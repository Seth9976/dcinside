package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.zzfi.zzo;

final class zza implements Runnable {
    private final int zza;
    private final zzo zzb;
    private final DynamiteClearcutLogger zzc;

    zza(DynamiteClearcutLogger dynamiteClearcutLogger0, int v, zzo zzfi$zzo0) {
        this.zzc = dynamiteClearcutLogger0;
        this.zza = v;
        this.zzb = zzfi$zzo0;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zzc.zza(this.zza, this.zzb);
    }
}

