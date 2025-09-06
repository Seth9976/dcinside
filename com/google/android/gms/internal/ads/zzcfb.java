package com.google.android.gms.internal.ads;

public final class zzcfb implements Runnable {
    public final zzcff zza;
    public final boolean zzb;
    public final long zzc;

    public zzcfb(zzcff zzcff0, boolean z, long v) {
        this.zza = zzcff0;
        this.zzb = z;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzp(this.zzb, this.zzc);
    }
}

