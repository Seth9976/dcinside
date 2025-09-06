package com.google.android.gms.internal.common;

import j..util.Objects;
import z4.b;

@b
final class zzam extends zzak {
    static final zzak zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        zzam.zza = new zzam(new Object[0], 0);
    }

    zzam(Object[] arr_object, int v) {
        this.zzb = arr_object;
        this.zzc = v;
    }

    @Override
    public final Object get(int v) {
        zzv.zza(v, this.zzc, "index");
        Object object0 = this.zzb[v];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.common.zzak
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, 0, this.zzc);
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    final int zzb() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    final Object[] zzg() {
        return this.zzb;
    }
}

