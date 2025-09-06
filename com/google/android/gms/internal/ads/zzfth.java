package com.google.android.gms.internal.ads;

public final class zzfth implements Runnable {
    public final zzftn zza;
    public final Runnable zzb;

    public zzfth(zzftn zzftn0, Runnable runnable0) {
        this.zza = zzftn0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb);
    }
}

