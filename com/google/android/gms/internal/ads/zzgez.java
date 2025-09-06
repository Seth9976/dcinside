package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgez {
    @h
    private zzgfk zza;
    @h
    private zzgvp zzb;
    @h
    private zzgvp zzc;
    @h
    private Integer zzd;

    private zzgez() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    zzgez(zzgfa zzgfa0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final zzgez zza(zzgvp zzgvp0) {
        this.zzb = zzgvp0;
        return this;
    }

    public final zzgez zzb(zzgvp zzgvp0) {
        this.zzc = zzgvp0;
        return this;
    }

    public final zzgez zzc(@h Integer integer0) {
        this.zzd = integer0;
        return this;
    }

    public final zzgez zzd(zzgfk zzgfk0) {
        this.zza = zzgfk0;
        return this;
    }

    public final zzgfb zze() throws GeneralSecurityException {
        zzgvo zzgvo0;
        zzgfk zzgfk0 = this.zza;
        if(zzgfk0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgvp zzgvp0 = this.zzb;
        if(zzgvp0 == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if(zzgfk0.zzb() != zzgvp0.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if(zzgfk0.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if(this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if(!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if(this.zza.zzh() == zzgfi.zzc) {
            return new zzgfb(this.zza, this.zzb, this.zzc, zzgml.zza, this.zzd, null);
        }
        if(this.zza.zzh() == zzgfi.zzb) {
            zzgvo0 = zzgml.zza(((int)this.zzd));
            return new zzgfb(this.zza, this.zzb, this.zzc, zzgvo0, this.zzd, null);
        }
        if(this.zza.zzh() != zzgfi.zza) {
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.zza.zzh());
        }
        zzgvo0 = zzgml.zzb(((int)this.zzd));
        return new zzgfb(this.zza, this.zzb, this.zzc, zzgvo0, this.zzd, null);
    }
}

