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
public final class GetWeatherHistoryUseCase_Factory implements Factory<GetWeatherHistoryUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public GetWeatherHistoryUseCase_Factory(Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public GetWeatherHistoryUseCase get() {
    return newInstance(weatherRepositoryProvider.get());
  }

  public static GetWeatherHistoryUseCase_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new GetWeatherHistoryUseCase_Factory(weatherRepositoryProvider);
  }

  public static GetWeatherHistoryUseCase newInstance(WeatherRepository weatherRepository) {
    return new GetWeatherHistoryUseCase(weatherRepository);
  }
}
