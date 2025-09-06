package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzow implements Q {
    private static zzow zza;
    private final Q zzb;

    static {
        zzow.zza = new zzow();
    }

    public zzow() {
        this.zzb = S.d(new zzoy());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzoz)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzoz)zzow.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zzoz)zzow.zza.get()).zzb();
    }

    @e
    public static boolean zzc() {
        return ((zzoz)zzow.zza.get()).zzc();
    }
}

