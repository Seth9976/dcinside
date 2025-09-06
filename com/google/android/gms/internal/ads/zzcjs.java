package com.google.android.gms.internal.ads;

public final class zzcjs implements Runnable {
    public final zzcjy zza;
    public final Runnable zzb;

    public zzcjs(zzcjy zzcjy0, Runnable runnable0) {
        this.zza = zzcjy0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

