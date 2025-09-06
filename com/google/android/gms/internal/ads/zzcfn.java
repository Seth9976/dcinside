package com.google.android.gms.internal.ads;

public final class zzcfn implements Runnable {
    public final zzcfp zza;
    public final zzecp zzb;

    public zzcfn(zzcfp zzcfp0, zzecp zzecp0) {
        this.zza = zzcfp0;
        this.zzb = zzecp0;
    }

    @Override
    public final void run() {
        zzcfo zzcfo0 = new zzcfo(this.zza);
        this.zzb.zzf(zzcfo0);
    }
}

