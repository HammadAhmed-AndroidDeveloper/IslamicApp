package com.ne.muslimprayers.qiblafinder.repo.local;

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
public final class OfflineData_Factory implements Factory<OfflineData> {
  private final Provider<PrayersLocalDao> prayersLocalDaoProvider;

  public OfflineData_Factory(Provider<PrayersLocalDao> prayersLocalDaoProvider) {
    this.prayersLocalDaoProvider = prayersLocalDaoProvider;
  }

  @Override
  public OfflineData get() {
    return newInstance(prayersLocalDaoProvider.get());
  }

  public static OfflineData_Factory create(Provider<PrayersLocalDao> prayersLocalDaoProvider) {
    return new OfflineData_Factory(prayersLocalDaoProvider);
  }

  public static OfflineData newInstance(PrayersLocalDao prayersLocalDao) {
    return new OfflineData(prayersLocalDao);
  }
}
