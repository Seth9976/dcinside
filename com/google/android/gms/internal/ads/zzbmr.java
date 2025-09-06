package com.google.android.gms.internal.ads;

public final class zzbmr implements Runnable {
    public final zzbmv zza;
    public final String zzb;

    public zzbmr(zzbmv zzbmv0, String s) {
        this.zza = zzbmv0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb);
    }
}

