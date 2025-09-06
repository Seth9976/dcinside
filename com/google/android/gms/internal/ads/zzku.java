package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzku implements Runnable {
    public final zzkw zza;
    public final Pair zzb;
    public final zzuc zzc;

    public zzku(zzkw zzkw0, Pair pair0, zzuc zzuc0) {
        this.zza = zzkw0;
        this.zzb = pair0;
        this.zzc = zzuc0;
    }

    @Override
    public final void run() {
        this.zza.zza.zzh.zzaf(((int)(((Integer)this.zzb.first))), ((zzug)this.zzb.second), this.zzc);
    }
}

