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
public final class GetWeatherHistoryByIdUseCase_Factory implements Factory<GetWeatherHistoryByIdUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public GetWeatherHistoryByIdUseCase_Factory(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public GetWeatherHistoryByIdUseCase get() {
    return newInstance(weatherRepositoryProvider.get());
  }

  public static GetWeatherHistoryByIdUseCase_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new GetWeatherHistoryByIdUseCase_Factory(weatherRepositoryProvider);
  }

  public static GetWeatherHistoryByIdUseCase newInstance(WeatherRepository weatherRepository) {
    return new GetWeatherHistoryByIdUseCase(weatherRepository);
  }
}
