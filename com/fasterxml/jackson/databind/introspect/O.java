package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class o extends k {
    protected final p d;
    protected final m e;
    protected final int f;
    private static final long g = 1L;

    public o(p p0, m m0, K k0, s s0, int v) {
        super(k0, s0);
        this.d = p0;
        this.e = m0;
        this.f = v;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public AnnotatedElement c() {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int e() {
        return this.d.e();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return h.R(object0, o.class) ? ((o)object0).d.equals(this.d) && ((o)object0).f == this.f : false;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public Class f() {
        return this.e.g();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public m g() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String getName() {
        return "";
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int hashCode() {
        return this.d.hashCode() + this.f;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Class m() {
        return this.d.m();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Member o() {
        return this.d.o();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Object q(Object object0) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + this.m().getName());
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public void r(Object object0, Object object1) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + this.m().getName());
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public b s(s s0) {
        return this.y(s0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String toString() {
        return "[parameter #" + this.u() + ", annotations: " + this.b + "]";
    }

    public int u() {
        return this.f;
    }

    public p w() {
        return this.d;
    }

    public Type x() {
        return this.e;
    }

    public o y(s s0) {
        return s0 == this.b ? this : this.d.G(this.f, s0);
    }
}

