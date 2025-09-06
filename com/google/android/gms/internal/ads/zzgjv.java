package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

final class zzgjv {
    private static final int[] zza;

    static {
        zzgjv.zza = zzgjv.zze(new byte[]{101, 120, 0x70, 97, 110, 100, 0x20, 51, 50, 45, 98, 0x79, 0x74, 101, 0x20, 107});
    }

    static void zza(int[] arr_v, int v, int v1, int v2, int v3) {
        int v4 = arr_v[v] + arr_v[v1];
        arr_v[v] = v4;
        int v5 = v4 ^ arr_v[v3];
        int v6 = v5 >>> -16 | v5 << 16;
        arr_v[v3] = v6;
        int v7 = arr_v[v2] + v6;
        arr_v[v2] = v7;
        int v8 = arr_v[v1] ^ v7;
        int v9 = v8 >>> -12 | v8 << 12;
        arr_v[v1] = v9;
        int v10 = arr_v[v] + v9;
        arr_v[v] = v10;
        int v11 = arr_v[v3] ^ v10;
        int v12 = v11 >>> -8 | v11 << 8;
        arr_v[v3] = v12;
        int v13 = arr_v[v2] + v12;
        arr_v[v2] = v13;
        int v14 = arr_v[v1] ^ v13;
        arr_v[v1] = v14 >>> -7 | v14 << 7;
    }

    static void zzb(int[] arr_v, int[] arr_v1) {
        System.arraycopy(zzgjv.zza, 0, arr_v, 0, zzgjv.zza.length);
        System.arraycopy(arr_v1, 0, arr_v, zzgjv.zza.length, 8);
    }

    static void zzc(int[] arr_v) {
        for(int v = 0; v < 10; ++v) {
            zzgjv.zza(arr_v, 0, 4, 8, 12);
            zzgjv.zza(arr_v, 1, 5, 9, 13);
            zzgjv.zza(arr_v, 2, 6, 10, 14);
            zzgjv.zza(arr_v, 3, 7, 11, 15);
            zzgjv.zza(arr_v, 0, 5, 10, 15);
            zzgjv.zza(arr_v, 1, 6, 11, 12);
            zzgjv.zza(arr_v, 2, 7, 8, 13);
            zzgjv.zza(arr_v, 3, 4, 9, 14);
        }
    }

    static int[] zzd(int[] arr_v, int[] arr_v1) {
        int[] arr_v2 = new int[16];
        zzgjv.zzb(arr_v2, arr_v);
        arr_v2[12] = arr_v1[0];
        arr_v2[13] = arr_v1[1];
        arr_v2[14] = arr_v1[2];
        arr_v2[15] = arr_v1[3];
        zzgjv.zzc(arr_v2);
        arr_v2[4] = arr_v2[12];
        arr_v2[5] = arr_v2[13];
        arr_v2[6] = arr_v2[14];
        arr_v2[7] = arr_v2[15];
        return Arrays.copyOf(arr_v2, 8);
    }

    static int[] zze(byte[] arr_b) {
        if((arr_b.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBuffer0 = ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] arr_v = new int[intBuffer0.remaining()];
        intBuffer0.get(arr_v);
        return arr_v;
    }
}

