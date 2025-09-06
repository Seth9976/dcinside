package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzku implements Runnable {
    private final AtomicReference zza;
    private final zzjq zzb;

    zzku(zzjq zzjq0, AtomicReference atomicReference0) {
        this.zza = atomicReference0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Long long0 = this.zzb.zze().zzc(this.zzb.zzg().zzad(), zzbh.zzao);
                this.zza.set(long0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

