package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzoq implements Q {
    private static zzoq zza;
    private final Q zzb;

    static {
        zzoq.zza = new zzoq();
    }

    public zzoq() {
        this.zzb = S.d(new zzos());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzot)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzot)zzoq.zza.get()).zza();
    }
}

