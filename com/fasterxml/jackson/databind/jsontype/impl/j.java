package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
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

public class j extends s implements Serializable {
    private static final long j = 1L;

    protected j(j j0, d d0) {
        super(j0, d0);
    }

    public j(m m0, g g0, String s, boolean z, m m1) {
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
        return d0 == this.c ? this : new j(this, d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.s
    public a k() {
        return a.b;
    }

    protected Object w(n n0, h h0) throws IOException {
        if(n0.w()) {
            Object object0 = n0.n3();
            if(object0 != null) {
                return this.n(n0, h0, object0);
            }
        }
        r r0 = n0.Y();
        r r1 = r.k;
        if(r0 == r1) {
            r r2 = n0.m4();
            r r3 = r.o;
            if(r2 != r3) {
                h0.h1(this.s(), r3, "need JSON String that contains type id (for subtype of " + this.u() + ")", new Object[0]);
            }
        }
        else if(r0 != r.o) {
            h0.h1(this.s(), r1, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + this.u(), new Object[0]);
        }
        String s = n0.R2();
        com.fasterxml.jackson.databind.n n1 = this.p(h0, s);
        n0.m4();
        if(this.f && n0.Y3(r1)) {
            H h1 = h0.O(n0);
            h1.D4();
            h1.v3(this.e);
            h1.d(s);
            n0.L();
            n0 = com.fasterxml.jackson.core.util.m.O4(false, h1.b5(n0), n0);
            n0.m4();
        }
        Object object1 = n1.g(n0, h0);
        r r4 = n0.m4();
        r r5 = r.l;
        if(r4 != r5) {
            h0.h1(this.s(), r5, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return object1;
    }
}

