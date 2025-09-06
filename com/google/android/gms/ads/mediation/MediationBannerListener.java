package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

@Deprecated
public interface MediationBannerListener {
    void onAdClicked(@NonNull MediationBannerAdapter arg1);

    void onAdClosed(@NonNull MediationBannerAdapter arg1);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationBannerAdapter arg1, int arg2);

    void onAdFailedToLoad(@NonNull MediationBannerAdapter arg1, @NonNull AdError arg2);

    void onAdLeftApplication(@NonNull MediationBannerAdapter arg1);

    void onAdLoaded(@NonNull MediationBannerAdapter arg1);

    void onAdOpened(@NonNull MediationBannerAdapter arg1);

    void zzb(@NonNull MediationBannerAdapter arg1, @NonNull String arg2, @NonNull String arg3);
}

