package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zzpc implements Q {
    private static zzpc zza;
    private final Q zzb;

    static {
        zzpc.zza = new zzpc();
    }

    public zzpc() {
        this.zzb = S.d(new zzpe());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zzpf)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zzpf)zzpc.zza.get()).zza();
    }
}

