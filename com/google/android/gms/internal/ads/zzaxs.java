package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzaxs {
    private final Map zza;

    public zzaxs() {
        this.zza = new HashMap();
    }

    public final AtomicReference zza(String s) {
        synchronized(this) {
            if(!this.zza.containsKey(s)) {
                AtomicReference atomicReference0 = new AtomicReference();
                this.zza.put(s, atomicReference0);
            }
        }
        return (AtomicReference)this.zza.get(s);
    }
}

