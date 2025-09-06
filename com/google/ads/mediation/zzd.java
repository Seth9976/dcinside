package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@VisibleForTesting
final class zzd extends FullScreenContentCallback {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationInterstitialListener zzb;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter0, MediationInterstitialListener mediationInterstitialListener0) {
        this.zza = abstractAdViewAdapter0;
        this.zzb = mediationInterstitialListener0;
    }

    @Override  // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.zzb.onAdClosed(this.zza);
    }

    @Override  // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.zzb.onAdOpened(this.zza);
    }
}

