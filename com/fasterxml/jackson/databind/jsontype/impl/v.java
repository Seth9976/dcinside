package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.jsontype.j;
import java.io.IOException;

public abstract class v extends j {
    protected final g a;
    protected final d b;

    protected v(g g0, d d0) {
        this.a = g0;
        this.b = d0;
    }

    protected void A(Object object0) {
    }

    protected String B(Object object0) {
        return this.a.a(object0);
    }

    protected String C(Object object0, Class class0) {
        return this.a.e(object0, class0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public String c() {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public g d() {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public abstract a e();

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public c o(k k0, c c0) throws IOException {
        this.z(c0);
        return c0.c == null ? null : k0.M4(c0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public c v(k k0, c c0) throws IOException {
        return c0 == null ? null : k0.N4(c0);
    }

    protected void z(c c0) {
        if(c0.c == null) {
            Object object0 = c0.a;
            c0.c = c0.b == null ? this.B(object0) : this.C(object0, c0.b);
        }
    }
}

