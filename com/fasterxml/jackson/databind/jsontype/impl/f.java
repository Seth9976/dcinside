package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.m;

public class f extends a {
    private static final long k = 1L;

    public f(f f0, d d0) {
        super(f0, d0);
    }

    public f(m m0, g g0, String s, boolean z, m m1) {
        super(m0, g0, s, z, m1);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.a
    public com.fasterxml.jackson.databind.jsontype.f g(d d0) {
        return d0 == this.c ? this : new f(this, d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.a
    public com.fasterxml.jackson.annotation.H.a k() {
        return com.fasterxml.jackson.annotation.H.a.d;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.a
    protected boolean y() {
        return true;
    }
}

