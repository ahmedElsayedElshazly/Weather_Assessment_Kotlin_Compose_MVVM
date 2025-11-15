package com.planradar.weatherassessment.core.di

import android.app.Application
import androidx.room.Room
import com.planradar.weatherassessment.core.db.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Singleton
    @Provides
    fun provideAppDataBase(app: Application): AppDataBase {
        return Room.databaseBuilder(app, AppDataBase::class.java, "weatherdatabase").build()
    }

}