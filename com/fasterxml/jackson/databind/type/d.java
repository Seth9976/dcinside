package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.a;
import com.fasterxml.jackson.databind.m;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

public class d extends o {
    protected final m n;
    private static final long o = 1L;

    protected d(o o0, m m0) {
        super(o0);
        this.n = m0;
    }

    protected d(Class class0, p p0, m m0, m[] arr_m, m m1, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, m1.hashCode(), object0, object1, z);
        this.n = m1;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m E() {
        return this.n;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public Object F() {
        return this.n.R();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public Object G() {
        return this.n.S();
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder J(StringBuilder stringBuilder0) {
        return o.o0(this.a, stringBuilder0, true);
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder L(StringBuilder stringBuilder0) {
        o.o0(this.a, stringBuilder0, false);
        stringBuilder0.append('<');
        this.n.L(stringBuilder0);
        stringBuilder0.append(">;");
        return stringBuilder0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.m
    public boolean U() {
        return super.U() || this.n.U();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return new d(class0, p0, m0, arr_m, this.n, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public a d() {
        return this.E();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0.getClass() == this.getClass() ? this.a == ((d)object0).a && this.n.equals(((d)object0).n) : false;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m f0(m m0) {
        return this.n == m0 ? this : new d(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m g0(Object object0) {
        return this.v0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m h0(Object object0) {
        return this.w0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m i0(m m0) {
        m m1 = super.i0(m0);
        m m2 = m0.E();
        if(m2 != null) {
            m m3 = this.n.i0(m2);
            return m3 == this.n ? m1 : m1.f0(m3);
        }
        return m1;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m j0() {
        return this.x0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m k0(Object object0) {
        return this.y0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean m() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m m0(Object object0) {
        return this.z0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean o() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    protected String q0() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a.getName());
        if(this.n != null && this.p0(1)) {
            stringBuilder0.append('<');
            stringBuilder0.append(this.n.w());
            stringBuilder0.append('>');
        }
        return stringBuilder0.toString();
    }

    @Deprecated
    public static d r0(Class class0, m m0) {
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        return arr_typeVariable == null || arr_typeVariable.length != 1 ? new d(class0, p.i(), o.n0(class0), null, m0, null, null, false) : new d(class0, p.b(class0, m0), o.n0(class0), null, m0, null, null, false);
    }

    public static d s0(Class class0, p p0, m m0, m[] arr_m, m m1) {
        return new d(class0, p0, m0, arr_m, m1, null, null, false);
    }

    @Deprecated
    public boolean t0() {
        return Collection.class.isAssignableFrom(this.a);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public String toString() {
        return "[collection-like type; class " + this.a.getName() + ", contains " + this.n + "]";
    }

    public static d u0(m m0, m m1) {
        if(!(m0 instanceof o)) {
            throw new IllegalArgumentException("Cannot upgrade from an instance of " + m0.getClass());
        }
        return new d(((o)m0), m1);
    }

    public d v0(Object object0) {
        m m0 = this.n.k0(object0);
        return new d(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    public d w0(Object object0) {
        m m0 = this.n.m0(object0);
        return new d(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    public d x0() {
        if(this.e) {
            return this;
        }
        m m0 = this.n.j0();
        return new d(this.a, this.i, this.g, this.h, m0, this.c, this.d, true);
    }

    public d y0(Object object0) {
        return new d(this.a, this.i, this.g, this.h, this.n, this.c, object0, this.e);
    }

    public d z0(Object object0) {
        return new d(this.a, this.i, this.g, this.h, this.n, object0, this.d, this.e);
    }
}

