package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzov implements Q {
    private static zzov zza;
    private final Q zzb;

    static {
        zzov.zza = new zzov();
    }

    public zzov() {
        this.zzb = S.d(new zzox());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzou)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzou)zzov.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzou)zzov.zza.get()).zzb();
    }

    @e
    public static boolean zzc() {
        return ((zzou)zzov.zza.get()).zzc();
    }
}

