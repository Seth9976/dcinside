package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgmy {
    private final Map zza;
    private final Map zzb;

    private zzgmy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    zzgmy(zzgna zzgna0) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    zzgmy(zzgnb zzgnb0, zzgna zzgna0) {
        this.zza = new HashMap(zzgnb0.zza);
        this.zzb = new HashMap(zzgnb0.zzb);
    }

    public final zzgmy zza(zzgmx zzgmx0) throws GeneralSecurityException {
        if(zzgmx0 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgmz zzgmz0 = new zzgmz(zzgmx0.zzc(), zzgmx0.zzd(), null);
        if(this.zza.containsKey(zzgmz0)) {
            zzgmx zzgmx1 = (zzgmx)this.zza.get(zzgmz0);
            if(!zzgmx1.equals(zzgmx0) || !zzgmx0.equals(zzgmx1)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + zzgmz0.toString());
            }
        }
        else {
            this.zza.put(zzgmz0, zzgmx0);
        }
        return this;
    }

    public final zzgmy zzb(zzgng zzgng0) throws GeneralSecurityException {
        Class class0 = zzgng0.zzb();
        if(this.zzb.containsKey(class0)) {
            zzgng zzgng1 = (zzgng)this.zzb.get(class0);
            if(!zzgng1.equals(zzgng0) || !zzgng0.equals(zzgng1)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + class0.toString());
            }
        }
        else {
            this.zzb.put(class0, zzgng0);
        }
        return this;
    }
}

