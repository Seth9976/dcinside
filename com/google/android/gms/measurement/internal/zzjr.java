package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class zzjr implements Runnable {
    private zzjq zza;
    private AtomicReference zzb;

    public zzjr(zzjq zzjq0, AtomicReference atomicReference0) {
        this.zza = zzjq0;
        this.zzb = atomicReference0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

