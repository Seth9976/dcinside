package com.google.android.gms.internal.ads;

public final class zzcmd implements Runnable {
    public final zzcmk zza;
    public final Throwable zzb;

    public zzcmd(zzcmk zzcmk0, Throwable throwable0) {
        this.zza = zzcmk0;
        this.zzb = throwable0;
    }

    @Override
    public final void run() {
        this.zza.zzg(this.zzb);
    }
}

