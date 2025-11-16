package com.planradar.weatherassessment.weather.data.mapper

import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity
import com.planradar.weatherassessment.weather.domain.model.WeatherHistory

fun WeatherHistoryEntity.toDomain(): WeatherHistory {
    return WeatherHistory(
        id = id,
        cityName = cityName,
        description = description,
        temperature = temperature,
        humidity = humidity,
        windSpeed = windSpeed,
        iconId = iconId,
        timestamp = timestamp
    )
}

fun WeatherHistory.toEntity(): WeatherHistoryEntity {
    return WeatherHistoryEntity(
        id = id,
        cityName = cityName,
        description = description,
        temperature = temperature,
        humidity = humidity,
        windSpeed = windSpeed,
        iconId = iconId,
        timestamp = timestamp
    )
}

