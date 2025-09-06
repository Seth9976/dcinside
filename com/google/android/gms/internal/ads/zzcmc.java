package com.google.android.gms.internal.ads;

public final class zzcmc implements Runnable {
    public final zzcmk zza;
    public final Throwable zzb;

    public zzcmc(zzcmk zzcmk0, Throwable throwable0) {
        this.zza = zzcmk0;
        this.zzb = throwable0;
    }

    @Override
    public final void run() {
        this.zza.zzh(this.zzb);
    }
}

