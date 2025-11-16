package com.planradar.weatherassessment.cities.data.mapper

import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.model.City

fun CityEntity.toDomain(): City {
    return City(
        id = id,
        name = name
    )
}

fun City.toEntity(): CityEntity {
    return CityEntity(
        id = id,
        name = name
    )
}

