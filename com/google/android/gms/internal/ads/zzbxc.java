package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public final class zzbxc extends zzbwv {
    private final RewardedAdLoadCallback zza;
    private final RewardedAd zzb;

    public zzbxc(RewardedAdLoadCallback rewardedAdLoadCallback0, RewardedAd rewardedAd0) {
        this.zza = rewardedAdLoadCallback0;
        this.zzb = rewardedAd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zze(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzf(zze zze0) {
        if(this.zza != null) {
            LoadAdError loadAdError0 = zze0.zzb();
            this.zza.onAdFailedToLoad(loadAdError0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback0 = this.zza;
        if(rewardedAdLoadCallback0 != null) {
            rewardedAdLoadCallback0.onAdLoaded(this.zzb);
        }
    }
}

