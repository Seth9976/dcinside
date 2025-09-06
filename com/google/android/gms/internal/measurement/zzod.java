package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzod implements Q {
    private static zzod zza;
    private final Q zzb;

    static {
        zzod.zza = new zzod();
    }

    public zzod() {
        this.zzb = S.d(new zzof());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzoc)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzoc)zzod.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzoc)zzod.zza.get()).zzb();
    }
}

