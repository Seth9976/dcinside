package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzbzs implements ThreadFactory {
    final String zza;
    private final AtomicInteger zzb;

    zzbzs(String s) {
        this.zza = s;
        super();
        this.zzb = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        int v = this.zzb.getAndIncrement();
        return new Thread(runnable0, "AdWorker(" + this.zza + ") #" + v);
    }
}

