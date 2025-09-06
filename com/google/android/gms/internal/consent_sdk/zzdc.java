package com.google.android.gms.internal.consent_sdk;

import java.util.List;
import o3.a;

final class zzdc extends zzdd {
    final transient int zza;
    final transient int zzb;
    final zzdd zzc;

    zzdc(zzdd zzdd0, int v, int v1) {
        this.zzc = zzdd0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final Object get(int v) {
        zzcw.zza(v, this.zzb, "index");
        return this.zzc.get(v + this.zza);
    }

    @Override
    public final int size() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdd
    public final List subList(int v, int v1) {
        return this.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    @a
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdd
    public final zzdd zzf(int v, int v1) {
        zzcw.zzc(v, v1, this.zzb);
        return this.zzc.zzf(v + this.zza, v1 + this.zza);
    }
}

