package com.google.android.gms.internal.vision;

import java.util.AbstractMap.SimpleImmutableEntry;

final class zzeu extends zzee {
    private final zzer zza;

    zzeu(zzer zzer0) {
        this.zza = zzer0;
        super();
    }

    @Override
    public final Object get(int v) {
        zzde.zza(v, this.zza.zzd);
        return new AbstractMap.SimpleImmutableEntry(this.zza.zzb[v * 2], this.zza.zzb[v * 2 + 1]);
    }

    @Override
    public final int size() {
        return this.zza.zzd;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final boolean zzf() {
        return true;
    }
}

