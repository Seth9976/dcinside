package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzpz implements Q {
    private static zzpz zza;
    private final Q zzb;

    static {
        zzpz.zza = new zzpz();
    }

    public zzpz() {
        this.zzb = S.d(new zzqb());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzpy)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzpy)zzpz.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzpy)zzpz.zza.get()).zzb();
    }
}

