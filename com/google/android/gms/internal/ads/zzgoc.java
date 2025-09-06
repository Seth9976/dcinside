package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class zzgoc {
    @h
    private Integer zza;
    @h
    private Integer zzb;
    private zzgod zzc;

    private zzgoc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgod.zzd;
    }

    zzgoc(zzgoe zzgoe0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgod.zzd;
    }

    public final zzgoc zza(int v) throws GeneralSecurityException {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", ((int)(v * 8))));
        }
        this.zza = v;
        return this;
    }

    public final zzgoc zzb(int v) throws GeneralSecurityException {
        if(v < 10 || v > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + v);
        }
        this.zzb = v;
        return this;
    }

    public final zzgoc zzc(zzgod zzgod0) {
        this.zzc = zzgod0;
        return this;
    }

    public final zzgof zzd() throws GeneralSecurityException {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("variant not set");
        }
        return new zzgof(((int)integer0), ((int)this.zzb), this.zzc, null);
    }
}

