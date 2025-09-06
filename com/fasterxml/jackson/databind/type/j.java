package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;
import java.lang.reflect.TypeVariable;

public final class j extends i {
    private static final long q = 1L;

    protected j(o o0, m m0, m m1) {
        super(o0, m0, m1);
    }

    private j(Class class0, p p0, m m0, m[] arr_m, m m1, m m2, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, m1, m2, object0, object1, z);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i A0(Object object0) {
        return this.K0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i B0(Object object0) {
        return this.L0(object0);
    }

    @Deprecated
    public static j C0(Class class0, m m0, m m1) {
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        return arr_typeVariable == null || arr_typeVariable.length != 2 ? new j(class0, p.i(), o.n0(class0), null, m0, m1, null, null, false) : new j(class0, p.c(class0, m0, m1), o.n0(class0), null, m0, m1, null, null, false);
    }

    public static j D0(Class class0, p p0, m m0, m[] arr_m, m m1, m m2) {
        return new j(class0, p0, m0, arr_m, m1, m2, null, null, false);
    }

    public j E0(Object object0) {
        m m0 = this.o.k0(object0);
        return new j(this.a, this.i, this.g, this.h, this.n, m0, this.c, this.d, this.e);
    }

    public j F0(Object object0) {
        m m0 = this.o.m0(object0);
        return new j(this.a, this.i, this.g, this.h, this.n, m0, this.c, this.d, this.e);
    }

    public j G0(m m0) {
        return m0 == this.n ? this : new j(this.a, this.i, this.g, this.h, m0, this.o, this.c, this.d, this.e);
    }

    public j H0(Object object0) {
        m m0 = this.n.k0(object0);
        return new j(this.a, this.i, this.g, this.h, m0, this.o, this.c, this.d, this.e);
    }

    public j I0(Object object0) {
        m m0 = this.n.m0(object0);
        return new j(this.a, this.i, this.g, this.h, m0, this.o, this.c, this.d, this.e);
    }

    public j J0() {
        if(this.e) {
            return this;
        }
        m m0 = this.n.j0();
        m m1 = this.o.j0();
        return new j(this.a, this.i, this.g, this.h, m0, m1, this.c, this.d, true);
    }

    public j K0(Object object0) {
        return new j(this.a, this.i, this.g, this.h, this.n, this.o, this.c, object0, this.e);
    }

    public j L0(Object object0) {
        return new j(this.a, this.i, this.g, this.h, this.n, this.o, object0, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return new j(class0, p0, m0, arr_m, this.n, this.o, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public m f0(m m0) {
        return this.o == m0 ? this : new j(this.a, this.i, this.g, this.h, this.n, m0, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public m g0(Object object0) {
        return this.E0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public m h0(Object object0) {
        return this.F0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public m j0() {
        return this.J0();
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public m k0(Object object0) {
        return this.K0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public m m0(Object object0) {
        return this.L0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public String toString() {
        return "[map type; class " + this.a.getName() + ", " + this.n + " -> " + this.o + "]";
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i u0(Object object0) {
        return this.E0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i v0(Object object0) {
        return this.F0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i w0(m m0) {
        return this.G0(m0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i x0(Object object0) {
        return this.H0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i y0(Object object0) {
        return this.I0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.i
    public i z0() {
        return this.J0();
    }
}

