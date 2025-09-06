package com.google.android.gms.ads.internal.util;

final class zza implements Runnable {
    final zzb zza;

    zza(zzb zzb0) {
        this.zza = zzb0;
        super();
    }

    @Override
    public final void run() {
        this.zza.zzb = Thread.currentThread();
        this.zza.zza();
    }
}

