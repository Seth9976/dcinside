package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfez implements ThreadFactory {
    private final AtomicInteger zza;

    zzfez() {
        this.zza = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, "AdWorker(NG) #" + this.zza.getAndIncrement());
    }
}

