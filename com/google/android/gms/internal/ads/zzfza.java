package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;

final class zzfza extends zzfxn {
    final zzfzb zza;

    zzfza(zzfzb zzfzb0) {
        this.zza = zzfzb0;
        super();
    }

    @Override
    public final Object get(int v) {
        zzfun.zza(v, this.zza.zzc, "index");
        int v1 = v + v;
        Object object0 = this.zza.zzb[v1];
        Objects.requireNonNull(object0);
        Object object1 = this.zza.zzb[v1 + 1];
        Objects.requireNonNull(object1);
        return new AbstractMap.SimpleImmutableEntry(object0, object1);
    }

    @Override
    public final int size() {
        return this.zza.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public final boolean zzf() {
        return true;
    }
}

