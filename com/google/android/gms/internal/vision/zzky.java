package com.google.android.gms.internal.vision;

import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzky {
    private static final zzky zza;
    private final zzlf zzb;
    private final ConcurrentMap zzc;

    static {
        zzky.zza = new zzky();
    }

    private zzky() {
        this.zzc = new ConcurrentHashMap();
        this.zzb = new zzkb();
    }

    public static zzky zza() {
        return zzky.zza;
    }

    public final zzlc zza(Class class0) {
        zzjf.zza(class0, "messageType");
        zzlc zzlc0 = (zzlc)this.zzc.get(class0);
        if(zzlc0 == null) {
            zzlc0 = this.zzb.zza(class0);
            zzjf.zza(class0, "messageType");
            zzjf.zza(zzlc0, "schema");
            zzlc zzlc1 = (zzlc)this.zzc.putIfAbsent(class0, zzlc0);
            return zzlc1 == null ? zzlc0 : zzlc1;
        }
        return zzlc0;
    }

    public final zzlc zza(Object object0) {
        return this.zza(object0.getClass());
    }
}

