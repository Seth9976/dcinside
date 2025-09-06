package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o3.a;

abstract class zzgbe extends zzgbx implements Runnable {
    @a
    t0 zza;
    @a
    Object zzb;
    public static final int zzc;

    zzgbe(t0 t00, Object object0) {
        t00.getClass();
        this.zza = t00;
        this.zzb = object0;
    }

    @Override
    public final void run() {
        Object object2;
        Object object1;
        t0 t00 = this.zza;
        Object object0 = this.zzb;
        if((this.isCancelled() | t00 == null | (object0 == null ? 1 : 0)) != 0) {
            return;
        }
        this.zza = null;
        if(t00.isCancelled()) {
            this.zzs(t00);
            return;
        }
        try {
            object1 = zzgch.zzp(t00);
        }
        catch(CancellationException unused_ex) {
            this.cancel(false);
            return;
        }
        catch(ExecutionException executionException0) {
            this.zzd(executionException0.getCause());
            return;
        }
        catch(Exception exception0) {
            this.zzd(exception0);
            return;
        }
        catch(Error error0) {
            this.zzd(error0);
            return;
        }
        try {
            object2 = this.zze(object0, object1);
        }
        catch(Throwable throwable0) {
            try {
                zzgda.zza(throwable0);
                this.zzd(throwable0);
                this.zzb = null;
                return;
            }
            catch(Throwable throwable1) {
                this.zzb = null;
                throw throwable1;
            }
        }
        this.zzb = null;
        this.zzf(object2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    @a
    protected final String zza() {
        t0 t00 = this.zza;
        Object object0 = this.zzb;
        String s = super.zza();
        String s1 = t00 == null ? "" : "inputFuture=[" + t00.toString() + "], ";
        if(object0 != null) {
            return s1 + "function=[" + object0.toString() + "]";
        }
        return s == null ? null : s1 + s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        this.zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object arg1, Object arg2) throws Exception;

    abstract void zzf(Object arg1);
}

