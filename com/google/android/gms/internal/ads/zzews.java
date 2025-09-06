package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzews implements Runnable {
    public final zzewt zza;
    public final zze zzb;

    public zzews(zzewt zzewt0, zze zze0) {
        this.zza = zzewt0;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        this.zza.zze.zzd.zzdz(this.zzb);
    }
}

