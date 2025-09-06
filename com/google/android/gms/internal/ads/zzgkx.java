package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

public final class zzgkx {
    private final Map zza;
    private final Map zzb;

    zzgkx(Map map0, Map map1, zzgkw zzgkw0) {
        this.zza = map0;
        this.zzb = map1;
    }

    public static zzgkv zza() {
        return new zzgkv(null);
    }

    public final Enum zzb(Object object0) throws GeneralSecurityException {
        Enum enum0 = (Enum)this.zzb.get(object0);
        if(enum0 == null) {
            throw new GeneralSecurityException("Unable to convert object enum: " + object0);
        }
        return enum0;
    }

    public final Object zzc(Enum enum0) throws GeneralSecurityException {
        Object object0 = this.zza.get(enum0);
        if(object0 == null) {
            throw new GeneralSecurityException("Unable to convert proto enum: " + enum0);
        }
        return object0;
    }
}

