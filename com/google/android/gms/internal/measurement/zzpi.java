package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzpi implements Q {
    private static zzpi zza;
    private final Q zzb;

    static {
        zzpi.zza = new zzpi();
    }

    public zzpi() {
        this.zzb = S.d(new zzpk());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzpl)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzpl)zzpi.zza.get()).zza();
    }
}

