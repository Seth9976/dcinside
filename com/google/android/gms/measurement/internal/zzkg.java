package com.google.android.gms.measurement.internal;

final class zzkg implements Runnable {
    private final long zza;
    private final zzjq zzb;

    zzkg(zzjq zzjq0, long v) {
        this.zza = v;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzk().zzf.zza(this.zza);
        this.zzb.zzj().zzc().zza("Session timeout duration set", this.zza);
    }
}

