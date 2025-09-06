package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import J1.e;
import java.util.Iterator;
import o3.a;

@b(emulated = true, serializable = true)
@C1
final class r4 extends a3 {
    @e
    final transient Object[] h;
    private final transient int i;
    @e
    final transient Object[] j;
    private final transient int k;
    private final transient int l;
    private static final Object[] m;
    static final r4 n;

    static {
        Object[] arr_object = new Object[0];
        r4.m = arr_object;
        r4.n = new r4(arr_object, 0, arr_object, 0, 0);
    }

    r4(Object[] arr_object, int v, Object[] arr_object1, int v1, int v2) {
        this.h = arr_object;
        this.i = v;
        this.j = arr_object1;
        this.k = v1;
        this.l = v2;
    }

    @Override  // com.google.common.collect.a3
    boolean A() {
        return true;
    }

    @Override  // com.google.common.collect.K2
    int b(Object[] arr_object, int v) {
        System.arraycopy(this.h, 0, arr_object, v, this.l);
        return v + this.l;
    }

    @Override  // com.google.common.collect.K2
    Object[] c() {
        return this.h;
    }

    @Override  // com.google.common.collect.K2
    public boolean contains(@a Object object0) {
        Object[] arr_object = this.j;
        if(object0 != null && arr_object.length != 0) {
            for(int v = F2.d(object0); true; v = v1 + 1) {
                int v1 = v & this.k;
                Object object1 = arr_object[v1];
                if(object1 == null) {
                    return false;
                }
                if(object1.equals(object0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // com.google.common.collect.K2
    int d() {
        return this.l;
    }

    @Override  // com.google.common.collect.K2
    int g() {
        return 0;
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return false;
    }

    @Override  // com.google.common.collect.a3
    public int hashCode() {
        return this.i;
    }

    @Override  // com.google.common.collect.a3
    public u5 i() {
        return this.a().i();
    }

    @Override  // com.google.common.collect.a3
    public Iterator iterator() {
        return this.i();
    }

    @Override  // com.google.common.collect.a3
    @c
    @d
    Object k() {
        return super.k();
    }

    @Override
    public int size() {
        return this.l;
    }

    @Override  // com.google.common.collect.a3
    O2 z() {
        return O2.m(this.h, this.l);
    }
}

