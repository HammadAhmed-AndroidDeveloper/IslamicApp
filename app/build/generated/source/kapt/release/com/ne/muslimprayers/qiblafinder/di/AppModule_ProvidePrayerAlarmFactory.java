package com.ne.muslimprayers.qiblafinder.di;

import com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvidePrayerAlarmFactory implements Factory<PrayerAlarmService> {
  @Override
  public PrayerAlarmService get() {
    return providePrayerAlarm();
  }

  public static AppModule_ProvidePrayerAlarmFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PrayerAlarmService providePrayerAlarm() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePrayerAlarm());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidePrayerAlarmFactory INSTANCE = new AppModule_ProvidePrayerAlarmFactory();
  }
}
