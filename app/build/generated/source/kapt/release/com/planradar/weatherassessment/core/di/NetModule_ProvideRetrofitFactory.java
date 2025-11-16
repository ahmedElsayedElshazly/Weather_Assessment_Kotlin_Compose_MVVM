package com.planradar.weatherassessment.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class NetModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetModule_ProvideRetrofitFactory(NetModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, okHttpClientProvider.get());
  }

  public static NetModule_ProvideRetrofitFactory create(NetModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(NetModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(okHttpClient));
  }
}
