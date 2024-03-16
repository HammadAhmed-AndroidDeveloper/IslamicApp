package com.ne.muslimprayers.qiblafinder.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.ne.muslimprayers.qiblafinder.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/ads/AdvanceBannerAd;", "", "()V", "adView", "Lcom/google/android/gms/ads/AdView;", "getAdSize", "Lcom/google/android/gms/ads/AdSize;", "context", "Landroid/app/Activity;", "loadBannerAd", "", "Landroid/content/Context;", "adContainer", "Landroid/widget/FrameLayout;", "bannerAdListener", "Lcom/ne/muslimprayers/qiblafinder/ads/BannerAdListener;", "pauseAd", "stopAd", "app_release"})
public final class AdvanceBannerAd {
    @org.jetbrains.annotations.Nullable
    private static com.google.android.gms.ads.AdView adView;
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.ads.AdvanceBannerAd INSTANCE = null;
    
    private AdvanceBannerAd() {
        super();
    }
    
    public final void loadBannerAd(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.widget.FrameLayout adContainer, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.ads.BannerAdListener bannerAdListener) {
    }
    
    private final com.google.android.gms.ads.AdSize getAdSize(android.app.Activity context) {
        return null;
    }
    
    public final void pauseAd() {
    }
    
    public final void stopAd() {
    }
}