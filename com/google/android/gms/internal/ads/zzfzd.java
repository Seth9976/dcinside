package com.google.android.gms.internal.ads;

import j..util.Objects;

final class zzfzd extends zzfxn {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzfzd(Object[] arr_object, int v, int v1) {
        this.zza = arr_object;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final Object get(int v) {
        zzfun.zza(v, this.zzc, "index");
        Object object0 = this.zza[v + v + this.zzb];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }
}

