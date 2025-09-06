package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgfl {
    @h
    private zzgfu zza;
    @h
    private zzgvp zzb;
    @h
    private Integer zzc;

    private zzgfl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgfl(zzgfm zzgfm0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgfl zza(@h Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgfl zzb(zzgvp zzgvp0) {
        this.zzb = zzgvp0;
        return this;
    }

    public final zzgfl zzc(zzgfu zzgfu0) {
        this.zza = zzgfu0;
        return this;
    }

    public final zzgfn zzd() throws GeneralSecurityException {
        zzgvo zzgvo0;
        zzgfu zzgfu0 = this.zza;
        if(zzgfu0 != null) {
            zzgvp zzgvp0 = this.zzb;
            if(zzgvp0 != null) {
                if(zzgfu0.zzc() != zzgvp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgfu0.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zze() == zzgfs.zzc) {
                    return new zzgfn(this.zza, this.zzb, zzgml.zza, this.zzc, null);
                }
                if(this.zza.zze() == zzgfs.zzb) {
                    zzgvo0 = zzgml.zza(((int)this.zzc));
                    return new zzgfn(this.zza, this.zzb, zzgvo0, this.zzc, null);
                }
                if(this.zza.zze() != zzgfs.zza) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.zza.zze());
                }
                zzgvo0 = zzgml.zzb(((int)this.zzc));
                return new zzgfn(this.zza, this.zzb, zzgvo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

