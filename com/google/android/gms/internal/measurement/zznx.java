package com.google.android.gms.internal.measurement;

import com.google.common.base.Q;
import com.google.common.base.S;
import w4.e;

public final class zznx implements Q {
    private static zznx zza;
    private final Q zzb;

    static {
        zznx.zza = new zznx();
    }

    public zznx() {
        this.zzb = S.d(new zznz());
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return (zznw)this.zzb.get();
    }

    @e
    public static boolean zza() {
        return ((zznw)zznx.zza.get()).zza();
    }

    @e
    public static boolean zzb() {
        return ((zznw)zznx.zza.get()).zzb();
    }

    @e
    public static boolean zzc() {
        return ((zznw)zznx.zza.get()).zzc();
    }
}

