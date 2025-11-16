package com.planradar.weatherassessment.cities.domain.usecase

import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import javax.inject.Inject

class GetCitiesUseCase @Inject constructor(
    private val citiesRepository: CitiesRepository
) {
    suspend operator fun invoke(): List<CityEntity> {
        return citiesRepository.getCities()
    }
}

