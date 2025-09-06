package com.google.android.gms.internal.ads;

public final class zzaau implements Runnable {
    public final zzabb zza;
    public final Object zzb;
    public final long zzc;

    public zzaau(zzabb zzabb0, Object object0, long v) {
        this.zza = zzabb0;
        this.zzb = object0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}

