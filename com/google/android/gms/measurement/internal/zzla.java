package com.google.android.gms.measurement.internal;

final class zzla implements Runnable {
    private final zzje zza;
    private final long zzb;
    private final boolean zzc;
    private final zzje zzd;
    private final zzjq zze;

    zzla(zzjq zzjq0, zzje zzje0, long v, boolean z, zzje zzje1) {
        this.zza = zzje0;
        this.zzb = v;
        this.zzc = z;
        this.zzd = zzje1;
        this.zze = zzjq0;
        super();
    }

    @Override
    public final void run() {
        this.zze.zza(this.zza);
        zzjq.zza(this.zze, this.zza, this.zzb, false, this.zzc);
        zzjq.zza(this.zze, this.zza, this.zzd);
    }
}

