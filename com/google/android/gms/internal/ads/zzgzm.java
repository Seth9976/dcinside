package com.google.android.gms.internal.ads;

import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzgzm {
    public static final int zza;
    private static final zzgzm zzb;
    private final zzgzw zzc;
    private final ConcurrentMap zzd;

    static {
        zzgzm.zzb = new zzgzm();
    }

    private zzgzm() {
        this.zzd = new ConcurrentHashMap();
        this.zzc = new zzgyu();
    }

    public static zzgzm zza() {
        return zzgzm.zzb;
    }

    public final zzgzv zzb(Class class0) {
        zzgye.zzc(class0, "messageType");
        zzgzv zzgzv0 = (zzgzv)this.zzd.get(class0);
        if(zzgzv0 == null) {
            zzgzv0 = this.zzc.zza(class0);
            zzgye.zzc(class0, "messageType");
            zzgzv zzgzv1 = (zzgzv)this.zzd.putIfAbsent(class0, zzgzv0);
            return zzgzv1 == null ? zzgzv0 : zzgzv1;
        }
        return zzgzv0;
    }
}

