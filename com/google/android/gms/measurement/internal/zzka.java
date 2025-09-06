package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzka implements Runnable {
    private final AtomicReference zza;
    private final zzjq zzb;

    zzka(zzjq zzjq0, AtomicReference atomicReference0) {
        this.zza = atomicReference0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Boolean boolean0 = Boolean.valueOf(this.zzb.zze().zzi(this.zzb.zzg().zzad()));
                this.zza.set(boolean0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

