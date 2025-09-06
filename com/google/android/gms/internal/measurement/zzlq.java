package com.google.android.gms.internal.measurement;

import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzlq {
    private static final zzlq zza;
    private final zzlt zzb;
    private final ConcurrentMap zzc;

    static {
        zzlq.zza = new zzlq();
    }

    private zzlq() {
        this.zzc = new ConcurrentHashMap();
        this.zzb = new zzkq();
    }

    public static zzlq zza() {
        return zzlq.zza;
    }

    public final zzlu zza(Class class0) {
        zzjv.zza(class0, "messageType");
        zzlu zzlu0 = (zzlu)this.zzc.get(class0);
        if(zzlu0 == null) {
            zzlu0 = this.zzb.zza(class0);
            zzjv.zza(class0, "messageType");
            zzjv.zza(zzlu0, "schema");
            zzlu zzlu1 = (zzlu)this.zzc.putIfAbsent(class0, zzlu0);
            return zzlu1 == null ? zzlu0 : zzlu1;
        }
        return zzlu0;
    }

    public final zzlu zza(Object object0) {
        return this.zza(object0.getClass());
    }
}

