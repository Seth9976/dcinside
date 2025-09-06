package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzv {
    private final SparseBooleanArray zza;
    private boolean zzb;

    public zzv() {
        this.zza = new SparseBooleanArray();
    }

    public final zzv zza(int v) {
        zzcw.zzf(!this.zzb);
        this.zza.append(v, true);
        return this;
    }

    public final zzx zzb() {
        zzcw.zzf(!this.zzb);
        this.zzb = true;
        return new zzx(this.zza, null);
    }
}

