package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgnb {
    private final Map zza;
    private final Map zzb;

    zzgnb(zzgmy zzgmy0, zzgna zzgna0) {
        this.zza = new HashMap(zzgmy0.zza);
        this.zzb = new HashMap(zzgmy0.zzb);
    }

    public final Class zza(Class class0) throws GeneralSecurityException {
        if(!this.zzb.containsKey(class0)) {
            throw new GeneralSecurityException("No input primitive class for " + class0.toString() + " available");
        }
        return ((zzgng)this.zzb.get(class0)).zza();
    }

    public final Object zzb(zzgdx zzgdx0, Class class0) throws GeneralSecurityException {
        zzgmz zzgmz0 = new zzgmz(zzgdx0.getClass(), class0, null);
        if(!this.zza.containsKey(zzgmz0)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + zzgmz0.toString() + " available");
        }
        return ((zzgmx)this.zza.get(zzgmz0)).zza(zzgdx0);
    }

    public final Object zzc(zzgnf zzgnf0, Class class0) throws GeneralSecurityException {
        if(!this.zzb.containsKey(class0)) {
            throw new GeneralSecurityException("No wrapper found for " + class0.toString());
        }
        zzgng zzgng0 = (zzgng)this.zzb.get(class0);
        if(!zzgnf0.zzd().equals(zzgng0.zza()) || !zzgng0.zza().equals(zzgnf0.zzd())) {
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn\'t match the type of primitives in the provided PrimitiveSet");
        }
        return zzgng0.zzc(zzgnf0);
    }
}

