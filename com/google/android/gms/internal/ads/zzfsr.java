package com.google.android.gms.internal.ads;

public final class zzfsr implements Runnable {
    public final zzfsw zza;
    public final zzfsy zzb;
    public final zzftb zzc;

    public zzfsr(zzfsw zzfsw0, zzfsy zzfsy0, zzftb zzftb0) {
        this.zza = zzfsw0;
        this.zzb = zzfsy0;
        this.zzc = zzftb0;
    }

    @Override
    public final void run() {
        this.zza.zzd(this.zzb, this.zzc);
    }
}

