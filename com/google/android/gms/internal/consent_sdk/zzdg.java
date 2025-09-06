package com.google.android.gms.internal.consent_sdk;

import j..util.Objects;

final class zzdg extends zzdd {
    static final zzdd zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        zzdg.zza = new zzdg(new Object[0], 0);
    }

    zzdg(Object[] arr_object, int v) {
        this.zzb = arr_object;
        this.zzc = v;
    }

    @Override
    public final Object get(int v) {
        zzcw.zza(v, this.zzc, "index");
        Object object0 = this.zzb[v];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdd
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, 0, this.zzc);
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    final int zzb() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    final Object[] zze() {
        return this.zzb;
    }
}

