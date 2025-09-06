package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import J1.e;
import o3.a;

@b(emulated = true, serializable = true)
@C1
final class n4 extends I2 {
    @a
    private final transient Object h;
    @e
    final transient Object[] i;
    private final transient int j;
    private final transient int k;
    private final transient n4 l;
    static final n4 m;

    static {
        n4.m = new n4();
    }

    private n4() {
        this.h = null;
        this.i = new Object[0];
        this.j = 0;
        this.k = 0;
        this.l = this;
    }

    private n4(@a Object object0, Object[] arr_object, int v, n4 n40) {
        this.h = object0;
        this.i = arr_object;
        this.j = 1;
        this.k = v;
        this.l = n40;
    }

    n4(Object[] arr_object, int v) {
        this.i = arr_object;
        this.k = v;
        this.j = 0;
        int v1 = v < 2 ? 0 : a3.p(v);
        this.h = p4.P(arr_object, v, v1, 0);
        this.l = new n4(p4.P(arr_object, v, v1, 1), arr_object, v, this);
    }

    @Override  // com.google.common.collect.I2
    @c
    @d
    Object L() {
        return super.L();
    }

    @Override  // com.google.common.collect.I2
    public x Q1() {
        return this.U();
    }

    @Override  // com.google.common.collect.I2
    public I2 U() {
        return this.l;
    }

    @Override  // com.google.common.collect.Q2
    @a
    public Object get(@a Object object0) {
        Object object1 = p4.S(this.h, this.i, this.k, this.j, object0);
        return object1 == null ? null : object1;
    }

    @Override  // com.google.common.collect.Q2
    a3 h() {
        return new com.google.common.collect.p4.a(this, this.i, this.j, this.k);
    }

    @Override  // com.google.common.collect.Q2
    a3 i() {
        return new com.google.common.collect.p4.b(this, new com.google.common.collect.p4.c(this.i, this.j, this.k));
    }

    @Override  // com.google.common.collect.Q2
    boolean q() {
        return false;
    }

    @Override
    public int size() {
        return this.k;
    }
}

