package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

final class zzeep implements zzgcd {
    final zzeeq zza;

    zzeep(zzeeq zzeeq0) {
        this.zza = zzeeq0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zze zze0 = this.zza.zza.zzd().zza(throwable0);
        this.zza.zzd.zzdz(zze0);
        zzfdg.zzb(zze0.zza, throwable0, "DelayedBannerAd.onFailure");
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        ((zzcom)object0).zzk();
    }
}

