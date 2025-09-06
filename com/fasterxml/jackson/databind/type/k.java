package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;

public class k extends f {
    protected final int o;
    protected m p;
    private static final long q = 1L;

    public k(int v) {
        m m0 = q.v0();
        super(Object.class, p.i(), m0, null, 1, null, null, false);
        this.o = v;
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder J(StringBuilder stringBuilder0) {
        stringBuilder0.append('$');
        stringBuilder0.append(this.o + 1);
        return stringBuilder0;
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder L(StringBuilder stringBuilder0) {
        return this.J(stringBuilder0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m c0(Class class0, p p0, m m0, m[] arr_m) {
        return (m)this.r0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m f0(m m0) {
        return (m)this.r0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m g0(Object object0) {
        return (m)this.r0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m h0(Object object0) {
        return (m)this.r0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m j0() {
        return (m)this.r0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m k0(Object object0) {
        return (m)this.r0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m m0(Object object0) {
        return (m)this.r0();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean o() {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    protected String q0() {
        return this.toString();
    }

    private Object r0() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + this.getClass().getName());
    }

    public m s0() {
        return this.p;
    }

    public void t0(m m0) {
        this.p = m0;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public String toString() {
        return this.J(new StringBuilder()).toString();
    }
}

