package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkk implements Runnable {
    private final AtomicReference zza;
    private final boolean zzb;
    private final zzjq zzc;

    zzkk(zzjq zzjq0, AtomicReference atomicReference0, boolean z) {
        this.zza = atomicReference0;
        this.zzb = z;
        this.zzc = zzjq0;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zzo().zza(this.zza, this.zzb);
    }
}

