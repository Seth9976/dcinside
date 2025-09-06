package com.google.android.gms.internal.ads;

import java.util.AbstractList;

public final class zzgyb extends AbstractList {
    private final zzgxz zza;
    private final zzgya zzb;

    public zzgyb(zzgxz zzgxz0, zzgya zzgya0) {
        this.zza = zzgxz0;
        this.zzb = zzgya0;
    }

    @Override
    public final Object get(int v) {
        int v1 = this.zza.zzd(v);
        return this.zzb.zzb(v1);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

