package com.google.android.gms.internal.ads;

public final class zzccb implements Runnable {
    public final zzcck zza;
    public final int zzb;
    public final int zzc;

    public zzccb(zzcck zzcck0, int v, int v1) {
        this.zza = zzcck0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.zzO(this.zzb, this.zzc);
    }
}

