package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzpb implements Q {
    private static zzpb zza;
    private final Q zzb;

    static {
        zzpb.zza = new zzpb();
    }

    public zzpb() {
        this.zzb = S.d(new zzpd());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzpa)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzpa)zzpb.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzpa)zzpb.zza.get()).zzb();
    }
}

