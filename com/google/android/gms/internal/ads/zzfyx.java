package com.google.android.gms.internal.ads;

import o3.a;

public final class zzfyx {
    static Object zza(@a Object object0, int v) {
        if(object0 == null) {
            throw new NullPointerException("at index " + v);
        }
        return object0;
    }

    static Object[] zzb(Object[] arr_object, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            zzfyx.zza(arr_object[v1], v1);
        }
        return arr_object;
    }
}

