package com.google.android.gms.internal.common;

import java.util.List;
import o3.a;

final class zzaj extends zzak {
    final transient int zza;
    final transient int zzb;
    final zzak zzc;

    zzaj(zzak zzak0, int v, int v1) {
        this.zzc = zzak0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final Object get(int v) {
        zzv.zza(v, this.zzb, "index");
        return this.zzc.get(v + this.zza);
    }

    @Override
    public final int size() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.common.zzak
    public final List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.common.zzag
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    final boolean zzf() {
        return true;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    @a
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override  // com.google.android.gms.internal.common.zzak
    public final zzak zzh(int v, int v1) {
        zzv.zzc(v, v1, this.zzb);
        return this.zzc.zzh(v + this.zza, v1 + this.zza);
    }
}

