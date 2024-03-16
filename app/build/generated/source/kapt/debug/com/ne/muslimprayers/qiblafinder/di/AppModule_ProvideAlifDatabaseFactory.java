package com.ne.muslimprayers.qiblafinder.di;

import android.content.Context;
import com.ne.muslimprayers.qiblafinder.repo.local.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAlifDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public AppModule_ProvideAlifDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAlifDatabase(appContextProvider.get());
  }

  public static AppModule_ProvideAlifDatabaseFactory create(Provider<Context> appContextProvider) {
    return new AppModule_ProvideAlifDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideAlifDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAlifDatabase(appContext));
  }
}
