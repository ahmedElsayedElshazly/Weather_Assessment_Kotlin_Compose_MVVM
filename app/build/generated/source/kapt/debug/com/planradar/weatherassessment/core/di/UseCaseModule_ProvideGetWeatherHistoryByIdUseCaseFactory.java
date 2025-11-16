package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase;
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
public final class UseCaseModule_ProvideGetWeatherHistoryByIdUseCaseFactory implements Factory<GetWeatherHistoryByIdUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public UseCaseModule_ProvideGetWeatherHistoryByIdUseCaseFactory(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public GetWeatherHistoryByIdUseCase get() {
    return provideGetWeatherHistoryByIdUseCase(weatherRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetWeatherHistoryByIdUseCaseFactory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new UseCaseModule_ProvideGetWeatherHistoryByIdUseCaseFactory(weatherRepositoryProvider);
  }

  public static GetWeatherHistoryByIdUseCase provideGetWeatherHistoryByIdUseCase(
      WeatherRepository weatherRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetWeatherHistoryByIdUseCase(weatherRepository));
  }
}
