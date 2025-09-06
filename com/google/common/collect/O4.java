package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import j..util.Objects;

@b(emulated = true, serializable = true)
@C1
class o4 extends O2 {
    @e
    final transient Object[] e;
    private final transient int f;
    static final O2 g;

    static {
        o4.g = new o4(new Object[0], 0);
    }

    o4(Object[] arr_object, int v) {
        this.e = arr_object;
        this.f = v;
    }

    @Override  // com.google.common.collect.O2
    int b(Object[] arr_object, int v) {
        System.arraycopy(this.e, 0, arr_object, v, this.f);
        return v + this.f;
    }

    @Override  // com.google.common.collect.K2
    Object[] c() {
        return this.e;
    }

    @Override  // com.google.common.collect.K2
    int d() {
        return this.f;
    }

    @Override  // com.google.common.collect.K2
    int g() {
        return 0;
    }

    @Override
    public Object get(int v) {
        H.C(v, this.f);
        Object object0 = this.e[v];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return false;
    }

    @Override  // com.google.common.collect.O2
    @c
    @d
    Object k() {
        return super.k();
    }

    @Override
    public int size() {
        return this.f;
    }
}

