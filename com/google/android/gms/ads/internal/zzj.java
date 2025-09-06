package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfol;

final class zzj implements zzfol {
    final zzk zza;

    zzj(zzk zzk0) {
        this.zza = zzk0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfol
    public final void zza(int v, long v1) {
        this.zza.zzi.zzd(v, System.currentTimeMillis() - v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfol
    public final void zzb(int v, long v1, String s) {
        this.zza.zzi.zze(v, System.currentTimeMillis() - v1, s);
    }
}

