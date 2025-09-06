package com.fasterxml.jackson.databind.type;

public class m extends f {
    protected com.fasterxml.jackson.databind.m o;
    private static final long p = 1L;

    public m(Class class0, p p0) {
        super(class0, p0, null, null, 0, null, null, false);
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public p D() {
        com.fasterxml.jackson.databind.m m0 = this.o;
        return m0 == null ? super.D() : m0.D();
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder J(StringBuilder stringBuilder0) {
        return this.o == null ? stringBuilder0 : this.o.J(stringBuilder0);
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public StringBuilder L(StringBuilder stringBuilder0) {
        com.fasterxml.jackson.databind.m m0 = this.o;
        if(m0 != null) {
            return m0.J(stringBuilder0);
        }
        stringBuilder0.append("?");
        return stringBuilder0;
    }

    @Override  // com.fasterxml.jackson.databind.type.o
    public com.fasterxml.jackson.databind.m Q() {
        com.fasterxml.jackson.databind.m m0 = this.o;
        return m0 == null ? super.Q() : m0.Q();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.databind.m c0(Class class0, p p0, com.fasterxml.jackson.databind.m m0, com.fasterxml.jackson.databind.m[] arr_m) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.databind.m f0(com.fasterxml.jackson.databind.m m0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.databind.m g0(Object object0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.databind.m h0(Object object0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.databind.m j0() {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.databind.m k0(Object object0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public com.fasterxml.jackson.databind.m m0(Object object0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public boolean o() {
        return false;
    }

    public com.fasterxml.jackson.databind.m r0() {
        return this.o;
    }

    public void s0(com.fasterxml.jackson.databind.m m0) {
        if(this.o != null) {
            throw new IllegalStateException("Trying to re-set self reference; old value = " + this.o + ", new = " + m0);
        }
        this.o = m0;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(40);
        stringBuilder0.append("[recursive type; ");
        com.fasterxml.jackson.databind.m m0 = this.o;
        if(m0 == null) {
            stringBuilder0.append("UNRESOLVED");
            return stringBuilder0.toString();
        }
        stringBuilder0.append(m0.g().getName());
        return stringBuilder0.toString();
    }
}

