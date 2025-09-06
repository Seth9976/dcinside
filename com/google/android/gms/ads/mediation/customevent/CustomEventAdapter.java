package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;

@KeepForSdkWithMembers
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    @VisibleForTesting
    static final AdError zza;
    @Nullable
    @VisibleForTesting
    CustomEventBanner zzb;
    @Nullable
    @VisibleForTesting
    CustomEventInterstitial zzc;
    @Nullable
    @VisibleForTesting
    CustomEventNative zzd;
    private View zze;

    static {
        CustomEventAdapter.zza = new AdError(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner0 = this.zzb;
        if(customEventBanner0 != null) {
            customEventBanner0.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial0 = this.zzc;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.onDestroy();
        }
        CustomEventNative customEventNative0 = this.zzd;
        if(customEventNative0 != null) {
            customEventNative0.onDestroy();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        CustomEventBanner customEventBanner0 = this.zzb;
        if(customEventBanner0 != null) {
            customEventBanner0.onPause();
        }
        CustomEventInterstitial customEventInterstitial0 = this.zzc;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.onPause();
        }
        CustomEventNative customEventNative0 = this.zzd;
        if(customEventNative0 != null) {
            customEventNative0.onPause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        CustomEventBanner customEventBanner0 = this.zzb;
        if(customEventBanner0 != null) {
            customEventBanner0.onResume();
        }
        CustomEventInterstitial customEventInterstitial0 = this.zzc;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.onResume();
        }
        CustomEventNative customEventNative0 = this.zzd;
        if(customEventNative0 != null) {
            customEventNative0.onResume();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context0, @NonNull MediationBannerListener mediationBannerListener0, @NonNull Bundle bundle0, @NonNull AdSize adSize0, @NonNull MediationAdRequest mediationAdRequest0, @Nullable Bundle bundle1) {
        String s = bundle0.getString("class_name");
        CustomEventBanner customEventBanner0 = (CustomEventBanner)CustomEventAdapter.zzb(CustomEventBanner.class, s);
        this.zzb = customEventBanner0;
        if(customEventBanner0 == null) {
            mediationBannerListener0.onAdFailedToLoad(this, CustomEventAdapter.zza);
            return;
        }
        Bundle bundle2 = bundle1 == null ? null : bundle1.getBundle(bundle0.getString("class_name"));
        CustomEventBanner customEventBanner1 = this.zzb;
        customEventBanner1.getClass();
        customEventBanner1.requestBannerAd(context0, new zza(this, mediationBannerListener0), bundle0.getString("parameter"), adSize0, mediationAdRequest0, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context0, @NonNull MediationInterstitialListener mediationInterstitialListener0, @NonNull Bundle bundle0, @NonNull MediationAdRequest mediationAdRequest0, @Nullable Bundle bundle1) {
        String s = bundle0.getString("class_name");
        CustomEventInterstitial customEventInterstitial0 = (CustomEventInterstitial)CustomEventAdapter.zzb(CustomEventInterstitial.class, s);
        this.zzc = customEventInterstitial0;
        if(customEventInterstitial0 == null) {
            mediationInterstitialListener0.onAdFailedToLoad(this, CustomEventAdapter.zza);
            return;
        }
        Bundle bundle2 = bundle1 == null ? null : bundle1.getBundle(bundle0.getString("class_name"));
        CustomEventInterstitial customEventInterstitial1 = this.zzc;
        customEventInterstitial1.getClass();
        customEventInterstitial1.requestInterstitialAd(context0, new zzb(this, this, mediationInterstitialListener0), bundle0.getString("parameter"), mediationAdRequest0, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@NonNull Context context0, @NonNull MediationNativeListener mediationNativeListener0, @NonNull Bundle bundle0, @NonNull NativeMediationAdRequest nativeMediationAdRequest0, @Nullable Bundle bundle1) {
        String s = bundle0.getString("class_name");
        CustomEventNative customEventNative0 = (CustomEventNative)CustomEventAdapter.zzb(CustomEventNative.class, s);
        this.zzd = customEventNative0;
        if(customEventNative0 == null) {
            mediationNativeListener0.onAdFailedToLoad(this, CustomEventAdapter.zza);
            return;
        }
        Bundle bundle2 = bundle1 == null ? null : bundle1.getBundle(bundle0.getString("class_name"));
        CustomEventNative customEventNative1 = this.zzd;
        customEventNative1.getClass();
        customEventNative1.requestNativeAd(context0, new zzc(this, mediationNativeListener0), bundle0.getString("parameter"), nativeMediationAdRequest0, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial0 = this.zzc;
        if(customEventInterstitial0 != null) {
            customEventInterstitial0.showInterstitial();
        }
    }

    @Nullable
    private static Object zzb(Class class0, @Nullable String s) {
        try {
            if(s == null) {
                throw null;
            }
            return class0.cast(Class.forName(s).getDeclaredConstructor(null).newInstance(null));
        }
        catch(Throwable throwable0) {
        }
        zzo.zzj(("Could not instantiate custom event adapter: " + s + ". " + throwable0.getMessage()));
        return null;
    }
}

