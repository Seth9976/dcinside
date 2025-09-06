package com.google.android.gms.internal.ads;

public final class zzaat implements Runnable {
    public final zzabb zza;
    public final int zzb;
    public final long zzc;

    public zzaat(zzabb zzabb0, int v, long v1) {
        this.zza = zzabb0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}

