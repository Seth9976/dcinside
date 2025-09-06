package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.H;
import java.io.IOException;
import java.io.Serializable;

public class a extends s implements Serializable {
    private static final long j = 1L;

    public a(a a0, d d0) {
        super(a0, d0);
    }

    public a(m m0, g g0, String s, boolean z, m m1) {
        super(m0, g0, s, z, m1);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public Object c(n n0, h h0) throws IOException {
        return this.w(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public Object d(n n0, h h0) throws IOException {
        return this.w(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public Object e(n n0, h h0) throws IOException {
        return this.w(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.f
    public Object f(n n0, h h0) throws IOException {
        return this.w(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.s
    public f g(d d0) {
        return d0 == this.c ? this : new a(this, d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.s
    public com.fasterxml.jackson.annotation.H.a k() {
        return com.fasterxml.jackson.annotation.H.a.c;
    }

    protected Object w(n n0, h h0) throws IOException {
        if(n0.w()) {
            Object object0 = n0.n3();
            if(object0 != null) {
                return this.n(n0, h0, object0);
            }
        }
        boolean z = n0.d4();
        String s = this.x(n0, h0);
        com.fasterxml.jackson.databind.n n1 = this.p(h0, s);
        if(this.f && !this.y() && n0.Y3(r.k)) {
            H h1 = h0.O(n0);
            h1.D4();
            h1.v3(this.e);
            h1.d(s);
            n0.L();
            n0 = com.fasterxml.jackson.core.util.m.O4(false, h1.b5(n0), n0);
            n0.m4();
        }
        if(z && n0.Y() == r.n) {
            return n1.c(h0);
        }
        Object object1 = n1.g(n0, h0);
        if(z) {
            r r0 = n0.m4();
            r r1 = r.n;
            if(r0 != r1) {
                h0.h1(this.s(), r1, "expected closing `JsonToken.END_ARRAY` after type information and deserialized value", new Object[0]);
            }
        }
        return object1;
    }

    protected String x(n n0, h h0) throws IOException {
        if(!n0.d4()) {
            if(this.d != null) {
                return this.a.f();
            }
            h0.h1(this.s(), r.m, "need Array value to contain `As.WRAPPER_ARRAY` type information for class " + this.u(), new Object[0]);
            return null;
        }
        r r0 = n0.m4();
        r r1 = r.q;
        if(r0 != r1 && (r0 == null || !r0.g())) {
            h0.h1(this.s(), r1, "need String, Number of Boolean value that contains type id (for subtype of %s)", new Object[]{this.u()});
            return null;
        }
        String s = n0.R2();
        n0.m4();
        return s;
    }

    protected boolean y() {
        return false;
    }
}

