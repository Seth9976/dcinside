package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.b;
import java.io.Serializable;

public class y implements Serializable {
    public static final class a {
        private long a;
        private int b;
        private int c;
        private int d;
        private int e;

        a() {
            this(1000, -1L, 1000, 20000000, 50000);
        }

        a(int v, long v1, int v2, int v3, int v4) {
            this.b = v;
            this.a = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
        }

        a(y y0) {
            this.b = y0.a;
            this.a = y0.b;
            this.c = y0.c;
            this.d = y0.d;
            this.e = y0.e;
        }

        public y a() {
            return new y(this.b, this.a, this.c, this.d, this.e);
        }

        public a b(long v) {
            if(v <= 0L) {
                v = -1L;
            }
            this.a = v;
            return this;
        }

        public a c(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Cannot set maxNameLen to a negative value");
            }
            this.e = v;
            return this;
        }

        public a d(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Cannot set maxNestingDepth to a negative value");
            }
            this.b = v;
            return this;
        }

        public a e(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Cannot set maxNumberLength to a negative value");
            }
            this.c = v;
            return this;
        }

        public a f(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Cannot set maxStringLen to a negative value");
            }
            this.d = v;
            return this;
        }
    }

    protected final int a;
    protected final long b;
    protected final int c;
    protected final int d;
    protected final int e;
    private static final long f = 1L;
    public static final int g = 1000;
    public static final long h = -1L;
    public static final int i = 1000;
    public static final int j = 20000000;
    public static final int k = 50000;
    private static final int l = 100000;
    private static y m;

    static {
        y.m = new y(1000, -1L, 1000, 20000000, 50000);
    }

    @Deprecated
    protected y(int v, long v1, int v2, int v3) {
        this(v, -1L, v2, v3, 50000);
    }

    protected y(int v, long v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    protected String a(String s) [...] // Inlined contents

    protected b b(String s, Object[] arr_object) throws b {
        throw new b(String.format(s, arr_object));
    }

    public static a c() {
        return new a();
    }

    public static y d() {
        return y.m;
    }

    public long e() {
        return this.b;
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.c;
    }

    public int i() {
        return this.d;
    }

    public boolean j() {
        return this.b > 0L;
    }

    public static void k(y y0) {
        if(y0 == null) {
            y.m = new y(1000, -1L, 1000, 20000000);
            return;
        }
        y.m = y0;
    }

    public a l() {
        return new a(this);
    }

    public void m(int v) throws b {
        if(Math.abs(v) > 100000) {
            throw this.b("BigDecimal scale (%d) magnitude exceeds the maximum allowed (%d)", new Object[]{v, 100000});
        }
    }

    public void n(long v) throws b {
        if(v > this.b && this.b > 0L) {
            throw this.b("Document length (%d) exceeds the maximum allowed (%d, from %s)", new Object[]{v, this.b, "`StreamReadConstraints.getMaxDocumentLength()`"});
        }
    }

    public void o(int v) throws b {
        if(v > this.c) {
            throw this.b("Number value length (%d) exceeds the maximum allowed (%d, from %s)", new Object[]{v, this.c, "`StreamReadConstraints.getMaxNumberLength()`"});
        }
    }

    public void p(int v) throws b {
        if(v > this.c) {
            throw this.b("Number value length (%d) exceeds the maximum allowed (%d, from %s)", new Object[]{v, this.c, "`StreamReadConstraints.getMaxNumberLength()`"});
        }
    }

    public void q(int v) throws b {
        if(v > this.e) {
            throw this.b("Name length (%d) exceeds the maximum allowed (%d, from %s)", new Object[]{v, this.e, "`StreamReadConstraints.getMaxNameLength()`"});
        }
    }

    public void r(int v) throws b {
        if(v > this.a) {
            throw this.b("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", new Object[]{v, this.a, "`StreamReadConstraints.getMaxNestingDepth()`"});
        }
    }

    public void s(int v) throws b {
        if(v > this.d) {
            throw this.b("String value length (%d) exceeds the maximum allowed (%d, from %s)", new Object[]{v, this.d, "`StreamReadConstraints.getMaxStringLength()`"});
        }
    }
}

