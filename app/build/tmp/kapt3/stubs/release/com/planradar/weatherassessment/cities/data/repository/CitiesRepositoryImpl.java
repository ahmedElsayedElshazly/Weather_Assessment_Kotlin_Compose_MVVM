package com.planradar.weatherassessment.cities.data.repository;

import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource;
import com.planradar.weatherassessment.cities.data.model.CityEntity;
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/planradar/weatherassessment/cities/data/repository/CitiesRepositoryImpl;", "Lcom/planradar/weatherassessment/cities/domain/repository/CitiesRepository;", "citiesLocalDataSource", "Lcom/planradar/weatherassessment/cities/data/datasource/CitiesLocalDataSource;", "(Lcom/planradar/weatherassessment/cities/data/datasource/CitiesLocalDataSource;)V", "deleteCity", "", "cityEntity", "Lcom/planradar/weatherassessment/cities/data/model/CityEntity;", "(Lcom/planradar/weatherassessment/cities/data/model/CityEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCities", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCity", "", "app_release"})
public final class CitiesRepositoryImpl implements com.planradar.weatherassessment.cities.domain.repository.CitiesRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource citiesLocalDataSource = null;
    
    @javax.inject.Inject()
    public CitiesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource citiesLocalDataSource) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.planradar.weatherassessment.cities.data.model.CityEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertCity(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.data.model.CityEntity cityEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteCity(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.data.model.CityEntity cityEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}