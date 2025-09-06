package com.google.android.gms.internal.vision;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzda {
    static final class zza {
        private zza() {
        }

        zza(zzdc zzdc0) {
        }
    }

    private static final Logger zza;
    private static final zzdb zzb;

    static {
        zzda.zza = Logger.getLogger("com.google.android.gms.internal.vision.zzda");
        zzda.zzb = new zza(null);
    }

    static String zza(@NullableDecl String s) {
        return s == null ? "" : s;
    }
}

