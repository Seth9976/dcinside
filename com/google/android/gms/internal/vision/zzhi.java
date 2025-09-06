package com.google.android.gms.internal.vision;

final class zzhi {
    private static final Class zza;
    private static final boolean zzb;

    static {
        zzhi.zza = zzhi.zza("libcore.io.Memory");
        zzhi.zzb = zzhi.zza("org.robolectric.Robolectric") != null;
    }

    private static Class zza(String s) {
        try {
            return Class.forName(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static boolean zza() [...] // 潜在的解密器

    static Class zzb() {
        return zzhi.zza;
    }
}

