package com.google.android.gms.measurement.internal;

final class zzmz implements Runnable {
    private final zznv zza;
    private final Runnable zzb;

    zzmz(zzmy zzmy0, zznv zznv0, Runnable runnable0) {
        this.zza = zznv0;
        this.zzb = runnable0;
        super();
    }

    @Override
    public final void run() {
        this.zza.zzr();
        this.zza.zza(this.zzb);
        this.zza.zzw();
    }
}

