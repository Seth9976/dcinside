package com.google.android.gms.internal.ads;

public final class zzdjd implements Runnable {
    public final zzdjf zza;
    public final zzdkd zzb;

    public zzdjd(zzdjf zzdjf0, zzdkd zzdkd0) {
        this.zza = zzdjf0;
        this.zzb = zzdkd0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb);
    }
}

