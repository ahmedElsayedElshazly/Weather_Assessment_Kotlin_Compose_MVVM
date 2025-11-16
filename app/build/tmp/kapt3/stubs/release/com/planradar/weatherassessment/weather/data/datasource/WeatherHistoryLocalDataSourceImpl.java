package com.planradar.weatherassessment.weather.data.datasource;

import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSourceImpl;", "Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSource;", "weatherHistoryDao", "Lcom/planradar/weatherassessment/weather/data/dao/WeatherHistoryDao;", "(Lcom/planradar/weatherassessment/weather/data/dao/WeatherHistoryDao;)V", "getWeatherHistoryByCity", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;", "cityName", "", "getWeatherHistoryById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWeatherHistory", "", "weatherHistory", "(Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class WeatherHistoryLocalDataSourceImpl implements com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao weatherHistoryDao = null;
    
    @javax.inject.Inject()
    public WeatherHistoryLocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao weatherHistoryDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity>> getWeatherHistoryByCity(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getWeatherHistoryById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertWeatherHistory(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity weatherHistory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}