package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

public final class zzgvb implements zzgve {
    @Override  // com.google.android.gms.internal.ads.zzgve
    public final Object zza(String s, Provider provider0) throws GeneralSecurityException {
        return provider0 == null ? Mac.getInstance(s) : Mac.getInstance(s, provider0);
    }
}

