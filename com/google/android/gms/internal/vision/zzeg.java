package com.google.android.gms.internal.vision;

import java.util.List;

final class zzeg extends zzee {
    private final transient int zza;
    private final transient int zzb;
    private final zzee zzc;

    zzeg(zzee zzee0, int v, int v1) {
        this.zzc = zzee0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final Object get(int v) {
        zzde.zza(v, this.zzb);
        return this.zzc.get(v + this.zza);
    }

    @Override
    public final int size() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzee
    public final List subList(int v, int v1) {
        return this.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzee
    public final zzee zza(int v, int v1) {
        zzde.zza(v, v1, this.zzb);
        return (zzee)this.zzc.subList(v + this.zza, v1 + this.zza);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return true;
    }
}

