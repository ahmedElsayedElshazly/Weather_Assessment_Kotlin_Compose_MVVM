package com.planradar.weatherassessment.core.di

import com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSource
import com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRemoteDataSource(
        weatherRemoteDataSourceImpl: WeatherRemoteDataSourceImpl
    ): WeatherRemoteDataSource
}