package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzggg {
    @h
    private zzggq zza;
    @h
    private zzgvp zzb;
    @h
    private Integer zzc;

    private zzggg() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzggg(zzggh zzggh0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzggg zza(@h Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzggg zzb(zzgvp zzgvp0) {
        this.zzb = zzgvp0;
        return this;
    }

    public final zzggg zzc(zzggq zzggq0) {
        this.zza = zzggq0;
        return this;
    }

    public final zzggi zzd() throws GeneralSecurityException {
        zzgvo zzgvo0;
        zzggq zzggq0 = this.zza;
        if(zzggq0 != null) {
            zzgvp zzgvp0 = this.zzb;
            if(zzgvp0 != null) {
                if(zzggq0.zzb() != zzgvp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzggq0.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzd() == zzggo.zzc) {
                    return new zzggi(this.zza, this.zzb, zzgml.zza, this.zzc, null);
                }
                if(this.zza.zzd() == zzggo.zzb) {
                    zzgvo0 = zzgml.zza(((int)this.zzc));
                    return new zzggi(this.zza, this.zzb, zzgvo0, this.zzc, null);
                }
                if(this.zza.zzd() != zzggo.zza) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.zza.zzd());
                }
                zzgvo0 = zzgml.zzb(((int)this.zzc));
                return new zzggi(this.zza, this.zzb, zzgvo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

