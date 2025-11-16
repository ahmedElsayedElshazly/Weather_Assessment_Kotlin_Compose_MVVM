package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository

class GetWeatherHistoryByIdUseCase(
    private val weatherRepository: WeatherRepository
) {
    suspend operator fun invoke(id: Long): Result<WeatherHistory> {
        return weatherRepository.getWeatherHistoryById(id)
    }
}

