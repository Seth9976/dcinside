package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import o3.j;

@j
public final class zzazk {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzazk(float f, float f1, float f2, float f3, int v) {
        this.zza = f;
        this.zzb = f1;
        this.zzc = f + f2;
        this.zzd = f1 + f3;
        this.zze = v;
    }

    final float zza() {
        return this.zzd;
    }

    final float zzb() {
        return this.zza;
    }

    final float zzc() {
        return this.zzc;
    }

    final float zzd() {
        return this.zzb;
    }

    final int zze() {
        return this.zze;
    }
}

