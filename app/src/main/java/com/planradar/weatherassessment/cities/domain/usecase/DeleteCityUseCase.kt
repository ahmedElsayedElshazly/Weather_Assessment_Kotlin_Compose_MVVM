package com.planradar.weatherassessment.cities.domain.usecase

import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository

class DeleteCityUseCase(
    private val citiesRepository: CitiesRepository
) {
    suspend operator fun invoke(cityEntity: CityEntity) {
        citiesRepository.deleteCity(cityEntity)
    }
}

