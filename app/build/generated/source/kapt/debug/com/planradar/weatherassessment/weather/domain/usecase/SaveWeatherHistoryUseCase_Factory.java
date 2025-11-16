package com.planradar.weatherassessment.weather.domain.usecase;

import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
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
public final class SaveWeatherHistoryUseCase_Factory implements Factory<SaveWeatherHistoryUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public SaveWeatherHistoryUseCase_Factory(Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public SaveWeatherHistoryUseCase get() {
    return newInstance(weatherRepositoryProvider.get());
  }

  public static SaveWeatherHistoryUseCase_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new SaveWeatherHistoryUseCase_Factory(weatherRepositoryProvider);
  }

  public static SaveWeatherHistoryUseCase newInstance(WeatherRepository weatherRepository) {
    return new SaveWeatherHistoryUseCase(weatherRepository);
  }
}
