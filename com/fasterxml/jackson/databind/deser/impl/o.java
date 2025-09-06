package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class o extends y {
    protected final l p;
    protected final transient Method q;
    protected final boolean r;
    private static final long s = 1L;

    protected o(o o0, B b0) {
        super(o0, b0);
        this.p = o0.p;
        this.q = o0.q;
        this.r = o0.r;
    }

    protected o(o o0, n n0, v v0) {
        super(o0, n0, v0);
        this.p = o0.p;
        this.q = o0.q;
        this.r = q.e(v0);
    }

    protected o(o o0, Method method0) {
        super(o0);
        this.p = o0.p;
        this.q = method0;
        this.r = o0.r;
    }

    public o(com.fasterxml.jackson.databind.introspect.v v0, m m0, f f0, b b0, l l0) {
        super(v0, m0, f0, b0);
        this.p = l0;
        this.q = l0.J();
        this.r = q.e(this.j);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public final void M(Object object0, Object object1) throws IOException {
        try {
            this.q.invoke(object0, object1);
        }
        catch(Exception exception0) {
            this.o(exception0, object1);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object N(Object object0, Object object1) throws IOException {
        try {
            Object object2 = this.q.invoke(object0, object1);
            return object2 == null ? object0 : object2;
        }
        catch(Exception exception0) {
            this.o(exception0, object1);
            return null;
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y S(B b0) {
        return new o(this, b0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y T(v v0) {
        return new o(this, this.h, v0);
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
        return new o(this, n0, v0);
    }

    Object W() {
        return new o(this, this.p.J());
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Annotation getAnnotation(Class class0) {
        return this.p == null ? null : this.p.d(class0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public k h() {
        return this.p;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void r(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        Object object1;
        if(n0.Y3(r.v)) {
            if(this.r) {
                return;
            }
            object1 = this.j.c(h0);
        }
        else {
            f f0 = this.i;
            if(f0 == null) {
                Object object2 = this.h.g(n0, h0);
                if(object2 == null) {
                    if(this.r) {
                        return;
                    }
                    object1 = this.j.c(h0);
                }
                else {
                    object1 = object2;
                }
            }
            else {
                object1 = this.h.i(n0, h0, f0);
            }
        }
        try {
            this.q.invoke(object0, object1);
        }
        catch(Exception exception0) {
            this.n(n0, exception0, object1);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object s(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        Object object1;
        if(n0.Y3(r.v)) {
            if(this.r) {
                return object0;
            }
            object1 = this.j.c(h0);
        }
        else {
            f f0 = this.i;
            if(f0 == null) {
                Object object2 = this.h.g(n0, h0);
                if(object2 == null) {
                    if(this.r) {
                        return object0;
                    }
                    object1 = this.j.c(h0);
                }
                else {
                    object1 = object2;
                }
            }
            else {
                object1 = this.h.i(n0, h0, f0);
            }
        }
        try {
            Object object3 = this.q.invoke(object0, object1);
            return object3 == null ? object0 : object3;
        }
        catch(Exception exception0) {
            this.n(n0, exception0, object1);
            return null;
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void w(g g0) {
        boolean z = g0.a0(t.q);
        this.p.k(z);
    }
}

