package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class zzggn {
    @h
    private Integer zza;
    private zzggo zzb;

    private zzggn() {
        this.zza = null;
        this.zzb = zzggo.zzc;
    }

    zzggn(zzggp zzggp0) {
        this.zza = null;
        this.zzb = zzggo.zzc;
    }

    public final zzggn zza(int v) throws GeneralSecurityException {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzggn zzb(zzggo zzggo0) {
        this.zzb = zzggo0;
        return this;
    }

    public final zzggq zzc() throws GeneralSecurityException {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        return new zzggq(((int)integer0), this.zzb, null);
    }
}

