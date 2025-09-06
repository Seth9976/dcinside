package com.google.android.gms.internal.ads;

import o3.a;

final class zzfwx {
    static int zza(int v) {
        return v >= 0x20 ? 2 * (v + 1) : 4 * (v + 1);
    }

    static int zzb(@a Object object0, @a Object object1, int v, Object object2, int[] arr_v, Object[] arr_object, @a Object[] arr_object1) {
        int v1 = zzfxf.zzb(object0);
        int v2 = v1 & v;
        int v3 = zzfwx.zzc(object2, v2);
        if(v3 != 0) {
            int v4 = -1;
            while(true) {
                int v5 = arr_v[v3 - 1];
                int v6 = v5 & v;
                if((v5 & ~v) == (v1 & ~v) && zzfuk.zza(object0, arr_object[v3 - 1]) && (arr_object1 == null || zzfuk.zza(object1, arr_object1[v3 - 1]))) {
                    if(v4 == -1) {
                        zzfwx.zze(object2, v2, v6);
                        return v3 - 1;
                    }
                    arr_v[v4] = arr_v[v4] & ~v | v6 & v;
                    return v3 - 1;
                }
                if(v6 == 0) {
                    break;
                }
                v4 = v3 - 1;
                v3 = v6;
            }
        }
        return -1;
    }

    static int zzc(Object object0, int v) {
        if(object0 instanceof byte[]) {
            return ((byte[])object0)[v] & 0xFF;
        }
        return object0 instanceof short[] ? ((char)((short[])object0)[v]) : ((int[])object0)[v];
    }

    static Object zzd(int v) {
        if(v < 2 || v > 0x40000000 || Integer.highestOneBit(v) != v) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + v);
        }
        if(v <= 0x100) {
            return new byte[v];
        }
        return v <= 0x10000 ? new short[v] : new int[v];
    }

    static void zze(Object object0, int v, int v1) {
        if(object0 instanceof byte[]) {
            ((byte[])object0)[v] = (byte)v1;
            return;
        }
        if(object0 instanceof short[]) {
            ((short[])object0)[v] = (short)v1;
            return;
        }
        ((int[])object0)[v] = v1;
    }
}

