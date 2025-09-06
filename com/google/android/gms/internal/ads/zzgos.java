package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class zzgos {
    @h
    private Integer zza;
    @h
    private Integer zzb;
    private zzgot zzc;
    private zzgou zzd;

    private zzgos() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgou.zzd;
    }

    zzgos(zzgov zzgov0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgou.zzd;
    }

    public final zzgos zza(zzgot zzgot0) {
        this.zzc = zzgot0;
        return this;
    }

    public final zzgos zzb(int v) throws GeneralSecurityException {
        this.zza = v;
        return this;
    }

    public final zzgos zzc(int v) throws GeneralSecurityException {
        this.zzb = v;
        return this;
    }

    public final zzgos zzd(zzgou zzgou0) {
        this.zzd = zzgou0;
        return this;
    }

    public final zzgow zze() throws GeneralSecurityException {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if(this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if(((int)integer0) < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        Integer integer1 = this.zzb;
        int v = (int)integer1;
        zzgot zzgot0 = this.zzc;
        if(v < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", integer1));
        }
        if(zzgot0 != zzgot.zza) {
            if(zzgot0 == zzgot.zzb) {
                if(v > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", integer1));
                }
                return new zzgow(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
            }
            if(zzgot0 == zzgot.zzc) {
                if(v > 0x20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", integer1));
                }
                return new zzgow(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
            }
            if(zzgot0 == zzgot.zzd) {
                if(v > 0x30) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", integer1));
                }
                return new zzgow(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
            }
            if(zzgot0 != zzgot.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if(v > 0x40) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", integer1));
            }
        }
        else if(v > 20) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", integer1));
        }
        return new zzgow(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
    }
}

