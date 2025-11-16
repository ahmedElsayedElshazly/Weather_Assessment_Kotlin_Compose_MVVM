package com.planradar.weatherassessment.weather.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_history")
data class WeatherHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val cityName: String,
    val description: String,
    val temperature: Double,
    val humidity: Int,
    val windSpeed: Double,
    val iconId: String,
    val timestamp: Long
)

