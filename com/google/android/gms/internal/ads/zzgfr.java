package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class zzgfr {
    @h
    private Integer zza;
    @h
    private Integer zzb;
    @h
    private Integer zzc;
    private zzgfs zzd;

    private zzgfr() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgfs.zzc;
    }

    zzgfr(zzgft zzgft0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgfs.zzc;
    }

    public final zzgfr zza(int v) throws GeneralSecurityException {
        if(v != 12 && v != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", v));
        }
        this.zzb = v;
        return this;
    }

    public final zzgfr zzb(int v) throws GeneralSecurityException {
        if(v != 16 && v != 24 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzgfr zzc(int v) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgfr zzd(zzgfs zzgfs0) {
        this.zzd = zzgfs0;
        return this;
    }

    public final zzgfu zze() throws GeneralSecurityException {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if(this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int v = (int)this.zzb;
        this.zzc.intValue();
        return new zzgfu(((int)integer0), v, 16, this.zzd, null);
    }
}

