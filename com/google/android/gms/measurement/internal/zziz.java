package com.google.android.gms.measurement.internal;

final class zziz implements Runnable {
    private final zzon zza;
    private final zzo zzb;
    private final zzic zzc;

    zziz(zzic zzic0, zzon zzon0, zzo zzo0) {
        this.zza = zzon0;
        this.zzb = zzo0;
        this.zzc = zzic0;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zza.zzr();
        if(this.zza.zza() == null) {
            this.zzc.zza.zza(this.zza.zza, this.zzb);
            return;
        }
        this.zzc.zza.zza(this.zza, this.zzb);
    }
}

