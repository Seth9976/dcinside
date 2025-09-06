package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import java.util.List;

public abstract class Adapter implements MediationExtrasReceiver {
    @NonNull
    public abstract VersionInfo getSDKVersionInfo();

    @NonNull
    public abstract VersionInfo getVersionInfo();

    public abstract void initialize(@NonNull Context arg1, @NonNull InitializationCompleteCallback arg2, @NonNull List arg3);

    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support app open ads.", "com.google.android.gms.ads"));
    }

    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support banner ads.", "com.google.android.gms.ads"));
    }

    @Deprecated
    public void loadInterscrollerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support interscroller ads.", "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support interstitial ads.", "com.google.android.gms.ads"));
    }

    @Deprecated
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support native ads.", "com.google.android.gms.ads"));
    }

    public void loadNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support rewarded ads.", "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support rewarded interstitial ads.", "com.google.android.gms.ads"));
    }
}

