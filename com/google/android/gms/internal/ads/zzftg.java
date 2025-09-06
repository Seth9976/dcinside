package com.google.android.gms.internal.ads;

public final class zzftg implements Runnable {
    public final zzftn zza;
    public final Runnable zzb;

    public zzftg(zzftn zzftn0, Runnable runnable0) {
        this.zza = zzftn0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        this.zza.zzl(this.zzb);
    }
}

