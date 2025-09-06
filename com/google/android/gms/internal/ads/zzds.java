package com.google.android.gms.internal.ads;

public final class zzds implements Runnable {
    public final zzdw zza;
    public final zzyl zzb;

    public zzds(zzdw zzdw0, zzyl zzyl0) {
        this.zza = zzdw0;
        this.zzb = zzyl0;
    }

    @Override
    public final void run() {
        int v = this.zza.zza();
        this.zzb.zza.zzl(v);
    }
}

