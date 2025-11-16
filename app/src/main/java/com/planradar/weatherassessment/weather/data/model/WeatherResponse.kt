package com.planradar.weatherassessment.weather.data.model

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("main")
    val main: Main,
    @SerializedName("wind")
    val wind: Wind,
    @SerializedName("name")
    val name: String
)

data class Weather(
    @SerializedName("description")
    val description: String,
    @SerializedName("icon")
    val icon: String
)

data class Main(
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("humidity")
    val humidity: Int
)

data class Wind(
    @SerializedName("speed")
    val speed: Double
)

