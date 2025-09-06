package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzok implements Q {
    private static zzok zza;
    private final Q zzb;

    static {
        zzok.zza = new zzok();
    }

    public zzok() {
        this.zzb = S.d(new zzom());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzon)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzon)zzok.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzon)zzok.zza.get()).zzb();
    }
}

