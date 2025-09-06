package com.google.android.gms.internal.ads;

import java.io.Serializable;

final class zzfxj extends zzfwh implements Serializable {
    final Object zza;
    final Object zzb;

    zzfxj(Object object0, Object object1) {
        this.zza = object0;
        this.zzb = object1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwh
    public final Object getKey() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwh
    public final Object getValue() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwh
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException();
    }
}

