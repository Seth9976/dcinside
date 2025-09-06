package com.google.android.gms.internal.ads;

public final class zzcdl implements Runnable {
    public final zzcbs zza;
    public final boolean zzb;
    public final long zzc;

    public zzcdl(zzcbs zzcbs0, boolean z, long v) {
        this.zza = zzcbs0;
        this.zzb = z;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzv(this.zzb, this.zzc);
    }
}

