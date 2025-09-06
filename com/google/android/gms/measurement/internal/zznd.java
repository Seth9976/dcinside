package com.google.android.gms.measurement.internal;

final class zznd implements Runnable {
    private final long zza;
    private final zznb zzb;

    zznd(zznb zznb0, long v) {
        this.zza = v;
        this.zzb = zznb0;
        super();
    }

    @Override
    public final void run() {
        zznb.zza(this.zzb, this.zza);
    }
}

