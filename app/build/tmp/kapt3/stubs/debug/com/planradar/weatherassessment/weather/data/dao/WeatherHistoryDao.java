package com.planradar.weatherassessment.weather.data.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/planradar/weatherassessment/weather/data/dao/WeatherHistoryDao;", "", "getWeatherHistoryByCity", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;", "cityName", "", "getWeatherHistoryById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWeatherHistory", "", "weatherHistory", "(Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface WeatherHistoryDao {
    
    @androidx.room.Query(value = "SELECT * FROM weather_history WHERE cityName = :cityName ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity>> getWeatherHistoryByCity(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName);
    
    @androidx.room.Query(value = "SELECT * FROM weather_history WHERE id = :id LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherHistoryById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertWeatherHistory(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity weatherHistory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}