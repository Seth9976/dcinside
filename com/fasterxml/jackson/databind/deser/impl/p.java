package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.u;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.a;
import java.io.Serializable;

public class p implements v, Serializable {
    protected final n a;
    private static final long b = 1L;

    public p(n n0) {
        this.a = n0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object c(h h0) throws o {
        return this.a.o(h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public a d() {
        return a.c;
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object f(h h0) {
        return u.a(this, h0);
    }
}

