package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

public final class zzglx {
    public static final zzglp zza;

    static {
        zzglx.zza = new zzglv(null);
    }

    public static zzglu zza(zzgnf zzgnf0) {
        zzgdz zzgdz0;
        zzglr zzglr0 = new zzglr();
        zzglr0.zzb(zzgnf0.zza());
        for(Object object0: zzgnf0.zze()) {
            for(Object object1: ((List)object0)) {
                switch(((zzgnd)object1).zzf() - 2) {
                    case 1: {
                        zzgdz0 = zzgdz.zza;
                        break;
                    }
                    case 2: {
                        zzgdz0 = zzgdz.zzb;
                        break;
                    }
                    case 3: {
                        zzgdz0 = zzgdz.zzc;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown key status");
                    }
                }
                int v = ((zzgnd)object1).zza();
                String s = ((zzgnd)object1).zze();
                if(s.startsWith("type.googleapis.com/google.crypto.")) {
                    s = s.substring(34);
                }
                zzglr0.zza(zzgdz0, v, s, ((zzgnd)object1).zzb().name());
            }
        }
        if(zzgnf0.zzc() != null) {
            zzglr0.zzc(zzgnf0.zzc().zza());
        }
        try {
            return zzglr0.zzd();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

