package com.planradar.weatherassessment.cities.presentation.viewmodel;

import android.content.Context;
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase;
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase;
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
public final class CitiesViewModel_Factory implements Factory<CitiesViewModel> {
  private final Provider<GetCitiesUseCase> getCitiesUseCaseProvider;

  private final Provider<AddCityUseCase> addCityUseCaseProvider;

  private final Provider<Context> contextProvider;

  public CitiesViewModel_Factory(Provider<GetCitiesUseCase> getCitiesUseCaseProvider,
      Provider<AddCityUseCase> addCityUseCaseProvider, Provider<Context> contextProvider) {
    this.getCitiesUseCaseProvider = getCitiesUseCaseProvider;
    this.addCityUseCaseProvider = addCityUseCaseProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public CitiesViewModel get() {
    return newInstance(getCitiesUseCaseProvider.get(), addCityUseCaseProvider.get(), contextProvider.get());
  }

  public static CitiesViewModel_Factory create(Provider<GetCitiesUseCase> getCitiesUseCaseProvider,
      Provider<AddCityUseCase> addCityUseCaseProvider, Provider<Context> contextProvider) {
    return new CitiesViewModel_Factory(getCitiesUseCaseProvider, addCityUseCaseProvider, contextProvider);
  }

  public static CitiesViewModel newInstance(GetCitiesUseCase getCitiesUseCase,
      AddCityUseCase addCityUseCase, Context context) {
    return new CitiesViewModel(getCitiesUseCase, addCityUseCase, context);
  }
}
