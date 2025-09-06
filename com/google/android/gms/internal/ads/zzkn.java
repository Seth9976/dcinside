package com.google.android.gms.internal.ads;

public final class zzkn implements Runnable {
    public final zzko zza;
    public final zzfxk zzb;
    public final zzug zzc;

    public zzkn(zzko zzko0, zzfxk zzfxk0, zzug zzug0) {
        this.zza = zzko0;
        this.zzb = zzfxk0;
        this.zzc = zzug0;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}

