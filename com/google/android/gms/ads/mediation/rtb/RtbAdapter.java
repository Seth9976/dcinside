package com.google.android.gms.ads.mediation.rtb;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import o3.j;

@j
public abstract class RtbAdapter extends Adapter {
    public abstract void collectSignals(@NonNull RtbSignalData arg1, @NonNull SignalCallbacks arg2);

    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadAppOpenAd(mediationAppOpenAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadBannerAd(mediationBannerAdConfiguration0, mediationAdLoadCallback0);
    }

    @Deprecated
    public void loadRtbInterscrollerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support interscroller ads.", "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadInterstitialAd(mediationInterstitialAdConfiguration0, mediationAdLoadCallback0);
    }

    @Deprecated
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadNativeAd(mediationNativeAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) throws RemoteException {
        this.loadNativeAdMapper(mediationNativeAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadRewardedAd(mediationRewardedAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, @NonNull MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadRewardedInterstitialAd(mediationRewardedAdConfiguration0, mediationAdLoadCallback0);
    }
}

