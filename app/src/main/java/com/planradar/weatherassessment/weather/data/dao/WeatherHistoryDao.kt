package com.planradar.weatherassessment.weather.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherHistoryDao {
    
    @Query("SELECT * FROM weather_history WHERE cityName = :cityName ORDER BY timestamp DESC")
    fun getWeatherHistoryByCity(cityName: String): Flow<List<WeatherHistoryEntity>>
    
    @Query("SELECT * FROM weather_history WHERE id = :id LIMIT 1")
    suspend fun getWeatherHistoryById(id: Long): WeatherHistoryEntity?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeatherHistory(weatherHistory: WeatherHistoryEntity)
}
