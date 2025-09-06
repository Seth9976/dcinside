package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzgbz extends zzgby {
    private final t0 zza;

    zzgbz(t0 t00) {
        t00.getClass();
        this.zza = t00;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zza.addListener(runnable0, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(v, timeUnit0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    public final String toString() {
        return this.zza.toString();
    }
}

