package com.google.android.gms.internal.ads;

public final class zzcms implements Runnable {
    public final zzcmw zza;
    public final int zzb;
    public final int zzc;

    public zzcms(zzcmw zzcmw0, int v, int v1) {
        this.zza = zzcmw0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb, this.zzc);
    }
}

