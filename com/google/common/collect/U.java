package com.google.common.collect;

import J1.b;
import J1.c;
import com.google.common.base.B;
import com.google.common.base.H;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

@b(emulated = true)
@C1
public final class u extends q implements Serializable {
    static abstract class d extends A {
        private final Q2 a;

        private d(Q2 q20) {
            this.a = q20;
        }

        d(Q2 q20, a u$a0) {
            this(q20);
        }

        @Override  // com.google.common.collect.D3$A
        Iterator a() {
            class com.google.common.collect.u.d.b extends com.google.common.collect.b {
                final d c;

                com.google.common.collect.u.d.b(int v) {
                    super(v);
                }

                @Override  // com.google.common.collect.b
                protected Object a(int v) {
                    return this.b(v);
                }

                protected Map.Entry b(int v) {
                    return d.this.b(v);
                }
            }

            return new com.google.common.collect.u.d.b(this, this.size());
        }

        Map.Entry b(int v) {
            class com.google.common.collect.u.d.a extends g {
                final int a;
                final d b;

                com.google.common.collect.u.d.a(int v) {
                    this.a = v;
                    super();
                }

                @Override  // com.google.common.collect.g
                public Object getKey() {
                    return d.this.c(this.a);
                }

                @Override  // com.google.common.collect.g
                @d4
                public Object getValue() {
                    return d.this.e(this.a);
                }

                @Override  // com.google.common.collect.g
                @d4
                public Object setValue(@d4 Object object0) {
                    return d.this.f(this.a, object0);
                }
            }

            H.C(v, this.size());
            return new com.google.common.collect.u.d.a(this, v);
        }

        Object c(int v) {
            return this.a.s().a().get(v);
        }

        @Override  // com.google.common.collect.D3$A
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean containsKey(@o3.a Object object0) {
            return this.a.containsKey(object0);
        }

        abstract String d();

        @d4
        abstract Object e(int arg1);

        @d4
        abstract Object f(int arg1, @d4 Object arg2);

        @Override
        @o3.a
        public Object get(@o3.a Object object0) {
            Integer integer0 = (Integer)this.a.get(object0);
            return integer0 == null ? null : this.e(((int)integer0));
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Set keySet() {
            return this.a.s();
        }

        @Override
        @o3.a
        public Object put(Object object0, @d4 Object object1) {
            Integer integer0 = (Integer)this.a.get(object0);
            if(integer0 == null) {
                throw new IllegalArgumentException(this.d() + " " + object0 + " not in " + this.a.s());
            }
            return this.f(((int)integer0), object1);
        }

        @Override
        @o3.a
        public Object remove(@o3.a Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.D3$A
        public int size() {
            return this.a.size();
        }
    }

    class e extends d {
        final int b;
        final u c;

        e(int v) {
            super(u0.e, null);
            this.b = v;
        }

        @Override  // com.google.common.collect.u$d
        String d() {
            return "Row";
        }

        @Override  // com.google.common.collect.u$d
        @o3.a
        Object e(int v) {
            return u.this.m(v, this.b);
        }

        @Override  // com.google.common.collect.u$d
        @o3.a
        Object f(int v, @o3.a Object object0) {
            return u.this.z(v, this.b, object0);
        }
    }

    class f extends d {
        final u b;

        private f() {
            super(u0.f, null);
        }

        f(a u$a0) {
        }

        @Override  // com.google.common.collect.u$d
        String d() {
            return "Column";
        }

        @Override  // com.google.common.collect.u$d
        Object e(int v) {
            return this.g(v);
        }

        @Override  // com.google.common.collect.u$d
        Object f(int v, Object object0) {
            return this.i(v, ((Map)object0));
        }

        Map g(int v) {
            return new e(u.this, v);
        }

        @o3.a
        public Map h(Object object0, Map map0) {
            throw new UnsupportedOperationException();
        }

        Map i(int v, Map map0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.u$d
        @o3.a
        public Object put(Object object0, Object object1) {
            return this.h(object0, ((Map)object1));
        }
    }

    class com.google.common.collect.u.g extends d {
        final int b;
        final u c;

        com.google.common.collect.u.g(int v) {
            super(u0.f, null);
            this.b = v;
        }

        @Override  // com.google.common.collect.u$d
        String d() {
            return "Column";
        }

        @Override  // com.google.common.collect.u$d
        @o3.a
        Object e(int v) {
            return u.this.m(this.b, v);
        }

        @Override  // com.google.common.collect.u$d
        @o3.a
        Object f(int v, @o3.a Object object0) {
            return u.this.z(this.b, v, object0);
        }
    }

    class h extends d {
        final u b;

        private h() {
            super(u0.e, null);
        }

        h(a u$a0) {
        }

        @Override  // com.google.common.collect.u$d
        String d() {
            return "Row";
        }

        @Override  // com.google.common.collect.u$d
        Object e(int v) {
            return this.g(v);
        }

        @Override  // com.google.common.collect.u$d
        Object f(int v, Object object0) {
            return this.i(v, ((Map)object0));
        }

        Map g(int v) {
            return new com.google.common.collect.u.g(u.this, v);
        }

        @o3.a
        public Map h(Object object0, Map map0) {
            throw new UnsupportedOperationException();
        }

        Map i(int v, Map map0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.u$d
        @o3.a
        public Object put(Object object0, Object object1) {
            return this.h(object0, ((Map)object1));
        }
    }

    private final O2 c;
    private final O2 d;
    private final Q2 e;
    private final Q2 f;
    private final Object[][] g;
    @P1.b
    @o3.a
    private transient f h;
    @P1.b
    @o3.a
    private transient h i;
    private static final long j;

    private u(W4 w40) {
        this(w40.i(), w40.m0());
        this.j0(w40);
    }

    private u(u u0) {
        this.c = u0.c;
        this.d = u0.d;
        this.e = u0.e;
        this.f = u0.f;
        int[] arr_v = new int[2];
        arr_v[1] = u0.d.size();
        arr_v[0] = u0.c.size();
        Object[][] arr2_object = (Object[][])Array.newInstance(Object.class, arr_v);
        this.g = arr2_object;
        for(int v = 0; v < this.c.size(); ++v) {
            Object[] arr_object = u0.g[v];
            System.arraycopy(arr_object, 0, arr2_object[v], 0, arr_object.length);
        }
    }

    private u(Iterable iterable0, Iterable iterable1) {
        O2 o20 = O2.q(iterable0);
        this.c = o20;
        O2 o21 = O2.q(iterable1);
        this.d = o21;
        H.d(o20.isEmpty() == o21.isEmpty());
        this.e = D3.Q(o20);
        this.f = D3.Q(o21);
        this.g = new Object[o20.size()][o21.size()];
        this.s();
    }

    @c
    public Object[][] A(Class class0) {
        Object[][] arr2_object = (Object[][])Array.newInstance(class0, new int[]{this.c.size(), this.d.size()});
        for(int v = 0; v < this.c.size(); ++v) {
            Object[] arr_object = this.g[v];
            System.arraycopy(arr_object, 0, arr2_object[v], 0, arr_object.length);
        }
        return arr2_object;
    }

    @Override  // com.google.common.collect.q
    @o3.a
    public Object Z(@o3.a Object object0, @o3.a Object object1) {
        Integer integer0 = (Integer)this.e.get(object0);
        Integer integer1 = (Integer)this.f.get(object1);
        return integer0 == null || integer1 == null ? null : this.m(((int)integer0), ((int)integer1));
    }

    @Override  // com.google.common.collect.q
    Iterator a() {
        class a extends com.google.common.collect.b {
            final u c;

            a(int v) {
                super(v);
            }

            @Override  // com.google.common.collect.b
            protected Object a(int v) {
                return this.b(v);
            }

            protected com.google.common.collect.W4.a b(int v) {
                return u.this.u(v);
            }
        }

        return new a(this, this.size());
    }

    @Override  // com.google.common.collect.q
    public boolean a0(@o3.a Object object0) {
        return this.f.containsKey(object0);
    }

    @Override  // com.google.common.collect.W4
    public Map b0() {
        f u$f0 = this.h;
        if(u$f0 == null) {
            u$f0 = new f(this, null);
            this.h = u$f0;
        }
        return u$f0;
    }

    @Override  // com.google.common.collect.W4
    public Map c0(Object object0) {
        H.E(object0);
        Integer integer0 = (Integer)this.f.get(object0);
        return integer0 == null ? Collections.emptyMap() : new e(this, ((int)integer0));
    }

    @Override  // com.google.common.collect.q
    @O1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.q
    public boolean containsValue(@o3.a Object object0) {
        Object[][] arr2_object = this.g;
        for(int v = 0; v < arr2_object.length; ++v) {
            Object[] arr_object = arr2_object[v];
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                if(B.a(object0, arr_object[v1])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // com.google.common.collect.q
    Iterator d() {
        class com.google.common.collect.u.c extends com.google.common.collect.b {
            final u c;

            com.google.common.collect.u.c(int v) {
                super(v);
            }

            @Override  // com.google.common.collect.b
            @o3.a
            protected Object a(int v) {
                return u.this.w(v);
            }
        }

        return new com.google.common.collect.u.c(this, this.size());
    }

    @Override  // com.google.common.collect.q
    public boolean equals(@o3.a Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.W4
    public Map g() {
        h u$h0 = this.i;
        if(u$h0 == null) {
            u$h0 = new h(this, null);
            this.i = u$h0;
        }
        return u$h0;
    }

    @Override  // com.google.common.collect.q
    @O1.a
    @o3.a
    public Object g0(Object object0, Object object1, @o3.a Object object2) {
        H.E(object0);
        H.E(object1);
        Integer integer0 = (Integer)this.e.get(object0);
        boolean z = false;
        H.y(integer0 != null, "Row %s not in %s", object0, this.c);
        Integer integer1 = (Integer)this.f.get(object1);
        if(integer1 != null) {
            z = true;
        }
        H.y(z, "Column %s not in %s", object1, this.d);
        return this.z(((int)integer0), ((int)integer1), object2);
    }

    @Override  // com.google.common.collect.q
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.common.collect.q
    public Set i() {
        return this.y();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.q
    public boolean i0(@o3.a Object object0, @o3.a Object object1) {
        return this.n0(object0) && this.a0(object1);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.q
    public boolean isEmpty() {
        return this.c.isEmpty() || this.d.isEmpty();
    }

    @Override  // com.google.common.collect.q
    public void j0(W4 w40) {
        super.j0(w40);
    }

    @Override  // com.google.common.collect.q
    public Set k0() {
        return super.k0();
    }

    @o3.a
    public Object m(int v, int v1) {
        H.C(v, this.c.size());
        H.C(v1, this.d.size());
        return this.g[v][v1];
    }

    @Override  // com.google.common.collect.q
    public Set m0() {
        return this.o();
    }

    public O2 n() {
        return this.d;
    }

    @Override  // com.google.common.collect.q
    public boolean n0(@o3.a Object object0) {
        return this.e.containsKey(object0);
    }

    public a3 o() {
        return this.f.s();
    }

    @Override  // com.google.common.collect.W4
    public Map o0(Object object0) {
        H.E(object0);
        Integer integer0 = (Integer)this.e.get(object0);
        return integer0 == null ? Collections.emptyMap() : new com.google.common.collect.u.g(this, ((int)integer0));
    }

    // 去混淆评级： 低(20)
    public static u p(W4 w40) {
        return w40 instanceof u ? new u(((u)w40)) : new u(w40);
    }

    public static u q(Iterable iterable0, Iterable iterable1) {
        return new u(iterable0, iterable1);
    }

    @O1.a
    @o3.a
    public Object r(@o3.a Object object0, @o3.a Object object1) {
        Integer integer0 = (Integer)this.e.get(object0);
        Integer integer1 = (Integer)this.f.get(object1);
        return integer0 == null || integer1 == null ? null : this.z(((int)integer0), ((int)integer1), null);
    }

    @Override  // com.google.common.collect.q
    @O1.a
    @O1.e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object remove(@o3.a Object object0, @o3.a Object object1) {
        throw new UnsupportedOperationException();
    }

    public void s() {
        Object[][] arr2_object = this.g;
        for(int v = 0; v < arr2_object.length; ++v) {
            Arrays.fill(arr2_object[v], null);
        }
    }

    @Override  // com.google.common.collect.W4
    public int size() {
        return this.c.size() * this.d.size();
    }

    @Override  // com.google.common.collect.q
    public String toString() {
        return super.toString();
    }

    private com.google.common.collect.W4.a u(int v) {
        class com.google.common.collect.u.b extends com.google.common.collect.j5.b {
            final int a;
            final int b;
            final int c;
            final u d;

            com.google.common.collect.u.b(int v) {
                this.c = v;
                super();
                this.a = v / u0.d.size();
                this.b = v % u0.d.size();
            }

            @Override  // com.google.common.collect.W4$a
            public Object a() {
                return u.this.d.get(this.b);
            }

            @Override  // com.google.common.collect.W4$a
            public Object b() {
                return u.this.c.get(this.a);
            }

            @Override  // com.google.common.collect.W4$a
            @o3.a
            public Object getValue() {
                return u.this.m(this.a, this.b);
            }
        }

        return new com.google.common.collect.u.b(this, v);
    }

    @Override  // com.google.common.collect.q
    public Collection values() {
        return super.values();
    }

    @o3.a
    private Object w(int v) {
        return this.m(v / this.d.size(), v % this.d.size());
    }

    public O2 x() {
        return this.c;
    }

    public a3 y() {
        return this.e.s();
    }

    @O1.a
    @o3.a
    public Object z(int v, int v1, @o3.a Object object0) {
        H.C(v, this.c.size());
        H.C(v1, this.d.size());
        Object[] arr_object = this.g[v];
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }
}

