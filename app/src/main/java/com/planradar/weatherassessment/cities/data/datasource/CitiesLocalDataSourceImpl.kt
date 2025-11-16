package com.planradar.weatherassessment.cities.data.datasource

import com.planradar.weatherassessment.cities.data.CitiesDao
import com.planradar.weatherassessment.cities.data.model.CityEntity
import javax.inject.Inject

class CitiesLocalDataSourceImpl @Inject constructor(
    private val citiesDao: CitiesDao
) : CitiesLocalDataSource {
    override suspend fun getCitiesFromDB(): List<CityEntity> {
        return citiesDao.getCities()
    }

    override suspend fun insertCityToDB(cityEntity: CityEntity): Long {
        return citiesDao.insertCity(cityEntity)
    }

    override suspend fun deleteCityFromDB(cityEntity: CityEntity) {
        citiesDao.deleteCity(cityEntity)
    }
}