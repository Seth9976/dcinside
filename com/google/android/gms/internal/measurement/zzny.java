package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzny implements Q {
    private static zzny zza;
    private final Q zzb;

    static {
        zzny.zza = new zzny();
    }

    public zzny() {
        this.zzb = S.d(new zzoa());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzob)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzob)zzny.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzob)zzny.zza.get()).zzb();
    }

    @e
    public static boolean zzc() {
        return ((zzob)zzny.zza.get()).zzc();
    }
}

