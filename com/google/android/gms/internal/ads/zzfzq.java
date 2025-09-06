package com.google.android.gms.internal.ads;

import java.util.Iterator;
import o3.a;

final class zzfzq extends zzfxs {
    final transient Object zza;

    zzfzq(Object object0) {
        object0.getClass();
        this.zza = object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public final boolean contains(@a Object object0) {
        return this.zza.equals(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final Iterator iterator() {
        return new zzfxw(this.zza);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zza(Object[] arr_object, int v) {
        arr_object[v] = this.zza;
        return v + 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final zzfxn zzd() {
        return zzfxn.zzo(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final zzfzt zze() {
        return new zzfxw(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return false;
    }
}

