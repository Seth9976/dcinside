package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgok {
    @h
    private zzgow zza;
    @h
    private zzgvp zzb;
    @h
    private Integer zzc;

    private zzgok() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgok(zzgol zzgol0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgok zza(@h Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgok zzb(zzgvp zzgvp0) {
        this.zzb = zzgvp0;
        return this;
    }

    public final zzgok zzc(zzgow zzgow0) {
        this.zza = zzgow0;
        return this;
    }

    public final zzgom zzd() throws GeneralSecurityException {
        zzgvo zzgvo0;
        zzgow zzgow0 = this.zza;
        if(zzgow0 != null) {
            zzgvp zzgvp0 = this.zzb;
            if(zzgvp0 != null) {
                if(zzgow0.zzc() != zzgvp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgow0.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzg() == zzgou.zzd) {
                    return new zzgom(this.zza, this.zzb, zzgml.zza, this.zzc, null);
                }
                if(this.zza.zzg() != zzgou.zzc && this.zza.zzg() != zzgou.zzb) {
                    if(this.zza.zzg() != zzgou.zza) {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.zza.zzg());
                    }
                    zzgvo0 = zzgml.zzb(((int)this.zzc));
                    return new zzgom(this.zza, this.zzb, zzgvo0, this.zzc, null);
                }
                zzgvo0 = zzgml.zza(((int)this.zzc));
                return new zzgom(this.zza, this.zzb, zzgvo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

