package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

public final class zzgvd implements zzgve {
    @Override  // com.google.android.gms.internal.ads.zzgve
    public final Object zza(String s, Provider provider0) throws GeneralSecurityException {
        return provider0 == null ? Signature.getInstance(s) : Signature.getInstance(s, provider0);
    }
}

