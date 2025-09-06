package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzfqt implements zzfqs {
    private zzfqt() {
        throw null;
    }

    zzfqt(zzfqu zzfqu0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfqs
    public final ExecutorService zza(int v) {
        return this.zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzfqs
    public final ExecutorService zzb(ThreadFactory threadFactory0, int v) {
        return this.zzc(1, threadFactory0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfqs
    public final ExecutorService zzc(int v, ThreadFactory threadFactory0, int v1) {
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(v, v, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor0);
    }
}

