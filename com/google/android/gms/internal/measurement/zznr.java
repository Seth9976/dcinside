package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zznr implements Q {
    private static zznr zza;
    private final Q zzb;

    static {
        zznr.zza = new zznr();
    }

    public zznr() {
        this.zzb = S.d(new zznt());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zznq)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zznq)zznr.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zznq)zznr.zza.get()).zzb();
    }

    @e
    public static boolean zzc() {
        return ((zznq)zznr.zza.get()).zzc();
    }

    @e
    public static boolean zzd() {
        return ((zznq)zznr.zza.get()).zzd();
    }
}

