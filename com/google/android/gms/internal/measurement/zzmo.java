package com.google.android.gms.internal.measurement;

final class zzmo {
    static void zza(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) {
        if(zzmo.zza(b1) || (b << 28) + (b1 + 0x70) >> 30 != 0 || zzmo.zza(b2) || zzmo.zza(b3)) {
            throw zzkb.zzd();
        }
        int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
        arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
        arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
    }

    static void zza(byte b, byte b1, byte b2, char[] arr_c, int v) {
        if(zzmo.zza(b1) || b == 0xFFFFFFE0 && b1 < 0xFFFFFFA0 || b == -19 && b1 >= 0xFFFFFFA0 || zzmo.zza(b2)) {
            throw zzkb.zzd();
        }
        arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
    }

    static void zza(byte b, byte b1, char[] arr_c, int v) {
        if(b < -62 || zzmo.zza(b1)) {
            throw zzkb.zzd();
        }
        arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
    }

    static void zza(byte b, char[] arr_c, int v) {
        arr_c[v] = (char)b;
    }

    private static boolean zza(byte b) {
        return b > -65;
    }
}

