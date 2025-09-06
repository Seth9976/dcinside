package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

public final class zzepw implements zzher {
    private final zzhfj zza;

    public zzepw(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzeqr zzeqr0 = zzeqt.zza();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zza.zzb();
        return new zzesd(zzeqr0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmd)))))), scheduledExecutorService0);
    }
}

