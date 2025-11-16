package com.planradar.weatherassessment.cities.domain.usecase

import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class AddCityUseCaseTest {

    private lateinit var repository: CitiesRepository
    private lateinit var addCityUseCase: AddCityUseCase

    @Before
    fun setup() {
        repository = mockk()
        addCityUseCase = AddCityUseCase(repository)
    }

    @Test
    fun `invoke with valid city name should return Success`() = runTest {
        // Given
        val cityName = "London, UK"
        coEvery { repository.insertCity(any()) } returns 1L

        // When
        val result = addCityUseCase(cityName)

        // Then
        assertTrue(result is AddCityResult.Success)
        coVerify(exactly = 1) { repository.insertCity(any()) }
    }

    @Test
    fun `invoke with blank city name should return Error`() = runTest {
        // Given
        val cityName = ""

        // When
        val result = addCityUseCase(cityName)

        // Then
        assertTrue(result is AddCityResult.Error)
        assertEquals("City name cannot be empty", (result as AddCityResult.Error).message)
        coVerify(exactly = 0) { repository.insertCity(any()) }
    }

    @Test
    fun `invoke with whitespace only city name should return Error`() = runTest {
        // Given
        val cityName = "   "

        // When
        val result = addCityUseCase(cityName)

        // Then
        assertTrue(result is AddCityResult.Error)
        assertEquals("City name cannot be empty", (result as AddCityResult.Error).message)
        coVerify(exactly = 0) { repository.insertCity(any()) }
    }

    @Test
    fun `invoke with duplicate city should return Error`() = runTest {
        // Given
        val cityName = "London, UK"
        coEvery { repository.insertCity(any()) } returns -1L

        // When
        val result = addCityUseCase(cityName)

        // Then
        assertTrue(result is AddCityResult.Error)
        assertEquals("City already added", (result as AddCityResult.Error).message)
        coVerify(exactly = 1) { repository.insertCity(any()) }
    }

    @Test
    fun `invoke should trim city name before inserting`() = runTest {
        // Given
        val cityName = "  London, UK  "
        coEvery { repository.insertCity(any()) } returns 1L

        // When
        val result = addCityUseCase(cityName)

        // Then
        assertTrue(result is AddCityResult.Success)
        coVerify(exactly = 1) { 
            repository.insertCity(match { it.name == "London, UK" })
        }
    }
}

