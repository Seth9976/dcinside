package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgkq extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return zzgkq.zza();
    }

    protected static final Cipher zza() {
        try {
            Cipher cipher0 = (Cipher)zzguw.zza.zza("AES/GCM-SIV/NoPadding");
            return !zzgkr.zzd(cipher0) ? null : cipher0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

