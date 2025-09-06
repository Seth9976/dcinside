package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import o3.a;

abstract class zzgaw extends zzgbx implements Runnable {
    @a
    t0 zza;
    @a
    Class zzb;
    @a
    Object zzc;

    zzgaw(t0 t00, Class class0, Object object0) {
        t00.getClass();
        this.zza = t00;
        this.zzb = class0;
        this.zzc = object0;
    }

    @Override
    public final void run() {
        Object object2;
        Throwable throwable1;
        Object object1;
        t0 t00 = this.zza;
        Class class0 = this.zzb;
        Object object0 = this.zzc;
        if(((object0 == null ? 1 : 0) | ((t00 == null ? 1 : 0) | (class0 == null ? 1 : 0))) == 0 && !this.isCancelled()) {
            try {
                this.zza = null;
                throwable0 = t00 instanceof zzgdl ? ((zzgdl)t00).zzl() : null;
                if(throwable0 == null) {
                    object1 = zzgch.zzp(t00);
                    goto label_17;
                label_12:
                    throwable1 = executionException0.getCause();
                    if(throwable1 == null) {
                        goto label_14;
                    }
                    goto label_15;
                }
                else {
                    goto label_16;
                }
                goto label_17;
            }
            catch(ExecutionException executionException0) {
                goto label_12;
            }
            catch(Throwable throwable0) {
                goto label_16;
            }
        label_14:
            throwable1 = new NullPointerException("Future type " + t00.getClass() + " threw " + executionException0.getClass() + " without a cause");
        label_15:
            throwable0 = throwable1;
        label_16:
            object1 = null;
        label_17:
            if(throwable0 == null) {
                this.zzc(object1);
                return;
            }
            if(class0.isInstance(throwable0)) {
                try {
                    object2 = this.zze(object0, throwable0);
                }
                catch(Throwable throwable2) {
                    try {
                        zzgda.zza(throwable2);
                        this.zzd(throwable2);
                        this.zzb = null;
                        this.zzc = null;
                        return;
                    }
                    catch(Throwable throwable3) {
                        this.zzb = null;
                        this.zzc = null;
                        throw throwable3;
                    }
                }
                this.zzb = null;
                this.zzc = null;
                this.zzf(object2);
                return;
            }
            this.zzs(t00);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    @a
    protected final String zza() {
        t0 t00 = this.zza;
        Class class0 = this.zzb;
        Object object0 = this.zzc;
        String s = super.zza();
        String s1 = t00 == null ? "" : "inputFuture=[" + t00.toString() + "], ";
        if(class0 != null && object0 != null) {
            return s1 + "exceptionType=[" + class0.toString() + "], fallback=[" + object0.toString() + "]";
        }
        return s == null ? null : s1 + s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        this.zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zze(Object arg1, Throwable arg2) throws Exception;

    abstract void zzf(Object arg1);
}

