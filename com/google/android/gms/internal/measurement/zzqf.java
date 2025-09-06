package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzqf implements Q {
    private static zzqf zza;
    private final Q zzb;

    static {
        zzqf.zza = new zzqf();
    }

    public zzqf() {
        this.zzb = S.d(new zzqg());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzqe)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzqe)zzqf.zza.get()).zza();
    }
}

