package com.google.android.gms.internal.ads;

public final class zzdhp implements Runnable {
    public final zzdia zza;
    public final zzdkd zzb;

    public zzdhp(zzdia zzdia0, zzdkd zzdkd0) {
        this.zza = zzdia0;
        this.zzb = zzdkd0;
    }

    @Override
    public final void run() {
        this.zza.zzz(this.zzb);
    }
}

