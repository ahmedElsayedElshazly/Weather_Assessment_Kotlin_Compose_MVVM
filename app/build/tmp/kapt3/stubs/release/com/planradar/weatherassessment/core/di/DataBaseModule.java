package com.planradar.weatherassessment.core.di;

import android.app.Application;
import androidx.room.Room;
import com.planradar.weatherassessment.core.db.AppDataBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/planradar/weatherassessment/core/di/DataBaseModule;", "", "()V", "provideAppDataBase", "Lcom/planradar/weatherassessment/core/db/AppDataBase;", "app", "Landroid/app/Application;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DataBaseModule {
    
    public DataBaseModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.core.db.AppDataBase provideAppDataBase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
}