package com.google.android.gms.internal.ads;

import java.util.List;
import o3.a;

final class zzfxm extends zzfxn {
    final transient int zza;
    final transient int zzb;
    final zzfxn zzc;

    zzfxm(zzfxn zzfxn0, int v, int v1) {
        this.zzc = zzfxn0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final Object get(int v) {
        zzfun.zza(v, this.zzb, "index");
        return this.zzc.get(v + this.zza);
    }

    @Override
    public final int size() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxn
    public final List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    @a
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxn
    public final zzfxn zzh(int v, int v1) {
        zzfun.zzk(v, v1, this.zzb);
        return this.zzc.zzh(v + this.zza, v1 + this.zza);
    }
}

