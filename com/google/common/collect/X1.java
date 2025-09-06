package com.google.common.collect;

import J1.b;
import J1.c;
import O1.j;
import j..util.Objects;
import java.lang.reflect.Array;
import java.util.Map.Entry;
import java.util.Map;

@b
@j(containerOf = {"R", "C", "V"})
@C1
final class x1 extends v4 {
    static class a {
    }

    final class com.google.common.collect.x1.b extends d {
        private final int h;
        final x1 i;

        com.google.common.collect.x1.b(int v) {
            super(x10.i[v]);
            this.h = v;
        }

        @Override  // com.google.common.collect.x1$d
        @c
        @J1.d
        Object L() {
            return super.L();
        }

        @Override  // com.google.common.collect.x1$d
        @o3.a
        Object O(int v) {
            Object[][] arr2_object = x1.this.j;
            return arr2_object[v][this.h];
        }

        @Override  // com.google.common.collect.x1$d
        Q2 S() {
            return x1.this.d;
        }

        @Override  // com.google.common.collect.Q2
        boolean q() {
            return true;
        }
    }

    final class com.google.common.collect.x1.c extends d {
        final x1 h;

        private com.google.common.collect.x1.c() {
            super(x10.i.length);
        }

        com.google.common.collect.x1.c(a x1$a0) {
        }

        @Override  // com.google.common.collect.x1$d
        @c
        @J1.d
        Object L() {
            return super.L();
        }

        @Override  // com.google.common.collect.x1$d
        Object O(int v) {
            return this.U(v);
        }

        @Override  // com.google.common.collect.x1$d
        Q2 S() {
            return x1.this.e;
        }

        Q2 U(int v) {
            return new com.google.common.collect.x1.b(x1.this, v);
        }

        @Override  // com.google.common.collect.Q2
        boolean q() {
            return false;
        }
    }

    static abstract class d extends com.google.common.collect.Q2.c {
        private final int g;

        d(int v) {
            this.g = v;
        }

        @Override  // com.google.common.collect.Q2$c
        @c
        @J1.d
        Object L() {
            return super.L();
        }

        @Override  // com.google.common.collect.Q2$c
        u5 M() {
            class com.google.common.collect.x1.d.a extends com.google.common.collect.c {
                private int c;
                private final int d;
                final d e;

                com.google.common.collect.x1.d.a() {
                    this.c = -1;
                    this.d = x1$d0.S().size();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected Map.Entry d() {
                    for(int v = this.c; true; v = this.c) {
                        this.c = v + 1;
                        int v1 = this.c;
                        if(v1 >= this.d) {
                            break;
                        }
                        Object object0 = d.this.O(v1);
                        if(object0 != null) {
                            return D3.O(d.this.N(this.c), object0);
                        }
                    }
                    return (Map.Entry)this.b();
                }
            }

            return new com.google.common.collect.x1.d.a(this);
        }

        Object N(int v) {
            return this.S().s().a().get(v);
        }

        @o3.a
        abstract Object O(int arg1);

        private boolean P() {
            int v = this.S().size();
            return this.g == v;
        }

        abstract Q2 S();

        @Override  // com.google.common.collect.Q2
        @o3.a
        public Object get(@o3.a Object object0) {
            Integer integer0 = (Integer)this.S().get(object0);
            return integer0 == null ? null : this.O(((int)integer0));
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.Q2$c
        a3 i() {
            return this.P() ? this.S().s() : super.i();
        }

        @Override
        public int size() {
            return this.g;
        }
    }

    final class e extends d {
        private final int h;
        final x1 i;

        e(int v) {
            super(x10.h[v]);
            this.h = v;
        }

        @Override  // com.google.common.collect.x1$d
        @c
        @J1.d
        Object L() {
            return super.L();
        }

        @Override  // com.google.common.collect.x1$d
        @o3.a
        Object O(int v) {
            return x1.this.j[this.h][v];
        }

        @Override  // com.google.common.collect.x1$d
        Q2 S() {
            return x1.this.e;
        }

        @Override  // com.google.common.collect.Q2
        boolean q() {
            return true;
        }
    }

    final class f extends d {
        final x1 h;

        private f() {
            super(x10.h.length);
        }

        f(a x1$a0) {
        }

        @Override  // com.google.common.collect.x1$d
        @c
        @J1.d
        Object L() {
            return super.L();
        }

        @Override  // com.google.common.collect.x1$d
        Object O(int v) {
            return this.U(v);
        }

        @Override  // com.google.common.collect.x1$d
        Q2 S() {
            return x1.this.d;
        }

        Q2 U(int v) {
            return new e(x1.this, v);
        }

        @Override  // com.google.common.collect.Q2
        boolean q() {
            return false;
        }
    }

    private final Q2 d;
    private final Q2 e;
    private final Q2 f;
    private final Q2 g;
    private final int[] h;
    private final int[] i;
    private final Object[][] j;
    private final int[] k;
    private final int[] l;

    x1(O2 o20, a3 a30, a3 a31) {
        int[] arr_v = new int[2];
        arr_v[1] = a31.size();
        arr_v[0] = a30.size();
        this.j = (Object[][])Array.newInstance(Object.class, arr_v);
        Q2 q20 = D3.Q(a30);
        this.d = q20;
        Q2 q21 = D3.Q(a31);
        this.e = q21;
        this.h = new int[q20.size()];
        this.i = new int[q21.size()];
        int[] arr_v1 = new int[o20.size()];
        int[] arr_v2 = new int[o20.size()];
        for(int v = 0; v < o20.size(); ++v) {
            com.google.common.collect.W4.a w4$a0 = (com.google.common.collect.W4.a)o20.get(v);
            Object object0 = w4$a0.b();
            Object object1 = w4$a0.a();
            Integer integer0 = (Integer)this.d.get(object0);
            Objects.requireNonNull(integer0);
            int v1 = (int)integer0;
            Integer integer1 = (Integer)this.e.get(object1);
            Objects.requireNonNull(integer1);
            int v2 = (int)integer1;
            this.E(object0, object1, this.j[v1][v2], w4$a0.getValue());
            Object[] arr_object = this.j[v1];
            arr_object[v2] = w4$a0.getValue();
            ++this.h[v1];
            ++this.i[v2];
            arr_v1[v] = v1;
            arr_v2[v] = v2;
        }
        this.k = arr_v1;
        this.l = arr_v2;
        this.f = new f(this, null);
        this.g = new com.google.common.collect.x1.c(this, null);
    }

    @Override  // com.google.common.collect.v4
    @c
    @J1.d
    Object C() {
        return com.google.common.collect.l3.b.a(this, this.k, this.l);
    }

    @Override  // com.google.common.collect.v4
    com.google.common.collect.W4.a J(int v) {
        int v1 = this.k[v];
        int v2 = this.l[v];
        Object object0 = this.x().a().get(v1);
        Object object1 = this.l().a().get(v2);
        Object object2 = this.j[v1][v2];
        Objects.requireNonNull(object2);
        return l3.h(object0, object1, object2);
    }

    @Override  // com.google.common.collect.v4
    Object K(int v) {
        Object object0 = this.j[this.k[v]][this.l[v]];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override  // com.google.common.collect.l3
    @o3.a
    public Object Z(@o3.a Object object0, @o3.a Object object1) {
        Integer integer0 = (Integer)this.d.get(object0);
        Integer integer1 = (Integer)this.e.get(object1);
        return integer0 == null || integer1 == null ? null : this.j[((int)integer0)][((int)integer1)];
    }

    @Override  // com.google.common.collect.l3
    public Map b0() {
        return this.m();
    }

    @Override  // com.google.common.collect.l3
    public Map g() {
        return this.y();
    }

    @Override  // com.google.common.collect.l3
    public Q2 m() {
        return Q2.g(this.g);
    }

    @Override  // com.google.common.collect.W4
    public int size() {
        return this.k.length;
    }

    @Override  // com.google.common.collect.l3
    public Q2 y() {
        return Q2.g(this.f);
    }
}

