package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzcqr {
    private final zzcyl zza;
    @Nullable
    private final zzdar zzb;

    public zzcqr(zzcyl zzcyl0, @Nullable zzdar zzdar0) {
        this.zza = zzcyl0;
        this.zzb = zzdar0;
    }

    public final zzcyl zza() {
        return this.zza;
    }

    @Nullable
    final zzdar zzb() {
        return this.zzb;
    }

    final zzddk zzc() {
        return this.zzb == null ? new zzddk(new zzcqq(this), zzbzw.zzg) : new zzddk(this.zzb, zzbzw.zzg);
    }
}

