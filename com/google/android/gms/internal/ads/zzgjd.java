package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgjd {
    private static final ThreadLocal zza;

    static {
        zzgjd.zza = new zzgjc();
    }

    public static AlgorithmParameterSpec zza(byte[] arr_b, int v, int v1) {
        Objects.equals("The Android Project", "The Android Project");
        return new GCMParameterSpec(0x80, arr_b, v, 12);
    }

    public static Cipher zzb() {
        return (Cipher)zzgjd.zza.get();
    }

    public static SecretKey zzc(byte[] arr_b) throws GeneralSecurityException {
        zzgvm.zza(arr_b.length);
        return new SecretKeySpec(arr_b, "AES");
    }
}

