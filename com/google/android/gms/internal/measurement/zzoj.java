package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzoj implements Q {
    private static zzoj zza;
    private final Q zzb;

    static {
        zzoj.zza = new zzoj();
    }

    public zzoj() {
        this.zzb = S.d(new zzol());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzoi)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzoi)zzoj.zza.get()).zza();
    }
}

