package com.google.android.gms.internal.ads;

public final class zzcjx implements Runnable {
    public final zzcjy zza;
    public final Runnable zzb;

    public zzcjx(zzcjy zzcjy0, Runnable runnable0) {
        this.zza = zzcjy0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        zzcjs zzcjs0 = new zzcjs(this.zza, this.zzb);
        zzbzw.zzf.execute(zzcjs0);
    }
}

