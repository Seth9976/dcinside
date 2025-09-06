package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzdxa implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzdxa(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj0;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    public final zzdwz zza() {
        return new zzdwz(((ScheduledExecutorService)this.zza.zzb()), zzffh.zzc(), zzffn.zzc(), ((zzdxv)this.zzb).zza(), zzheq.zza(zzhfc.zza(this.zzc)));
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

