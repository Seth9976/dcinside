package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

final class zzgcl implements t0 {
    static final t0 zza;
    private static final zzgcq zzb;
    private final Object zzc;

    static {
        zzgcl.zza = new zzgcl(null);
        zzgcl.zzb = new zzgcq(zzgcl.class);
    }

    zzgcl(Object object0) {
        this.zzc = object0;
    }

    @Override  // com.google.common.util.concurrent.t0
    public final void addListener(Runnable runnable0, Executor executor0) {
        zzfun.zzc(runnable0, "Runnable was null.");
        zzfun.zzc(executor0, "Executor was null.");
        try {
            executor0.execute(runnable0);
        }
        catch(Exception exception0) {
            zzgcl.zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, exception0);
        }
    }

    @Override
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override
    public final Object get() {
        return this.zzc;
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws ExecutionException {
        timeUnit0.getClass();
        return this.zzc;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    @Override
    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.zzc + "]]";
    }
}

