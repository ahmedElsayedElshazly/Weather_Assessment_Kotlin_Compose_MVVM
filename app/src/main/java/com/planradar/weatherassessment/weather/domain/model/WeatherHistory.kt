package com.planradar.weatherassessment.weather.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WeatherHistory(
    val id: Long,
    val cityName: String,
    val description: String,
    val temperature: Double, // in Celsius
    val humidity: Int, // percentage
    val windSpeed: Double, // km/h
    val iconId: String,
    val timestamp: Long // milliseconds since epoch
) : Parcelable

