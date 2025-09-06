package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.a;
import com.fasterxml.jackson.databind.m;
import j..util.Objects;

public class l extends n {
    protected final m o;
    @Deprecated
    protected final m p;
    private static final long q = 1L;

    protected l(o o0, m m0) {
        super(o0);
        this.o = m0;
        this.p = this;
    }

    protected l(Class class0, p p0, m m0, m[] arr_m, m m1, m m2, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, Objects.hashCode(m1), object0, object1, z);
        this.o = m1;
        m m3 = m2 == null ? this : m2;
        this.p = m3;
    }

    @Deprecated
    public m A0() {
        return this.p;
    }

    @Deprecated
    public boolean B0() {
        return this.p == this;
    }

    public static l C0(m m0, m m1) {
        if(m1 == null) {
            throw new IllegalArgumentException("Missing referencedType");
        }
        if(!(m0 instanceof o)) {
            throw new IllegalArgumentException("Cannot upgrade from an instance of " + m0.getClass());
        }
        return new l(((o)m0), m1);
    }

    public l D0(Object object0) {
        if(object0 == this.o.R()) {
            return this;
        }
        m m0 = this.o.k0(object0);
        return new l(this.a, this.i, this.g, this.h, m0, this.p, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m E() {
        return this.o;
    }

    public l E0(Object object0) {
        if(object0 == this.o.S()) {
            return this;
        }
        m m0 = this.o.m0(object0);
        return new l(this.a, this.i, this.g, this.h, m0, this.p, this.c, this.d, this.e);
    }

    public l F0() {
        if(this.e) {
            return this;
        }
        m m0 = this.o.j0();
        return new l(this.a, this.i, this.g, this.h, m0, this.p, this.c, this.d, true);
    }

    public l G0(Object object0) {
        return object0 == this.d ? this : new l(this.a, this.i, this.g, this.h, this.o, this.p, this.c, object0, this.e);
    }

    public l H0(Object object0) {
        return object0 == this.c ? this : new l(this.a, this.i, this.g, this.h, this.o, this.p, object0, this.d, this.e);
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

    @Override  // com.fasterxml.jackson.databind.m
    public m O() {
        return this.o;
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public boolean T() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return new l(class0, this.i, m0, arr_m, this.o, this.p, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public a d() {
        return this.E();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(object0.getClass() != this.getClass()) {
            return false;
        }
        return ((l)object0).a == this.a ? this.o.equals(((l)object0).o) : false;
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m f0(m m0) {
        return this.o == m0 ? this : new l(this.a, this.i, this.g, this.h, m0, this.p, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m g0(Object object0) {
        return this.D0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public a h() {
        return this.O();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m h0(Object object0) {
        return this.E0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m j0() {
        return this.F0();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m k0(Object object0) {
        return this.G0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public m m0(Object object0) {
        return this.H0(object0);
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

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean s() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public String toString() {
        return "[reference type, class " + this.q0() + '<' + this.o + '>' + ']';
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n u0(Object object0) {
        return this.E0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n v0() {
        return this.F0();
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n w0(Object object0) {
        return this.G0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.n
    public n x0(Object object0) {
        return this.H0(object0);
    }

    @Deprecated
    public static l y0(Class class0, m m0) {
        return new l(class0, p.i(), null, null, null, m0, null, null, false);
    }

    public static l z0(Class class0, p p0, m m0, m[] arr_m, m m1) {
        return new l(class0, p0, m0, arr_m, m1, null, null, null, false);
    }
}

