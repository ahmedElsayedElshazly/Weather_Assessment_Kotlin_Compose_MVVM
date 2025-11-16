package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import javax.inject.Inject

class GetCurrentWeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend operator fun invoke(cityName: String): Result<Weather> {
        return weatherRepository.getCurrentWeather(cityName)
    }
}

