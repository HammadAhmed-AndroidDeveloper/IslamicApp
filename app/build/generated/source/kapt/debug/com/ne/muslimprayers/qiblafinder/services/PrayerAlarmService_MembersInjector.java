package com.ne.muslimprayers.qiblafinder.services;

import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class PrayerAlarmService_MembersInjector implements MembersInjector<PrayerAlarmService> {
  private final Provider<PrayerRepository> repositoryProvider;

  public PrayerAlarmService_MembersInjector(Provider<PrayerRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<PrayerAlarmService> create(
      Provider<PrayerRepository> repositoryProvider) {
    return new PrayerAlarmService_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(PrayerAlarmService instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService.repository")
  public static void injectRepository(PrayerAlarmService instance, PrayerRepository repository) {
    instance.repository = repository;
  }
}
