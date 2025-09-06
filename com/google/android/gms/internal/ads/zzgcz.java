package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzgcz {
    public static zzgcs zza(ExecutorService executorService0) {
        if(executorService0 instanceof zzgcs) {
            return (zzgcs)executorService0;
        }
        return executorService0 instanceof ScheduledExecutorService ? new zzgcy(((ScheduledExecutorService)executorService0)) : new zzgcv(executorService0);
    }

    public static zzgct zzb(ScheduledExecutorService scheduledExecutorService0) {
        return new zzgcy(scheduledExecutorService0);
    }

    public static Executor zzc() {
        return zzgbv.zza;
    }

    static Executor zzd(Executor executor0, zzgax zzgax0) {
        executor0.getClass();
        return executor0 == zzgbv.zza ? executor0 : new zzgcu(executor0, zzgax0);
    }
}

