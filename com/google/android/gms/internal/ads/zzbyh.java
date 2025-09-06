package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzbyh implements ThreadFactory {
    private final AtomicInteger zza;

    zzbyh(zzbyi zzbyi0) {
        this.zza = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(@NonNull Runnable runnable0) {
        return new Thread(runnable0, "AdWorker(SCION_TASK_EXECUTOR) #" + this.zza.getAndIncrement());
    }
}

