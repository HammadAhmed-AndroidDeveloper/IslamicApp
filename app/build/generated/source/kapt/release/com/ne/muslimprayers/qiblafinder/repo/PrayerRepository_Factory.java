package com.ne.muslimprayers.qiblafinder.repo;

import com.ne.muslimprayers.qiblafinder.repo.local.OfflineData;
import com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource;
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
public final class PrayerRepository_Factory implements Factory<PrayerRepository> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  private final Provider<OfflineData> offlineDataProvider;

  public PrayerRepository_Factory(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<OfflineData> offlineDataProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.offlineDataProvider = offlineDataProvider;
  }

  @Override
  public PrayerRepository get() {
    return newInstance(remoteDataSourceProvider.get(), offlineDataProvider.get());
  }

  public static PrayerRepository_Factory create(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<OfflineData> offlineDataProvider) {
    return new PrayerRepository_Factory(remoteDataSourceProvider, offlineDataProvider);
  }

  public static PrayerRepository newInstance(RemoteDataSource remoteDataSource,
      OfflineData offlineData) {
    return new PrayerRepository(remoteDataSource, offlineData);
  }
}
