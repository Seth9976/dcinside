package com.google.android.gms.internal.ads;

public final class zzccd implements Runnable {
    public final zzcck zza;
    public final boolean zzb;
    public final long zzc;

    public zzccd(zzcck zzcck0, boolean z, long v) {
        this.zza = zzcck0;
        this.zzb = z;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzJ(this.zzb, this.zzc);
    }
}

