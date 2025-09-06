package com.google.android.gms.internal.ads;

public final class zzow implements Runnable {
    public final zzpe zza;
    public final zzpg zzb;

    public zzow(zzpe zzpe0, zzpg zzpg0) {
        this.zza = zzpe0;
        this.zzb = zzpg0;
    }

    @Override
    public final void run() {
        this.zza.zzl(this.zzb);
    }
}

