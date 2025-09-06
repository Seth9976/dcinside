package com.google.android.gms.internal.ads;

public final class zzcqe implements Runnable {
    public final zzcqf zza;
    public final Runnable zzb;

    public zzcqe(zzcqf zzcqf0, Runnable runnable0) {
        this.zza = zzcqf0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        this.zza.zzl(this.zzb);
    }
}

