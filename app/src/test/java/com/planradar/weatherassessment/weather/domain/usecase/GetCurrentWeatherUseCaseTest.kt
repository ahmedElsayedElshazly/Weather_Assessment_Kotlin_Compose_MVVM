package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class GetCurrentWeatherUseCaseTest {

    private lateinit var repository: WeatherRepository
    private lateinit var getCurrentWeatherUseCase: GetCurrentWeatherUseCase

    @Before
    fun setup() {
        repository = mockk()
        getCurrentWeatherUseCase = GetCurrentWeatherUseCase(repository)
    }

    @Test
    fun `invoke should return success result with weather data`() = runTest {
        // Given
        val cityName = "London"
        val expectedWeather = Weather(
            cityName = "London",
            description = "Clear sky",
            temperature = 20.5,
            humidity = 65,
            windSpeed = 10.2,
            iconId = "01d"
        )
        coEvery { repository.getCurrentWeather(cityName) } returns Result.success(expectedWeather)

        // When
        val result = getCurrentWeatherUseCase(cityName)

        // Then
        assertTrue(result.isSuccess)
        assertEquals(expectedWeather, result.getOrNull())
        coVerify(exactly = 1) { repository.getCurrentWeather(cityName) }
    }

    @Test
    fun `invoke should return failure result when repository fails`() = runTest {
        // Given
        val cityName = "InvalidCity"
        val exception = Exception("City not found")
        coEvery { repository.getCurrentWeather(cityName) } returns Result.failure(exception)

        // When
        val result = getCurrentWeatherUseCase(cityName)

        // Then
        assertTrue(result.isFailure)
        assertEquals(exception, result.exceptionOrNull())
        coVerify(exactly = 1) { repository.getCurrentWeather(cityName) }
    }
}

