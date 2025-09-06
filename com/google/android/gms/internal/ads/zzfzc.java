package com.google.android.gms.internal.ads;

import java.util.Iterator;
import o3.a;

final class zzfzc extends zzfxs {
    private final transient zzfxq zza;
    private final transient zzfxn zzb;

    zzfzc(zzfxq zzfxq0, zzfxn zzfxn0) {
        this.zza = zzfxq0;
        this.zzb = zzfxn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public final boolean contains(@a Object object0) {
        return this.zza.get(object0) != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final Iterator iterator() {
        return this.zzb.zzu(0);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zza(Object[] arr_object, int v) {
        return this.zzb.zza(arr_object, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final zzfxn zzd() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final zzfzt zze() {
        return this.zzb.zzu(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }
}

