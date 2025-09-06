package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class zzd implements Callable {
    private zzb zza;

    public zzd(zzb zzb0) {
        this.zza = zzb0;
    }

    @Override
    public final Object call() {
        return new zzk(this.zza.zza);
    }
}

