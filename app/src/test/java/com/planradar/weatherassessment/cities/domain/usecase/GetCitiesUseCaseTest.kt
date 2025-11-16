package com.planradar.weatherassessment.cities.domain.usecase

import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GetCitiesUseCaseTest {

    private lateinit var repository: CitiesRepository
    private lateinit var getCitiesUseCase: GetCitiesUseCase

    @Before
    fun setup() {
        repository = mockk()
        getCitiesUseCase = GetCitiesUseCase(repository)
    }

    @Test
    fun `invoke should return list of cities from repository`() = runTest {
        // Given
        val expectedCities = listOf(
            CityEntity(id = 1, name = "London, UK"),
            CityEntity(id = 2, name = "Paris, FR"),
            CityEntity(id = 3, name = "Vienna, AUT")
        )
        coEvery { repository.getCities() } returns expectedCities

        // When
        val result = getCitiesUseCase()

        // Then
        assertEquals(expectedCities, result)
        coVerify(exactly = 1) { repository.getCities() }
    }

    @Test
    fun `invoke should return empty list when repository returns empty list`() = runTest {
        // Given
        val emptyList = emptyList<CityEntity>()
        coEvery { repository.getCities() } returns emptyList

        // When
        val result = getCitiesUseCase()

        // Then
        assertEquals(emptyList, result)
        coVerify(exactly = 1) { repository.getCities() }
    }
}

