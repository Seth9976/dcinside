package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgui extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return zzgui.zza();
    }

    protected static final Cipher zza() {
        try {
            return (Cipher)zzguw.zza.zza("AES/CTR/NoPadding");
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

