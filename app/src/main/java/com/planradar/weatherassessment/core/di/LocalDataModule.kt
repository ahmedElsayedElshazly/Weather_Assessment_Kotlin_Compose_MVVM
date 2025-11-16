package com.planradar.weatherassessment.core.di

import com.planradar.weatherassessment.cities.data.CitiesDao
import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource
import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSourceImpl
import com.planradar.weatherassessment.core.db.AppDataBase
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalDataModule {

    @Binds
    @Singleton
    abstract fun bindCitiesLocalDataSource(
        citiesLocalDataSourceImpl: CitiesLocalDataSourceImpl
    ): CitiesLocalDataSource

    @Binds
    @Singleton
    abstract fun bindWeatherHistoryLocalDataSource(
        weatherHistoryLocalDataSourceImpl: WeatherHistoryLocalDataSourceImpl
    ): WeatherHistoryLocalDataSource

    companion object {
        @Provides
        @Singleton
        fun provideCitiesDao(appDataBase: AppDataBase): CitiesDao {
            return appDataBase.citiesDao()
        }

        @Provides
        @Singleton
        fun provideWeatherHistoryDao(appDataBase: AppDataBase): WeatherHistoryDao {
            return appDataBase.weatherHistoryDao()
        }
    }
}