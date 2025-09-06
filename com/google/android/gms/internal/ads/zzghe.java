package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import o3.h;

public final class zzghe extends zzget {
    private final zzghg zza;
    private final zzgvo zzb;
    @h
    private final Integer zzc;

    private zzghe(zzghg zzghg0, zzgvo zzgvo0, @h Integer integer0) {
        this.zza = zzghg0;
        this.zzb = zzgvo0;
        this.zzc = integer0;
    }

    public static zzghe zza(zzghg zzghg0, @h Integer integer0) throws GeneralSecurityException {
        if(zzghg0.zzb() == zzghf.zza) {
            if(integer0 == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            return new zzghe(zzghg0, zzgvo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)integer0)).array()), integer0);
        }
        if(zzghg0.zzb() != zzghf.zzb) {
            throw new GeneralSecurityException("Unknown Variant: " + zzghg0.zzb().toString());
        }
        if(integer0 != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        return new zzghe(zzghg0, zzgvo.zzb(new byte[0]), null);
    }

    public final zzghg zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}

