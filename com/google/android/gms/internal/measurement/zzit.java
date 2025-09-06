package com.google.android.gms.internal.measurement;

final class zzit {
    private final zzjc zza;
    private final byte[] zzb;

    private zzit(int v) {
        byte[] arr_b = new byte[v];
        this.zzb = arr_b;
        this.zza = zzjc.zzb(arr_b);
    }

    zzit(int v, zzix zzix0) {
        this(v);
    }

    public final zzik zza() {
        this.zza.zzb();
        return new zziv(this.zzb);
    }

    public final zzjc zzb() {
        return this.zza;
    }
}

