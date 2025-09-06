package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapv;

final class zzbi implements zzapq {
    final String zza;
    final zzbk zzb;

    zzbi(zzbo zzbo0, String s, zzbk zzbk0) {
        this.zza = s;
        this.zzb = zzbk0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzapq
    public final void zza(zzapv zzapv0) {
        zzo.zzj(("Failed to load URL: " + this.zza + "\n" + zzapv0.toString()));
        this.zzb.zza(null);
    }
}

