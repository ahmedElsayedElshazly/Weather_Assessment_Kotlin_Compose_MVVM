package com.planradar.weatherassessment.cities.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.planradar.weatherassessment.cities.data.model.CityEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/planradar/weatherassessment/cities/data/CitiesDao;", "", "deleteCity", "", "cityEntity", "Lcom/planradar/weatherassessment/cities/data/model/CityEntity;", "(Lcom/planradar/weatherassessment/cities/data/model/CityEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCities", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCity", "", "app_debug"})
@androidx.room.Dao()
public abstract interface CitiesDao {
    
    @androidx.room.Query(value = "SELECT * FROM cities")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.planradar.weatherassessment.cities.data.model.CityEntity>> $completion);
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCity(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.data.model.CityEntity cityEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCity(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.data.model.CityEntity cityEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}