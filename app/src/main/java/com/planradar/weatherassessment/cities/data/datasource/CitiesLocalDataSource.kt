package com.planradar.weatherassessment.cities.data.datasource

import com.planradar.weatherassessment.cities.data.model.CityEntity

interface CitiesLocalDataSource {
    suspend fun getCitiesFromDB(): List<CityEntity>
    suspend fun insertCityToDB(cityEntity: CityEntity): Long
    suspend fun deleteCityFromDB(cityEntity: CityEntity)
}