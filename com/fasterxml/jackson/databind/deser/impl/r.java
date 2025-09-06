package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.u;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.a;
import java.io.Serializable;

public class r implements v, Serializable {
    protected final B a;
    protected final m b;
    private static final long c = 1L;

    protected r(B b0, m m0) {
        this.a = b0;
        this.b = m0;
    }

    public static r a(d d0) {
        return r.b(d0, d0.getType());
    }

    public static r b(d d0, m m0) {
        return new r(d0.a(), m0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object c(h h0) throws o {
        throw com.fasterxml.jackson.databind.exc.d.J(h0, this.a, this.b);
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public a d() {
        return a.c;
    }

    public static r e(m m0) {
        return new r(null, m0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object f(h h0) {
        return u.a(this, h0);
    }
}

