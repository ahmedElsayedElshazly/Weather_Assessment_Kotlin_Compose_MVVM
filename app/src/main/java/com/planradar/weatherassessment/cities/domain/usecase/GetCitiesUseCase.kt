package com.planradar.weatherassessment.cities.domain.usecase

import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository

class GetCitiesUseCase(
    private val citiesRepository: CitiesRepository
) {
    suspend operator fun invoke(): List<CityEntity> {
        return citiesRepository.getCities()
    }
}

