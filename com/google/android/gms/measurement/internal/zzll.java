package com.google.android.gms.measurement.internal;

final class zzll implements Runnable {
    private final zzlk zza;
    private final zzlk zzb;
    private final long zzc;
    private final boolean zzd;
    private final zzlj zze;

    zzll(zzlj zzlj0, zzlk zzlk0, zzlk zzlk1, long v, boolean z) {
        this.zza = zzlk0;
        this.zzb = zzlk1;
        this.zzc = v;
        this.zzd = z;
        this.zze = zzlj0;
        super();
    }

    @Override
    public final void run() {
        zzlj.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

