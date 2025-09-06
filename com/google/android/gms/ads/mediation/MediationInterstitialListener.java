package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

@Deprecated
public interface MediationInterstitialListener {
    void onAdClicked(@NonNull MediationInterstitialAdapter arg1);

    void onAdClosed(@NonNull MediationInterstitialAdapter arg1);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationInterstitialAdapter arg1, int arg2);

    void onAdFailedToLoad(@NonNull MediationInterstitialAdapter arg1, @NonNull AdError arg2);

    void onAdLeftApplication(@NonNull MediationInterstitialAdapter arg1);

    void onAdLoaded(@NonNull MediationInterstitialAdapter arg1);

    void onAdOpened(@NonNull MediationInterstitialAdapter arg1);
}

