package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzfft implements t0 {
    private final Object zza;
    private final String zzb;
    private final t0 zzc;

    @VisibleForTesting(otherwise = 3)
    public zzfft(Object object0, String s, t0 t00) {
        this.zza = object0;
        this.zzb = s;
        this.zzc = t00;
    }

    @Override  // com.google.common.util.concurrent.t0
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zzc.addListener(runnable0, executor0);
    }

    @Override
    public final boolean cancel(boolean z) {
        return this.zzc.cancel(z);
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zzc.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzc.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.zzc.isDone();
    }

    @Override
    public final String toString() {
        return this.zzb + "@" + System.identityHashCode(this);
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

