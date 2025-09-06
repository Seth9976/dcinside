package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

public final class zzguz implements zzgve {
    @Override  // com.google.android.gms.internal.ads.zzgve
    public final Object zza(String s, Provider provider0) throws GeneralSecurityException {
        return provider0 == null ? KeyFactory.getInstance(s) : KeyFactory.getInstance(s, provider0);
    }
}

