package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

final class zzjz implements Executor {
    private final zzjq zza;

    zzjz(zzjq zzjq0) {
        this.zza = zzjq0;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.zza.zzl().zzb(runnable0);
    }
}

