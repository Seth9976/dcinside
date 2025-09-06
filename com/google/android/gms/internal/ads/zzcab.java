package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o3.j;

@j
public class zzcab implements t0 {
    private final zzgdb zza;

    public zzcab() {
        this.zza = zzgdb.zze();
    }

    @Override  // com.google.common.util.concurrent.t0
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zza.addListener(runnable0, executor0);
    }

    @Override
    public boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.zza.isDone();
    }

    private static final boolean zza(boolean z) {
        if(!z) {
            zzv.zzp().zzv(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean zzc(@Nullable Object object0) {
        boolean z = this.zza.zzc(object0);
        zzcab.zza(z);
        return z;
    }

    public final boolean zzd(Throwable throwable0) {
        boolean z = this.zza.zzd(throwable0);
        zzcab.zza(z);
        return z;
    }
}

