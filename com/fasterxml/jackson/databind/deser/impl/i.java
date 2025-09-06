package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class i extends y {
    protected final com.fasterxml.jackson.databind.introspect.i p;
    protected final transient Field q;
    protected final boolean r;
    private static final long s = 1L;

    protected i(i i0) {
        super(i0);
        this.p = i0.p;
        Field field0 = i0.p.u();
        if(field0 == null) {
            throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
        }
        this.q = field0;
        this.r = i0.r;
    }

    protected i(i i0, B b0) {
        super(i0, b0);
        this.p = i0.p;
        this.q = i0.q;
        this.r = i0.r;
    }

    protected i(i i0, n n0, v v0) {
        super(i0, n0, v0);
        this.p = i0.p;
        this.q = i0.q;
        this.r = q.e(v0);
    }

    public i(com.fasterxml.jackson.databind.introspect.v v0, m m0, f f0, b b0, com.fasterxml.jackson.databind.introspect.i i0) {
        super(v0, m0, f0, b0);
        this.p = i0;
        this.q = i0.u();
        this.r = q.e(this.j);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void M(Object object0, Object object1) throws IOException {
        try {
            this.q.set(object0, object1);
        }
        catch(Exception exception0) {
            this.o(exception0, object1);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object N(Object object0, Object object1) throws IOException {
        try {
            this.q.set(object0, object1);
        }
        catch(Exception exception0) {
            this.o(exception0, object1);
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y S(B b0) {
        return new i(this, b0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y T(v v0) {
        return new i(this, this.h, v0);
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
        return new i(this, n0, v0);
    }

    Object W() {
        return new i(this);
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
            this.q.set(object0, object1);
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
            this.q.set(object0, object1);
        }
        catch(Exception exception0) {
            this.n(n0, exception0, object1);
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void w(g g0) {
        boolean z = g0.a0(t.q);
        com.fasterxml.jackson.databind.util.h.i(this.q, z);
    }
}

