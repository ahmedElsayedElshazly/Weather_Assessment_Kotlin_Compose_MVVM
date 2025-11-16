package com.planradar.weatherassessment.cities.domain.usecase

import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class DeleteCityUseCaseTest {

    private lateinit var repository: CitiesRepository
    private lateinit var deleteCityUseCase: DeleteCityUseCase

    @Before
    fun setup() {
        repository = mockk()
        deleteCityUseCase = DeleteCityUseCase(repository)
    }

    @Test
    fun `invoke should call repository deleteCity`() = runTest {
        // Given
        val cityEntity = CityEntity(id = 1, name = "London, UK")
        coEvery { repository.deleteCity(any()) } returns Unit

        // When
        deleteCityUseCase(cityEntity)

        // Then
        coVerify(exactly = 1) { repository.deleteCity(cityEntity) }
    }

    @Test
    fun `invoke should delete correct city entity`() = runTest {
        // Given
        val cityEntity = CityEntity(id = 2, name = "Paris, FR")
        coEvery { repository.deleteCity(any()) } returns Unit

        // When
        deleteCityUseCase(cityEntity)

        // Then
        coVerify(exactly = 1) { 
            repository.deleteCity(match { it.id == 2 && it.name == "Paris, FR" })
        }
    }
}

