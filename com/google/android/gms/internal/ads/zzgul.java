package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgul extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return zzgul.zza();
    }

    protected static final Cipher zza() {
        try {
            return (Cipher)zzguw.zza.zza("AES/CTR/NOPADDING");
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

