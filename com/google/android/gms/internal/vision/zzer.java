package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzer extends zzej {
    private final transient zzef zza;
    private final transient Object[] zzb;
    private final transient int zzc;
    private final transient int zzd;

    zzer(zzef zzef0, Object[] arr_object, int v, int v1) {
        this.zza = zzef0;
        this.zzb = arr_object;
        this.zzc = 0;
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final boolean contains(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return object2 != null && object2.equals(this.zza.get(object1));
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    public final Iterator iterator() {
        return this.zza();
    }

    @Override
    public final int size() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zza(Object[] arr_object, int v) {
        return this.zze().zza(arr_object, v);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final zzfa zza() {
        return (zzfa)this.zze().iterator();
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return true;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    final zzee zzh() {
        return new zzeu(this);
    }
}

