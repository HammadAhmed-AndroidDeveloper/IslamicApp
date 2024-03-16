package com.ne.muslimprayers.qiblafinder.di;

import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
import com.ne.muslimprayers.qiblafinder.repo.local.OfflineData;
import com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvidePrayerRepositoryFactory implements Factory<PrayerRepository> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  private final Provider<OfflineData> offlineDataProvider;

  public AppModule_ProvidePrayerRepositoryFactory(
      Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<OfflineData> offlineDataProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.offlineDataProvider = offlineDataProvider;
  }

  @Override
  public PrayerRepository get() {
    return providePrayerRepository(remoteDataSourceProvider.get(), offlineDataProvider.get());
  }

  public static AppModule_ProvidePrayerRepositoryFactory create(
      Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<OfflineData> offlineDataProvider) {
    return new AppModule_ProvidePrayerRepositoryFactory(remoteDataSourceProvider, offlineDataProvider);
  }

  public static PrayerRepository providePrayerRepository(RemoteDataSource remoteDataSource,
      OfflineData offlineData) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePrayerRepository(remoteDataSource, offlineData));
  }
}
