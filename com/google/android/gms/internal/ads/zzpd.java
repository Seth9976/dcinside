package com.google.android.gms.internal.ads;

public final class zzpd implements Runnable {
    public final zzpe zza;
    public final String zzb;

    public zzpd(zzpe zzpe0, String s) {
        this.zza = zzpe0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb);
    }
}

