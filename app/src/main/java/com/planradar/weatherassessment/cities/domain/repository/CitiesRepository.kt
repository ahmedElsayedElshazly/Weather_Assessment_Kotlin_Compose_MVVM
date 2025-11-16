package com.planradar.weatherassessment.cities.domain.repository

import com.planradar.weatherassessment.cities.data.model.CityEntity

interface CitiesRepository {
    suspend fun getCities(): List<CityEntity>
    suspend fun insertCity(cityEntity: CityEntity): Long
    suspend fun deleteCity(cityEntity: CityEntity)
}

