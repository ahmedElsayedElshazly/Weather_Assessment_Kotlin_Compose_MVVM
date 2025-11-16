package com.planradar.weatherassessment.weather.data.mapper

import com.planradar.weatherassessment.weather.data.model.WeatherResponse
import com.planradar.weatherassessment.weather.domain.model.Weather

fun WeatherResponse.toDomain(): Weather {
    val weatherInfo = weather.firstOrNull() ?: throw IllegalStateException("Weather data is empty")
    
    val temperatureCelsius = main.temp - 273.15
    
    return Weather(
        cityName = name,
        description = weatherInfo.description,
        temperature = temperatureCelsius,
        humidity = main.humidity,
        windSpeed = wind.speed,
        iconId = weatherInfo.icon
    )
}

