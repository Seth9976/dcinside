package com.google.android.gms.measurement.internal;

final class zzid implements Runnable {
    private final zzjo zza;
    private final zzhy zzb;

    zzid(zzhy zzhy0, zzjo zzjo0) {
        this.zza = zzjo0;
        this.zzb = zzhy0;
        super();
    }

    @Override
    public final void run() {
        zzhy.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}

