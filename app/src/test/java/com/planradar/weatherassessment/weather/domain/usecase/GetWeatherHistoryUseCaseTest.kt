package com.planradar.weatherassessment.weather.domain.usecase

import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class GetWeatherHistoryUseCaseTest {

    private lateinit var repository: WeatherRepository
    private lateinit var getWeatherHistoryUseCase: GetWeatherHistoryUseCase

    @Before
    fun setup() {
        repository = mockk()
        getWeatherHistoryUseCase = GetWeatherHistoryUseCase(repository)
    }

    @Test
    fun `invoke should return flow with weather history list`() = runTest {
        // Given
        val cityName = "London"
        val expectedHistory = listOf(
            WeatherHistory(
                id = 1,
                cityName = "London",
                description = "Clear sky",
                temperature = 20.5,
                humidity = 65,
                windSpeed = 10.2,
                iconId = "01d",
                timestamp = 1234567890L
            ),
            WeatherHistory(
                id = 2,
                cityName = "London",
                description = "Cloudy",
                temperature = 18.3,
                humidity = 70,
                windSpeed = 8.5,
                iconId = "02d",
                timestamp = 1234567800L
            )
        )
        every { repository.getWeatherHistoryByCity(cityName) } returns flowOf(expectedHistory)

        // When
        val result = getWeatherHistoryUseCase(cityName)

        // Then
        val collected = mutableListOf<List<WeatherHistory>>()
        result.collect { collected.add(it) }
        assertEquals(1, collected.size)
        assertEquals(expectedHistory, collected[0])
        verify(exactly = 1) { repository.getWeatherHistoryByCity(cityName) }
    }

    @Test
    fun `invoke should return empty flow when no history exists`() = runTest {
        // Given
        val cityName = "NewCity"
        every { repository.getWeatherHistoryByCity(cityName) } returns flowOf(emptyList())

        // When
        val result = getWeatherHistoryUseCase(cityName)

        // Then
        val collected = mutableListOf<List<WeatherHistory>>()
        result.collect { collected.add(it) }
        assertEquals(1, collected.size)
        assertTrue(collected[0].isEmpty())
        verify(exactly = 1) { repository.getWeatherHistoryByCity(cityName) }
    }
}

