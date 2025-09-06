package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzggr extends zzget {
    private final zzggw zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    @h
    private final Integer zzd;

    private zzggr(zzggw zzggw0, zzgvp zzgvp0, zzgvo zzgvo0, @h Integer integer0) {
        this.zza = zzggw0;
        this.zzb = zzgvp0;
        this.zzc = zzgvo0;
        this.zzd = integer0;
    }

    public static zzggr zza(zzggv zzggv0, zzgvp zzgvp0, @h Integer integer0) throws GeneralSecurityException {
        zzggv zzggv1 = zzggv.zzc;
        if(zzggv0 != zzggv1 && integer0 == null) {
            throw new GeneralSecurityException("For given Variant " + zzggv0.toString() + " the value of idRequirement must be non-null");
        }
        if(zzggv0 == zzggv1 && integer0 != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if(zzgvp0.zza() != 0x20) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgvp0.zza());
        }
        zzggw zzggw0 = zzggw.zzc(zzggv0);
        if(zzggw0.zzb() == zzggv1) {
            return new zzggr(zzggw0, zzgvp0, zzgml.zza, integer0);
        }
        if(zzggw0.zzb() == zzggv.zzb) {
            return new zzggr(zzggw0, zzgvp0, zzgml.zza(((int)integer0)), integer0);
        }
        if(zzggw0.zzb() != zzggv.zza) {
            throw new IllegalStateException("Unknown Variant: " + zzggw0.zzb().toString());
        }
        return new zzggr(zzggw0, zzgvp0, zzgml.zzb(((int)integer0)), integer0);
    }

    public final zzggw zzb() {
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

