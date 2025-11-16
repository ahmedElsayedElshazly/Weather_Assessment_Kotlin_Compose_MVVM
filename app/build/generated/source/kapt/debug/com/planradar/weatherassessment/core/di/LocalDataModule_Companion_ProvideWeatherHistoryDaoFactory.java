package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.core.db.AppDataBase;
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class LocalDataModule_Companion_ProvideWeatherHistoryDaoFactory implements Factory<WeatherHistoryDao> {
  private final Provider<AppDataBase> appDataBaseProvider;

  public LocalDataModule_Companion_ProvideWeatherHistoryDaoFactory(
      Provider<AppDataBase> appDataBaseProvider) {
    this.appDataBaseProvider = appDataBaseProvider;
  }

  @Override
  public WeatherHistoryDao get() {
    return provideWeatherHistoryDao(appDataBaseProvider.get());
  }

  public static LocalDataModule_Companion_ProvideWeatherHistoryDaoFactory create(
      Provider<AppDataBase> appDataBaseProvider) {
    return new LocalDataModule_Companion_ProvideWeatherHistoryDaoFactory(appDataBaseProvider);
  }

  public static WeatherHistoryDao provideWeatherHistoryDao(AppDataBase appDataBase) {
    return Preconditions.checkNotNullFromProvides(LocalDataModule.Companion.provideWeatherHistoryDao(appDataBase));
  }
}
