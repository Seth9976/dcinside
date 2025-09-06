package com.google.android.gms.internal.ads;

import android.util.SparseArray;

public final class zzlv {
    private final zzx zza;
    private final SparseArray zzb;

    public zzlv(zzx zzx0, SparseArray sparseArray0) {
        this.zza = zzx0;
        SparseArray sparseArray1 = new SparseArray(zzx0.zzb());
        for(int v = 0; v < zzx0.zzb(); ++v) {
            int v1 = zzx0.zza(v);
            zzlu zzlu0 = (zzlu)sparseArray0.get(v1);
            zzlu0.getClass();
            sparseArray1.append(v1, zzlu0);
        }
        this.zzb = sparseArray1;
    }

    public final int zza(int v) {
        return this.zza.zza(v);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlu zzc(int v) {
        zzlu zzlu0 = (zzlu)this.zzb.get(v);
        zzlu0.getClass();
        return zzlu0;
    }

    public final boolean zzd(int v) {
        return this.zza.zzc(v);
    }
}

