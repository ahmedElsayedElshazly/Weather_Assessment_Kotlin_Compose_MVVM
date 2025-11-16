package com.planradar.weatherassessment.core.di

import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase
import com.planradar.weatherassessment.cities.domain.usecase.DeleteCityUseCase
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule