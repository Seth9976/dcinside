package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzevd implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzevd(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj0;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public static zzevb zza(String s, zzbam zzbam0, zzbzm zzbzm0, ScheduledExecutorService scheduledExecutorService0, zzgcs zzgcs0) {
        return new zzevb(s, zzbam0, zzbzm0, scheduledExecutorService0, zzgcs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzevb(((zzevy)this.zza).zza(), zzckl.zza(), ((zzbzm)this.zzb.zzb()), ((ScheduledExecutorService)this.zzc.zzb()), zzffh.zzc());
    }
}

