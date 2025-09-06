package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.a;
import com.fasterxml.jackson.databind.m;
import j..util.Objects;

public class g extends n {
    protected final m o;
    private static final long p = 1L;

    protected g(o o0, m m0) {
        super(o0);
        this.o = m0;
    }

    protected g(Class class0, p p0, m m0, m[] arr_m, m m1, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, Objects.hashCode(m1), object0, object1, z);
        this.o = m1;
    }

    public g A0(Object object0) {
        if(object0 == this.o.R()) {
            return this;
        }
        m m0 = this.o.k0(object0);
        return new g(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    public g B0(Object object0) {
        if(object0 == this.o.S()) {
            return this;
        }
        m m0 = this.o.m0(object0);
        return new g(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    public g C0() {
        if(this.e) {
            return this;
        }
        m m0 = this.o.j0();
        return new g(this.a, this.i, this.g, this.h, m0, this.c, this.d, true);
    }

    public g D0(Object object0) {
        return object0 == this.d ? this : new g(this.a, this.i, this.g, this.h, this.o, this.c, object0, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m E() {
        return this.o;
    }

    public g E0(Object object0) {
        return object0 == this.c ? this : new g(this.a, this.i, this.g, this.h, this.o, object0, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public StringBuilder J(StringBuilder stringBuilder0) {
        return o.o0(this.a, stringBuilder0, true);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public StringBuilder L(StringBuilder stringBuilder0) {
        o.o0(this.a, stringBuilder0, false);
        stringBuilder0.append('<');
        StringBuilder stringBuilder1 = this.o.L(stringBuilder0);
        stringBuilder1.append(">;");
        return stringBuilder1;
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public boolean T() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean X() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return new g(class0, this.i, m0, arr_m, this.o, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public a d() {
        return this.E();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m f0(m m0) {
        return this.o == m0 ? this : new g(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m g0(Object object0) {
        return this.A0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m h0(Object object0) {
        return this.B0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m j0() {
        return this.C0();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m k0(Object object0) {
        return this.D0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m m0(Object object0) {
        return this.E0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    protected String q0() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a.getName());
        if(this.o != null && this.p0(1)) {
            stringBuilder0.append('<');
            stringBuilder0.append(this.o.w());
            stringBuilder0.append('>');
        }
        return stringBuilder0.toString();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n u0(Object object0) {
        return this.B0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n v0() {
        return this.C0();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n w0(Object object0) {
        return this.D0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n x0(Object object0) {
        return this.E0(object0);
    }

    public static g y0(Class class0, p p0, m m0, m[] arr_m, m m1) {
        return new g(class0, p0, m0, arr_m, m1, null, null, false);
    }

    public static g z0(m m0, m m1) {
        Objects.requireNonNull(m1);
        if(!(m0 instanceof o)) {
            throw new IllegalArgumentException("Cannot upgrade from an instance of " + m0.getClass());
        }
        return new g(((o)m0), m1);
    }
}

