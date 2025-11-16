package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase;
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
public final class UseCaseModule_ProvideAddCityUseCaseFactory implements Factory<AddCityUseCase> {
  private final Provider<CitiesRepository> citiesRepositoryProvider;

  public UseCaseModule_ProvideAddCityUseCaseFactory(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    this.citiesRepositoryProvider = citiesRepositoryProvider;
  }

  @Override
  public AddCityUseCase get() {
    return provideAddCityUseCase(citiesRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideAddCityUseCaseFactory create(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    return new UseCaseModule_ProvideAddCityUseCaseFactory(citiesRepositoryProvider);
  }

  public static AddCityUseCase provideAddCityUseCase(CitiesRepository citiesRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideAddCityUseCase(citiesRepository));
  }
}
