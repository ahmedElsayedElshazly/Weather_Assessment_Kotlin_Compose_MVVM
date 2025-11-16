package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.cities.data.CitiesDao;
import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource;
import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSourceImpl;
import com.planradar.weatherassessment.core.db.AppDataBase;
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource;
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSourceImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/planradar/weatherassessment/core/di/LocalDataModule;", "", "()V", "bindCitiesLocalDataSource", "Lcom/planradar/weatherassessment/cities/data/datasource/CitiesLocalDataSource;", "citiesLocalDataSourceImpl", "Lcom/planradar/weatherassessment/cities/data/datasource/CitiesLocalDataSourceImpl;", "bindWeatherHistoryLocalDataSource", "Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSource;", "weatherHistoryLocalDataSourceImpl", "Lcom/planradar/weatherassessment/weather/data/datasource/WeatherHistoryLocalDataSourceImpl;", "Companion", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class LocalDataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.planradar.weatherassessment.core.di.LocalDataModule.Companion Companion = null;
    
    public LocalDataModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource bindCitiesLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSourceImpl citiesLocalDataSourceImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource bindWeatherHistoryLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSourceImpl weatherHistoryLocalDataSourceImpl);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/planradar/weatherassessment/core/di/LocalDataModule$Companion;", "", "()V", "provideCitiesDao", "Lcom/planradar/weatherassessment/cities/data/CitiesDao;", "appDataBase", "Lcom/planradar/weatherassessment/core/db/AppDataBase;", "provideWeatherHistoryDao", "Lcom/planradar/weatherassessment/weather/data/dao/WeatherHistoryDao;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @dagger.Provides()
        @javax.inject.Singleton()
        @org.jetbrains.annotations.NotNull()
        public final com.planradar.weatherassessment.cities.data.CitiesDao provideCitiesDao(@org.jetbrains.annotations.NotNull()
        com.planradar.weatherassessment.core.db.AppDataBase appDataBase) {
            return null;
        }
        
        @dagger.Provides()
        @javax.inject.Singleton()
        @org.jetbrains.annotations.NotNull()
        public final com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao provideWeatherHistoryDao(@org.jetbrains.annotations.NotNull()
        com.planradar.weatherassessment.core.db.AppDataBase appDataBase) {
            return null;
        }
    }
}