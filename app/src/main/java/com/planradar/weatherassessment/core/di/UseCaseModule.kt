package com.planradar.weatherassessment.core.di

import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase
import com.planradar.weatherassessment.cities.domain.usecase.DeleteCityUseCase
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetCitiesUseCase(
        citiesRepository: CitiesRepository
    ): GetCitiesUseCase {
        return GetCitiesUseCase(citiesRepository)
    }

    @Provides
    @Singleton
    fun provideAddCityUseCase(
        citiesRepository: CitiesRepository
    ): AddCityUseCase {
        return AddCityUseCase(citiesRepository)
    }

    @Provides
    @Singleton
    fun provideDeleteCityUseCase(
        citiesRepository: CitiesRepository
    ): DeleteCityUseCase {
        return DeleteCityUseCase(citiesRepository)
    }

    @Provides
    @Singleton
    fun provideGetCurrentWeatherUseCase(
        weatherRepository: WeatherRepository
    ): GetCurrentWeatherUseCase {
        return GetCurrentWeatherUseCase(weatherRepository)
    }

    @Provides
    @Singleton
    fun provideSaveWeatherHistoryUseCase(
        weatherRepository: WeatherRepository
    ): SaveWeatherHistoryUseCase {
        return SaveWeatherHistoryUseCase(weatherRepository)
    }

    @Provides
    @Singleton
    fun provideGetWeatherHistoryUseCase(
        weatherRepository: WeatherRepository
    ): GetWeatherHistoryUseCase {
        return GetWeatherHistoryUseCase(weatherRepository)
    }

    @Provides
    @Singleton
    fun provideGetWeatherHistoryByIdUseCase(
        weatherRepository: WeatherRepository
    ): GetWeatherHistoryByIdUseCase {
        return GetWeatherHistoryByIdUseCase(weatherRepository)
    }
}

