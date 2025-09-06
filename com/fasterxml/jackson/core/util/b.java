package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.j;
import java.lang.ref.SoftReference;

@Deprecated
public class b {
    public static final String a = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    private static final y b;
    protected static final ThreadLocal c;

    static {
        boolean z = false;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        }
        catch(SecurityException unused_ex) {
        }
        b.b = z ? y.a() : null;
        b.c = new ThreadLocal();
    }

    @Deprecated
    public static byte[] a(String s) {
        return j.k().j(s);
    }

    @Deprecated
    public static a b() {
        ThreadLocal threadLocal0 = b.c;
        SoftReference softReference0 = (SoftReference)threadLocal0.get();
        a a0 = softReference0 == null ? null : ((a)softReference0.get());
        if(a0 == null) {
            a0 = new a();
            threadLocal0.set((b.b == null ? new SoftReference(a0) : b.b.d(a0)));
        }
        return a0;
    }

    @Deprecated
    public static j c() {
        return j.k();
    }

    @Deprecated
    public static void d(CharSequence charSequence0, StringBuilder stringBuilder0) {
        j.k().l(charSequence0, stringBuilder0);
    }

    @Deprecated
    public static char[] e(String s) {
        return j.k().n(s);
    }

    @Deprecated
    public static byte[] f(String s) {
        return j.k().o(s);
    }

    public static int g() {
        return b.b == null ? -1 : b.b.b();
    }
}

