package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzk {
    private static int zza(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    private static long zza(long v, long v1, long v2) {
        long v3 = (v ^ v1) * v2;
        long v4 = (v3 ^ v3 >>> 0x2F ^ v1) * v2;
        return (v4 ^ v4 >>> 0x2F) * v2;
    }

    public static long zza(byte[] arr_b) {
        long v28;
        long v27;
        long v26;
        int v = arr_b.length;
        if(v < 0 || v > arr_b.length) {
            throw new IndexOutOfBoundsException("Out of bound index with offput: 0 and length: " + v);
        }
        if(v <= 0x20) {
            if(v <= 16) {
                if(v >= 8) {
                    long v1 = ((long)(v << 1)) - 0x651E95C4D06FBFB1L;
                    long v2 = zzk.zzb(arr_b, 0);
                    long v3 = zzk.zzb(arr_b, v - 8);
                    return zzk.zza(Long.rotateRight(v3, 37) * v1 + (v2 - 0x651E95C4D06FBFB1L), (Long.rotateRight(v2 - 0x651E95C4D06FBFB1L, 25) + v3) * v1, v1);
                }
                if(v >= 4) {
                    return zzk.zza(((((long)zzk.zza(arr_b, 0)) & 0xFFFFFFFFL) << 3) + ((long)v), ((long)zzk.zza(arr_b, v - 4)) & 0xFFFFFFFFL, ((long)(v << 1)) - 0x651E95C4D06FBFB1L);
                }
                if(v > 0) {
                    long v4 = ((long)((arr_b[0] & 0xFF) + ((arr_b[v >> 1] & 0xFF) << 8))) * 0x9AE16A3B2F90404FL ^ ((long)(v + ((arr_b[v - 1] & 0xFF) << 2))) * 0xC3A5C85C97CB3127L;
                    return (v4 ^ v4 >>> 0x2F) * 0x9AE16A3B2F90404FL;
                }
                return 0x9AE16A3B2F90404FL;
            }
            long v5 = ((long)(v << 1)) - 0x651E95C4D06FBFB1L;
            long v6 = zzk.zzb(arr_b, 0);
            long v7 = zzk.zzb(arr_b, 8);
            long v8 = zzk.zzb(arr_b, v - 8) * v5;
            return zzk.zza(Long.rotateRight(v6 * 0xB492B66FBE98F273L + v7, 43) + Long.rotateRight(v8, 30) + zzk.zzb(arr_b, v - 16) * 0x9AE16A3B2F90404FL, v6 * 0xB492B66FBE98F273L + Long.rotateRight(v7 - 0x651E95C4D06FBFB1L, 18) + v8, v5);
        }
        if(v <= 0x40) {
            long v9 = ((long)(v << 1)) - 0x651E95C4D06FBFB1L;
            long v10 = zzk.zzb(arr_b, 0);
            long v11 = zzk.zzb(arr_b, 8);
            long v12 = zzk.zzb(arr_b, v - 8) * v9;
            long v13 = Long.rotateRight(v10 * 0x9AE16A3B2F90404FL + v11, 43) + Long.rotateRight(v12, 30) + zzk.zzb(arr_b, v - 16) * 0x9AE16A3B2F90404FL;
            long v14 = zzk.zzb(arr_b, 16) * v9;
            long v15 = zzk.zzb(arr_b, 24);
            long v16 = (v13 + zzk.zzb(arr_b, v - 0x20)) * v9;
            return zzk.zza(Long.rotateRight(v14 + v15, 43) + Long.rotateRight(v16, 30) + (zzk.zza(v13, v12 + (v10 * 0x9AE16A3B2F90404FL + Long.rotateRight(v11 - 0x651E95C4D06FBFB1L, 18)), v9) + zzk.zzb(arr_b, v - 24)) * v9, v14 + Long.rotateRight(v15 + v10 * 0x9AE16A3B2F90404FL, 18) + v16, v9);
        }
        long[] arr_v = new long[2];
        long[] arr_v1 = new long[2];
        long v17 = zzk.zzb(arr_b, 0) + 0x1529CBA0CA458FFL;
        int v18 = (v - 1) / 0x40 << 6;
        int v19 = v - 1 & 0x3F;
        int v20 = v18 + v19;
        long v21 = 2480279821605975764L;
        int v23 = 0;
        for(long v22 = 1390051526045402406L; true; v22 = v26) {
            long v24 = Long.rotateRight(v17 + v21 + arr_v[0] + zzk.zzb(arr_b, v23 + 8), 37);
            long v25 = Long.rotateRight(v21 + arr_v[1] + zzk.zzb(arr_b, v23 + 0x30), 42);
            v26 = v24 * 0xB492B66FBE98F273L ^ arr_v1[1];
            v27 = v25 * 0xB492B66FBE98F273L + (arr_v[0] + zzk.zzb(arr_b, v23 + 40));
            v28 = Long.rotateRight(v22 + arr_v1[0], 33) * 0xB492B66FBE98F273L;
            zzk.zza(arr_b, v23, arr_v[1] * 0xB492B66FBE98F273L, v26 + arr_v1[0], arr_v);
            zzk.zza(arr_b, v23 + 0x20, v28 + arr_v1[1], v27 + zzk.zzb(arr_b, v23 + 16), arr_v1);
            if(v23 + 0x40 == v18) {
                break;
            }
            v23 += 0x40;
            v21 = v27;
            v17 = v28;
        }
        long v29 = 0xB492B66FBE98F273L + ((v26 & 0xFFL) << 1);
        long v30 = arr_v1[0] + ((long)v19);
        arr_v1[0] = v30;
        long v31 = arr_v[0] + v30;
        arr_v[0] = v31;
        arr_v1[0] += v31;
        long v32 = Long.rotateRight(v28 + v27 + arr_v[0] + zzk.zzb(arr_b, v20 - 55), 37);
        long v33 = Long.rotateRight(v27 + arr_v[1] + zzk.zzb(arr_b, v20 - 15), 42);
        long v34 = v32 * v29 ^ arr_v1[1] * 9L;
        long v35 = v33 * v29 + (arr_v[0] * 9L + zzk.zzb(arr_b, v20 - 23));
        long v36 = Long.rotateRight(v26 + arr_v1[0], 33) * v29;
        zzk.zza(arr_b, v20 - 0x3F, arr_v[1] * v29, v34 + arr_v1[0], arr_v);
        zzk.zza(arr_b, v20 - 0x1F, v36 + arr_v1[1], zzk.zzb(arr_b, v20 - 0x2F) + v35, arr_v1);
        return zzk.zza(zzk.zza(arr_v[0], arr_v1[0], v29) + (v35 >>> 0x2F ^ v35) * 0xC3A5C85C97CB3127L + v34, zzk.zza(arr_v[1], arr_v1[1], v29) + v36, v29);
    }

    private static void zza(byte[] arr_b, int v, long v1, long v2, long[] arr_v) {
        long v3 = zzk.zzb(arr_b, v);
        long v4 = zzk.zzb(arr_b, v + 8);
        long v5 = zzk.zzb(arr_b, v + 16);
        long v6 = zzk.zzb(arr_b, v + 24);
        long v7 = v1 + v3;
        long v8 = v4 + v7 + v5;
        arr_v[0] = v8 + v6;
        arr_v[1] = Long.rotateRight(v2 + v7 + v6, 21) + Long.rotateRight(v8, 44) + v7;
    }

    private static long zzb(byte[] arr_b, int v) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, v, 8);
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        return byteBuffer0.getLong();
    }
}

