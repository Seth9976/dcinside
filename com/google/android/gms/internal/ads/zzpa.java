package com.google.android.gms.internal.ads;

public final class zzpa implements Runnable {
    public final zzpe zza;
    public final zzab zzb;
    public final zzht zzc;

    public zzpa(zzpe zzpe0, zzab zzab0, zzht zzht0) {
        this.zza = zzpe0;
        this.zzb = zzab0;
        this.zzc = zzht0;
    }

    @Override
    public final void run() {
        this.zza.zzr(this.zzb, this.zzc);
    }
}

