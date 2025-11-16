package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository

class SaveWeatherHistoryUseCase(
    private val weatherRepository: WeatherRepository
) {
    suspend operator fun invoke(weather: Weather, cityName: String): Result<Unit> {
        return weatherRepository.saveWeatherHistory(weather, cityName)
    }
}

