package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

public final class zzbxi extends zzbwv {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbxj zzb;

    public zzbxi(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0, zzbxj zzbxj0) {
        this.zza = rewardedInterstitialAdLoadCallback0;
        this.zzb = zzbxj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zze(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzf(zze zze0) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0 = this.zza;
        if(rewardedInterstitialAdLoadCallback0 != null) {
            rewardedInterstitialAdLoadCallback0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0 = this.zza;
        if(rewardedInterstitialAdLoadCallback0 != null) {
            zzbxj zzbxj0 = this.zzb;
            if(zzbxj0 != null) {
                rewardedInterstitialAdLoadCallback0.onAdLoaded(zzbxj0);
            }
        }
    }
}

