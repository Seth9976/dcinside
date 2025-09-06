package com.google.android.gms.measurement.internal;

final class zzkv implements Runnable {
    private final Boolean zza;
    private final zzjq zzb;

    zzkv(zzjq zzjq0, Boolean boolean0) {
        this.zza = boolean0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        zzjq.zza(this.zzb, this.zza, true);
    }
}

