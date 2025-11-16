package com.planradar.weatherassessment.weather.data.datasource;

import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSourceImpl;", "Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSource;", "weatherHistoryDao", "Lcom/planradar/weatherassessment/weather/data/dao/WeatherHistoryDao;", "(Lcom/planradar/weatherassessment/weather/data/dao/WeatherHistoryDao;)V", "getAllWeatherHistory", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;", "getWeatherHistoryByCity", "cityName", "", "getWeatherHistoryById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWeatherHistory", "", "weatherHistory", "(Lcom/planradar/weatherassessment/weather/data/model/WeatherHistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity>> getAllWeatherHistory() {
        return null;
    }
}