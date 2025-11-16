package com.planradar.weatherassessment.weather.data.repository;

import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource;
import com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSource;
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
public final class WeatherRepositoryImpl_Factory implements Factory<WeatherRepositoryImpl> {
  private final Provider<WeatherRemoteDataSource> weatherRemoteDataSourceProvider;

  private final Provider<WeatherHistoryLocalDataSource> weatherHistoryLocalDataSourceProvider;

  public WeatherRepositoryImpl_Factory(
      Provider<WeatherRemoteDataSource> weatherRemoteDataSourceProvider,
      Provider<WeatherHistoryLocalDataSource> weatherHistoryLocalDataSourceProvider) {
    this.weatherRemoteDataSourceProvider = weatherRemoteDataSourceProvider;
    this.weatherHistoryLocalDataSourceProvider = weatherHistoryLocalDataSourceProvider;
  }

  @Override
  public WeatherRepositoryImpl get() {
    return newInstance(weatherRemoteDataSourceProvider.get(), weatherHistoryLocalDataSourceProvider.get());
  }

  public static WeatherRepositoryImpl_Factory create(
      Provider<WeatherRemoteDataSource> weatherRemoteDataSourceProvider,
      Provider<WeatherHistoryLocalDataSource> weatherHistoryLocalDataSourceProvider) {
    return new WeatherRepositoryImpl_Factory(weatherRemoteDataSourceProvider, weatherHistoryLocalDataSourceProvider);
  }

  public static WeatherRepositoryImpl newInstance(WeatherRemoteDataSource weatherRemoteDataSource,
      WeatherHistoryLocalDataSource weatherHistoryLocalDataSource) {
    return new WeatherRepositoryImpl(weatherRemoteDataSource, weatherHistoryLocalDataSource);
  }
}
