package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class zzgca extends zzfxe implements Future {
    @Override
    public boolean cancel(boolean z) {
        return this.zzb().cancel(z);
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zzb().get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzb().get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.zzb().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.zzb().isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxe
    protected Object zza() {
        throw null;
    }

    protected abstract Future zzb();
}

