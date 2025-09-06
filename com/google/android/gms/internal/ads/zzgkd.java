package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgkd {
    public static byte[] zza(byte[] arr_b, byte[] arr_b1) {
        long v = zzgkd.zzb(arr_b, 0, 0);
        long v1 = zzgkd.zzb(arr_b, 3, 2);
        long v2 = zzgkd.zzb(arr_b, 6, 4);
        long v3 = zzgkd.zzb(arr_b, 9, 6);
        long v4 = zzgkd.zzb(arr_b, 12, 8);
        byte[] arr_b2 = new byte[17];
        long v5 = 0L;
        long v6 = 0L;
        long v7 = 0L;
        long v8 = 0L;
        long v9 = 0L;
        int v10 = 0;
        while(v10 < arr_b1.length) {
            int v11 = Math.min(16, arr_b1.length - v10);
            System.arraycopy(arr_b1, v10, arr_b2, 0, v11);
            arr_b2[v11] = 1;
            if(v11 != 16) {
                Arrays.fill(arr_b2, v11 + 1, 17, 0);
            }
            long v12 = (v4 & 0xFFFFFL) * 5L;
            long v13 = (v3 & 0x3F03FFFL) * 5L;
            long v14 = (v2 & 0x3FFC0FFL) * 5L;
            long v15 = v9 + zzgkd.zzb(arr_b2, 0, 0);
            long v16 = v6 + zzgkd.zzb(arr_b2, 3, 2);
            long v17 = v5 + zzgkd.zzb(arr_b2, 6, 4);
            long v18 = v7 + zzgkd.zzb(arr_b2, 9, 6);
            long v19 = v8 + (zzgkd.zzb(arr_b2, 12, 8) | ((long)(arr_b2[16] << 24)));
            long v20 = v15 * v + v16 * v12 + v17 * v13 + v18 * v14 + (v1 & 0x3FFFF03L) * 5L * v19;
            long v21 = v15 * (v1 & 0x3FFFF03L) + v16 * v + v17 * v12 + v18 * v13 + v14 * v19 + (v20 >> 26);
            long v22 = v15 * (v2 & 0x3FFC0FFL) + v16 * (v1 & 0x3FFFF03L) + v17 * v + v18 * v12 + v13 * v19 + (v21 >> 26);
            long v23 = v15 * (v3 & 0x3F03FFFL) + v16 * (v2 & 0x3FFC0FFL) + v17 * (v1 & 0x3FFFF03L) + v18 * v + v19 * v12 + (v22 >> 26);
            long v24 = v15 * (v4 & 0xFFFFFL) + v16 * (v3 & 0x3F03FFFL) + v17 * (v2 & 0x3FFC0FFL) + v18 * (v1 & 0x3FFFF03L) + v19 * v + (v23 >> 26);
            long v25 = (v20 & 0x3FFFFFFL) + (v24 >> 26) * 5L;
            v6 = (v21 & 0x3FFFFFFL) + (v25 >> 26);
            v10 += 16;
            v5 = v22 & 0x3FFFFFFL;
            v7 = v23 & 0x3FFFFFFL;
            v8 = v24 & 0x3FFFFFFL;
            v9 = v25 & 0x3FFFFFFL;
        }
        long v26 = v5 + (v6 >> 26);
        long v27 = v7 + (v26 >> 26);
        long v28 = v8 + (v27 >> 26);
        long v29 = v9 + (v28 >> 26) * 5L;
        long v30 = (v29 & 0x3FFFFFFL) + 5L;
        long v31 = (v6 & 0x3FFFFFFL) + (v29 >> 26);
        long v32 = (v31 + (v30 >> 26) >> 26) + (v26 & 0x3FFFFFFL);
        long v33 = (v27 & 0x3FFFFFFL) + (v32 >> 26);
        long v34 = (v28 & 0x3FFFFFFL) + (v33 >> 26) - 0x4000000L;
        long v35 = v26 & 0x3FFFFFFL & v34 >> 0x3F | v32 & 0x3FFFFFFL & ~(v34 >> 0x3F);
        long v36 = v27 & 0x3FFFFFFL & v34 >> 0x3F | v33 & 0x3FFFFFFL & ~(v34 >> 0x3F);
        long v37 = ((v34 >> 0x3F & (v29 & 0x3FFFFFFL) | v30 & 0x3FFFFFFL & ~(v34 >> 0x3F) | v31 << 26) & 0xFFFFFFFFL) + zzgkd.zzc(arr_b, 16);
        long v38 = zzgkd.zzc(arr_b, 20);
        long v39 = zzgkd.zzc(arr_b, 24);
        long v40 = zzgkd.zzc(arr_b, 28);
        byte[] arr_b3 = new byte[16];
        zzgkd.zzd(arr_b3, v37 & 0xFFFFFFFFL, 0);
        long v41 = ((v31 >> 6 | v35 << 20) & 0xFFFFFFFFL) + v38 + (v37 >> 0x20);
        zzgkd.zzd(arr_b3, v41 & 0xFFFFFFFFL, 4);
        long v42 = ((v35 >> 12 | v36 << 14) & 0xFFFFFFFFL) + v39 + (v41 >> 0x20);
        zzgkd.zzd(arr_b3, v42 & 0xFFFFFFFFL, 8);
        zzgkd.zzd(arr_b3, ((v36 >> 18 | (v28 & 0x3FFFFFFL & v34 >> 0x3F | v34 & ~(v34 >> 0x3F)) << 8) & 0xFFFFFFFFL) + v40 + (v42 >> 0x20) & 0xFFFFFFFFL, 12);
        return arr_b3;
    }

    private static long zzb(byte[] arr_b, int v, int v1) {
        return zzgkd.zzc(arr_b, v) >> v1 & 0x3FFFFFFL;
    }

    private static long zzc(byte[] arr_b, int v) {
        return ((long)((arr_b[v + 3] & 0xFF) << 24 | ((arr_b[v + 1] & 0xFF) << 8 | arr_b[v] & 0xFF | (arr_b[v + 2] & 0xFF) << 16))) & 0xFFFFFFFFL;
    }

    private static void zzd(byte[] arr_b, long v, int v1) {
        for(int v2 = 0; v2 < 4; ++v2) {
            arr_b[v1 + v2] = (byte)(((int)(0xFFL & v)));
            v >>= 8;
        }
    }
}

