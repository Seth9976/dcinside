package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.util.v;

public class a extends c {
    protected final r g;
    protected final Class h;
    private static final long i = 1L;

    public a(n n0, String s, r r0, Class class0) {
        super(n0, s);
        this.g = r0;
        this.h = class0;
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public c i(n n0) {
        return this.m(n0);
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public c j(v v0) {
        return this.n(v0);
    }

    public r k() {
        return this.g;
    }

    public Class l() {
        return this.h;
    }

    public a m(n n0) {
        this.d = n0;
        return this;
    }

    public a n(v v0) {
        this.e = v0;
        return this;
    }
}

