package com.planradar.weatherassessment.weather.data.datasource

import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherHistoryLocalDataSourceImpl @Inject constructor(
    private val weatherHistoryDao: WeatherHistoryDao
) : WeatherHistoryLocalDataSource {
    
    override fun getWeatherHistoryByCity(cityName: String): Flow<List<WeatherHistoryEntity>> {
        return weatherHistoryDao.getWeatherHistoryByCity(cityName)
    }
    
    override suspend fun getWeatherHistoryById(id: Long): WeatherHistoryEntity? {
        return weatherHistoryDao.getWeatherHistoryById(id)
    }
    
    override suspend fun insertWeatherHistory(weatherHistory: WeatherHistoryEntity) {
        weatherHistoryDao.insertWeatherHistory(weatherHistory)
    }
}

