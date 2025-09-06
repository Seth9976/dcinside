package com.google.android.gms.internal.vision;

import java.util.Iterator;

final class zzex extends zzej {
    private final transient Object zza;
    private transient int zzb;

    zzex(Object object0) {
        this.zza = zzde.zza(object0);
    }

    zzex(Object object0, int v) {
        this.zza = object0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final boolean contains(Object object0) {
        return this.zza.equals(object0);
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    public final int hashCode() {
        int v = this.zzb;
        if(v == 0) {
            v = this.zza.hashCode();
            this.zzb = v;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    public final Iterator iterator() {
        return this.zza();
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zza(Object[] arr_object, int v) {
        arr_object[v] = this.zza;
        return v + 1;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final zzfa zza() {
        return new zzeo(this.zza);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    final boolean zzg() {
        return this.zzb != 0;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    final zzee zzh() {
        return zzee.zza(this.zza);
    }
}

