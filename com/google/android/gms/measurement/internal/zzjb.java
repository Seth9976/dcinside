package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzjb implements Callable {
    private final String zza;
    private final zzic zzb;

    zzjb(zzic zzic0, String s) {
        this.zza = s;
        this.zzb = zzic0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        this.zzb.zza.zzr();
        return this.zzb.zza.zzf().zzl(this.zza);
    }
}

