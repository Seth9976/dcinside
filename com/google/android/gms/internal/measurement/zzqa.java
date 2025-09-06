package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzqa implements Q {
    private static zzqa zza;
    private final Q zzb;

    static {
        zzqa.zza = new zzqa();
    }

    public zzqa() {
        this.zzb = S.d(new zzqc());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzqd)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzqd)zzqa.zza.get()).zza();
    }
}

