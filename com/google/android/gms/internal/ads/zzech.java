package com.google.android.gms.internal.ads;

public final class zzech implements Runnable {
    public final zzfla zza;
    public final zzcfo zzb;

    public zzech(zzfla zzfla0, zzcfo zzcfo0) {
        this.zza = zzfla0;
        this.zzb = zzcfo0;
    }

    @Override
    public final void run() {
        this.zza.zzg(this.zzb);
    }
}

