package com.google.android.gms.internal.ads;

public final class zzfgb implements Runnable {
    public final zzfgd zza;
    public final zzfft zzb;

    public zzfgb(zzfgd zzfgd0, zzfft zzfft0) {
        this.zza = zzfgd0;
        this.zzb = zzfft0;
    }

    @Override
    public final void run() {
        this.zza.zza.zzd.zzc(this.zzb);
    }
}

