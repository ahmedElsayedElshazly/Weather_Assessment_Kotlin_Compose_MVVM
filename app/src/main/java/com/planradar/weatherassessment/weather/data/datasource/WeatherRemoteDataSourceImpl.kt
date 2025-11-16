package com.planradar.weatherassessment.weather.data.datasource

import com.planradar.weatherassessment.core.api.ApiService
import com.planradar.weatherassessment.weather.data.model.WeatherResponse
import javax.inject.Inject

class WeatherRemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : WeatherRemoteDataSource {
    
    override suspend fun getCurrentWeather(cityName: String, apiKey: String): Result<WeatherResponse> {
        return try {
            val response = apiService.getCurrentWeather(cityName, apiKey)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

