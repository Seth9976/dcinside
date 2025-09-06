package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzgei {
    private static final CopyOnWriteArrayList zza;

    static {
        zzgei.zza = new CopyOnWriteArrayList();
    }

    public static zzgeh zza(String s) throws GeneralSecurityException {
        for(Object object0: zzgei.zza) {
            zzgeh zzgeh0 = (zzgeh)object0;
            if(zzgeh0.zza()) {
                return zzgeh0;
            }
            if(false) {
                break;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + s);
    }
}

