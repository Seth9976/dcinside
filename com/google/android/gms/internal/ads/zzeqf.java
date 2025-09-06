package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeqf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeqf(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzesl zzesl0 = ((zzesn)this.zza).zza();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzb.zzb();
        return new zzesd(zzesl0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlY)))))), scheduledExecutorService0);
    }
}

