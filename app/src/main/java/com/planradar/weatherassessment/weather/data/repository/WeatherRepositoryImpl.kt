package com.planradar.weatherassessment.weather.data.repository

import com.planradar.weatherassessment.BuildConfig
import com.planradar.weatherassessment.weather.data.mapper.toDomain
import com.planradar.weatherassessment.weather.data.mapper.toEntity
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource
import com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSource
import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherRemoteDataSource: WeatherRemoteDataSource,
    private val weatherHistoryLocalDataSource: WeatherHistoryLocalDataSource
) : WeatherRepository {
    
    override suspend fun getCurrentWeather(cityName: String): Result<Weather> {
        return weatherRemoteDataSource.getCurrentWeather(cityName, BuildConfig.API_KEY)
            .mapCatching { it.toDomain() }
    }
    
    override suspend fun saveWeatherHistory(weather: Weather, cityName: String): Result<Unit> {
        return try {
            val weatherHistory = com.planradar.weatherassessment.weather.domain.model.WeatherHistory(
                id = 0,
                cityName = cityName.trim(),
                description = weather.description,
                temperature = weather.temperature,
                humidity = weather.humidity,
                windSpeed = weather.windSpeed,
                iconId = weather.iconId,
                timestamp = System.currentTimeMillis()
            )
            val weatherHistoryEntity = weatherHistory.toEntity()
            weatherHistoryLocalDataSource.insertWeatherHistory(weatherHistoryEntity)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override fun getWeatherHistoryByCity(cityName: String): Flow<List<WeatherHistory>> {
        return weatherHistoryLocalDataSource.getWeatherHistoryByCity(cityName.trim())
            .map { entities -> entities.map { it.toDomain() } }
    }
    
    override suspend fun getWeatherHistoryById(id: Long): Result<WeatherHistory> {
        return try {
            val entity = weatherHistoryLocalDataSource.getWeatherHistoryById(id)
            if (entity != null) {
                Result.success(entity.toDomain())
            } else {
                Result.failure(Exception("Weather history not found for id: $id"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

