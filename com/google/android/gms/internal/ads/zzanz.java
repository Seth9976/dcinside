package com.google.android.gms.internal.ads;

public final class zzanz {
    public static int zza(byte[] arr_b, int v, int v1) {
        while(v < v1 && arr_b[v] != 71) {
            ++v;
        }
        return v;
    }

    public static long zzb(zzdy zzdy0, int v, int v1) {
        zzdy0.zzL(v);
        if(zzdy0.zzb() >= 5) {
            int v2 = zzdy0.zzg();
            if((0x800000 & v2) == 0 && (v2 >> 8 & 0x1FFF) == v1 && (v2 & 0x20) != 0 && zzdy0.zzm() >= 7 && zzdy0.zzb() >= 7 && (zzdy0.zzm() & 16) == 16) {
                byte[] arr_b = new byte[6];
                zzdy0.zzH(arr_b, 0, 6);
                long v3 = (long)arr_b[3];
                return (((long)arr_b[0]) & 0xFFL) << 25 | (((long)arr_b[1]) & 0xFFL) << 17 | (((long)arr_b[2]) & 0xFFL) << 9 | (v3 & 0xFFL) + (v3 & 0xFFL) | (((long)arr_b[4]) & 0xFFL) >> 7;
            }
        }
        return 0x8000000000000001L;
    }
}

