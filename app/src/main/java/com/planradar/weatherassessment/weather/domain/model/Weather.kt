package com.planradar.weatherassessment.weather.domain.model

data class Weather(
    val cityName: String,
    val description: String,
    val temperature: Double, // in Celsius
    val humidity: Int, // percentage
    val windSpeed: Double, // km/h
    val iconId: String
)

