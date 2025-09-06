package com.google.android.gms.internal.ads;

public final class zzdse implements Runnable {
    public final zzdsf zza;
    public final String zzb;

    public zzdse(zzdsf zzdsf0, String s) {
        this.zza = zzdsf0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzd.zza(this.zzb);
    }
}

