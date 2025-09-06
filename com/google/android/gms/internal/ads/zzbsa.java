package com.google.android.gms.internal.ads;

public final class zzbsa implements Runnable {
    public final zzbsc zza;
    public final boolean zzb;

    public zzbsa(zzbsc zzbsc0, boolean z) {
        this.zza = zzbsc0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

