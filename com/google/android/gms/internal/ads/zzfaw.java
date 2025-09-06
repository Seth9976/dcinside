package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzfaw implements Runnable {
    public final zzfay zza;
    public final zze zzb;

    public zzfaw(zzfay zzfay0, zze zze0) {
        this.zza = zzfay0;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        this.zza.zze.zzd.zzdz(this.zzb);
    }
}

