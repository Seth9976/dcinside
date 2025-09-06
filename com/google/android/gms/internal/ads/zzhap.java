package com.google.android.gms.internal.ads;

final class zzhap {
    static void zza(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) {
        if(zzhap.zzg(b1) || (b << 28) + (b1 + 0x70) >> 30 != 0 || zzhap.zzg(b2) || zzhap.zzg(b3)) {
            throw new zzgyg("Protocol message had invalid UTF-8.");
        }
        int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
        arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
        arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
    }

    static void zzb(byte b, byte b1, byte b2, char[] arr_c, int v) {
        if(!zzhap.zzg(b1)) {
            if(b != 0xFFFFFFE0) {
            label_4:
                if(b != -19) {
                label_7:
                    if(!zzhap.zzg(b2)) {
                        arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
                        return;
                    }
                }
                else if(b1 < 0xFFFFFFA0) {
                    b = -19;
                    goto label_7;
                }
            }
            else if(b1 >= 0xFFFFFFA0) {
                b = (byte)0xE0;
                goto label_4;
            }
        }
        throw new zzgyg("Protocol message had invalid UTF-8.");
    }

    static void zzc(byte b, byte b1, char[] arr_c, int v) {
        if(b < -62 || zzhap.zzg(b1)) {
            throw new zzgyg("Protocol message had invalid UTF-8.");
        }
        arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
    }

    static boolean zzd(byte b) {
        return b >= 0;
    }

    static boolean zze(byte b) {
        return b < -16;
    }

    static boolean zzf(byte b) {
        return b < 0xFFFFFFE0;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}

