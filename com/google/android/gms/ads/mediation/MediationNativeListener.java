package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.zzbgr;

@Deprecated
public interface MediationNativeListener {
    void onAdClicked(@NonNull MediationNativeAdapter arg1);

    void onAdClosed(@NonNull MediationNativeAdapter arg1);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationNativeAdapter arg1, int arg2);

    void onAdFailedToLoad(@NonNull MediationNativeAdapter arg1, @NonNull AdError arg2);

    void onAdImpression(@NonNull MediationNativeAdapter arg1);

    void onAdLeftApplication(@NonNull MediationNativeAdapter arg1);

    void onAdLoaded(@NonNull MediationNativeAdapter arg1, @NonNull UnifiedNativeAdMapper arg2);

    void onAdOpened(@NonNull MediationNativeAdapter arg1);

    void onVideoEnd(@NonNull MediationNativeAdapter arg1);

    void zzd(MediationNativeAdapter arg1, zzbgr arg2);

    void zze(MediationNativeAdapter arg1, zzbgr arg2, String arg3);
}

