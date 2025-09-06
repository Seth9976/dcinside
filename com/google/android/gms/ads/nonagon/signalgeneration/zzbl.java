package com.google.android.gms.ads.nonagon.signalgeneration;

public final class zzbl implements Runnable {
    public final zzbm zza;
    public final zzbk zzb;

    public zzbl(zzbm zzbm0, zzbk zzbk0) {
        this.zza = zzbm0;
        this.zzb = zzbk0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

