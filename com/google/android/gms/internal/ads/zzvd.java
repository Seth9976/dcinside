package com.google.android.gms.internal.ads;

public final class zzvd implements Runnable {
    public final zzvk zza;
    public final zzadm zzb;

    public zzvd(zzvk zzvk0, zzadm zzadm0) {
        this.zza = zzvk0;
        this.zzb = zzadm0;
    }

    @Override
    public final void run() {
        this.zza.zzG(this.zzb);
    }
}

