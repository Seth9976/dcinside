package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgkt {
    private static final Logger zza;
    private static final AtomicBoolean zzb;

    static {
        zzgkt.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzgkt");
        zzgkt.zzb = new AtomicBoolean(false);
    }

    static Boolean zza() {
        try {
            return (Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            zzgkt.zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return false;
        }
    }

    public static boolean zzb() {
        return zzgkt.zzb.get();
    }
}

