package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

final class zzgut implements zzguu {
    private final zzgve zza;

    zzgut(zzgve zzgve0, zzguv zzguv0) {
        this.zza = zzgve0;
    }

    @Override  // com.google.android.gms.internal.ads.zzguu
    public final Object zza(String s) throws GeneralSecurityException {
        Throwable throwable0 = null;
        for(Object object0: zzguw.zzb(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"})) {
            Provider provider0 = (Provider)object0;
            try {
                return this.zza.zza(s, provider0);
            }
            catch(Exception exception0) {
                if(throwable0 != null) {
                    continue;
                }
                throwable0 = exception0;
            }
        }
        throw new GeneralSecurityException("No good Provider found.", throwable0);
    }
}

