package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

final class zzdvn extends RewardedAdLoadCallback {
    final String zza;
    final String zzb;
    final zzdvs zzc;

    zzdvn(zzdvs zzdvs0, String s, String s1) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzdvs0;
        super();
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError0) {
        String s = zzdvs.zzl(loadAdError0);
        this.zzc.zzm(s, this.zzb);
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(@NonNull Object object0) {
        this.zzc.zzg(this.zza, ((RewardedAd)object0), this.zzb);
    }
}

