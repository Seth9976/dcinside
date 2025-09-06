package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;
import java.lang.reflect.TypeVariable;

public final class e extends d {
    private static final long p = 1L;

    protected e(o o0, m m0) {
        super(o0, m0);
    }

    private e(Class class0, p p0, m m0, m[] arr_m, m m1, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, m1, object0, object1, z);
    }

    @Deprecated
    public static e A0(Class class0, m m0) {
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        return arr_typeVariable == null || arr_typeVariable.length != 1 ? new e(class0, p.i(), o.n0(class0), null, m0, null, null, false) : new e(class0, p.b(class0, m0), o.n0(class0), null, m0, null, null, false);
    }

    public static e B0(Class class0, p p0, m m0, m[] arr_m, m m1) {
        return new e(class0, p0, m0, arr_m, m1, null, null, false);
    }

    public e C0(Object object0) {
        m m0 = this.n.k0(object0);
        return new e(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    public e D0(Object object0) {
        m m0 = this.n.m0(object0);
        return new e(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    public e E0() {
        if(this.e) {
            return this;
        }
        m m0 = this.n.j0();
        return new e(this.a, this.i, this.g, this.h, m0, this.c, this.d, true);
    }

    public e F0(Object object0) {
        return new e(this.a, this.i, this.g, this.h, this.n, this.c, object0, this.e);
    }

    public e G0(Object object0) {
        return new e(this.a, this.i, this.g, this.h, this.n, object0, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return new e(class0, p0, m0, arr_m, this.n, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public m f0(m m0) {
        return this.n == m0 ? this : new e(this.a, this.i, this.g, this.h, m0, this.c, this.d, this.e);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public m g0(Object object0) {
        return this.C0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public m h0(Object object0) {
        return this.D0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public m j0() {
        return this.E0();
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public m k0(Object object0) {
        return this.F0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public m m0(Object object0) {
        return this.G0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public String toString() {
        return "[collection type; class " + this.a.getName() + ", contains " + this.n + "]";
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public d v0(Object object0) {
        return this.C0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public d w0(Object object0) {
        return this.D0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public d x0() {
        return this.E0();
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public d y0(Object object0) {
        return this.F0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.type.d
    public d z0(Object object0) {
        return this.G0(object0);
    }
}

