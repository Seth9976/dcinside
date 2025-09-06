package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import java.io.IOException;
import java.io.Serializable;

public class s implements Serializable {
    protected final m a;
    public final B b;
    public final N c;
    public final P d;
    protected final n e;
    public final y f;
    private static final long g = 1L;

    protected s(m m0, B b0, N n0, n n1, y y0, P p0) {
        this.a = m0;
        this.b = b0;
        this.c = n0;
        this.d = p0;
        this.e = n1;
        this.f = y0;
    }

    public static s a(m m0, B b0, N n0, n n1, y y0, P p0) {
        return new s(m0, b0, n0, n1, y0, p0);
    }

    public n b() {
        return this.e;
    }

    public m c() {
        return this.a;
    }

    public boolean d(String s, com.fasterxml.jackson.core.n n0) {
        return false;
    }

    public boolean e() {
        return false;
    }

    public Object f(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        return this.e.g(n0, h0);
    }
}

