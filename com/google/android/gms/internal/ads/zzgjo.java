package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import o3.h;

final class zzgjo extends ThreadLocal {
    @Override
    @h
    protected final Object initialValue() {
        return zzgjo.zza();
    }

    @h
    protected static final Cipher zza() {
        try {
            Cipher cipher0 = (Cipher)zzguw.zza.zza("ChaCha20-Poly1305");
            return !zzgjp.zzf(cipher0) ? null : cipher0;
        }
        catch(GeneralSecurityException unused_ex) {
            return null;
        }
    }
}

