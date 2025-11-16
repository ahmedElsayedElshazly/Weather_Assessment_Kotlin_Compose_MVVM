package com.planradar.weatherassessment.weather.presentation.viewmodel;

import android.content.Context;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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

  private final Provider<Context> contextProvider;

  public WeatherHistoryViewModel_Factory(
      Provider<GetWeatherHistoryUseCase> getWeatherHistoryUseCaseProvider,
      Provider<Context> contextProvider) {
    this.getWeatherHistoryUseCaseProvider = getWeatherHistoryUseCaseProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public WeatherHistoryViewModel get() {
    return newInstance(getWeatherHistoryUseCaseProvider.get(), contextProvider.get());
  }

  public static WeatherHistoryViewModel_Factory create(
      Provider<GetWeatherHistoryUseCase> getWeatherHistoryUseCaseProvider,
      Provider<Context> contextProvider) {
    return new WeatherHistoryViewModel_Factory(getWeatherHistoryUseCaseProvider, contextProvider);
  }

  public static WeatherHistoryViewModel newInstance(
      GetWeatherHistoryUseCase getWeatherHistoryUseCase, Context context) {
    return new WeatherHistoryViewModel(getWeatherHistoryUseCase, context);
  }
}
