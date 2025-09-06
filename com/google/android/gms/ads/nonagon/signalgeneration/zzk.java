package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;

public final class zzk implements Runnable {
    public final zzo zza;
    public final Object zzb;
    public final Pair zzc;

    public zzk(zzo zzo0, Object object0, Pair pair0) {
        this.zza = zzo0;
        this.zzb = object0;
        this.zzc = pair0;
    }

    @Override
    public final void run() {
        this.zza.zze(this.zzb, this.zzc);
    }
}

