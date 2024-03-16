package com.ne.muslimprayers.qiblafinder.data.viewmodels;

import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
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
public final class CalendarViewModel_Factory implements Factory<CalendarViewModel> {
  private final Provider<PrayerRepository> repositoryProvider;

  public CalendarViewModel_Factory(Provider<PrayerRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CalendarViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static CalendarViewModel_Factory create(Provider<PrayerRepository> repositoryProvider) {
    return new CalendarViewModel_Factory(repositoryProvider);
  }

  public static CalendarViewModel newInstance(PrayerRepository repository) {
    return new CalendarViewModel(repository);
  }
}
