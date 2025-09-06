package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.a;
import com.fasterxml.jackson.databind.m;
import java.lang.reflect.TypeVariable;
import java.util.Map;

public class i extends o {
    protected final m n;
    protected final m o;
    private static final long p = 1L;

    protected i(o o0, m m0, m m1) {
        super(o0);
        this.n = m0;
        this.o = m1;
    }

    protected i(Class class0, p p0, m m0, m[] arr_m, m m1, m m2, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, m1.hashCode() * 0x1F + m2.hashCode(), object0, object1, z);
        this.n = m1;
        this.o = m2;
    }

    public i A0(Object object0) {
        return new i(this.a, this.i, this.g, this.h, this.n, this.o, this.c, object0, this.e);
    }

    public i B0(Object object0) {
        return new i(this.a, this.i, this.g, this.h, this.n, this.o, object0, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m E() {
        return this.o;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public Object F() {
        return this.o.R();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public Object G() {
        return this.o.S();
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
        this.o.L(stringBuilder0);
        stringBuilder0.append(">;");
        return stringBuilder0;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m N() {
        return this.n;
    }

    // 去混淆评级： 低(30)
    @Override  // com.fasterxml.jackson.databind.m
    public boolean U() {
        return super.U() || this.o.U() || this.n.U();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return new i(class0, p0, m0, arr_m, this.n, this.o, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public a d() {
        return this.E();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public a e() {
        return this.N();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0.getClass() == this.getClass() ? this.a == ((i)object0).a && this.n.equals(((i)object0).n) && this.o.equals(((i)object0).o) : false;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m f0(m m0) {
        return this.o == m0 ? this : new i(this.a, this.i, this.g, this.h, this.n, m0, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m g0(Object object0) {
        return this.u0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m h0(Object object0) {
        return this.v0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m i0(m m0) {
        m m1 = super.i0(m0);
        m m2 = m0.N();
        if(m1 instanceof i && m2 != null) {
            m m3 = this.n.i0(m2);
            if(m3 != this.n) {
                m1 = ((i)m1).w0(m3);
            }
        }
        m m4 = m0.E();
        if(m4 != null) {
            m m5 = this.o.i0(m4);
            return m5 == this.o ? m1 : m1.f0(m5);
        }
        return m1;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m j0() {
        return this.z0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m k0(Object object0) {
        return this.A0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m m0(Object object0) {
        return this.B0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean o() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    protected String q0() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a.getName());
        if(this.n != null && this.p0(2)) {
            stringBuilder0.append('<');
            stringBuilder0.append(this.n.w());
            stringBuilder0.append(',');
            stringBuilder0.append(this.o.w());
            stringBuilder0.append('>');
        }
        return stringBuilder0.toString();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean r() {
        return true;
    }

    @Deprecated
    public static i r0(Class class0, m m0, m m1) {
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        return arr_typeVariable == null || arr_typeVariable.length != 2 ? new i(class0, p.i(), o.n0(class0), null, m0, m1, null, null, false) : new i(class0, p.c(class0, m0, m1), o.n0(class0), null, m0, m1, null, null, false);
    }

    @Deprecated
    public boolean s0() {
        return Map.class.isAssignableFrom(this.a);
    }

    public static i t0(m m0, m m1, m m2) {
        if(!(m0 instanceof o)) {
            throw new IllegalArgumentException("Cannot upgrade from an instance of " + m0.getClass());
        }
        return new i(((o)m0), m1, m2);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.a.getName(), this.n, this.o);
    }

    public i u0(Object object0) {
        m m0 = this.o.k0(object0);
        return new i(this.a, this.i, this.g, this.h, this.n, m0, this.c, this.d, this.e);
    }

    public i v0(Object object0) {
        m m0 = this.o.m0(object0);
        return new i(this.a, this.i, this.g, this.h, this.n, m0, this.c, this.d, this.e);
    }

    public i w0(m m0) {
        return m0 == this.n ? this : new i(this.a, this.i, this.g, this.h, m0, this.o, this.c, this.d, this.e);
    }

    public i x0(Object object0) {
        m m0 = this.n.k0(object0);
        return new i(this.a, this.i, this.g, this.h, m0, this.o, this.c, this.d, this.e);
    }

    public i y0(Object object0) {
        m m0 = this.n.m0(object0);
        return new i(this.a, this.i, this.g, this.h, m0, this.o, this.c, this.d, this.e);
    }

    public i z0() {
        if(this.e) {
            return this;
        }
        m m0 = this.o.j0();
        return new i(this.a, this.i, this.g, this.h, this.n, m0, this.c, this.d, true);
    }
}

