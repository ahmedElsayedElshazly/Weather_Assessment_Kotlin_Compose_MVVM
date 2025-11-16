package com.planradar.weatherassessment.weather.data.datasource;

import com.planradar.weatherassessment.core.api.ApiService;
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
public final class WeatherRemoteDataSourceImpl_Factory implements Factory<WeatherRemoteDataSourceImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public WeatherRemoteDataSourceImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public WeatherRemoteDataSourceImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static WeatherRemoteDataSourceImpl_Factory create(
      Provider<ApiService> apiServiceProvider) {
    return new WeatherRemoteDataSourceImpl_Factory(apiServiceProvider);
  }

  public static WeatherRemoteDataSourceImpl newInstance(ApiService apiService) {
    return new WeatherRemoteDataSourceImpl(apiService);
  }
}
