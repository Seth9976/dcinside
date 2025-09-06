package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

public final class zzh extends zzbn {
    private final AdLoadCallback zza;
    private final Object zzb;

    public zzh(AdLoadCallback adLoadCallback0, Object object0) {
        this.zza = adLoadCallback0;
        this.zzb = object0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zze0) {
        AdLoadCallback adLoadCallback0 = this.zza;
        if(adLoadCallback0 != null) {
            adLoadCallback0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        AdLoadCallback adLoadCallback0 = this.zza;
        if(adLoadCallback0 != null) {
            Object object0 = this.zzb;
            if(object0 != null) {
                adLoadCallback0.onAdLoaded(object0);
            }
        }
    }
}

