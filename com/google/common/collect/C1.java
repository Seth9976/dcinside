package com.google.common.collect;

import J1.b;
import O1.a;
import com.google.common.base.H;

@b
@C1
final class c1 {
    static void a(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("null key in entry: null=" + object1);
        }
        if(object1 == null) {
            throw new NullPointerException("null value in entry: " + object0 + "=null");
        }
    }

    @a
    static int b(int v, String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s + " cannot be negative but was: " + v);
        }
        return v;
    }

    @a
    static long c(long v, String s) {
        if(v < 0L) {
            throw new IllegalArgumentException(s + " cannot be negative but was: " + v);
        }
        return v;
    }

    static void d(int v, String s) {
        if(v <= 0) {
            throw new IllegalArgumentException(s + " must be positive but was: " + v);
        }
    }

    static void e(boolean z) {
        H.h0(z, "no calls to next() since the last call to remove()");
    }
}

