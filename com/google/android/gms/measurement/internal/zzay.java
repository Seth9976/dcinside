package com.google.android.gms.measurement.internal;

final class zzay implements Runnable {
    private final zzjc zza;
    private final zzav zzb;

    zzay(zzav zzav0, zzjc zzjc0) {
        this.zza = zzjc0;
        this.zzb = zzav0;
        super();
    }

    @Override
    public final void run() {
        this.zza.zzd();
        if(zzab.zza()) {
            this.zza.zzl().zzb(this);
            return;
        }
        boolean z = this.zzb.zzc();
        zzav.zza(this.zzb, 0L);
        if(z) {
            this.zzb.zzb();
        }
    }
}

