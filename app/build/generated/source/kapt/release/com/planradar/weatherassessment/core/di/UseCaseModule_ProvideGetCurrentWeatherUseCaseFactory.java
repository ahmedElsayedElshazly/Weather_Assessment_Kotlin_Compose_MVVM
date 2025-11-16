package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase;
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
public final class UseCaseModule_ProvideGetCurrentWeatherUseCaseFactory implements Factory<GetCurrentWeatherUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public UseCaseModule_ProvideGetCurrentWeatherUseCaseFactory(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public GetCurrentWeatherUseCase get() {
    return provideGetCurrentWeatherUseCase(weatherRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetCurrentWeatherUseCaseFactory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new UseCaseModule_ProvideGetCurrentWeatherUseCaseFactory(weatherRepositoryProvider);
  }

  public static GetCurrentWeatherUseCase provideGetCurrentWeatherUseCase(
      WeatherRepository weatherRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetCurrentWeatherUseCase(weatherRepository));
  }
}
