package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgjc extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return zzgjc.zza();
    }

    protected static final Cipher zza() {
        try {
            return (Cipher)zzguw.zza.zza("AES/GCM/NoPadding");
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

