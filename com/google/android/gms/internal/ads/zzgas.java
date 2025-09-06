package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzgas {
    private static final byte[] zza;

    static {
        byte[] arr_b = new byte[0x80];
        Arrays.fill(arr_b, -1);
        for(int v1 = 0; v1 < 10; ++v1) {
            arr_b[v1 + 0x30] = (byte)v1;
        }
        for(int v = 0; v < 26; ++v) {
            arr_b[v + 65] = (byte)(v + 10);
            arr_b[v + 97] = (byte)(v + 10);
        }
        zzgas.zza = arr_b;
    }

    static int zza(char c) {
        return c < 0x80 ? zzgas.zza[c] : -1;
    }
}

