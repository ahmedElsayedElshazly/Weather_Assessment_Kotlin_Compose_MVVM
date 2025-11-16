package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import javax.inject.Inject

class SaveWeatherHistoryUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend operator fun invoke(weather: Weather, cityName: String): Result<Unit> {
        return weatherRepository.saveWeatherHistory(weather, cityName)
    }
}

