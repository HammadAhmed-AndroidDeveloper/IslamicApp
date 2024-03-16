package com.ne.muslimprayers.qiblafinder.di;

import com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class AppModule_ProvidePrayerServiceFactory implements Factory<PrayerService> {
  private final Provider<OkHttpClient> clientProvider;

  public AppModule_ProvidePrayerServiceFactory(Provider<OkHttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public PrayerService get() {
    return providePrayerService(clientProvider.get());
  }

  public static AppModule_ProvidePrayerServiceFactory create(
      Provider<OkHttpClient> clientProvider) {
    return new AppModule_ProvidePrayerServiceFactory(clientProvider);
  }

  public static PrayerService providePrayerService(OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePrayerService(client));
  }
}
