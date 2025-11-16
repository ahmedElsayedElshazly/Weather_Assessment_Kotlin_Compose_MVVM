package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import com.planradar.weatherassessment.cities.domain.usecase.DeleteCityUseCase;
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
public final class UseCaseModule_ProvideDeleteCityUseCaseFactory implements Factory<DeleteCityUseCase> {
  private final Provider<CitiesRepository> citiesRepositoryProvider;

  public UseCaseModule_ProvideDeleteCityUseCaseFactory(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    this.citiesRepositoryProvider = citiesRepositoryProvider;
  }

  @Override
  public DeleteCityUseCase get() {
    return provideDeleteCityUseCase(citiesRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideDeleteCityUseCaseFactory create(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    return new UseCaseModule_ProvideDeleteCityUseCaseFactory(citiesRepositoryProvider);
  }

  public static DeleteCityUseCase provideDeleteCityUseCase(CitiesRepository citiesRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideDeleteCityUseCase(citiesRepository));
  }
}
