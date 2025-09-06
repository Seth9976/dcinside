package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import com.google.common.base.Q;
import j..util.Objects;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import o3.a;

@b(serializable = true)
@C1
public class o5 extends T4 {
    static class com.google.common.collect.o5.b implements Q, Serializable {
        final Comparator a;
        private static final long b;

        com.google.common.collect.o5.b(Comparator comparator0) {
            this.a = comparator0;
        }

        public TreeMap a() {
            return new TreeMap(this.a);
        }

        @Override  // com.google.common.base.Q
        public Object get() {
            return this.a();
        }
    }

    class c extends g implements SortedMap {
        @a
        final Object d;
        @a
        final Object e;
        @a
        transient SortedMap f;
        final o5 g;

        c(Object object0) {
            this(object0, null, null);
        }

        c(Object object0, @a Object object1, @a Object object2) {
            super(object0);
            this.d = object1;
            this.e = object2;
            H.d(object1 == null || object2 == null || this.f(object1, object2) <= 0);
        }

        @Override  // com.google.common.collect.U4$g
        @a
        Map b() {
            return this.g();
        }

        @Override  // com.google.common.collect.U4$g
        void c() {
            this.j();
            if(this.f != null && this.f.isEmpty()) {
                o5.this.c.remove(this.a);
                this.f = null;
                this.b = null;
            }
        }

        @Override
        public Comparator comparator() {
            return o5.this.u();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.U4$g
        public boolean containsKey(@a Object object0) {
            return this.i(object0) && super.containsKey(object0);
        }

        int f(Object object0, Object object1) {
            return this.comparator().compare(object0, object1);
        }

        @Override
        public Object firstKey() {
            this.d();
            Map map0 = this.b;
            if(map0 == null) {
                throw new NoSuchElementException();
            }
            return ((SortedMap)map0).firstKey();
        }

        @a
        SortedMap g() {
            this.j();
            SortedMap sortedMap0 = this.f;
            if(sortedMap0 != null) {
                Object object0 = this.d;
                if(object0 != null) {
                    sortedMap0 = sortedMap0.tailMap(object0);
                }
                return this.e == null ? sortedMap0 : sortedMap0.headMap(this.e);
            }
            return null;
        }

        public SortedSet h() {
            return new G(this);
        }

        @Override
        public SortedMap headMap(Object object0) {
            H.d(this.i(H.E(object0)));
            return new c(o5.this, this.a, this.d, object0);
        }

        // 去混淆评级： 低(20)
        boolean i(@a Object object0) {
            return object0 != null && (this.d == null || this.f(this.d, object0) <= 0) && (this.e == null || this.f(this.e, object0) > 0);
        }

        void j() {
            if(this.f == null || this.f.isEmpty() && o5.this.c.containsKey(this.a)) {
                this.f = (SortedMap)o5.this.c.get(this.a);
            }
        }

        @Override
        public Set keySet() {
            return this.h();
        }

        @Override
        public Object lastKey() {
            this.d();
            Map map0 = this.b;
            if(map0 == null) {
                throw new NoSuchElementException();
            }
            return ((SortedMap)map0).lastKey();
        }

        @Override  // com.google.common.collect.U4$g
        @a
        public Object put(Object object0, Object object1) {
            H.d(this.i(H.E(object0)));
            return super.put(object0, object1);
        }

        @Override
        public SortedMap subMap(Object object0, Object object1) {
            H.d(this.i(H.E(object0)) && this.i(H.E(object1)));
            return new c(o5.this, this.a, object0, object1);
        }

        @Override
        public SortedMap tailMap(Object object0) {
            H.d(this.i(H.E(object0)));
            return new c(o5.this, this.a, object0, this.e);
        }
    }

    private final Comparator j;
    private static final long k;

    o5(Comparator comparator0, Comparator comparator1) {
        super(new TreeMap(comparator0), new com.google.common.collect.o5.b(comparator1));
        this.j = comparator1;
    }

    public SortedMap A(Object object0) {
        return new c(this, object0);
    }

    @Deprecated
    public Comparator B() {
        Comparator comparator0 = this.i().comparator();
        Objects.requireNonNull(comparator0);
        return comparator0;
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    @a
    public Object Z(@a Object object0, @a Object object1) {
        return super.Z(object0, object1);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public boolean a0(@a Object object0) {
        return super.a0(object0);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public Map b0() {
        return super.b0();
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public Map c0(Object object0) {
        return super.c0(object0);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public void clear() {
        super.clear();
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public boolean containsValue(@a Object object0) {
        return super.containsValue(object0);
    }

    @Override  // com.google.common.collect.q, com.google.common.collect.W4
    public boolean equals(@a Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.T4
    public Map g() {
        return this.g();
    }

    @Override  // com.google.common.collect.T4
    public SortedMap g() {
        return super.g();
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    @O1.a
    @a
    public Object g0(Object object0, Object object1, Object object2) {
        return super.g0(object0, object1, object2);
    }

    @Override  // com.google.common.collect.q, com.google.common.collect.W4
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.common.collect.T4
    public Set i() {
        return this.i();
    }

    @Override  // com.google.common.collect.T4
    public SortedSet i() {
        return super.i();
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public boolean i0(@a Object object0, @a Object object1) {
        return super.i0(object0, object1);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override  // com.google.common.collect.q, com.google.common.collect.W4
    public void j0(W4 w40) {
        super.j0(w40);
    }

    @Override  // com.google.common.collect.U4
    Iterator k() {
        class com.google.common.collect.o5.a extends com.google.common.collect.c {
            @a
            Object c;
            final Iterator d;
            final Comparator e;

            com.google.common.collect.o5.a(Iterator iterator0, Comparator comparator0) {
                this.d = iterator0;
                this.e = comparator0;
                super();
            }

            @Override  // com.google.common.collect.c
            @a
            protected Object a() {
                while(this.d.hasNext()) {
                    Object object0 = this.d.next();
                    if(this.c == null || this.e.compare(object0, this.c) != 0) {
                        this.c = object0;
                        return object0;
                    }
                    if(false) {
                        break;
                    }
                }
                this.c = null;
                return this.b();
            }
        }

        Comparator comparator0 = this.u();
        return new com.google.common.collect.o5.a(this, q3.N(p3.T(this.c.values(), (Map map0) -> map0.keySet().iterator()), comparator0), comparator0);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public Set k0() {
        return super.k0();
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public Set m0() {
        return super.m0();
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public boolean n0(@a Object object0) {
        return super.n0(object0);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public Map o0(Object object0) {
        return this.A(object0);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    @O1.a
    @a
    public Object remove(@a Object object0, @a Object object1) {
        return super.remove(object0, object1);
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public int size() {
        return super.size();
    }

    @Override  // com.google.common.collect.q
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public Comparator u() {
        return this.j;
    }

    @Override  // com.google.common.collect.U4, com.google.common.collect.W4
    public Collection values() {
        return super.values();
    }

    public static o5 w() {
        return new o5(c4.K(), c4.K());
    }

    public static o5 x(o5 o50) {
        o5 o51 = new o5(o50.B(), o50.u());
        o51.j0(o50);
        return o51;
    }

    public static o5 y(Comparator comparator0, Comparator comparator1) {
        H.E(comparator0);
        H.E(comparator1);
        return new o5(comparator0, comparator1);
    }

    // 检测为 Lambda 实现
    private static Iterator z(Map map0) [...]
}

