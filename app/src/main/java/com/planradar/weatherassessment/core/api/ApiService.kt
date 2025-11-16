package com.planradar.weatherassessment.core.api

import com.planradar.weatherassessment.weather.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    
    @GET("weather")
    suspend fun getCurrentWeather(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String
    ): WeatherResponse
}