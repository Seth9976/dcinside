package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeqc implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeqc(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzerr zzerr0 = ((zzert)this.zza).zza();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzb.zzb();
        return new zzesd(zzerr0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmr)))))), scheduledExecutorService0);
    }
}

