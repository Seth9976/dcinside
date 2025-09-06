package com.google.android.gms.internal.clearcut;

final class zzaw {
    private static final Class zzfb;
    private static final boolean zzfc;

    static {
        zzaw.zzfb = zzaw.zze("libcore.io.Memory");
        zzaw.zzfc = zzaw.zze("org.robolectric.Robolectric") != null;
    }

    private static Class zze(String s) {
        try {
            return Class.forName(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static boolean zzx() [...] // 潜在的解密器

    static Class zzy() {
        return zzaw.zzfb;
    }
}

