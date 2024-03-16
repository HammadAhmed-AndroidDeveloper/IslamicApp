// Generated by view binder compiler. Do not edit!
package com.ne.muslimprayers.qiblafinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ne.muslimprayers.qiblafinder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RelativeLayout alarm;

  @NonNull
  public final ImageView alarmImg;

  @NonNull
  public final ImageView azan;

  @NonNull
  public final RelativeLayout azanTimings;

  @NonNull
  public final ImageView compass;

  @NonNull
  public final TextView currentPrayerTimeTv;

  @NonNull
  public final TextView currentPrayerTv;

  @NonNull
  public final TextView findQibla;

  @NonNull
  public final TextView islamicDateTv;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final LinearLayout nimazTimingsLayout;

  @NonNull
  public final TextView normalDateTv;

  @NonNull
  public final ProgressBar pb;

  @NonNull
  public final RelativeLayout qiblaFinder;

  @NonNull
  public final RelativeLayout ramadanCalendar;

  @NonNull
  public final ImageView ramadanCalendarImg;

  @NonNull
  public final RelativeLayout searchLayout;

  @NonNull
  public final TextView upComingPrayerTimeTv;

  @NonNull
  public final TextView upComingPrayerTv;

  @NonNull
  public final ConstraintLayout upperHead;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull RelativeLayout alarm,
      @NonNull ImageView alarmImg, @NonNull ImageView azan, @NonNull RelativeLayout azanTimings,
      @NonNull ImageView compass, @NonNull TextView currentPrayerTimeTv,
      @NonNull TextView currentPrayerTv, @NonNull TextView findQibla,
      @NonNull TextView islamicDateTv, @NonNull ImageView menu,
      @NonNull LinearLayout nimazTimingsLayout, @NonNull TextView normalDateTv,
      @NonNull ProgressBar pb, @NonNull RelativeLayout qiblaFinder,
      @NonNull RelativeLayout ramadanCalendar, @NonNull ImageView ramadanCalendarImg,
      @NonNull RelativeLayout searchLayout, @NonNull TextView upComingPrayerTimeTv,
      @NonNull TextView upComingPrayerTv, @NonNull ConstraintLayout upperHead) {
    this.rootView = rootView;
    this.alarm = alarm;
    this.alarmImg = alarmImg;
    this.azan = azan;
    this.azanTimings = azanTimings;
    this.compass = compass;
    this.currentPrayerTimeTv = currentPrayerTimeTv;
    this.currentPrayerTv = currentPrayerTv;
    this.findQibla = findQibla;
    this.islamicDateTv = islamicDateTv;
    this.menu = menu;
    this.nimazTimingsLayout = nimazTimingsLayout;
    this.normalDateTv = normalDateTv;
    this.pb = pb;
    this.qiblaFinder = qiblaFinder;
    this.ramadanCalendar = ramadanCalendar;
    this.ramadanCalendarImg = ramadanCalendarImg;
    this.searchLayout = searchLayout;
    this.upComingPrayerTimeTv = upComingPrayerTimeTv;
    this.upComingPrayerTv = upComingPrayerTv;
    this.upperHead = upperHead;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alarm;
      RelativeLayout alarm = ViewBindings.findChildViewById(rootView, id);
      if (alarm == null) {
        break missingId;
      }

      id = R.id.alarmImg;
      ImageView alarmImg = ViewBindings.findChildViewById(rootView, id);
      if (alarmImg == null) {
        break missingId;
      }

      id = R.id.azan;
      ImageView azan = ViewBindings.findChildViewById(rootView, id);
      if (azan == null) {
        break missingId;
      }

      id = R.id.azanTimings;
      RelativeLayout azanTimings = ViewBindings.findChildViewById(rootView, id);
      if (azanTimings == null) {
        break missingId;
      }

      id = R.id.compass;
      ImageView compass = ViewBindings.findChildViewById(rootView, id);
      if (compass == null) {
        break missingId;
      }

      id = R.id.currentPrayerTimeTv;
      TextView currentPrayerTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (currentPrayerTimeTv == null) {
        break missingId;
      }

      id = R.id.currentPrayerTv;
      TextView currentPrayerTv = ViewBindings.findChildViewById(rootView, id);
      if (currentPrayerTv == null) {
        break missingId;
      }

      id = R.id.findQibla;
      TextView findQibla = ViewBindings.findChildViewById(rootView, id);
      if (findQibla == null) {
        break missingId;
      }

      id = R.id.islamicDateTv;
      TextView islamicDateTv = ViewBindings.findChildViewById(rootView, id);
      if (islamicDateTv == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageView menu = ViewBindings.findChildViewById(rootView, id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.nimazTimingsLayout;
      LinearLayout nimazTimingsLayout = ViewBindings.findChildViewById(rootView, id);
      if (nimazTimingsLayout == null) {
        break missingId;
      }

      id = R.id.normalDateTv;
      TextView normalDateTv = ViewBindings.findChildViewById(rootView, id);
      if (normalDateTv == null) {
        break missingId;
      }

      id = R.id.pb;
      ProgressBar pb = ViewBindings.findChildViewById(rootView, id);
      if (pb == null) {
        break missingId;
      }

      id = R.id.qiblaFinder;
      RelativeLayout qiblaFinder = ViewBindings.findChildViewById(rootView, id);
      if (qiblaFinder == null) {
        break missingId;
      }

      id = R.id.ramadanCalendar;
      RelativeLayout ramadanCalendar = ViewBindings.findChildViewById(rootView, id);
      if (ramadanCalendar == null) {
        break missingId;
      }

      id = R.id.ramadanCalendarImg;
      ImageView ramadanCalendarImg = ViewBindings.findChildViewById(rootView, id);
      if (ramadanCalendarImg == null) {
        break missingId;
      }

      id = R.id.searchLayout;
      RelativeLayout searchLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchLayout == null) {
        break missingId;
      }

      id = R.id.upComingPrayerTimeTv;
      TextView upComingPrayerTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (upComingPrayerTimeTv == null) {
        break missingId;
      }

      id = R.id.upComingPrayerTv;
      TextView upComingPrayerTv = ViewBindings.findChildViewById(rootView, id);
      if (upComingPrayerTv == null) {
        break missingId;
      }

      id = R.id.upperHead;
      ConstraintLayout upperHead = ViewBindings.findChildViewById(rootView, id);
      if (upperHead == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, alarm, alarmImg, azan,
          azanTimings, compass, currentPrayerTimeTv, currentPrayerTv, findQibla, islamicDateTv,
          menu, nimazTimingsLayout, normalDateTv, pb, qiblaFinder, ramadanCalendar,
          ramadanCalendarImg, searchLayout, upComingPrayerTimeTv, upComingPrayerTv, upperHead);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}