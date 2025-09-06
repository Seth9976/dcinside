package com.google.android.gms.internal.ads;

public final class zzaaw implements Runnable {
    public final zzabb zza;
    public final Exception zzb;

    public zzaaw(zzabb zzabb0, Exception exception0) {
        this.zza = zzabb0;
        this.zzb = exception0;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb);
    }
}

