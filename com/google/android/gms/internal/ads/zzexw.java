package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzexw implements Runnable {
    public final zzeya zza;
    public final zze zzb;

    public zzexw(zzeya zzeya0, zze zze0) {
        this.zza = zzeya0;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb);
    }
}

