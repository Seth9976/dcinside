package com.google.android.gms.internal.ads;

final class zzfwk {
    static int zza(int v, String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s + " cannot be negative but was: " + v);
        }
        return v;
    }

    static void zzb(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("null key in entry: null=" + object1);
        }
        if(object1 == null) {
            throw new NullPointerException("null value in entry: " + object0.toString() + "=null");
        }
    }
}

