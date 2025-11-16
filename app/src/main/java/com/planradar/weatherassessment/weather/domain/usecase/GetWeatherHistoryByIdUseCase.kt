package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import javax.inject.Inject

class GetWeatherHistoryByIdUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend operator fun invoke(id: Long): Result<WeatherHistory> {
        return weatherRepository.getWeatherHistoryById(id)
    }
}

