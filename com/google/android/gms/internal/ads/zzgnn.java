package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgnn {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgnn() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public zzgnn(zzgnr zzgnr0) {
        this.zza = new HashMap(zzgnr0.zza);
        this.zzb = new HashMap(zzgnr0.zzb);
        this.zzc = new HashMap(zzgnr0.zzc);
        this.zzd = new HashMap(zzgnr0.zzd);
    }

    public final zzgnn zza(zzgld zzgld0) throws GeneralSecurityException {
        zzgno zzgno0 = new zzgno(zzgld0.zzd(), zzgld0.zzc(), null);
        if(this.zzb.containsKey(zzgno0)) {
            zzgld zzgld1 = (zzgld)this.zzb.get(zzgno0);
            if(!zzgld1.equals(zzgld0) || !zzgld0.equals(zzgld1)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + zzgno0.toString());
            }
        }
        else {
            this.zzb.put(zzgno0, zzgld0);
        }
        return this;
    }

    public final zzgnn zzb(zzglh zzglh0) throws GeneralSecurityException {
        zzgnp zzgnp0 = new zzgnp(zzglh0.zzc(), zzglh0.zzd(), null);
        if(this.zza.containsKey(zzgnp0)) {
            zzglh zzglh1 = (zzglh)this.zza.get(zzgnp0);
            if(!zzglh1.equals(zzglh0) || !zzglh0.equals(zzglh1)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + zzgnp0.toString());
            }
        }
        else {
            this.zza.put(zzgnp0, zzglh0);
        }
        return this;
    }

    public final zzgnn zzc(zzgmp zzgmp0) throws GeneralSecurityException {
        zzgno zzgno0 = new zzgno(zzgmp0.zzd(), zzgmp0.zzc(), null);
        if(this.zzd.containsKey(zzgno0)) {
            zzgmp zzgmp1 = (zzgmp)this.zzd.get(zzgno0);
            if(!zzgmp1.equals(zzgmp0) || !zzgmp0.equals(zzgmp1)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + zzgno0.toString());
            }
        }
        else {
            this.zzd.put(zzgno0, zzgmp0);
        }
        return this;
    }

    public final zzgnn zzd(zzgmt zzgmt0) throws GeneralSecurityException {
        zzgnp zzgnp0 = new zzgnp(zzgmt0.zzc(), zzgmt0.zzd(), null);
        if(this.zzc.containsKey(zzgnp0)) {
            zzgmt zzgmt1 = (zzgmt)this.zzc.get(zzgnp0);
            if(!zzgmt1.equals(zzgmt0) || !zzgmt0.equals(zzgmt1)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + zzgnp0.toString());
            }
        }
        else {
            this.zzc.put(zzgnp0, zzgmt0);
        }
        return this;
    }
}

