package com.ne.muslimprayers.qiblafinder.di;

import com.ne.muslimprayers.qiblafinder.repo.local.AppDatabase;
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
public final class AppModule_ProvideReminderDaoFactory implements Factory<PrayersLocalDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public AppModule_ProvideReminderDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public PrayersLocalDao get() {
    return provideReminderDao(appDatabaseProvider.get());
  }

  public static AppModule_ProvideReminderDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_ProvideReminderDaoFactory(appDatabaseProvider);
  }

  public static PrayersLocalDao provideReminderDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideReminderDao(appDatabase));
  }
}
