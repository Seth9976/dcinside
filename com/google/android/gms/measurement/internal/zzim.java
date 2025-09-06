package com.google.android.gms.measurement.internal;

final class zzim implements Runnable {
    private final zzae zza;
    private final zzic zzb;

    zzim(zzic zzic0, zzae zzae0) {
        this.zza = zzae0;
        this.zzb = zzic0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzr();
        if(this.zza.zzc.zza() == null) {
            this.zzb.zza.zza(this.zza);
            return;
        }
        this.zzb.zza.zzb(this.zza);
    }
}

