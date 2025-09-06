package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;
import o3.a;

final class zzfzb extends zzfxs {
    private final transient zzfxq zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzfzb(zzfxq zzfxq0, Object[] arr_object, int v, int v1) {
        this.zza = zzfxq0;
        this.zzb = arr_object;
        this.zzc = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public final boolean contains(@a Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return object2 != null && object2.equals(this.zza.get(object1));
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final Iterator iterator() {
        return this.zzd().zzu(0);
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zza(Object[] arr_object, int v) {
        return this.zzd().zza(arr_object, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final zzfzt zze() {
        return this.zzd().zzu(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    final zzfxn zzi() {
        return new zzfza(this);
    }
}

