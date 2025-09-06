package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgil extends zzget {
    private final zzgir zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    @h
    private final Integer zzd;

    private zzgil(zzgir zzgir0, zzgvp zzgvp0, zzgvo zzgvo0, @h Integer integer0) {
        this.zza = zzgir0;
        this.zzb = zzgvp0;
        this.zzc = zzgvo0;
        this.zzd = integer0;
    }

    public static zzgil zza(zzgiq zzgiq0, zzgvp zzgvp0, @h Integer integer0) throws GeneralSecurityException {
        zzgiq zzgiq1 = zzgiq.zzc;
        if(zzgiq0 != zzgiq1 && integer0 == null) {
            throw new GeneralSecurityException("For given Variant " + zzgiq0.toString() + " the value of idRequirement must be non-null");
        }
        if(zzgiq0 == zzgiq1 && integer0 != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if(zzgvp0.zza() != 0x20) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgvp0.zza());
        }
        zzgir zzgir0 = zzgir.zzc(zzgiq0);
        if(zzgir0.zzb() == zzgiq1) {
            return new zzgil(zzgir0, zzgvp0, zzgml.zza, integer0);
        }
        if(zzgir0.zzb() == zzgiq.zzb) {
            return new zzgil(zzgir0, zzgvp0, zzgml.zza(((int)integer0)), integer0);
        }
        if(zzgir0.zzb() != zzgiq.zza) {
            throw new IllegalStateException("Unknown Variant: " + zzgir0.zzb().toString());
        }
        return new zzgil(zzgir0, zzgvp0, zzgml.zzb(((int)integer0)), integer0);
    }

    public final zzgir zzb() {
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

