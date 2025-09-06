package com.google.android.gms.internal.ads;

public final class zzcan implements Runnable {
    public final zzcaw zza;
    public final int zzb;

    public zzcan(zzcaw zzcaw0, int v) {
        this.zza = zzcaw0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb);
    }
}

