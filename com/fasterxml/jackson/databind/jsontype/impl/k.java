package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.util.h;
import java.io.IOException;

public class k extends v {
    public k(g g0, d d0) {
        super(g0, d0);
    }

    protected String D(String s) {
        return h.n0(s);
    }

    protected final void E(com.fasterxml.jackson.core.k k0, String s) throws IOException {
        if(s != null) {
            k0.L4(s);
        }
    }

    public k F(d d0) {
        return this.b == d0 ? this : new k(this.a, d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public j b(d d0) {
        return this.F(d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public a e() {
        return a.b;
    }
}

