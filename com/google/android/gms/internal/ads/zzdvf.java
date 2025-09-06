package com.google.android.gms.internal.ads;

public final class zzdvf implements Runnable {
    public final zzdvg zza;
    public final String zzb;

    public zzdvf(zzdvg zzdvg0, String s) {
        this.zza = zzdvg0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzi(this.zzb);
    }
}

