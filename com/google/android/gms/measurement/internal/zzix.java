package com.google.android.gms.measurement.internal;

final class zzix implements Runnable {
    private final zzbf zza;
    private final String zzb;
    private final zzic zzc;

    zzix(zzic zzic0, zzbf zzbf0, String s) {
        this.zza = zzbf0;
        this.zzb = s;
        this.zzc = zzic0;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zza.zzr();
        this.zzc.zza.zza(this.zza, this.zzb);
    }
}

