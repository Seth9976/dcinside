package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgfv {
    @h
    private zzggf zza;
    @h
    private zzgvp zzb;
    @h
    private Integer zzc;

    private zzgfv() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgfv(zzgfw zzgfw0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgfv zza(@h Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgfv zzb(zzgvp zzgvp0) {
        this.zzb = zzgvp0;
        return this;
    }

    public final zzgfv zzc(zzggf zzggf0) {
        this.zza = zzggf0;
        return this;
    }

    public final zzgfx zzd() throws GeneralSecurityException {
        zzgvo zzgvo0;
        zzggf zzggf0 = this.zza;
        if(zzggf0 != null) {
            zzgvp zzgvp0 = this.zzb;
            if(zzgvp0 != null) {
                if(zzggf0.zzb() != zzgvp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzggf0.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzd() == zzggd.zzc) {
                    return new zzgfx(this.zza, this.zzb, zzgml.zza, this.zzc, null);
                }
                if(this.zza.zzd() == zzggd.zzb) {
                    zzgvo0 = zzgml.zza(((int)this.zzc));
                    return new zzgfx(this.zza, this.zzb, zzgvo0, this.zzc, null);
                }
                if(this.zza.zzd() != zzggd.zza) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.zza.zzd());
                }
                zzgvo0 = zzgml.zzb(((int)this.zzc));
                return new zzgfx(this.zza, this.zzb, zzgvo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

