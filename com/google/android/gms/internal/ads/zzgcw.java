package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzgcw extends zzgcb implements zzgcr {
    private final ScheduledFuture zza;

    public zzgcw(t0 t00, ScheduledFuture scheduledFuture0) {
        super(t00);
        this.zza = scheduledFuture0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgca
    public final boolean cancel(boolean z) {
        boolean z1 = this.zzb().cancel(z);
        if(z1) {
            this.zza.cancel(z);
        }
        return z1;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza.compareTo(((Delayed)object0));
    }

    @Override
    public final long getDelay(TimeUnit timeUnit0) {
        return this.zza.getDelay(timeUnit0);
    }
}

