package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import o3.h;

public final class zzgku {
    private static final String[] zza;

    static {
        zzgku.zza = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
    }

    @h
    public static Provider zza() {
        String[] arr_s = zzgku.zza;
        for(int v = 0; v < 3; ++v) {
            Provider provider0 = Security.getProvider(arr_s[v]);
            if(provider0 != null) {
                return provider0;
            }
        }
        return null;
    }
}

