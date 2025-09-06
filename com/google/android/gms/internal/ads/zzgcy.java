package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzgcy extends zzgcv implements zzgct {
    final ScheduledExecutorService zza;

    zzgcy(ScheduledExecutorService scheduledExecutorService0) {
        super(scheduledExecutorService0);
        scheduledExecutorService0.getClass();
        this.zza = scheduledExecutorService0;
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        zzgdi zzgdi0 = zzgdi.zze(runnable0, null);
        return new zzgcw(zzgdi0, this.zza.schedule(zzgdi0, v, timeUnit0));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        return this.zzc(callable0, v, timeUnit0);
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        zzgcx zzgcx0 = new zzgcx(runnable0);
        return new zzgcw(zzgcx0, this.zza.scheduleAtFixedRate(zzgcx0, v, v1, timeUnit0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        zzgcx zzgcx0 = new zzgcx(runnable0);
        return new zzgcw(zzgcx0, this.zza.scheduleWithFixedDelay(zzgcx0, v, v1, timeUnit0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgct
    public final zzgcr zzc(Callable callable0, long v, TimeUnit timeUnit0) {
        zzgdi zzgdi0 = new zzgdi(callable0);
        return new zzgcw(zzgdi0, this.zza.schedule(zzgdi0, v, timeUnit0));
    }
}

