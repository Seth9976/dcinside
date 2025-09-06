package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class zzgkv {
    final Map zza;
    final Map zzb;

    private zzgkv() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    zzgkv(zzgkw zzgkw0) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgkv zza(Enum enum0, Object object0) {
        this.zza.put(enum0, object0);
        this.zzb.put(object0, enum0);
        return this;
    }

    public final zzgkx zzb() {
        return new zzgkx(DesugarCollections.unmodifiableMap(this.zza), DesugarCollections.unmodifiableMap(this.zzb), null);
    }
}

