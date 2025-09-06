package kotlinx.coroutines.internal;

import kotlin.text.v;
import y4.l;

final class a0 {
    public static final int a(@l String s, int v, int v1, int v2) {
        return (int)Y.c(s, ((long)v), ((long)v1), ((long)v2));
    }

    public static final long b(@l String s, long v, long v1, long v2) {
        String s1 = Y.d(s);
        if(s1 == null) {
            return v;
        }
        Long long0 = v.d1(s1);
        if(long0 == null) {
            throw new IllegalStateException(("System property \'" + s + "\' has unrecognized value \'" + s1 + '\'').toString());
        }
        long v3 = (long)long0;
        if(v1 > v3 || v3 > v2) {
            throw new IllegalStateException(("System property \'" + s + "\' should be in range " + v1 + ".." + v2 + ", but is \'" + v3 + '\'').toString());
        }
        return v3;
    }

    @l
    public static final String c(@l String s, @l String s1) {
        String s2 = Y.d(s);
        return s2 == null ? s1 : s2;
    }

    public static final boolean d(@l String s, boolean z) {
        String s1 = Y.d(s);
        return s1 == null ? z : Boolean.parseBoolean(s1);
    }

    public static int e(String s, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v1 = 1;
        }
        if((v3 & 8) != 0) {
            v2 = 0x7FFFFFFF;
        }
        return Y.b(s, v, v1, v2);
    }

    public static long f(String s, long v, long v1, long v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v1 = 1L;
        }
        if((v3 & 8) != 0) {
            v2 = 0x7FFFFFFFFFFFFFFFL;
        }
        return Y.c(s, v, v1, v2);
    }
}

