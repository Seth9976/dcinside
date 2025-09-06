package com.google.android.gms.internal.ads;

public final class zzpc implements Runnable {
    public final zzpe zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;

    public zzpc(zzpe zzpe0, String s, long v, long v1) {
        this.zza = zzpe0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override
    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd);
    }
}

