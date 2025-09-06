package com.pgl.ssdk.ces;

import android.content.Context;

public final class a {
    public static native Object meta(int arg0, Context arg1, Object arg2) {
    }

    public static Object njss(int v, Object object0) {
        try {
            b b0 = b.h();
            return b0 == null ? null : b0.a(v, object0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

