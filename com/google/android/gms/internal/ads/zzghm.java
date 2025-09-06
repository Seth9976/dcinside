package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzghm extends zzget {
    private final zzghr zza;
    private final zzgvo zzb;
    @h
    private final Integer zzc;

    private zzghm(zzghr zzghr0, zzgvo zzgvo0, @h Integer integer0) {
        this.zza = zzghr0;
        this.zzb = zzgvo0;
        this.zzc = integer0;
    }

    public static zzghm zza(zzghr zzghr0, @h Integer integer0) throws GeneralSecurityException {
        if(zzghr0.zzc() == zzghp.zzb) {
            if(integer0 != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            return new zzghm(zzghr0, zzgml.zza, null);
        }
        if(zzghr0.zzc() != zzghp.zza) {
            throw new GeneralSecurityException("Unknown Variant: " + zzghr0.zzc());
        }
        if(integer0 == null) {
            throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
        }
        return new zzghm(zzghr0, zzgml.zzb(((int)integer0)), integer0);
    }

    public final zzghr zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}

