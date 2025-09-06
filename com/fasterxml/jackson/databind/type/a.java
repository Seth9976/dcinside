package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;
import java.lang.reflect.Array;

public final class a extends o {
    protected final m n;
    protected final Object o;
    private static final long p = 1L;

    protected a(m m0, p p0, Object object0, Object object1, Object object2, boolean z) {
        super(object0.getClass(), p0, null, null, m0.hashCode(), object1, object2, z);
        this.n = m0;
        this.o = object0;
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
        stringBuilder0.append('[');
        return this.n.J(stringBuilder0);
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder L(StringBuilder stringBuilder0) {
        stringBuilder0.append('[');
        return this.n.L(stringBuilder0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.m
    public boolean U() {
        return super.U() || this.n.U();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.core.type.a d() {
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
        return object0.getClass() == a.class ? this.n.equals(((a)object0).n) : false;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m f0(m m0) {
        Object object0 = Array.newInstance(m0.g(), 0);
        return new a(m0, this.i, object0, this.c, this.d, this.e);
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
    public boolean i() {
        return this.n.i();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m j0() {
        return this.w0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean k() {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m k0(Object object0) {
        return this.x0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean l() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m m0(Object object0) {
        return this.y0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean n() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean o() {
        return true;
    }

    public static a r0(m m0, p p0) {
        return a.s0(m0, p0, null, null);
    }

    public static a s0(m m0, p p0, Object object0, Object object1) {
        return new a(m0, p0, Array.newInstance(m0.g(), 0), object0, object1, false);
    }

    public Object[] t0() {
        return (Object[])this.o;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public String toString() {
        return "[array type, component type: " + this.n + "]";
    }

    public a u0(Object object0) {
        return object0 == this.n.R() ? this : new a(this.n.k0(object0), this.i, this.o, this.c, this.d, this.e);
    }

    public a v0(Object object0) {
        return object0 == this.n.S() ? this : new a(this.n.m0(object0), this.i, this.o, this.c, this.d, this.e);
    }

    // 去混淆评级： 低(20)
    public a w0() {
        return this.e ? this : new a(this.n.j0(), this.i, this.o, this.c, this.d, true);
    }

    public a x0(Object object0) {
        return object0 == this.d ? this : new a(this.n, this.i, this.o, this.c, object0, this.e);
    }

    public a y0(Object object0) {
        return object0 == this.c ? this : new a(this.n, this.i, this.o, object0, this.d, this.e);
    }
}

