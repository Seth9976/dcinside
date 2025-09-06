package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkj implements Runnable {
    private final AtomicReference zza;
    private final zzjq zzb;

    zzkj(zzjq zzjq0, AtomicReference atomicReference0) {
        this.zza = atomicReference0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                String s = this.zzb.zze().zzf(this.zzb.zzg().zzad());
                this.zza.set(s);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

