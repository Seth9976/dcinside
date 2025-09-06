package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import java.util.ListIterator;
import o3.a;

@b(emulated = true)
@C1
class m4 extends H2 {
    private final K2 e;
    private final O2 f;

    m4(K2 k20, O2 o20) {
        this.e = k20;
        this.f = o20;
    }

    m4(K2 k20, Object[] arr_object) {
        this(k20, O2.l(arr_object));
    }

    m4(K2 k20, Object[] arr_object, int v) {
        this(k20, O2.m(arr_object, v));
    }

    @Override  // com.google.common.collect.H2
    K2 U() {
        return this.e;
    }

    O2 V() {
        return this.f;
    }

    @Override  // com.google.common.collect.O2
    @c
    int b(Object[] arr_object, int v) {
        return this.f.b(arr_object, v);
    }

    @Override  // com.google.common.collect.K2
    @a
    Object[] c() {
        return this.f.c();
    }

    @Override  // com.google.common.collect.K2
    int d() {
        return this.f.d();
    }

    @Override  // com.google.common.collect.K2
    int g() {
        return this.f.g();
    }

    @Override
    public Object get(int v) {
        return this.f.get(v);
    }

    @Override  // com.google.common.collect.H2
    @c
    @d
    Object k() {
        return super.k();
    }

    @Override  // com.google.common.collect.O2
    public ListIterator listIterator(int v) {
        return this.z(v);
    }

    @Override  // com.google.common.collect.O2
    public v5 z(int v) {
        return this.f.z(v);
    }
}

