package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzea {
    static int zza(int v, int v1, int v2) [...] // Inlined contents

    static int zza(Object object0, int v) {
        if(object0 instanceof byte[]) {
            return ((byte[])object0)[v] & 0xFF;
        }
        return object0 instanceof short[] ? ((short[])object0)[v] & 0xFFFF : ((int[])object0)[v];
    }

    static int zza(@NullableDecl Object object0, @NullableDecl Object object1, int v, Object object2, int[] arr_v, Object[] arr_object, @NullableDecl Object[] arr_object1) {
        int v1 = zzec.zza(object0);
        int v2 = v1 & v;
        int v3 = zzea.zza(object2, v2);
        if(v3 == 0) {
            return -1;
        }
        int v4 = -1;
        while(true) {
            int v5 = arr_v[v3 - 1];
            if((v5 & ~v) == (v1 & ~v) && zzcz.zza(object0, arr_object[v3 - 1]) && (arr_object1 == null || zzcz.zza(object1, arr_object1[v3 - 1]))) {
                int v6 = v5 & v;
                if(v4 == -1) {
                    zzea.zza(object2, v2, v6);
                    return v3 - 1;
                }
                arr_v[v4] = zzea.zza(arr_v[v4], v6, v);
                return v3 - 1;
            }
            int v7 = v5 & v;
            if(v7 == 0) {
                return -1;
            }
            v4 = v3 - 1;
            v3 = v7;
        }
    }

    static Object zza(int v) {
        if(v < 2 || v > 0x40000000 || Integer.highestOneBit(v) != v) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + v);
        }
        if(v <= 0x100) {
            return new byte[v];
        }
        return v <= 0x10000 ? new short[v] : new int[v];
    }

    static void zza(Object object0, int v, int v1) {
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

    static int zzb(int v) {
        return v >= 0x20 ? 2 * (v + 1) : 4 * (v + 1);
    }
}

