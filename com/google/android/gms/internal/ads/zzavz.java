package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzavz implements ThreadFactory {
    private final ThreadFactory zza;
    private final AtomicInteger zzb;

    zzavz() {
        this.zza = Executors.defaultThreadFactory();
        this.zzb = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = this.zza.newThread(runnable0);
        thread0.setName("gads-" + this.zzb.getAndIncrement());
        return thread0;
    }
}

