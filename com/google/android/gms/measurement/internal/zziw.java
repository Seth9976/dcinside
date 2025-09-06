package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zziw implements Callable {
    private final zzbf zza;
    private final String zzb;
    private final zzic zzc;

    zziw(zzic zzic0, zzbf zzbf0, String s) {
        this.zza = zzbf0;
        this.zzb = s;
        this.zzc = zzic0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        this.zzc.zza.zzr();
        return this.zzc.zza.zzm().zza(this.zza, this.zzb);
    }
}

