package com.google.android.gms.internal.ads;

public final class zzcgb implements Runnable {
    public final zzcgd zza;
    public final String zzb;

    public zzcgb(zzcgd zzcgd0, String s) {
        this.zza = zzcgd0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

