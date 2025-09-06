package com.google.android.gms.internal.ads;

public final class zzyf implements Runnable {
    public final zzyg zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public zzyf(zzyg zzyg0, int v, long v1, long v2) {
        this.zza = zzyg0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final void run() {
        this.zza.zzb.zzY(this.zzb, this.zzc, this.zzd);
    }
}

