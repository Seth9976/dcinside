package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgnv {
    @h
    private zzgof zza;
    @h
    private zzgvp zzb;
    @h
    private Integer zzc;

    private zzgnv() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgnv(zzgnw zzgnw0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgnv zza(zzgvp zzgvp0) throws GeneralSecurityException {
        this.zzb = zzgvp0;
        return this;
    }

    public final zzgnv zzb(@h Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgnv zzc(zzgof zzgof0) {
        this.zza = zzgof0;
        return this;
    }

    public final zzgnx zzd() throws GeneralSecurityException {
        zzgvo zzgvo0;
        zzgof zzgof0 = this.zza;
        if(zzgof0 != null) {
            zzgvp zzgvp0 = this.zzb;
            if(zzgvp0 != null) {
                if(zzgof0.zzc() != zzgvp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgof0.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzf() == zzgod.zzd) {
                    return new zzgnx(this.zza, this.zzb, zzgml.zza, this.zzc, null);
                }
                if(this.zza.zzf() != zzgod.zzc && this.zza.zzf() != zzgod.zzb) {
                    if(this.zza.zzf() != zzgod.zza) {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.zza.zzf());
                    }
                    zzgvo0 = zzgml.zzb(((int)this.zzc));
                    return new zzgnx(this.zza, this.zzb, zzgvo0, this.zzc, null);
                }
                zzgvo0 = zzgml.zza(((int)this.zzc));
                return new zzgnx(this.zza, this.zzb, zzgvo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

