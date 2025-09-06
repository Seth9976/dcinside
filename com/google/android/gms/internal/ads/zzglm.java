package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.HashMap;

public final class zzglm {
    private HashMap zza;

    public zzglm() {
        this.zza = new HashMap();
    }

    public final zzglo zza() {
        if(this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzglo zzglo0 = new zzglo(DesugarCollections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzglo0;
    }
}

