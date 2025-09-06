package com.google.android.gms.internal.ads;

final class zzjn implements zzkp {
    private final Object zza;
    private zzbq zzb;

    public zzjn(Object object0, zzub zzub0) {
        this.zza = object0;
        this.zzb = zzub0.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final zzbq zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzbq zzbq0) {
        this.zzb = zzbq0;
    }
}

