package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.m;
import java.io.IOException;

public abstract class o {
    public static final Object a;

    static {
        o.a = new Object();
    }

    public Object a(h h0, Class class0, Object object0, Throwable throwable0) throws IOException {
        return o.a;
    }

    @Deprecated
    public Object b(h h0, Class class0, n n0, String s) throws IOException {
        return o.a;
    }

    public Object c(h h0, Class class0, B b0, n n0, String s) throws IOException {
        return this.b(h0, class0, n0, s);
    }

    public m d(h h0, m m0, g g0, String s) throws IOException {
        return null;
    }

    public Object e(h h0, m m0, r r0, n n0, String s) throws IOException {
        return this.f(h0, m0.g(), r0, n0, s);
    }

    @Deprecated
    public Object f(h h0, Class class0, r r0, n n0, String s) throws IOException {
        return o.a;
    }

    public boolean g(h h0, n n0, com.fasterxml.jackson.databind.n n1, Object object0, String s) throws IOException {
        return false;
    }

    public m h(h h0, m m0, String s, g g0, String s1) throws IOException {
        return null;
    }

    public Object i(h h0, Class class0, String s, String s1) throws IOException {
        return o.a;
    }

    public Object j(h h0, m m0, Object object0, n n0) throws IOException {
        return o.a;
    }

    public Object k(h h0, Class class0, Number number0, String s) throws IOException {
        return o.a;
    }

    public Object l(h h0, Class class0, String s, String s1) throws IOException {
        return o.a;
    }
}

