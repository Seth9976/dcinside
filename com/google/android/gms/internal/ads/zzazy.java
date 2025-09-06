package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;

public final class zzazy extends zzbaf {
    @Nullable
    private final AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzazy(AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0, String s) {
        this.zza = appOpenAd$AppOpenAdLoadCallback0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzc(zze zze0) {
        if(this.zza != null) {
            LoadAdError loadAdError0 = zze0.zzb();
            this.zza.onAdFailedToLoad(loadAdError0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzd(zzbad zzbad0) {
        if(this.zza != null) {
            zzazz zzazz0 = new zzazz(zzbad0, this.zzb);
            this.zza.onAdLoaded(zzazz0);
        }
    }
}

