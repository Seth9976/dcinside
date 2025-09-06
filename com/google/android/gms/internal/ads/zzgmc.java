package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgmc {
    private static final zzgmc zza;
    private final Map zzb;

    static {
        zzgmc.zza = new zzgmc();
    }

    public zzgmc() {
        this.zzb = new HashMap();
    }

    public static zzgmc zza() {
        return zzgmc.zza;
    }

    public final void zzb(zzgmb zzgmb0, Class class0) throws GeneralSecurityException {
        synchronized(this) {
            zzgmb zzgmb1 = (zzgmb)this.zzb.get(class0);
            if(zzgmb1 != null && !zzgmb1.equals(zzgmb0)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(class0, zzgmb0);
        }
    }
}

