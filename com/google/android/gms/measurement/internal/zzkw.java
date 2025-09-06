package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkw implements Runnable {
    private final AtomicReference zza;
    private final zzjq zzb;

    zzkw(zzjq zzjq0, AtomicReference atomicReference0) {
        this.zza = atomicReference0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Double double0 = this.zzb.zze().zza(this.zzb.zzg().zzad(), zzbh.zzaq);
                this.zza.set(double0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

