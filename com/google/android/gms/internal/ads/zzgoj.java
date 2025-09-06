package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

public final class zzgoj implements zzgng {
    private static final zzgoj zza;

    static {
        zzgoj.zza = new zzgoj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Class zza() {
        return zzgog.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Class zzb() {
        return zzgog.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Object zzc(zzgnf zzgnf0) throws GeneralSecurityException {
        if(zzgnf0.zzc() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        for(Object object0: zzgnf0.zze()) {
            for(Object object1: ((List)object0)) {
                zzgog zzgog0 = (zzgog)((zzgnd)object1).zzd();
            }
        }
        return new zzgoh(zzgnf0, null);
    }

    static void zzd() throws GeneralSecurityException {
        zzgmh.zza().zzf(zzgoj.zza);
    }
}

