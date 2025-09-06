package com.google.android.gms.internal.ads;

public final class zzoz implements Runnable {
    public final zzpe zza;
    public final Exception zzb;

    public zzoz(zzpe zzpe0, Exception exception0) {
        this.zza = zzpe0;
        this.zzb = exception0;
    }

    @Override
    public final void run() {
        this.zza.zzk(this.zzb);
    }
}

