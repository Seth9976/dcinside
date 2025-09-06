package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

public final class zzgnk {
    private static final ThreadLocal zza;

    static {
        zzgnk.zza = new zzgnj();
    }

    static SecureRandom zza() {
        SecureRandom secureRandom0 = zzgnk.zzc();
        secureRandom0.nextLong();
        return secureRandom0;
    }

    public static byte[] zzb(int v) {
        byte[] arr_b = new byte[v];
        ((SecureRandom)zzgnk.zza.get()).nextBytes(arr_b);
        return arr_b;
    }

    private static SecureRandom zzc() {
        Provider provider0 = zzgku.zza();
        Provider provider1 = null;
        if(provider0 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider0);
            }
            catch(GeneralSecurityException unused_ex) {
            }
        }
        try {
            provider1 = (Provider)Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        }
        catch(ClassNotFoundException | NoSuchMethodException | IllegalArgumentException | InvocationTargetException | IllegalAccessException unused_ex) {
        }
        if(provider1 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider1);
            }
            catch(GeneralSecurityException unused_ex) {
            }
        }
        return new SecureRandom();
    }
}

