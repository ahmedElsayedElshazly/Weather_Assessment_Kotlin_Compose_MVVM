package com.planradar.weatherassessment.cities.domain.usecase

import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import javax.inject.Inject

class AddCityUseCase @Inject constructor(
    private val citiesRepository: CitiesRepository
) {
    suspend operator fun invoke(cityName: String): AddCityResult {
        if (cityName.isBlank()) {
            return AddCityResult.Error("City name cannot be empty")
        }

        val cityEntity = CityEntity(
            name = cityName.trim()
        )

        val result = citiesRepository.insertCity(cityEntity)
        
        return if (result == -1L) {
            AddCityResult.Error("City already added")
        } else {
            AddCityResult.Success
        }
    }
}

sealed class AddCityResult {
    object Success : AddCityResult()
    data class Error(val message: String) : AddCityResult()
}

