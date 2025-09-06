package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzpo implements Q {
    private static zzpo zza;
    private final Q zzb;

    static {
        zzpo.zza = new zzpo();
    }

    public zzpo() {
        this.zzb = S.d(new zzpq());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzpr)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzpr)zzpo.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzpr)zzpo.zza.get()).zzb();
    }
}

