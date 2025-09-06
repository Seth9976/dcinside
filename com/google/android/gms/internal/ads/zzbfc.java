package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbfc {
    private static final AtomicReference zza;
    private static final AtomicReference zzb;

    static {
        zzbfc.zza = new AtomicReference();
        zzbfc.zzb = new AtomicReference();
        new AtomicBoolean();
    }

    static zzbfa zza() {
        return (zzbfa)zzbfc.zza.get();
    }

    static zzbfb zzb() {
        return (zzbfb)zzbfc.zzb.get();
    }

    public static void zzc(zzbfa zzbfa0) {
        zzbfc.zza.set(zzbfa0);
    }
}

