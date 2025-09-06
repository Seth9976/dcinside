package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class zzffo implements zzher {
    private final zzhfj zza;

    public zzffo(zzhfj zzhfj0) {
        this.zza = zzhfj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        ScheduledExecutorService scheduledExecutorService0 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, ((ThreadFactory)this.zza.zzb())));
        zzhez.zzb(scheduledExecutorService0);
        return scheduledExecutorService0;
    }
}

