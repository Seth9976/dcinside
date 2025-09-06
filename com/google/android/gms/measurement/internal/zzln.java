package com.google.android.gms.measurement.internal;

final class zzln implements Runnable {
    private final long zza;
    private final zzlj zzb;

    zzln(zzlj zzlj0, long v) {
        this.zza = v;
        this.zzb = zzlj0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}

