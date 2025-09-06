package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import o3.h;

public final class zzgnr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    zzgnr(zzgnn zzgnn0, zzgnq zzgnq0) {
        this.zza = new HashMap(zzgnn0.zza);
        this.zzb = new HashMap(zzgnn0.zzb);
        this.zzc = new HashMap(zzgnn0.zzc);
        this.zzd = new HashMap(zzgnn0.zzd);
    }

    public final zzgdx zza(zzgnm zzgnm0, @h zzgeo zzgeo0) throws GeneralSecurityException {
        zzgno zzgno0 = new zzgno(zzgnm0.getClass(), zzgnm0.zzd(), null);
        if(!this.zzb.containsKey(zzgno0)) {
            throw new GeneralSecurityException("No Key Parser for requested key type " + zzgno0.toString() + " available");
        }
        return ((zzgld)this.zzb.get(zzgno0)).zza(zzgnm0, zzgeo0);
    }

    public final zzgek zzb(zzgnm zzgnm0) throws GeneralSecurityException {
        zzgno zzgno0 = new zzgno(zzgnm0.getClass(), zzgnm0.zzd(), null);
        if(!this.zzd.containsKey(zzgno0)) {
            throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzgno0.toString() + " available");
        }
        return ((zzgmp)this.zzd.get(zzgno0)).zza(zzgnm0);
    }

    public final zzgnm zzc(zzgdx zzgdx0, Class class0, @h zzgeo zzgeo0) throws GeneralSecurityException {
        zzgnp zzgnp0 = new zzgnp(zzgdx0.getClass(), class0, null);
        if(!this.zza.containsKey(zzgnp0)) {
            throw new GeneralSecurityException("No Key serializer for " + zzgnp0.toString() + " available");
        }
        return ((zzglh)this.zza.get(zzgnp0)).zza(zzgdx0, zzgeo0);
    }

    public final zzgnm zzd(zzgek zzgek0, Class class0) throws GeneralSecurityException {
        zzgnp zzgnp0 = new zzgnp(zzgek0.getClass(), class0, null);
        if(!this.zzc.containsKey(zzgnp0)) {
            throw new GeneralSecurityException("No Key Format serializer for " + zzgnp0.toString() + " available");
        }
        return ((zzgmt)this.zzc.get(zzgnp0)).zza(zzgek0);
    }

    public final boolean zzi(zzgnm zzgnm0) {
        zzgno zzgno0 = new zzgno(zzgnm0.getClass(), zzgnm0.zzd(), null);
        return this.zzb.containsKey(zzgno0);
    }

    public final boolean zzj(zzgnm zzgnm0) {
        zzgno zzgno0 = new zzgno(zzgnm0.getClass(), zzgnm0.zzd(), null);
        return this.zzd.containsKey(zzgno0);
    }
}

