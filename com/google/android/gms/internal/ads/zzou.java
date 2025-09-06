package com.google.android.gms.internal.ads;

public final class zzou implements Runnable {
    public final zzpe zza;
    public final long zzb;

    public zzou(zzpe zzpe0, long v) {
        this.zza = zzpe0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        this.zza.zzs(this.zzb);
    }
}

