package com.planradar.weatherassessment.cities.presentation;

import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase;
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase;
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
public final class CitiesViewModel_Factory implements Factory<CitiesViewModel> {
  private final Provider<GetCitiesUseCase> getCitiesUseCaseProvider;

  private final Provider<AddCityUseCase> addCityUseCaseProvider;

  public CitiesViewModel_Factory(Provider<GetCitiesUseCase> getCitiesUseCaseProvider,
      Provider<AddCityUseCase> addCityUseCaseProvider) {
    this.getCitiesUseCaseProvider = getCitiesUseCaseProvider;
    this.addCityUseCaseProvider = addCityUseCaseProvider;
  }

  @Override
  public CitiesViewModel get() {
    return newInstance(getCitiesUseCaseProvider.get(), addCityUseCaseProvider.get());
  }

  public static CitiesViewModel_Factory create(Provider<GetCitiesUseCase> getCitiesUseCaseProvider,
      Provider<AddCityUseCase> addCityUseCaseProvider) {
    return new CitiesViewModel_Factory(getCitiesUseCaseProvider, addCityUseCaseProvider);
  }

  public static CitiesViewModel newInstance(GetCitiesUseCase getCitiesUseCase,
      AddCityUseCase addCityUseCase) {
    return new CitiesViewModel(getCitiesUseCase, addCityUseCase);
  }
}
