package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import java.util.Iterator;

@b(emulated = true)
@C1
abstract class m3 extends a3 {
    @Override  // com.google.common.collect.K2
    @c
    int b(Object[] arr_object, int v) {
        return this.a().b(arr_object, v);
    }

    abstract Object get(int arg1);

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

    @Override  // com.google.common.collect.a3
    O2 z() {
        class a extends O2 {
            final m3 e;

            @Override
            public Object get(int v) {
                return m3.this.get(v);
            }

            @Override  // com.google.common.collect.K2
            boolean h() {
                return m3.this.h();
            }

            @Override  // com.google.common.collect.O2
            @c
            @d
            Object k() {
                return super.k();
            }

            @Override
            public int size() {
                return m3.this.size();
            }
        }

        return new a(this);
    }
}

