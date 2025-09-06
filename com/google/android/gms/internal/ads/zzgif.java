package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgif extends zzget {
    private final zzgik zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    @h
    private final Integer zzd;

    private zzgif(zzgik zzgik0, zzgvp zzgvp0, zzgvo zzgvo0, @h Integer integer0) {
        this.zza = zzgik0;
        this.zzb = zzgvp0;
        this.zzc = zzgvo0;
        this.zzd = integer0;
    }

    public static zzgif zza(zzgik zzgik0, zzgvp zzgvp0, @h Integer integer0) throws GeneralSecurityException {
        zzgij zzgij0 = zzgij.zzb;
        if(zzgik0.zzc() != zzgij0 && integer0 == null) {
            throw new GeneralSecurityException("For given Variant " + zzgik0.zzc().toString() + " the value of idRequirement must be non-null");
        }
        if(zzgik0.zzc() == zzgij0 && integer0 != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if(zzgvp0.zza() != 0x20) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zzgvp0.zza());
        }
        if(zzgik0.zzc() == zzgij0) {
            return new zzgif(zzgik0, zzgvp0, zzgml.zza, integer0);
        }
        if(zzgik0.zzc() != zzgij.zza) {
            throw new IllegalStateException("Unknown Variant: " + zzgik0.zzc().toString());
        }
        return new zzgif(zzgik0, zzgvp0, zzgml.zzb(((int)integer0)), integer0);
    }

    public final zzgik zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzc;
    }

    public final zzgvp zzd() {
        return this.zzb;
    }

    @h
    public final Integer zze() {
        return this.zzd;
    }
}

