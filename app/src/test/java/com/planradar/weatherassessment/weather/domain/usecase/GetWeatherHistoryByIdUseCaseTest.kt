package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class GetWeatherHistoryByIdUseCaseTest {

    private lateinit var repository: WeatherRepository
    private lateinit var getWeatherHistoryByIdUseCase: GetWeatherHistoryByIdUseCase

    @Before
    fun setup() {
        repository = mockk()
        getWeatherHistoryByIdUseCase = GetWeatherHistoryByIdUseCase(repository)
    }

    @Test
    fun `invoke should return success result with weather history`() = runTest {
        // Given
        val historyId = 1L
        val expectedHistory = WeatherHistory(
            id = historyId,
            cityName = "London",
            description = "Clear sky",
            temperature = 20.5,
            humidity = 65,
            windSpeed = 10.2,
            iconId = "01d",
            timestamp = 1234567890L
        )
        coEvery { repository.getWeatherHistoryById(historyId) } returns Result.success(expectedHistory)

        // When
        val result = getWeatherHistoryByIdUseCase(historyId)

        // Then
        assertTrue(result.isSuccess)
        assertEquals(expectedHistory, result.getOrNull())
        coVerify(exactly = 1) { repository.getWeatherHistoryById(historyId) }
    }

    @Test
    fun `invoke should return failure result when history not found`() = runTest {
        // Given
        val historyId = 999L
        val exception = Exception("Weather history not found for id: $historyId")
        coEvery { repository.getWeatherHistoryById(historyId) } returns Result.failure(exception)

        // When
        val result = getWeatherHistoryByIdUseCase(historyId)

        // Then
        assertTrue(result.isFailure)
        assertEquals(exception, result.exceptionOrNull())
        coVerify(exactly = 1) { repository.getWeatherHistoryById(historyId) }
    }
}

