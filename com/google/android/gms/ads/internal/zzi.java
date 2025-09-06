package com.google.android.gms.ads.internal;

public final class zzi implements Runnable {
    public final zzk zza;
    public final boolean zzb;

    public zzi(zzk zzk0, boolean z) {
        this.zza = zzk0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

