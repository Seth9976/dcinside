package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzna implements Q {
    private static zzna zza;
    private final Q zzb;

    static {
        zzna.zza = new zzna();
    }

    public zzna() {
        this.zzb = S.d(new zznc());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zznd)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zznd)zzna.zza.get()).zza();
    }
}

