package com.google.android.gms.measurement.internal;

final class zzne implements Runnable {
    private final long zza;
    private final zznb zzb;

    zzne(zznb zznb0, long v) {
        this.zza = v;
        this.zzb = zznb0;
        super();
    }

    @Override
    public final void run() {
        zznb.zzb(this.zzb, this.zza);
    }
}

