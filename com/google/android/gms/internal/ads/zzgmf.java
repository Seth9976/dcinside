package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzgmf {
    private static final zzgmf zza;
    private static final zzgmd zzb;
    private final AtomicReference zzc;

    static {
        zzgmf.zza = new zzgmf();
        zzgmf.zzb = new zzgmd(null);
    }

    public zzgmf() {
        this.zzc = new AtomicReference();
    }

    public final zzglq zza() {
        zzglq zzglq0 = (zzglq)this.zzc.get();
        return zzglq0 == null ? zzgmf.zzb : zzglq0;
    }

    public static zzgmf zzb() {
        return zzgmf.zza;
    }
}

