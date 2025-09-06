package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.deser.y.a;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.f;
import java.io.IOException;
import java.lang.reflect.Constructor;

public final class j extends a {
    protected final transient Constructor q;
    protected f r;
    private static final long s = 1L;

    protected j(y y0, f f0) {
        super(y0);
        this.r = f0;
        Constructor constructor0 = f0 == null ? null : f0.H();
        this.q = constructor0;
        if(constructor0 == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }

    public j(y y0, Constructor constructor0) {
        super(y0);
        this.q = constructor0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    protected y Y(y y0) {
        return y0 == this.p ? this : new j(y0, this.q);
    }

    Object Z() {
        return new j(this, this.r);
    }

    Object a0() {
        return this.r == null ? new j(this, new f(null, this.q, null, null)) : this;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public void r(n n0, h h0, Object object0) throws IOException {
        Object object2;
        Object object1;
        if(n0.Y() == r.v) {
            object1 = this.h.c(h0);
        }
        else {
            com.fasterxml.jackson.databind.jsontype.f f0 = this.i;
            if(f0 == null) {
                try {
                    object2 = this.q.newInstance(object0);
                }
                catch(Exception exception0) {
                    com.fasterxml.jackson.databind.util.h.A0(exception0, String.format("Failed to instantiate class %s, problem: %s", this.q.getDeclaringClass().getName(), exception0.getMessage()));
                    object2 = null;
                }
                this.h.h(n0, h0, object2);
                object1 = object2;
            }
            else {
                object1 = this.h.i(n0, h0, f0);
            }
        }
        this.M(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public Object s(n n0, h h0, Object object0) throws IOException {
        return this.N(object0, this.q(n0, h0));
    }
}

