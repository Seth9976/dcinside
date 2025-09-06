package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzjt implements zzfvf {
    public final AtomicBoolean zza;

    public zzjt(AtomicBoolean atomicBoolean0) {
        this.zza = atomicBoolean0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        return Boolean.valueOf(this.zza.get());
    }
}

