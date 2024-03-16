package com.ne.muslimprayers.qiblafinder.data.viewmodels;

import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
import com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService;
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
public final class PrayerTimingViewModel_Factory implements Factory<PrayerTimingViewModel> {
  private final Provider<PrayerRepository> repositoryProvider;

  private final Provider<PrayerAlarmService> prayerAlarmServiceProvider;

  public PrayerTimingViewModel_Factory(Provider<PrayerRepository> repositoryProvider,
      Provider<PrayerAlarmService> prayerAlarmServiceProvider) {
    this.repositoryProvider = repositoryProvider;
    this.prayerAlarmServiceProvider = prayerAlarmServiceProvider;
  }

  @Override
  public PrayerTimingViewModel get() {
    return newInstance(repositoryProvider.get(), prayerAlarmServiceProvider.get());
  }

  public static PrayerTimingViewModel_Factory create(Provider<PrayerRepository> repositoryProvider,
      Provider<PrayerAlarmService> prayerAlarmServiceProvider) {
    return new PrayerTimingViewModel_Factory(repositoryProvider, prayerAlarmServiceProvider);
  }

  public static PrayerTimingViewModel newInstance(PrayerRepository repository,
      PrayerAlarmService prayerAlarmService) {
    return new PrayerTimingViewModel(repository, prayerAlarmService);
  }
}
