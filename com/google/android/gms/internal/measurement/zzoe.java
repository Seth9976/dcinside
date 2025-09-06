package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzoe implements Q {
    private static zzoe zza;
    private final Q zzb;

    static {
        zzoe.zza = new zzoe();
    }

    public zzoe() {
        this.zzb = S.d(new zzog());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzoh)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzoh)zzoe.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzoh)zzoe.zza.get()).zzb();
    }

    @e
    public static boolean zzc() {
        return ((zzoh)zzoe.zza.get()).zzc();
    }

    @e
    public static boolean zzd() {
        return ((zzoh)zzoe.zza.get()).zzd();
    }
}

