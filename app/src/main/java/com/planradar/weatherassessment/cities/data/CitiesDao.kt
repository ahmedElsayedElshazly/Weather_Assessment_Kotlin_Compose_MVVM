package com.planradar.weatherassessment.cities.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.planradar.weatherassessment.cities.data.model.CityEntity

@Dao
interface CitiesDao {

    @Query("SELECT * FROM cities")
    suspend fun getCities(): List<CityEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCity(cityEntity: CityEntity): Long

    @Delete
    suspend fun deleteCity(cityEntity: CityEntity)

}