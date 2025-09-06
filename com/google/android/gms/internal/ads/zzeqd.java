package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeqd implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeqd(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzerz zzerz0 = ((zzesb)this.zza).zza();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzb.zzb();
        return new zzesd(zzerz0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzma)))))), scheduledExecutorService0);
    }
}

