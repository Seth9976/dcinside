package com.google.android.gms.measurement.internal;

final class zznf implements Runnable {
    long zza;
    long zzb;
    final zzng zzc;

    zznf(zzng zzng0, long v, long v1) {
        this.zzc = zzng0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final void run() {
        this.zzc.zza.zzl().zzb(new zzni(this));
    }
}

