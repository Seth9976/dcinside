package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class zzgs {
    private final Map zza;
    @Nullable
    private Map zzb;

    public zzgs() {
        this.zza = new HashMap();
    }

    public final Map zza() {
        synchronized(this) {
            if(this.zzb == null) {
                this.zzb = DesugarCollections.unmodifiableMap(new HashMap(this.zza));
            }
            return this.zzb;
        }
    }
}

