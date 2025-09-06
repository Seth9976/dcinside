package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzpt implements Q {
    private static zzpt zza;
    private final Q zzb;

    static {
        zzpt.zza = new zzpt();
    }

    public zzpt() {
        this.zzb = S.d(new zzpv());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzps)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzps)zzpt.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzps)zzpt.zza.get()).zzb();
    }
}

