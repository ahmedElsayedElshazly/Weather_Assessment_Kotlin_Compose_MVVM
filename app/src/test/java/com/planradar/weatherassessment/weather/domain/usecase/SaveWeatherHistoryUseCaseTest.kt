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

class SaveWeatherHistoryUseCaseTest {

    private lateinit var repository: WeatherRepository
    private lateinit var saveWeatherHistoryUseCase: SaveWeatherHistoryUseCase

    @Before
    fun setup() {
        repository = mockk()
        saveWeatherHistoryUseCase = SaveWeatherHistoryUseCase(repository)
    }

    @Test
    fun `invoke should return success when repository saves successfully`() = runTest {
        // Given
        val weather = Weather(
            cityName = "London",
            description = "Clear sky",
            temperature = 20.5,
            humidity = 65,
            windSpeed = 10.2,
            iconId = "01d"
        )
        val cityName = "London"
        coEvery { repository.saveWeatherHistory(weather, cityName) } returns Result.success(Unit)

        // When
        val result = saveWeatherHistoryUseCase(weather, cityName)

        // Then
        assertTrue(result.isSuccess)
        coVerify(exactly = 1) { repository.saveWeatherHistory(weather, cityName) }
    }

    @Test
    fun `invoke should return failure when repository fails to save`() = runTest {
        // Given
        val weather = Weather(
            cityName = "London",
            description = "Clear sky",
            temperature = 20.5,
            humidity = 65,
            windSpeed = 10.2,
            iconId = "01d"
        )
        val cityName = "London"
        val exception = Exception("Database error")
        coEvery { repository.saveWeatherHistory(weather, cityName) } returns Result.failure(exception)

        // When
        val result = saveWeatherHistoryUseCase(weather, cityName)

        // Then
        assertTrue(result.isFailure)
        assertEquals(exception, result.exceptionOrNull())
        coVerify(exactly = 1) { repository.saveWeatherHistory(weather, cityName) }
    }
}

