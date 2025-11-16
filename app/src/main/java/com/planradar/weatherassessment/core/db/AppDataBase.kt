package com.planradar.weatherassessment.core.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.planradar.weatherassessment.cities.data.CitiesDao
import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity

@Database(
    entities = [CityEntity::class, WeatherHistoryEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun citiesDao(): CitiesDao
    abstract fun weatherHistoryDao(): WeatherHistoryDao
}