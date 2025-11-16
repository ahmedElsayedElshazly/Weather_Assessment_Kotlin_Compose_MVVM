package com.planradar.weatherassessment.cities.data.repository

import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource
import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import javax.inject.Inject

class CitiesRepositoryImpl @Inject constructor(
    private val citiesLocalDataSource: CitiesLocalDataSource
) : CitiesRepository {

    override suspend fun getCities(): List<CityEntity> {
        return citiesLocalDataSource.getCitiesFromDB()
    }

    override suspend fun insertCity(cityEntity: CityEntity): Long {
        return citiesLocalDataSource.insertCityToDB(cityEntity)
    }

    override suspend fun deleteCity(cityEntity: CityEntity) {
        citiesLocalDataSource.deleteCityFromDB(cityEntity)
    }
}

