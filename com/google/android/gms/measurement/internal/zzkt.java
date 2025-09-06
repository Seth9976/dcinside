package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkt implements Runnable {
    private final AtomicReference zza;
    private final zzjq zzb;

    zzkt(zzjq zzjq0, AtomicReference atomicReference0) {
        this.zza = atomicReference0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Integer integer0 = this.zzb.zze().zzb(this.zzb.zzg().zzad(), zzbh.zzap);
                this.zza.set(integer0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

