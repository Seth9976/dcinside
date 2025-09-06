package com.google.android.gms.measurement.internal;

final class zzke implements Runnable {
    private final boolean zza;
    private final zzjq zzb;

    zzke(zzjq zzjq0, boolean z) {
        this.zza = z;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        boolean z = this.zzb.zzu.zzac();
        boolean z1 = this.zzb.zzu.zzab();
        this.zzb.zzu.zza(this.zza);
        if(z1 == this.zza) {
            this.zzb.zzu.zzj().zzp().zza("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if(this.zzb.zzu.zzac() == z || this.zzb.zzu.zzac() != this.zzb.zzu.zzab()) {
            this.zzb.zzu.zzj().zzv().zza("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(z));
        }
        this.zzb.zzav();
    }
}

