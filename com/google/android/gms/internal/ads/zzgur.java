package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

final class zzgur implements zzguu {
    private final zzgve zza;

    zzgur(zzgve zzgve0, zzguv zzguv0) {
        this.zza = zzgve0;
    }

    @Override  // com.google.android.gms.internal.ads.zzguu
    public final Object zza(String s) throws GeneralSecurityException {
        for(Object object0: zzguw.zzb(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"})) {
            Provider provider0 = (Provider)object0;
            try {
                return this.zza.zza(s, provider0);
            }
            catch(Exception unused_ex) {
            }
        }
        return this.zza.zza(s, null);
    }
}

