package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow

class GetWeatherHistoryUseCase(
    private val weatherRepository: WeatherRepository
) {
    operator fun invoke(cityName: String): Flow<List<WeatherHistory>> {
        return weatherRepository.getWeatherHistoryByCity(cityName)
    }
}

