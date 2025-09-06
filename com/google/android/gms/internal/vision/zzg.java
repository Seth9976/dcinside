package com.google.android.gms.internal.vision;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzg implements zzf {
    private zzg() {
    }

    zzg(zzh zzh0) {
    }

    @Override  // com.google.android.gms.internal.vision.zzf
    public final ExecutorService zza(int v, int v1) {
        ThreadFactory threadFactory0 = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor0);
    }
}

