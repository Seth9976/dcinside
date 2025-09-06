package com.google.android.gms.internal.ads;

public final class zzaay implements Runnable {
    public final zzabb zza;
    public final zzab zzb;
    public final zzht zzc;

    public zzaay(zzabb zzabb0, zzab zzab0, zzht zzht0) {
        this.zza = zzabb0;
        this.zzb = zzab0;
        this.zzc = zzht0;
    }

    @Override
    public final void run() {
        this.zza.zzl(this.zzb, this.zzc);
    }
}

