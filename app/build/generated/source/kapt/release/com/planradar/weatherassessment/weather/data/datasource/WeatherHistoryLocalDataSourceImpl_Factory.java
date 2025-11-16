package com.planradar.weatherassessment.weather.data.datasource;

import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class WeatherHistoryLocalDataSourceImpl_Factory implements Factory<WeatherHistoryLocalDataSourceImpl> {
  private final Provider<WeatherHistoryDao> weatherHistoryDaoProvider;

  public WeatherHistoryLocalDataSourceImpl_Factory(
      Provider<WeatherHistoryDao> weatherHistoryDaoProvider) {
    this.weatherHistoryDaoProvider = weatherHistoryDaoProvider;
  }

  @Override
  public WeatherHistoryLocalDataSourceImpl get() {
    return newInstance(weatherHistoryDaoProvider.get());
  }

  public static WeatherHistoryLocalDataSourceImpl_Factory create(
      Provider<WeatherHistoryDao> weatherHistoryDaoProvider) {
    return new WeatherHistoryLocalDataSourceImpl_Factory(weatherHistoryDaoProvider);
  }

  public static WeatherHistoryLocalDataSourceImpl newInstance(WeatherHistoryDao weatherHistoryDao) {
    return new WeatherHistoryLocalDataSourceImpl(weatherHistoryDao);
  }
}
