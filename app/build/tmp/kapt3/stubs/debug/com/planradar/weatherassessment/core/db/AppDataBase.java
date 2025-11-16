package com.planradar.weatherassessment.core.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.planradar.weatherassessment.cities.data.CitiesDao;
import com.planradar.weatherassessment.cities.data.model.CityEntity;
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/planradar/weatherassessment/core/db/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "citiesDao", "Lcom/planradar/weatherassessment/cities/data/CitiesDao;", "weatherHistoryDao", "Lcom/planradar/weatherassessment/weather/data/dao/WeatherHistoryDao;", "app_debug"})
@androidx.room.Database(entities = {com.planradar.weatherassessment.cities.data.model.CityEntity.class, com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    
    public AppDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.planradar.weatherassessment.cities.data.CitiesDao citiesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao weatherHistoryDao();
}