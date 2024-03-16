package com.ne.muslimprayers.qiblafinder.di;

import com.ne.muslimprayers.qiblafinder.repo.local.OfflineData;
import com.ne.muslimprayers.qiblafinder.repo.local.PrayersLocalDao;
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
public final class AppModule_ProvideLocalDataSourceFactory implements Factory<OfflineData> {
  private final Provider<PrayersLocalDao> prayersLocalDaoProvider;

  public AppModule_ProvideLocalDataSourceFactory(
      Provider<PrayersLocalDao> prayersLocalDaoProvider) {
    this.prayersLocalDaoProvider = prayersLocalDaoProvider;
  }

  @Override
  public OfflineData get() {
    return provideLocalDataSource(prayersLocalDaoProvider.get());
  }

  public static AppModule_ProvideLocalDataSourceFactory create(
      Provider<PrayersLocalDao> prayersLocalDaoProvider) {
    return new AppModule_ProvideLocalDataSourceFactory(prayersLocalDaoProvider);
  }

  public static OfflineData provideLocalDataSource(PrayersLocalDao prayersLocalDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLocalDataSource(prayersLocalDao));
  }
}
