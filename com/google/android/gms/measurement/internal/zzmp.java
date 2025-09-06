package com.google.android.gms.measurement.internal;

final class zzmp implements Runnable {
    private final zzgb zza;
    private final zzmq zzb;

    zzmp(zzmq zzmq0, zzgb zzgb0) {
        this.zza = zzgb0;
        this.zzb = zzmq0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zzb) {
            zzmq.zza(this.zzb, false);
            if(!this.zzb.zza.zzal()) {
                this.zzb.zza.zzj().zzp().zza("Connected to service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}

