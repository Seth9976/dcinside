package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzfgp implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzfgp(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj1;
        this.zzb = zzhfj2;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzfgn(zzffh.zzc(), ((ScheduledExecutorService)this.zza.zzb()), ((zzfgq)this.zzb).zza());
    }
}

