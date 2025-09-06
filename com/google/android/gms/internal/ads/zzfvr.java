package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import o3.a;

final class zzfvr extends zzfyg {
    final zzfvt zza;

    zzfvr(zzfvt zzfvt0) {
        this.zza = zzfvt0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfyg
    public final boolean contains(@a Object object0) {
        return zzfwm.zza(this.zza.zza.entrySet(), object0);
    }

    @Override
    public final Iterator iterator() {
        return new zzfvs(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfyg
    public final boolean remove(@a Object object0) {
        if(!this.contains(object0)) {
            return false;
        }
        Objects.requireNonNull(((Map.Entry)object0));
        Object object1 = ((Map.Entry)object0).getKey();
        zzfwg.zzo(this.zza.zzb, object1);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyg
    final Map zza() {
        return this.zza;
    }
}

