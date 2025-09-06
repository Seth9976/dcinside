package com.google.android.gms.measurement.internal;

final class zzlq implements Runnable {
    private final zzlk zza;
    private final long zzb;
    private final zzlj zzc;

    zzlq(zzlj zzlj0, zzlk zzlk0, long v) {
        this.zza = zzlk0;
        this.zzb = v;
        this.zzc = zzlj0;
        super();
    }

    @Override
    public final void run() {
        zzlj.zza(this.zzc, this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzo().zza(null);
    }
}

