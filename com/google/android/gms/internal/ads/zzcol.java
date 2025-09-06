package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcol implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcol(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    public final zzcyl zza() {
        return zzcol.zzc(((ScheduledExecutorService)this.zza.zzb()), ((Clock)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }

    public static zzcyl zzc(ScheduledExecutorService scheduledExecutorService0, Clock clock0) {
        return new zzcyl(scheduledExecutorService0, clock0);
    }
}

