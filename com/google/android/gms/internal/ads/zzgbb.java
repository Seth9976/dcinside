package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class zzgbb extends AbstractExecutorService implements zzgcs {
    @Override
    protected final RunnableFuture newTaskFor(Runnable runnable0, Object object0) {
        return zzgdi.zze(runnable0, object0);
    }

    @Override
    protected final RunnableFuture newTaskFor(Callable callable0) {
        return new zzgdi(callable0);
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return (t0)super.submit(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return (t0)super.submit(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return (t0)super.submit(callable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcs
    public final t0 zza(Runnable runnable0) {
        return (t0)super.submit(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcs
    public final t0 zzb(Callable callable0) {
        return (t0)super.submit(callable0);
    }
}

