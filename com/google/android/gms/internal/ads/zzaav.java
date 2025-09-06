package com.google.android.gms.internal.ads;

public final class zzaav implements Runnable {
    public final zzabb zza;
    public final long zzb;
    public final int zzc;

    public zzaav(zzabb zzabb0, long v, int v1) {
        this.zza = zzabb0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}

