package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;
import o3.a;

@b(emulated = true)
@C1
final class T2 extends K2 {
    @c
    @d
    static class com.google.common.collect.T2.c implements Serializable {
        final Q2 a;
        private static final long b;

        com.google.common.collect.T2.c(Q2 q20) {
            this.a = q20;
        }

        Object a() {
            return this.a.K();
        }
    }

    private final Q2 c;

    T2(Q2 q20) {
        this.c = q20;
    }

    @Override  // com.google.common.collect.K2
    public O2 a() {
        class com.google.common.collect.T2.b extends O2 {
            final O2 e;

            com.google.common.collect.T2.b(O2 o20) {
                this.e = o20;
                super();
            }

            @Override
            public Object get(int v) {
                return ((Map.Entry)this.e.get(v)).getValue();
            }

            @Override  // com.google.common.collect.K2
            boolean h() {
                return true;
            }

            @Override  // com.google.common.collect.O2
            @c
            @d
            Object k() {
                return super.k();
            }

            @Override
            public int size() {
                return this.e.size();
            }
        }

        return new com.google.common.collect.T2.b(this, this.c.m().a());
    }

    @Override  // com.google.common.collect.K2
    public boolean contains(@a Object object0) {
        return object0 != null && q3.p(this.i(), object0);
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return true;
    }

    @Override  // com.google.common.collect.K2
    public u5 i() {
        class com.google.common.collect.T2.a extends u5 {
            final u5 a;
            final T2 b;

            com.google.common.collect.T2.a() {
                this.a = t20.c.m().i();
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                Object object0 = this.a.next();
                return ((Map.Entry)object0).getValue();
            }
        }

        return new com.google.common.collect.T2.a(this);
    }

    @Override  // com.google.common.collect.K2
    public Iterator iterator() {
        return this.i();
    }

    @Override  // com.google.common.collect.K2
    @c
    Object k() {
        return new com.google.common.collect.T2.c(this.c);
    }

    @Override
    public int size() {
        return this.c.size();
    }
}

