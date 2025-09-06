package com.google.android.gms.internal.vision;

final class zzep extends zzee {
    static final zzee zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    static {
        zzep.zza = new zzep(new Object[0], 0);
    }

    zzep(Object[] arr_object, int v) {
        this.zzb = arr_object;
        this.zzc = v;
    }

    @Override
    public final Object get(int v) {
        zzde.zza(v, this.zzc);
        return this.zzb[v];
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.vision.zzee
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, v, this.zzc);
        return v + this.zzc;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final Object[] zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zzd() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return false;
    }
}

