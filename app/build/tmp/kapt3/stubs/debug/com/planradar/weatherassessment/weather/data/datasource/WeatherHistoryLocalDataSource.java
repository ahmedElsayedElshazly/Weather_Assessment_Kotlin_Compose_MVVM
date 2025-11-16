package com.planradar.weatherassessment.weather.data.datasource;

import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSource;", "", "getAllWeatherHistory", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;", "getWeatherHistoryByCity", "cityName", "", "getWeatherHistoryById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWeatherHistory", "", "weatherHistory", "(Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherHistoryLocalDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity>> getWeatherHistoryByCity(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherHistoryById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertWeatherHistory(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity weatherHistory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity>> getAllWeatherHistory();
}