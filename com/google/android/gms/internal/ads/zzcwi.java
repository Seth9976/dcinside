package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzcwi implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcwi(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzcwg(((zzcwh)this.zza).zza(), ((zzhff)this.zzb).zzc(), zzffh.zzc(), ((ScheduledExecutorService)this.zzc.zzb()));
    }
}

