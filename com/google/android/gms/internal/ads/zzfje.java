package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzfje extends zzbaf {
    final zzgdb zza;
    final zzft zzb;
    final zzfjf zzc;

    zzfje(zzfjf zzfjf0, zzgdb zzgdb0, zzft zzft0) {
        this.zza = zzgdb0;
        this.zzb = zzft0;
        this.zzc = zzfjf0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzc(zze zze0) {
        zzo.zzj(("Failed to load app open ad with error parcel: " + zze0.zzb().toString() + " for ad unit: " + this.zzb.zza));
        this.zzc.zzA(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzd(zzbad zzbad0) {
        zzfjd.zza(zzbad0, this.zza);
    }
}

