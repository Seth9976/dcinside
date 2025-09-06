package com.google.android.gms.measurement.internal;

final class zznx implements Runnable {
    private final zzok zza;
    private final zznv zzb;

    zznx(zznv zznv0, zzok zzok0) {
        this.zza = zzok0;
        this.zzb = zznv0;
        super();
    }

    @Override
    public final void run() {
        zznv.zza(this.zzb, this.zza);
        this.zzb.zzv();
    }
}

