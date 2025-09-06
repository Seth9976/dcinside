package com.google.android.gms.internal.ads;

public final class zzfsm implements Runnable {
    public final zzfsw zza;
    public final zzfsd zzb;
    public final zzftb zzc;

    public zzfsm(zzfsw zzfsw0, zzfsd zzfsd0, zzftb zzftb0) {
        this.zza = zzfsw0;
        this.zzb = zzfsd0;
        this.zzc = zzftb0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb, this.zzc);
    }
}

