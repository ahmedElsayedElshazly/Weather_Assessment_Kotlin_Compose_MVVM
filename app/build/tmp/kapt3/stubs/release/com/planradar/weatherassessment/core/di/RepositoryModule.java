package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.cities.data.repository.CitiesRepositoryImpl;
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import com.planradar.weatherassessment.weather.data.repository.WeatherRepositoryImpl;
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/planradar/weatherassessment/core/di/RepositoryModule;", "", "()V", "bindCitiesRepository", "Lcom/planradar/weatherassessment/cities/domain/repository/CitiesRepository;", "citiesRepositoryImpl", "Lcom/planradar/weatherassessment/cities/data/repository/CitiesRepositoryImpl;", "bindWeatherRepository", "Lcom/planradar/weatherassessment/weather/domain/repository/WeatherRepository;", "weatherRepositoryImpl", "Lcom/planradar/weatherassessment/weather/data/repository/WeatherRepositoryImpl;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.planradar.weatherassessment.cities.domain.repository.CitiesRepository bindCitiesRepository(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.data.repository.CitiesRepositoryImpl citiesRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.planradar.weatherassessment.weather.domain.repository.WeatherRepository bindWeatherRepository(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.repository.WeatherRepositoryImpl weatherRepositoryImpl);
}