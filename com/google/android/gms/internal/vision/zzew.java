package com.google.android.gms.internal.vision;

final class zzew extends zzee {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzew(Object[] arr_object, int v, int v1) {
        this.zza = arr_object;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final Object get(int v) {
        zzde.zza(v, this.zzc);
        return this.zza[v * 2 + this.zzb];
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return true;
    }
}

