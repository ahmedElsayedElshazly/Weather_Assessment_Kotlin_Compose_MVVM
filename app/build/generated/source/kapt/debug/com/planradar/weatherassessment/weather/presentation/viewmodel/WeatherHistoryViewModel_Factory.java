package com.planradar.weatherassessment.weather.presentation.viewmodel;

import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase;
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
public final class WeatherHistoryViewModel_Factory implements Factory<WeatherHistoryViewModel> {
  private final Provider<GetWeatherHistoryUseCase> getWeatherHistoryUseCaseProvider;

  public WeatherHistoryViewModel_Factory(
      Provider<GetWeatherHistoryUseCase> getWeatherHistoryUseCaseProvider) {
    this.getWeatherHistoryUseCaseProvider = getWeatherHistoryUseCaseProvider;
  }

  @Override
  public WeatherHistoryViewModel get() {
    return newInstance(getWeatherHistoryUseCaseProvider.get());
  }

  public static WeatherHistoryViewModel_Factory create(
      Provider<GetWeatherHistoryUseCase> getWeatherHistoryUseCaseProvider) {
    return new WeatherHistoryViewModel_Factory(getWeatherHistoryUseCaseProvider);
  }

  public static WeatherHistoryViewModel newInstance(
      GetWeatherHistoryUseCase getWeatherHistoryUseCase) {
    return new WeatherHistoryViewModel(getWeatherHistoryUseCase);
  }
}
