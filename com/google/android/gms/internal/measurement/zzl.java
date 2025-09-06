package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class zzl {
    @e
    private Map zza;

    public zzl() {
        this.zza = new HashMap();
    }

    public final zzaq zza(String s) {
        if(this.zza.containsKey(s)) {
            Callable callable0 = (Callable)this.zza.get(s);
            try {
                return (zzaq)callable0.call();
            }
            catch(Exception unused_ex) {
                throw new IllegalStateException("Failed to create API implementation: " + s);
            }
        }
        return zzaq.zzc;
    }

    public final void zza(String s, Callable callable0) {
        this.zza.put(s, callable0);
    }
}

