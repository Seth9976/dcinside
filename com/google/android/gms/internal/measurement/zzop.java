package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzop implements Q {
    private static zzop zza;
    private final Q zzb;

    static {
        zzop.zza = new zzop();
    }

    public zzop() {
        this.zzb = S.d(new zzor());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzoo)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzoo)zzop.zza.get()).zza();
    }
}

