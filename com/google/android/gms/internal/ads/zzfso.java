package com.google.android.gms.internal.ads;

public final class zzfso implements Runnable {
    public final zzfsw zza;
    public final zzftd zzb;
    public final int zzc;
    public final zzftb zzd;

    public zzfso(zzfsw zzfsw0, zzftd zzftd0, int v, zzftb zzftb0) {
        this.zza = zzfsw0;
        this.zzb = zzftd0;
        this.zzc = v;
        this.zzd = zzftb0;
    }

    @Override
    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd);
    }
}

