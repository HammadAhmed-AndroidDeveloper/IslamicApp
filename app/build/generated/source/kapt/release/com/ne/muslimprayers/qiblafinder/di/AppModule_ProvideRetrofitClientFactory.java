package com.ne.muslimprayers.qiblafinder.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideRetrofitClient();
  }

  public static AppModule_ProvideRetrofitClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideRetrofitClient() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofitClient());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideRetrofitClientFactory INSTANCE = new AppModule_ProvideRetrofitClientFactory();
  }
}
