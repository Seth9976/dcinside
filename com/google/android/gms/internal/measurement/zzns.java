package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzns implements Q {
    private static zzns zza;
    private final Q zzb;

    static {
        zzns.zza = new zzns();
    }

    public zzns() {
        this.zzb = S.d(new zznu());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zznv)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zznv)zzns.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zznv)zzns.zza.get()).zzb();
    }
}

