package com.google.android.gms.measurement.internal;

final class zziu implements Runnable {
    private final zzbf zza;
    private final zzo zzb;
    private final zzic zzc;

    zziu(zzic zzic0, zzbf zzbf0, zzo zzo0) {
        this.zza = zzbf0;
        this.zzb = zzo0;
        this.zzc = zzic0;
        super();
    }

    @Override
    public final void run() {
        zzbf zzbf0 = this.zzc.zzb(this.zza, this.zzb);
        this.zzc.zzc(zzbf0, this.zzb);
    }
}

