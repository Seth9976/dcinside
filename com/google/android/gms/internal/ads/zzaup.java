package com.google.android.gms.internal.ads;

final class zzaup implements zzfol {
    final zzfni zza;

    zzaup(zzfni zzfni0) {
        this.zza = zzfni0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfol
    public final void zza(int v, long v1) {
        this.zza.zzd(v, System.currentTimeMillis() - v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfol
    public final void zzb(int v, long v1, String s) {
        this.zza.zze(v, System.currentTimeMillis() - v1, s);
    }
}

