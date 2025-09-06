package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzks implements Runnable {
    public final zzkw zza;
    public final Pair zzb;
    public final zztx zzc;
    public final zzuc zzd;

    public zzks(zzkw zzkw0, Pair pair0, zztx zztx0, zzuc zzuc0) {
        this.zza = zzkw0;
        this.zzb = pair0;
        this.zzc = zztx0;
        this.zzd = zzuc0;
    }

    @Override
    public final void run() {
        this.zza.zza.zzh.zzag(((int)(((Integer)this.zzb.first))), ((zzug)this.zzb.second), this.zzc, this.zzd);
    }
}

