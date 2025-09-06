package com.google.android.gms.ads.nonagon.signalgeneration;

public final class zzl implements Runnable {
    public final zzo zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzl(zzo zzo0, boolean z, boolean z1) {
        this.zza = zzo0;
        this.zzb = z;
        this.zzc = z1;
    }

    @Override
    public final void run() {
        this.zza.zzd(this.zzb, this.zzc);
    }
}

