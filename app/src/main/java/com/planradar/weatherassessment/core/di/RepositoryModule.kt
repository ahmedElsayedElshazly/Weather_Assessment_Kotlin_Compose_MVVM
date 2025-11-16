package com.planradar.weatherassessment.core.di

import com.planradar.weatherassessment.cities.data.repository.CitiesRepositoryImpl
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import com.planradar.weatherassessment.weather.data.repository.WeatherRepositoryImpl
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCitiesRepository(
        citiesRepositoryImpl: CitiesRepositoryImpl
    ): CitiesRepository

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}