package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zznl implements Q {
    private static zznl zza;
    private final Q zzb;

    static {
        zznl.zza = new zznl();
    }

    public zznl() {
        this.zzb = S.d(new zznn());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zznk)this.zzb.get();
    }

    @e
    public static long zza() {
        return ((zznk)zznl.zza.get()).zza();
    }
}

