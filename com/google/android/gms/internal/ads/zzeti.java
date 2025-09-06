package com.google.android.gms.internal.ads;

final class zzeti implements zzetq {
    private final boolean zza;

    zzeti(boolean z, zzetj zzetj0) {
        this.zza = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        if(this.zza) {
            ((zzcuv)object0).zza.putBoolean("sdk_prefetch", true);
        }
    }
}

