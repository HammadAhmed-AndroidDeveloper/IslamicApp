package com.ne.muslimprayers.qiblafinder.ui.activities;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.ne.muslimprayers.qiblafinder.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/ui/activities/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "spinKit", "Lcom/github/ybq/android/spinkit/SpinKitView;", "startBtn", "Landroidx/appcompat/widget/AppCompatButton;", "onCreate", "", "bundle", "Landroid/os/Bundle;", "app_debug"})
@android.annotation.SuppressLint(value = {"CustomSplashScreen"})
public final class SplashActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.appcompat.widget.AppCompatButton startBtn;
    private com.github.ybq.android.spinkit.SpinKitView spinKit;
    
    public SplashActivity() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle bundle) {
    }
}