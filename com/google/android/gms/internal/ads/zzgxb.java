package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgxb {
    static final zzgxb zza = null;
    public static final int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgxb zzd;
    private final Map zze;

    static {
        zzgxb.zza = new zzgxb(true);
    }

    zzgxb() {
        this.zze = new HashMap();
    }

    zzgxb(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgxb zza() {
        return zzgxb.zza;
    }

    public static zzgxb zzb() {
        zzgxb zzgxb0 = zzgxb.zzd;
        if(zzgxb0 != null) {
            return zzgxb0;
        }
        synchronized(zzgxb.class) {
            zzgxb zzgxb1 = zzgxb.zzd;
            if(zzgxb1 != null) {
                return zzgxb1;
            }
            zzgxb zzgxb2 = zzgxj.zzb(zzgxb.class);
            zzgxb.zzd = zzgxb2;
            return zzgxb2;
        }
    }

    public final zzgxp zzc(zzgzc zzgzc0, int v) {
        zzgxa zzgxa0 = new zzgxa(zzgzc0, v);
        return (zzgxp)this.zze.get(zzgxa0);
    }
}

