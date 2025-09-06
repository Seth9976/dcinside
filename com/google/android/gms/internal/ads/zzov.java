package com.google.android.gms.internal.ads;

public final class zzov implements Runnable {
    public final zzpe zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public zzov(zzpe zzpe0, int v, long v1, long v2) {
        this.zza = zzpe0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final void run() {
        this.zza.zzu(this.zzb, this.zzc, this.zzd);
    }
}

