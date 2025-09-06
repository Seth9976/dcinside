package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgea {
    public static final zzgek zza(zzgek zzgek0) throws GeneralSecurityException {
        return zzgek0 == null ? zzgeq.zza(zzgea.zzb(null).zzaV()) : zzgek0;
    }

    static final zzgsp zzb(zzgek zzgek0) {
        try {
            return ((zzgni)zzgmk.zzc().zze(null, zzgni.class)).zzc();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new zzgnt("Parsing parameters failed in getProto(). You probably want to call some Tink register function for null", generalSecurityException0);
        }
    }
}

