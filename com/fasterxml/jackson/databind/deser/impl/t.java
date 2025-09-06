package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.deser.z;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class t extends y {
    public static final class a extends com.fasterxml.jackson.databind.deser.impl.z.a {
        private final t c;
        public final Object d;

        public a(t t0, z z0, Class class0, Object object0) {
            super(z0, class0);
            this.c = t0;
            this.d = object0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.z$a
        public void c(Object object0, Object object1) throws IOException {
            if(!this.d(object0)) {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + object0 + "] that wasn\'t previously seen as unresolved.");
            }
            this.c.M(this.d, object1);
        }
    }

    private final y p;
    private static final long q = 1L;

    public t(t t0, B b0) {
        super(t0, b0);
        this.p = t0.p;
        this.l = t0.l;
    }

    public t(t t0, n n0, v v0) {
        super(t0, n0, v0);
        this.p = t0.p;
        this.l = t0.l;
    }

    public t(y y0, F f0) {
        super(y0);
        this.p = y0;
        this.l = f0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void M(Object object0, Object object1) throws IOException {
        this.p.M(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object N(Object object0, Object object1) throws IOException {
        return this.p.N(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y S(B b0) {
        return new t(this, b0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y T(v v0) {
        return new t(this, this.h, v0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y V(n n0) {
        n n1 = this.h;
        if(n1 == n0) {
            return this;
        }
        v v0 = this.j;
        if(n1 == v0) {
            v0 = n0;
        }
        return new t(this, n0, v0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Annotation getAnnotation(Class class0) {
        return this.p.getAnnotation(class0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public k h() {
        return this.p.h();
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void r(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        this.s(n0, h0, object0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object s(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        try {
            return this.N(object0, this.q(n0, h0));
        }
        catch(z z0) {
            if(this.l == null && this.h.r() == null) {
                throw o.o(n0, "Unresolved forward reference but no identity info", z0);
            }
            z0.G().a(new a(this, z0, this.e.g(), object0));
            return null;
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void w(g g0) {
        y y0 = this.p;
        if(y0 != null) {
            y0.w(g0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public int x() {
        return this.p.x();
    }
}

