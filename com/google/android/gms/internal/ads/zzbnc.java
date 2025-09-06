package com.google.android.gms.internal.ads;

public final class zzbnc implements Runnable {
    public final zzbns zza;
    public final zzbnr zzb;

    public zzbnc(zzbns zzbns0, zzava zzava0, zzbnr zzbnr0) {
        this.zza = zzbns0;
        this.zzb = zzbnr0;
    }

    @Override
    public final void run() {
        this.zza.zzi(null, this.zzb);
    }
}

