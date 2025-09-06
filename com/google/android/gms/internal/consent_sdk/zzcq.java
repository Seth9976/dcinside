package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class zzcq implements Executor {
    private final AtomicInteger zza;
    private final ThreadPoolExecutor zzb;
    private WeakReference zzc;

    zzcq(String s) {
        this.zza = new AtomicInteger(1);
        this.zzc = new WeakReference(null);
        zzcp zzcp0 = (Runnable runnable0) -> {
            Thread thread0 = new Thread(runnable0, "Google consent worker #" + this.zza.getAndIncrement());
            this.zzc = new WeakReference(thread0);
            return thread0;
        };
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcp0);
        this.zzb = threadPoolExecutor0;
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(Thread.currentThread() == this.zzc.get()) {
            runnable0.run();
            return;
        }
        this.zzb.execute(runnable0);
    }

    // 检测为 Lambda 实现
    final Thread zza(String s, Runnable runnable0) [...]
}

