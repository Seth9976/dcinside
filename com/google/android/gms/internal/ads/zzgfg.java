package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class zzgfg {
    @h
    private Integer zza;
    @h
    private Integer zzb;
    @h
    private Integer zzc;
    @h
    private Integer zzd;
    private zzgfh zze;
    private zzgfi zzf;

    private zzgfg() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = zzgfi.zzc;
    }

    zzgfg(zzgfj zzgfj0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = zzgfi.zzc;
    }

    public final zzgfg zza(int v) throws GeneralSecurityException {
        if(v != 16 && v != 24 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzgfg zzb(zzgfh zzgfh0) {
        this.zze = zzgfh0;
        return this;
    }

    public final zzgfg zzc(int v) throws GeneralSecurityException {
        if(v < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", v));
        }
        this.zzb = v;
        return this;
    }

    public final zzgfg zzd(int v) throws GeneralSecurityException {
        if(v < 12 || v > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", v));
        }
        this.zzc = v;
        return this;
    }

    public final zzgfg zze(int v) throws GeneralSecurityException {
        if(v < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", v));
        }
        this.zzd = v;
        return this;
    }

    public final zzgfg zzf(zzgfi zzgfi0) {
        this.zzf = zzgfi0;
        return this;
    }

    public final zzgfk zzg() throws GeneralSecurityException {
        if(this.zza == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer integer0 = this.zzd;
        if(integer0 == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if(this.zze == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if(this.zzf == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int v = (int)integer0;
        zzgfh zzgfh0 = this.zze;
        if(zzgfh0 != zzgfh.zza) {
            if(zzgfh0 == zzgfh.zzb) {
                if(v > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", integer0));
                }
                return new zzgfk(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
            }
            if(zzgfh0 == zzgfh.zzc) {
                if(v > 0x20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", integer0));
                }
                return new zzgfk(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
            }
            if(zzgfh0 == zzgfh.zzd) {
                if(v > 0x30) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", integer0));
                }
                return new zzgfk(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
            }
            if(zzgfh0 != zzgfh.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if(v > 0x40) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", integer0));
            }
        }
        else if(v > 20) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", integer0));
        }
        return new zzgfk(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
    }
}

