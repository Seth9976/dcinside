package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class zzgbt extends zzgcp {
    private final Executor zza;
    final zzgbu zzb;

    zzgbt(zzgbu zzgbu0, Executor executor0) {
        this.zzb = zzgbu0;
        super();
        executor0.getClass();
        this.zza = executor0;
    }

    abstract void zzc(Object arg1);

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final void zzd(Throwable throwable0) {
        zzgbu.zzG(this.zzb, null);
        if(throwable0 instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException)throwable0).getCause());
            return;
        }
        if(throwable0 instanceof CancellationException) {
            this.zzb.cancel(false);
            return;
        }
        this.zzb.zzd(throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final void zze(Object object0) {
        zzgbu.zzG(this.zzb, null);
        this.zzc(object0);
    }

    final void zzf() {
        try {
            this.zza.execute(this);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            this.zzb.zzd(rejectedExecutionException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zzb.isDone();
    }
}

