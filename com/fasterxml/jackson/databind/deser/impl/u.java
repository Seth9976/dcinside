package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.n;
import java.io.IOException;
import java.lang.annotation.Annotation;

public final class u extends y {
    protected final s p;
    private static final long q = 1L;

    public u(s s0, A a0) {
        super(s0.b, s0.c(), a0, s0.b());
        this.p = s0;
    }

    protected u(u u0, B b0) {
        super(u0, b0);
        this.p = u0.p;
    }

    protected u(u u0, n n0, v v0) {
        super(u0, n0, v0);
        this.p = u0.p;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void M(Object object0, Object object1) throws IOException {
        this.N(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object N(Object object0, Object object1) throws IOException {
        y y0 = this.p.f;
        if(y0 == null) {
            throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
        }
        return y0.N(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y S(B b0) {
        return new u(this, b0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y T(v v0) {
        return new u(this, this.h, v0);
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
        return new u(this, n0, v0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Annotation getAnnotation(Class class0) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public k h() {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void r(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        this.s(n0, h0, object0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object s(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        if(n0.Y3(r.v)) {
            return null;
        }
        Object object1 = this.h.g(n0, h0);
        h0.b0(object1, this.p.c, this.p.d).b(object0);
        y y0 = this.p.f;
        return y0 == null ? object0 : y0.N(object0, object1);
    }
}

