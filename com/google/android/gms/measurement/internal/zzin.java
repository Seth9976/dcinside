package com.google.android.gms.measurement.internal;

final class zzin implements Runnable {
    private final zzae zza;
    private final zzo zzb;
    private final zzic zzc;

    zzin(zzic zzic0, zzae zzae0, zzo zzo0) {
        this.zza = zzae0;
        this.zzb = zzo0;
        this.zzc = zzic0;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zza.zzr();
        if(this.zza.zzc.zza() == null) {
            this.zzc.zza.zza(this.zza, this.zzb);
            return;
        }
        this.zzc.zza.zzb(this.zza, this.zzb);
    }
}

