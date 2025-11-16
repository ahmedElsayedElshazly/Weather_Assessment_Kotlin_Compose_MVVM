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
public final class GetCurrentWeatherUseCase_Factory implements Factory<GetCurrentWeatherUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public GetCurrentWeatherUseCase_Factory(Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public GetCurrentWeatherUseCase get() {
    return newInstance(weatherRepositoryProvider.get());
  }

  public static GetCurrentWeatherUseCase_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new GetCurrentWeatherUseCase_Factory(weatherRepositoryProvider);
  }

  public static GetCurrentWeatherUseCase newInstance(WeatherRepository weatherRepository) {
    return new GetCurrentWeatherUseCase(weatherRepository);
  }
}
