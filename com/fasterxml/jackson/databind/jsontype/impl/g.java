package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import java.io.IOException;

public class g extends v {
    protected final String c;

    public g(com.fasterxml.jackson.databind.jsontype.g g0, d d0, String s) {
        super(g0, d0);
        this.c = s;
    }

    protected final void D(Object object0, k k0) throws IOException {
        k0.z4();
    }

    protected final void E(Object object0, k k0, String s) throws IOException {
        k0.n3();
        if(s != null) {
            k0.J4(this.c, s);
        }
    }

    protected final void F(Object object0, k k0) throws IOException {
        k0.D4();
    }

    protected final void G(Object object0, k k0, String s) throws IOException {
        k0.p3();
        if(s != null) {
            k0.J4(this.c, s);
        }
    }

    protected final void H(Object object0, k k0) throws IOException {
    }

    protected final void I(Object object0, k k0, String s) throws IOException {
        if(s != null) {
            k0.J4(this.c, s);
        }
    }

    public g J(d d0) {
        return this.b == d0 ? this : new g(this.a, d0, this.c);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public j b(d d0) {
        return this.J(d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public String c() {
        return this.c;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public a e() {
        return a.d;
    }
}

