package com.google.android.gms.measurement.internal;

final class zzc implements Runnable {
    private final long zza;
    private final zzb zzb;

    zzc(zzb zzb0, long v) {
        this.zza = v;
        this.zzb = zzb0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}

