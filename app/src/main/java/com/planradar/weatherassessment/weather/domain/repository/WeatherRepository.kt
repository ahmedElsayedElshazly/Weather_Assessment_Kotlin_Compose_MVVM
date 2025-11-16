package com.planradar.weatherassessment.weather.domain.repository

import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    suspend fun getCurrentWeather(cityName: String): Result<Weather>
    suspend fun saveWeatherHistory(weather: Weather, cityName: String): Result<Unit>
    fun getWeatherHistoryByCity(cityName: String): Flow<List<WeatherHistory>>
    suspend fun getWeatherHistoryById(id: Long): Result<WeatherHistory>
}

