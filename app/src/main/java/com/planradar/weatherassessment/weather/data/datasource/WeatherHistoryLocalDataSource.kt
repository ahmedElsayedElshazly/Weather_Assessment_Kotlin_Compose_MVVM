package com.planradar.weatherassessment.weather.data.datasource

import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity
import kotlinx.coroutines.flow.Flow

interface WeatherHistoryLocalDataSource {
    fun getWeatherHistoryByCity(cityName: String): Flow<List<WeatherHistoryEntity>>
    suspend fun getWeatherHistoryById(id: Long): WeatherHistoryEntity?
    suspend fun insertWeatherHistory(weatherHistory: WeatherHistoryEntity)
}

