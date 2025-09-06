package com.google.android.gms.internal.ads;

import j..util.Objects;

final class zzfyz extends zzfxn {
    static final zzfxn zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        zzfyz.zza = new zzfyz(new Object[0], 0);
    }

    zzfyz(Object[] arr_object, int v) {
        this.zzb = arr_object;
        this.zzc = v;
    }

    @Override
    public final Object get(int v) {
        zzfun.zza(v, this.zzc, "index");
        Object object0 = this.zzb[v];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxn
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, v, this.zzc);
        return v + this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zzb() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final Object[] zzg() {
        return this.zzb;
    }
}

