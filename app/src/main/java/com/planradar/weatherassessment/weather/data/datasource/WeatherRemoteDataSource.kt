package com.planradar.weatherassessment.weather.data.datasource

import com.planradar.weatherassessment.weather.data.model.WeatherResponse

interface WeatherRemoteDataSource {
    suspend fun getCurrentWeather(cityName: String, apiKey: String): Result<WeatherResponse>
}

