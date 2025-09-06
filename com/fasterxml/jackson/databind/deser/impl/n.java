package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.y.a;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.k;
import java.io.IOException;

public class n extends a {
    protected final k q;
    private static final long r = 1L;

    protected n(n n0, y y0) {
        super(y0);
        this.q = n0.q;
    }

    protected n(y y0, k k0) {
        super(y0);
        this.q = k0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public void M(Object object0, Object object1) throws IOException {
        if(object1 != null) {
            this.p.M(object0, object1);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public Object N(Object object0, Object object1) throws IOException {
        return object1 == null ? object0 : this.p.N(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    protected y Y(y y0) {
        return new n(y0, this.q);
    }

    public static n Z(y y0, k k0) {
        return new n(y0, k0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public void r(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        Object object1 = this.q.q(object0);
        Object object2 = object1 == null ? this.p.q(n0, h0) : this.p.u(n0, h0, object1);
        if(object2 != object1) {
            this.p.M(object0, object2);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public Object s(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        Object object1 = this.q.q(object0);
        Object object2 = object1 == null ? this.p.q(n0, h0) : this.p.u(n0, h0, object1);
        return object2 == object1 || object2 == null ? object0 : this.p.N(object0, object2);
    }
}

