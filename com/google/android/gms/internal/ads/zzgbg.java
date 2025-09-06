package com.google.android.gms.internal.ads;

public final class zzgbg implements Runnable {
    public final zzgbh zza;
    public final zzfxi zzb;

    public zzgbg(zzgbh zzgbh0, zzfxi zzfxi0) {
        this.zza = zzgbh0;
        this.zzb = zzfxi0;
    }

    @Override
    public final void run() {
        this.zza.zzx(this.zzb);
    }
}

