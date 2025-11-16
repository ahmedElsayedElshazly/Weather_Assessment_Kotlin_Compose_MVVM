package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase;
import com.planradar.weatherassessment.cities.domain.usecase.DeleteCityUseCase;
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase;
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/planradar/weatherassessment/core/di/UseCaseModule;", "", "()V", "provideAddCityUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/AddCityUseCase;", "citiesRepository", "Lcom/planradar/weatherassessment/cities/domain/repository/CitiesRepository;", "provideDeleteCityUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/DeleteCityUseCase;", "provideGetCitiesUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/GetCitiesUseCase;", "provideGetCurrentWeatherUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetCurrentWeatherUseCase;", "weatherRepository", "Lcom/planradar/weatherassessment/weather/domain/repository/WeatherRepository;", "provideGetWeatherHistoryByIdUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryByIdUseCase;", "provideGetWeatherHistoryUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryUseCase;", "provideSaveWeatherHistoryUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/SaveWeatherHistoryUseCase;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.planradar.weatherassessment.core.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase provideGetCitiesUseCase(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.domain.repository.CitiesRepository citiesRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase provideAddCityUseCase(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.domain.repository.CitiesRepository citiesRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.cities.domain.usecase.DeleteCityUseCase provideDeleteCityUseCase(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.domain.repository.CitiesRepository citiesRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase provideGetCurrentWeatherUseCase(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.repository.WeatherRepository weatherRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase provideSaveWeatherHistoryUseCase(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.repository.WeatherRepository weatherRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase provideGetWeatherHistoryUseCase(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.repository.WeatherRepository weatherRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase provideGetWeatherHistoryByIdUseCase(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.repository.WeatherRepository weatherRepository) {
        return null;
    }
}