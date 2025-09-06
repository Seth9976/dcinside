package com.google.android.gms.internal.ads;

final class zzafe extends zzacz {
    private final long zza;

    public zzafe(zzaco zzaco0, long v) {
        super(zzaco0);
        zzcw.zzd(zzaco0.zzf() >= v);
        this.zza = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzacz
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzacz
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzacz
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}

