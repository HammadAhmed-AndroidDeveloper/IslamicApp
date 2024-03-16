package com.ne.muslimprayers.qiblafinder.repo.remote;

import com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService;
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
    "rawtypes"
})
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<PrayerService> prayerServiceProvider;

  public RemoteDataSource_Factory(Provider<PrayerService> prayerServiceProvider) {
    this.prayerServiceProvider = prayerServiceProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(prayerServiceProvider.get());
  }

  public static RemoteDataSource_Factory create(Provider<PrayerService> prayerServiceProvider) {
    return new RemoteDataSource_Factory(prayerServiceProvider);
  }

  public static RemoteDataSource newInstance(PrayerService prayerService) {
    return new RemoteDataSource(prayerService);
  }
}
