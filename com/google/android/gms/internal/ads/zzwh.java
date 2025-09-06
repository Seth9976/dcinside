package com.google.android.gms.internal.ads;

public final class zzwh extends zztu {
    private final zzar zzc;

    public zzwh(zzbq zzbq0, zzar zzar0) {
        super(zzbq0);
        this.zzc = zzar0;
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zzbp zze(int v, zzbp zzbp0, long v1) {
        this.zzb.zze(v, zzbp0, v1);
        zzbp0.zzd = this.zzc;
        zzbp0.zzc = null;
        return zzbp0;
    }
}

