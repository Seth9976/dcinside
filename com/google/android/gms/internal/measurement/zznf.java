package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zznf implements Q {
    private static zznf zza;
    private final Q zzb;

    static {
        zznf.zza = new zznf();
    }

    public zznf() {
        this.zzb = S.d(new zznh());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzne)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzne)zznf.zza.get()).zza();
    }
}

