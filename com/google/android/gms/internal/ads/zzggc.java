package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class zzggc {
    @h
    private Integer zza;
    @h
    private Integer zzb;
    @h
    private Integer zzc;
    private zzggd zzd;

    private zzggc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzggd.zzc;
    }

    zzggc(zzgge zzgge0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzggd.zzc;
    }

    public final zzggc zza(int v) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzggc zzb(int v) throws GeneralSecurityException {
        if(v != 16 && v != 24 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzggc zzc(int v) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzggc zzd(zzggd zzggd0) {
        this.zzd = zzggd0;
        return this;
    }

    public final zzggf zze() throws GeneralSecurityException {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if(this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzggf(((int)integer0), 12, 16, this.zzd, null);
    }
}

