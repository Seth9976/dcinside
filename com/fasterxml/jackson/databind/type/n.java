package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;
import java.util.Collection;
import java.util.Map;

public class n extends o {
    private static final long n = 1L;

    protected n(o o0) {
        super(o0);
    }

    protected n(Class class0) {
        this(class0, p.i(), null, null);
    }

    protected n(Class class0, p p0, m m0, m[] arr_m) {
        this(class0, p0, m0, arr_m, null, null, false);
    }

    protected n(Class class0, p p0, m m0, m[] arr_m, int v, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, v, object0, object1, z);
    }

    protected n(Class class0, p p0, m m0, m[] arr_m, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, (p0 == null ? p.i() : p0).hashCode(), object0, object1, z);
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder J(StringBuilder stringBuilder0) {
        return o.o0(this.a, stringBuilder0, true);
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder L(StringBuilder stringBuilder0) {
        o.o0(this.a, stringBuilder0, false);
        int v1 = this.i.r();
        if(v1 > 0) {
            stringBuilder0.append('<');
            for(int v = 0; v < v1; ++v) {
                stringBuilder0 = this.y(v).L(stringBuilder0);
            }
            stringBuilder0.append('>');
        }
        stringBuilder0.append(';');
        return stringBuilder0;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean T() {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.m
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
        return ((n)object0).a == this.a ? this.i.equals(((n)object0).i) : false;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m f0(m m0) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m g0(Object object0) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m h0(Object object0) {
        return this.u0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m j0() {
        return this.v0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m k0(Object object0) {
        return this.w0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m m0(Object object0) {
        return this.x0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean o() {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    protected String q0() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a.getName());
        int v = this.i.r();
        if(v > 0 && this.p0(v)) {
            stringBuilder0.append('<');
            for(int v1 = 0; v1 < v; ++v1) {
                m m0 = this.y(v1);
                if(v1 > 0) {
                    stringBuilder0.append(',');
                }
                stringBuilder0.append(m0.w());
            }
            stringBuilder0.append('>');
        }
        return stringBuilder0.toString();
    }

    private static m r0(Class class0, p p0) {
        if(class0 == null) {
            return null;
        }
        return class0 == Object.class ? q.v0() : new n(class0, p0, n.r0(class0.getSuperclass(), p0), null, null, null, false);
    }

    @Deprecated
    public static n s0(Class class0) {
        if(Map.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Map (class: " + class0.getName() + ")");
        }
        if(Collection.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Collection (class: " + class0.getName() + ")");
        }
        if(class0.isArray()) {
            throw new IllegalArgumentException("Cannot construct SimpleType for an array (class: " + class0.getName() + ")");
        }
        p p0 = p.i();
        return new n(class0, p0, n.r0(class0.getSuperclass(), p0), null, null, null, false);
    }

    public static n t0(Class class0) {
        return new n(class0, null, null, null, null, null, false);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public String toString() {
        return "[simple type, class " + this.q0() + ']';
    }

    public n u0(Object object0) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    // 去混淆评级： 低(20)
    public n v0() {
        return this.e ? this : new n(this.a, this.i, this.g, this.h, this.c, this.d, true);
    }

    public n w0(Object object0) {
        return this.d == object0 ? this : new n(this.a, this.i, this.g, this.h, this.c, object0, this.e);
    }

    public n x0(Object object0) {
        return object0 == this.c ? this : new n(this.a, this.i, this.g, this.h, object0, this.d, this.e);
    }
}

