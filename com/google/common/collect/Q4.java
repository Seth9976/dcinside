package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.primitives.l;
import java.io.Serializable;
import java.util.Set;

@b(emulated = true, serializable = true)
@C1
class q4 extends W2 {
    static class a {
    }

    final class com.google.common.collect.q4.b extends m3 {
        final q4 h;

        private com.google.common.collect.q4.b() {
        }

        com.google.common.collect.q4.b(a q4$a0) {
        }

        @Override  // com.google.common.collect.K2
        public boolean contains(@o3.a Object object0) {
            return q4.this.contains(object0);
        }

        @Override  // com.google.common.collect.m3
        Object get(int v) {
            return q4.this.f.j(v);
        }

        @Override  // com.google.common.collect.K2
        boolean h() {
            return true;
        }

        @Override  // com.google.common.collect.m3
        @c
        @d
        Object k() {
            return super.k();
        }

        @Override
        public int size() {
            return q4.this.f.D();
        }
    }

    @c
    static class com.google.common.collect.q4.c implements Serializable {
        final Object[] a;
        final int[] b;
        private static final long c;

        com.google.common.collect.q4.c(S3 s30) {
            int v = s30.entrySet().size();
            this.a = new Object[v];
            this.b = new int[v];
            int v1 = 0;
            for(Object object0: s30.entrySet()) {
                this.a[v1] = ((com.google.common.collect.S3.a)object0).b0();
                this.b[v1] = ((com.google.common.collect.S3.a)object0).getCount();
                ++v1;
            }
        }

        Object a() {
            com.google.common.collect.W2.b w2$b0 = new com.google.common.collect.W2.b(this.a.length);
            for(int v = 0; true; ++v) {
                Object[] arr_object = this.a;
                if(v >= arr_object.length) {
                    break;
                }
                w2$b0.k(arr_object[v], this.b[v]);
            }
            return w2$b0.l();
        }
    }

    final transient a4 f;
    private final transient int g;
    @P1.b
    @o3.a
    private transient a3 h;
    static final q4 i;

    static {
        q4.i = new q4(a4.c());
    }

    q4(a4 a40) {
        this.f = a40;
        long v = 0L;
        for(int v1 = 0; v1 < a40.D(); ++v1) {
            v += (long)a40.l(v1);
        }
        this.g = l.z(v);
    }

    @Override  // com.google.common.collect.W2
    public Set f() {
        return this.x();
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return false;
    }

    @Override  // com.google.common.collect.W2
    @c
    @d
    Object k() {
        return new com.google.common.collect.q4.c(this);
    }

    @Override  // com.google.common.collect.S3
    public int size() {
        return this.g;
    }

    @Override  // com.google.common.collect.W2
    public a3 x() {
        a3 a30 = this.h;
        if(a30 == null) {
            a30 = new com.google.common.collect.q4.b(this, null);
            this.h = a30;
        }
        return a30;
    }

    @Override  // com.google.common.collect.S3
    public int y3(@o3.a Object object0) {
        return this.f.g(object0);
    }

    @Override  // com.google.common.collect.W2
    com.google.common.collect.S3.a z(int v) {
        return this.f.h(v);
    }
}

