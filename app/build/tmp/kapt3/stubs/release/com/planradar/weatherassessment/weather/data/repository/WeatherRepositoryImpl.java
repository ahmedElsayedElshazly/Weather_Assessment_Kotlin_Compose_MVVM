package com.planradar.weatherassessment.weather.data.repository;

import com.planradar.weatherassessment.BuildConfig;
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource;
import com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSource;
import com.planradar.weatherassessment.weather.domain.model.Weather;
import com.planradar.weatherassessment.weather.domain.model.WeatherHistory;
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001c"}, d2 = {"Lcom/planradar/weatherassessment/weather/data/repository/WeatherRepositoryImpl;", "Lcom/planradar/weatherassessment/weather/domain/repository/WeatherRepository;", "weatherRemoteDataSource", "Lcom/planradar/weatherassessment/weather/data/datasource/WeatherRemoteDataSource;", "weatherHistoryLocalDataSource", "Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSource;", "(Lcom/planradar/weatherassessment/weather/data/datasource/WeatherRemoteDataSource;Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSource;)V", "getCurrentWeather", "Lkotlin/Result;", "Lcom/planradar/weatherassessment/weather/domain/model/Weather;", "cityName", "", "getCurrentWeather-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherHistoryByCity", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/planradar/weatherassessment/weather/domain/model/WeatherHistory;", "getWeatherHistoryById", "id", "", "getWeatherHistoryById-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveWeatherHistory", "", "weather", "saveWeatherHistory-0E7RQCE", "(Lcom/planradar/weatherassessment/weather/domain/model/Weather;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class WeatherRepositoryImpl implements com.planradar.weatherassessment.weather.domain.repository.WeatherRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSource weatherRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource weatherHistoryLocalDataSource = null;
    
    @javax.inject.Inject()
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSource weatherRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource weatherHistoryLocalDataSource) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.planradar.weatherassessment.weather.domain.model.WeatherHistory>> getWeatherHistoryByCity(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
        return null;
    }
}