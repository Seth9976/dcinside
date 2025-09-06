package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@VisibleForTesting
final class zzc extends InterstitialAdLoadCallback {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationInterstitialListener zzb;

    public zzc(AbstractAdViewAdapter abstractAdViewAdapter0, MediationInterstitialListener mediationInterstitialListener0) {
        this.zza = abstractAdViewAdapter0;
        this.zzb = mediationInterstitialListener0;
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        this.zzb.onAdFailedToLoad(this.zza, loadAdError0);
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(Object object0) {
        this.zza.mInterstitialAd = (InterstitialAd)object0;
        ((InterstitialAd)object0).setFullScreenContentCallback(new zzd(this.zza, this.zzb));
        this.zzb.onAdLoaded(this.zza);
    }
}

