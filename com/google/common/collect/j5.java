package com.google.common.collect;

import J1.b;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.Q;
import com.google.common.base.t;
import j..util.DesugarCollections;
import j..util.stream.Collector;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

@b
@C1
public final class j5 {
    class a implements t {
        a() {
            super();
        }

        public Map a(Map map0) {
            return DesugarCollections.unmodifiableMap(map0);
        }

        @Override  // com.google.common.base.t
        public Object apply(Object object0) {
            return this.a(((Map)object0));
        }
    }

    static abstract class com.google.common.collect.j5.b implements com.google.common.collect.W4.a {
        // 去混淆评级： 中等(50)
        @Override  // com.google.common.collect.W4$a
        public boolean equals(@o3.a Object object0) {
            return object0 == this ? true : object0 instanceof com.google.common.collect.W4.a && (B.a(this.b(), ((com.google.common.collect.W4.a)object0).b()) && B.a(this.a(), ((com.google.common.collect.W4.a)object0).a()) && B.a(this.getValue(), ((com.google.common.collect.W4.a)object0).getValue()));
        }

        @Override  // com.google.common.collect.W4$a
        public int hashCode() {
            return B.b(new Object[]{this.b(), this.a(), this.getValue()});
        }

        @Override
        public String toString() {
            return "(" + this.b() + "," + this.a() + ")=" + this.getValue();
        }
    }

    static final class c extends com.google.common.collect.j5.b implements Serializable {
        @d4
        private final Object a;
        @d4
        private final Object b;
        @d4
        private final Object c;
        private static final long d;

        c(@d4 Object object0, @d4 Object object1, @d4 Object object2) {
            this.a = object0;
            this.b = object1;
            this.c = object2;
        }

        @Override  // com.google.common.collect.W4$a
        @d4
        public Object a() {
            return this.b;
        }

        @Override  // com.google.common.collect.W4$a
        @d4
        public Object b() {
            return this.a;
        }

        @Override  // com.google.common.collect.W4$a
        @d4
        public Object getValue() {
            return this.c;
        }
    }

    static class d extends q {
        final W4 c;
        final t d;

        d(W4 w40, t t0) {
            this.c = (W4)H.E(w40);
            this.d = (t)H.E(t0);
        }

        @Override  // com.google.common.collect.q
        @o3.a
        public Object Z(@o3.a Object object0, @o3.a Object object1) {
            if(this.i0(object0, object1)) {
                Object object2 = W3.a(this.c.Z(object0, object1));
                return this.d.apply(object2);
            }
            return null;
        }

        @Override  // com.google.common.collect.q
        Iterator a() {
            return q3.b0(this.c.k0().iterator(), this.e());
        }

        @Override  // com.google.common.collect.W4
        public Map b0() {
            class com.google.common.collect.j5.d.c implements t {
                final d a;

                public Map a(Map map0) {
                    return D3.D0(map0, d.this.d);
                }

                @Override  // com.google.common.base.t
                public Object apply(Object object0) {
                    return this.a(((Map)object0));
                }
            }

            com.google.common.collect.j5.d.c j5$d$c0 = new com.google.common.collect.j5.d.c(this);
            return D3.D0(this.c.b0(), j5$d$c0);
        }

        @Override  // com.google.common.collect.q
        Collection c() {
            return d1.m(this.c.values(), this.d);
        }

        @Override  // com.google.common.collect.W4
        public Map c0(@d4 Object object0) {
            return D3.D0(this.c.c0(object0), this.d);
        }

        @Override  // com.google.common.collect.q
        public void clear() {
            this.c.clear();
        }

        t e() {
            class com.google.common.collect.j5.d.a implements t {
                final d a;

                public com.google.common.collect.W4.a a(com.google.common.collect.W4.a w4$a0) {
                    Object object0 = w4$a0.b();
                    Object object1 = w4$a0.a();
                    Object object2 = w4$a0.getValue();
                    return j5.c(object0, object1, d.this.d.apply(object2));
                }

                @Override  // com.google.common.base.t
                public Object apply(Object object0) {
                    return this.a(((com.google.common.collect.W4.a)object0));
                }
            }

            return new com.google.common.collect.j5.d.a(this);
        }

        @Override  // com.google.common.collect.W4
        public Map g() {
            class com.google.common.collect.j5.d.b implements t {
                final d a;

                public Map a(Map map0) {
                    return D3.D0(map0, d.this.d);
                }

                @Override  // com.google.common.base.t
                public Object apply(Object object0) {
                    return this.a(((Map)object0));
                }
            }

            com.google.common.collect.j5.d.b j5$d$b0 = new com.google.common.collect.j5.d.b(this);
            return D3.D0(this.c.g(), j5$d$b0);
        }

        @Override  // com.google.common.collect.q
        @o3.a
        public Object g0(@d4 Object object0, @d4 Object object1, @d4 Object object2) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.q
        public Set i() {
            return this.c.i();
        }

        @Override  // com.google.common.collect.q
        public boolean i0(@o3.a Object object0, @o3.a Object object1) {
            return this.c.i0(object0, object1);
        }

        @Override  // com.google.common.collect.q
        public void j0(W4 w40) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.q
        public Set m0() {
            return this.c.m0();
        }

        @Override  // com.google.common.collect.W4
        public Map o0(@d4 Object object0) {
            return D3.D0(this.c.o0(object0), this.d);
        }

        @Override  // com.google.common.collect.q
        @o3.a
        public Object remove(@o3.a Object object0, @o3.a Object object1) {
            if(this.i0(object0, object1)) {
                Object object2 = W3.a(this.c.remove(object0, object1));
                return this.d.apply(object2);
            }
            return null;
        }

        @Override  // com.google.common.collect.W4
        public int size() {
            return this.c.size();
        }
    }

    static class e extends q {
        class com.google.common.collect.j5.e.a implements t {
            com.google.common.collect.j5.e.a() {
                super();
            }

            public com.google.common.collect.W4.a a(com.google.common.collect.W4.a w4$a0) {
                return j5.c(w4$a0.a(), w4$a0.b(), w4$a0.getValue());
            }

            @Override  // com.google.common.base.t
            public Object apply(Object object0) {
                return this.a(((com.google.common.collect.W4.a)object0));
            }
        }

        final W4 c;
        private static final t d;

        static {
            e.d = new com.google.common.collect.j5.e.a();
        }

        e(W4 w40) {
            this.c = (W4)H.E(w40);
        }

        @Override  // com.google.common.collect.q
        @o3.a
        public Object Z(@o3.a Object object0, @o3.a Object object1) {
            return this.c.Z(object1, object0);
        }

        @Override  // com.google.common.collect.q
        Iterator a() {
            return q3.b0(this.c.k0().iterator(), e.d);
        }

        @Override  // com.google.common.collect.q
        public boolean a0(@o3.a Object object0) {
            return this.c.n0(object0);
        }

        @Override  // com.google.common.collect.W4
        public Map b0() {
            return this.c.g();
        }

        @Override  // com.google.common.collect.W4
        public Map c0(@d4 Object object0) {
            return this.c.o0(object0);
        }

        @Override  // com.google.common.collect.q
        public void clear() {
            this.c.clear();
        }

        @Override  // com.google.common.collect.q
        public boolean containsValue(@o3.a Object object0) {
            return this.c.containsValue(object0);
        }

        @Override  // com.google.common.collect.W4
        public Map g() {
            return this.c.b0();
        }

        @Override  // com.google.common.collect.q
        @o3.a
        public Object g0(@d4 Object object0, @d4 Object object1, @d4 Object object2) {
            return this.c.g0(object1, object0, object2);
        }

        @Override  // com.google.common.collect.q
        public Set i() {
            return this.c.m0();
        }

        @Override  // com.google.common.collect.q
        public boolean i0(@o3.a Object object0, @o3.a Object object1) {
            return this.c.i0(object1, object0);
        }

        @Override  // com.google.common.collect.q
        public void j0(W4 w40) {
            W4 w41 = j5.i(w40);
            this.c.j0(w41);
        }

        @Override  // com.google.common.collect.q
        public Set m0() {
            return this.c.i();
        }

        @Override  // com.google.common.collect.q
        public boolean n0(@o3.a Object object0) {
            return this.c.a0(object0);
        }

        @Override  // com.google.common.collect.W4
        public Map o0(@d4 Object object0) {
            return this.c.c0(object0);
        }

        @Override  // com.google.common.collect.q
        @o3.a
        public Object remove(@o3.a Object object0, @o3.a Object object1) {
            return this.c.remove(object1, object0);
        }

        @Override  // com.google.common.collect.W4
        public int size() {
            return this.c.size();
        }

        @Override  // com.google.common.collect.q
        public Collection values() {
            return this.c.values();
        }
    }

    static final class f extends g implements z4 {
        private static final long c;

        public f(z4 z40) {
            super(z40);
        }

        @Override  // com.google.common.collect.j5$g
        protected Object K() {
            return this.N();
        }

        @Override  // com.google.common.collect.j5$g
        protected W4 M() {
            return this.N();
        }

        protected z4 N() {
            return (z4)super.M();
        }

        @Override  // com.google.common.collect.j5$g, com.google.common.collect.z4
        public Map g() {
            return this.g();
        }

        @Override  // com.google.common.collect.z4
        public SortedMap g() {
            return DesugarCollections.unmodifiableSortedMap(D3.F0(this.N().g(), j5.l()));
        }

        @Override  // com.google.common.collect.j5$g, com.google.common.collect.z4
        public Set i() {
            return this.i();
        }

        @Override  // com.google.common.collect.z4
        public SortedSet i() {
            return DesugarCollections.unmodifiableSortedSet(this.N().i());
        }
    }

    static class g extends x2 implements Serializable {
        final W4 a;
        private static final long b;

        g(W4 w40) {
            this.a = (W4)H.E(w40);
        }

        @Override  // com.google.common.collect.x2
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.collect.x2
        protected W4 M() {
            return this.a;
        }

        @Override  // com.google.common.collect.x2
        public Map b0() {
            return DesugarCollections.unmodifiableMap(D3.D0(super.b0(), j5.l()));
        }

        @Override  // com.google.common.collect.x2
        public Map c0(@d4 Object object0) {
            return DesugarCollections.unmodifiableMap(super.c0(object0));
        }

        @Override  // com.google.common.collect.x2
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.x2
        public Map g() {
            return DesugarCollections.unmodifiableMap(D3.D0(super.g(), j5.l()));
        }

        @Override  // com.google.common.collect.x2
        @o3.a
        public Object g0(@d4 Object object0, @d4 Object object1, @d4 Object object2) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.x2
        public Set i() {
            return DesugarCollections.unmodifiableSet(super.i());
        }

        @Override  // com.google.common.collect.x2
        public void j0(W4 w40) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.x2
        public Set k0() {
            return DesugarCollections.unmodifiableSet(super.k0());
        }

        @Override  // com.google.common.collect.x2
        public Set m0() {
            return DesugarCollections.unmodifiableSet(super.m0());
        }

        @Override  // com.google.common.collect.x2
        public Map o0(@d4 Object object0) {
            return DesugarCollections.unmodifiableMap(super.o0(object0));
        }

        @Override  // com.google.common.collect.x2
        @o3.a
        public Object remove(@o3.a Object object0, @o3.a Object object1) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.collect.x2
        public Collection values() {
            return DesugarCollections.unmodifiableCollection(super.values());
        }
    }

    private static final t a;

    static {
        j5.a = new a();
    }

    static boolean b(W4 w40, @o3.a Object object0) {
        if(object0 == w40) {
            return true;
        }
        return object0 instanceof W4 ? w40.k0().equals(((W4)object0).k0()) : false;
    }

    public static com.google.common.collect.W4.a c(@d4 Object object0, @d4 Object object1, @d4 Object object2) {
        return new c(object0, object1, object2);
    }

    public static W4 d(Map map0, Q q0) {
        H.d(map0.isEmpty());
        H.E(q0);
        return new U4(map0, q0);
    }

    public static W4 e(W4 w40) {
        return V4.z(w40, null);
    }

    @G2
    static Collector f(Function function0, Function function1, Function function2, BinaryOperator binaryOperator0, Supplier supplier0) {
        return i5.t(function0, function1, function2, binaryOperator0, supplier0);
    }

    @G2
    static Collector g(Function function0, Function function1, Function function2, Supplier supplier0) {
        return i5.u(function0, function1, function2, supplier0);
    }

    public static W4 h(W4 w40, t t0) {
        return new d(w40, t0);
    }

    public static W4 i(W4 w40) {
        return w40 instanceof e ? ((e)w40).c : new e(w40);
    }

    public static z4 j(z4 z40) {
        return new f(z40);
    }

    public static W4 k(W4 w40) {
        return new g(w40);
    }

    private static t l() {
        return j5.a;
    }
}

