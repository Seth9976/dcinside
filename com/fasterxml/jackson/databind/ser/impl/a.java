package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.ser.u;
import com.fasterxml.jackson.databind.util.b;

public class a extends u {
    protected final String y;
    private static final long z = 1L;

    protected a(a a0) {
        super(a0);
        this.y = a0.y;
    }

    protected a(String s, v v0, b b0, m m0) {
        this(s, v0, b0, m0, v0.n());
    }

    protected a(String s, v v0, b b0, m m0, com.fasterxml.jackson.annotation.u.b u$b0) {
        super(v0, b0, m0, null, null, null, u$b0, null);
        this.y = s;
    }

    @Override  // com.fasterxml.jackson.databind.ser.u
    protected Object Y(Object object0, k k0, I i0) throws Exception {
        return i0.p(this.y);
    }

    @Override  // com.fasterxml.jackson.databind.ser.u
    public u Z(t t0, d d0, v v0, m m0) {
        throw new IllegalStateException("Should not be called on this type");
    }

    public static a a0(String s, v v0, b b0, m m0) {
        return new a(s, v0, b0, m0);
    }
}

