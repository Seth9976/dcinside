package com.google.common.collect;

import J1.b;
import J1.d;
import O1.a;
import O1.e;
import com.google.common.base.H;
import j..util.Map;
import j..util.Objects;
import j..util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;

@b(emulated = true, serializable = true)
@C1
public final class d3 extends Q2 implements Map, NavigableMap {
    public static class com.google.common.collect.d3.b extends com.google.common.collect.Q2.b {
        private transient Object[] f;
        private transient Object[] g;
        private final Comparator h;

        public com.google.common.collect.d3.b(Comparator comparator0) {
            this(comparator0, 4);
        }

        private com.google.common.collect.d3.b(Comparator comparator0, int v) {
            this.h = (Comparator)H.E(comparator0);
            this.f = new Object[v];
            this.g = new Object[v];
        }

        @Override  // com.google.common.collect.Q2$b
        public Q2 a() {
            return this.n();
        }

        @Override  // com.google.common.collect.Q2$b
        @e
        @Deprecated
        public Q2 c() {
            return this.o();
        }

        @Override  // com.google.common.collect.Q2$b
        public Q2 d() {
            return this.p();
        }

        private void f(int v) {
            Object[] arr_object = this.f;
            if(v > arr_object.length) {
                int v1 = com.google.common.collect.K2.b.f(arr_object.length, v);
                this.f = Arrays.copyOf(this.f, v1);
                this.g = Arrays.copyOf(this.g, v1);
            }
        }

        @Override  // com.google.common.collect.Q2$b
        @a
        @e("Always throws UnsupportedOperationException")
        @Deprecated
        public com.google.common.collect.Q2.b h(Comparator comparator0) {
            return this.r(comparator0);
        }

        @Override  // com.google.common.collect.Q2$b
        @a
        public com.google.common.collect.Q2.b i(Object object0, Object object1) {
            return this.s(object0, object1);
        }

        @Override  // com.google.common.collect.Q2$b
        @a
        public com.google.common.collect.Q2.b j(Map.Entry map$Entry0) {
            return this.t(map$Entry0);
        }

        @Override  // com.google.common.collect.Q2$b
        @a
        public com.google.common.collect.Q2.b k(Iterable iterable0) {
            return this.u(iterable0);
        }

        @Override  // com.google.common.collect.Q2$b
        @a
        public com.google.common.collect.Q2.b l(java.util.Map map0) {
            return this.v(map0);
        }

        public d3 n() {
            return this.p();
        }

        @e
        @Deprecated
        public final d3 o() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        public d3 p() {
            int v1 = this.c;
            switch(v1) {
                case 0: {
                    return d3.e0(this.h);
                }
                case 1: {
                    Object object2 = this.f[0];
                    Objects.requireNonNull(object2);
                    Object object3 = this.g[0];
                    Objects.requireNonNull(object3);
                    return d3.M0(this.h, object2, object3);
                }
                default: {
                    Object[] arr_object = Arrays.copyOf(this.f, v1);
                    Arrays.sort(arr_object, this.h);
                    Object[] arr_object1 = new Object[this.c];
                    for(int v = 0; v < this.c; ++v) {
                        if(v > 0 && this.h.compare(arr_object[v - 1], arr_object[v]) == 0) {
                            throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + arr_object[v - 1] + " and " + arr_object[v]);
                        }
                        Object object0 = this.f[v];
                        Objects.requireNonNull(object0);
                        int v2 = Arrays.binarySearch(arr_object, object0, this.h);
                        Object object1 = this.g[v];
                        Objects.requireNonNull(object1);
                        arr_object1[v2] = object1;
                    }
                    return new d3(new t4(O2.l(arr_object), this.h), O2.l(arr_object1));
                }
            }
        }

        @a
        com.google.common.collect.d3.b q(com.google.common.collect.d3.b d3$b0) {
            this.f(this.c + d3$b0.c);
            System.arraycopy(d3$b0.f, 0, this.f, this.c, d3$b0.c);
            System.arraycopy(d3$b0.g, 0, this.g, this.c, d3$b0.c);
            this.c += d3$b0.c;
            return this;
        }

        @a
        @e("Always throws UnsupportedOperationException")
        @Deprecated
        public final com.google.common.collect.d3.b r(Comparator comparator0) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @a
        public com.google.common.collect.d3.b s(Object object0, Object object1) {
            this.f(this.c + 1);
            c1.a(object0, object1);
            int v = this.c;
            this.f[v] = object0;
            this.g[v] = object1;
            this.c = v + 1;
            return this;
        }

        @a
        public com.google.common.collect.d3.b t(Map.Entry map$Entry0) {
            super.j(map$Entry0);
            return this;
        }

        @a
        public com.google.common.collect.d3.b u(Iterable iterable0) {
            super.k(iterable0);
            return this;
        }

        @a
        public com.google.common.collect.d3.b v(java.util.Map map0) {
            super.l(map0);
            return this;
        }
    }

    @d
    static class c extends com.google.common.collect.Q2.e {
        private final Comparator e;
        private static final long f;

        c(d3 d30) {
            super(d30);
            this.e = d30.comparator();
        }

        @Override  // com.google.common.collect.Q2$e
        com.google.common.collect.Q2.b b(int v) {
            return this.d(v);
        }

        com.google.common.collect.d3.b d(int v) {
            return new com.google.common.collect.d3.b(this.e);
        }
    }

    private final transient t4 g;
    private final transient O2 h;
    @o3.a
    private transient d3 i;
    private static final Comparator j;
    private static final d3 k;
    private static final long l;

    static {
        d3.j = c4.K();
        d3.k = new d3(k3.a0(c4.K()), O2.A());
    }

    d3(t4 t40, O2 o20) {
        this(t40, o20, null);
    }

    d3(t4 t40, O2 o20, @o3.a d3 d30) {
        this.g = t40;
        this.h = o20;
        this.i = d30;
    }

    public static d3 A0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5, Comparable comparable6, Object object6, Comparable comparable7, Object object7, Comparable comparable8, Object object8, Comparable comparable9, Object object9) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2), Q2.l(comparable3, object3), Q2.l(comparable4, object4), Q2.l(comparable5, object5), Q2.l(comparable6, object6), Q2.l(comparable7, object7), Q2.l(comparable8, object8), Q2.l(comparable9, object9)});
    }

    @e("Pass a key of type Comparable")
    @Deprecated
    public static d3 B0(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 C0(Object object0, Object object1, Object object2, Object object3) {
        throw new UnsupportedOperationException();
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 D0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        throw new UnsupportedOperationException();
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 F0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        throw new UnsupportedOperationException();
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 G0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        throw new UnsupportedOperationException();
    }

    @d
    private void H(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 H0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.Q2
    @e("Use toImmutableSortedMap")
    @G2
    @Deprecated
    static Collector I(Function function0, Function function1) {
        throw new UnsupportedOperationException();
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 I0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.Q2
    @e("Use toImmutableSortedMap")
    @G2
    @Deprecated
    static Collector J(Function function0, Function function1, BinaryOperator binaryOperator0) {
        throw new UnsupportedOperationException();
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 J0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.Q2
    public K2 K() {
        return this.h;
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 K0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.Q2
    @d
    Object L() {
        return new c(this);
    }

    @e("Pass keys of type Comparable")
    @Deprecated
    public static d3 L0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        throw new UnsupportedOperationException();
    }

    private static d3 M0(Comparator comparator0, Object object0, Object object1) {
        return new d3(new t4(O2.B(object0), ((Comparator)H.E(comparator0))), O2.B(object1));
    }

    @e("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @Deprecated
    public static d3 N0(Map.Entry[] arr_map$Entry) {
        throw new UnsupportedOperationException();
    }

    public static com.google.common.collect.d3.b O0(Comparator comparator0) {
        return new com.google.common.collect.d3.b(comparator0);
    }

    public static com.google.common.collect.d3.b P0() {
        return new com.google.common.collect.d3.b(c4.K().P());
    }

    public d3 Q0(Object object0, Object object1) {
        return this.R0(object0, true, object1, false);
    }

    public d3 R0(Object object0, boolean z, Object object1, boolean z1) {
        H.E(object0);
        H.E(object1);
        H.y(this.comparator().compare(object0, object1) <= 0, "expected fromKey <= toKey but %s > %s", object0, object1);
        return this.k0(object1, z1).T0(object0, z);
    }

    @e("Use naturalOrder")
    @Deprecated
    public static com.google.common.collect.d3.b S() {
        throw new UnsupportedOperationException();
    }

    public d3 S0(Object object0) {
        return this.T0(object0, true);
    }

    public d3 T0(Object object0, boolean z) {
        Object object1 = H.E(object0);
        return this.i0(this.g.K0(object1, z), this.size());
    }

    @e("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static com.google.common.collect.d3.b U(int v) {
        throw new UnsupportedOperationException();
    }

    @G2
    static Collector U0(Comparator comparator0, Function function0, Function function1) {
        return a1.w0(comparator0, function0, function1);
    }

    public static d3 V(Iterable iterable0) {
        return d3.W(iterable0, ((c4)d3.j));
    }

    @G2
    static Collector V0(Comparator comparator0, Function function0, Function function1, BinaryOperator binaryOperator0) {
        return a1.x0(comparator0, function0, function1, binaryOperator0);
    }

    public static d3 W(Iterable iterable0, Comparator comparator0) {
        return d3.f0(((Comparator)H.E(comparator0)), false, iterable0);
    }

    public static d3 X(java.util.Map map0) {
        return d3.Z(map0, ((c4)d3.j));
    }

    public static d3 Y(java.util.Map map0, Comparator comparator0) {
        return d3.Z(map0, ((Comparator)H.E(comparator0)));
    }

    private static d3 Z(java.util.Map map0, Comparator comparator0) {
        boolean z = false;
        if(map0 instanceof SortedMap) {
            Comparator comparator1 = ((SortedMap)map0).comparator();
            if(comparator1 != null) {
                z = comparator0.equals(comparator1);
            }
            else if(comparator0 == d3.j) {
                return !(map0 instanceof d3) || ((d3)map0).q() ? d3.f0(comparator0, true, map0.entrySet()) : ((d3)map0);
            }
        }
        return !z || !(map0 instanceof d3) || ((d3)map0).q() ? d3.f0(comparator0, z, map0.entrySet()) : ((d3)map0);
    }

    public static d3 a0(SortedMap sortedMap0) {
        Comparator comparator0 = sortedMap0.comparator();
        if(comparator0 == null) {
            comparator0 = d3.j;
        }
        return !(sortedMap0 instanceof d3) || ((d3)sortedMap0).q() ? d3.f0(comparator0, true, sortedMap0.entrySet()) : ((d3)sortedMap0);
    }

    public k3 b0() {
        return this.g.Z();
    }

    public d3 c0() {
        d3 d30 = this.i;
        if(d30 == null) {
            return this.isEmpty() ? d3.e0(c4.q(this.comparator()).P()) : new d3(((t4)this.g.Z()), this.h.O(), this);
        }
        return d30;
    }

    @Override
    @o3.a
    public Map.Entry ceilingEntry(Object object0) {
        return this.T0(object0, true).firstEntry();
    }

    @Override
    @o3.a
    public Object ceilingKey(Object object0) {
        return D3.T(this.ceilingEntry(object0));
    }

    @Override
    public Comparator comparator() {
        return this.m0().comparator();
    }

    @Override
    public NavigableSet descendingKeySet() {
        return this.b0();
    }

    @Override
    public NavigableMap descendingMap() {
        return this.c0();
    }

    // 去混淆评级： 低(20)
    static d3 e0(Comparator comparator0) {
        return c4.K().equals(comparator0) ? d3.q0() : new d3(k3.a0(comparator0), O2.A());
    }

    @Override  // com.google.common.collect.Q2
    public Set entrySet() {
        return this.m();
    }

    private static d3 f0(Comparator comparator0, boolean z, Iterable iterable0) {
        Map.Entry[] arr_map$Entry = (Map.Entry[])p3.R(iterable0, Q2.e);
        return d3.g0(comparator0, z, arr_map$Entry, arr_map$Entry.length);
    }

    // 去混淆评级： 低(20)
    @Override
    @o3.a
    public Map.Entry firstEntry() {
        return this.isEmpty() ? null : ((Map.Entry)this.m().a().get(0));
    }

    @Override
    public Object firstKey() {
        return this.m0().first();
    }

    @Override
    @o3.a
    public Map.Entry floorEntry(Object object0) {
        return this.k0(object0, true).lastEntry();
    }

    @Override
    @o3.a
    public Object floorKey(Object object0) {
        return D3.T(this.floorEntry(object0));
    }

    private static d3 g0(Comparator comparator0, boolean z, Map.Entry[] arr_map$Entry, int v) {
        switch(v) {
            case 0: {
                return d3.e0(comparator0);
            }
            case 1: {
                Map.Entry map$Entry4 = arr_map$Entry[0];
                Objects.requireNonNull(map$Entry4);
                return d3.M0(comparator0, map$Entry4.getKey(), map$Entry4.getValue());
            }
            default: {
                Object[] arr_object = new Object[v];
                Object[] arr_object1 = new Object[v];
                if(z) {
                    for(int v1 = 0; v1 < v; ++v1) {
                        Map.Entry map$Entry0 = arr_map$Entry[v1];
                        Objects.requireNonNull(map$Entry0);
                        Object object0 = map$Entry0.getKey();
                        Object object1 = map$Entry0.getValue();
                        c1.a(object0, object1);
                        arr_object[v1] = object0;
                        arr_object1[v1] = object1;
                    }
                    return new d3(new t4(O2.l(arr_object), comparator0), O2.l(arr_object1));
                }
                Arrays.sort(arr_map$Entry, 0, v, (Map.Entry map$Entry0, Map.Entry map$Entry1) -> {
                    Objects.requireNonNull(map$Entry0);
                    Objects.requireNonNull(map$Entry1);
                    return comparator0.compare(map$Entry0.getKey(), map$Entry1.getKey());
                });
                Map.Entry map$Entry1 = arr_map$Entry[0];
                Objects.requireNonNull(map$Entry1);
                Object object2 = map$Entry1.getKey();
                arr_object[0] = object2;
                Object object3 = map$Entry1.getValue();
                arr_object1[0] = object3;
                c1.a(arr_object[0], object3);
                int v2 = 1;
                while(v2 < v) {
                    Map.Entry map$Entry2 = arr_map$Entry[v2 - 1];
                    Objects.requireNonNull(map$Entry2);
                    Map.Entry map$Entry3 = arr_map$Entry[v2];
                    Objects.requireNonNull(map$Entry3);
                    Object object4 = map$Entry3.getKey();
                    Object object5 = map$Entry3.getValue();
                    c1.a(object4, object5);
                    arr_object[v2] = object4;
                    arr_object1[v2] = object5;
                    Q2.d(comparator0.compare(object2, object4) != 0, "key", map$Entry2, map$Entry3);
                    ++v2;
                    object2 = object4;
                }
                return new d3(new t4(O2.l(arr_object), comparator0), O2.l(arr_object1));
            }
        }
    }

    @Override  // com.google.common.collect.Q2
    @o3.a
    public Object get(@o3.a Object object0) {
        int v = this.g.indexOf(object0);
        return v == -1 ? null : this.h.get(v);
    }

    @Override  // com.google.common.collect.Q2
    a3 h() {
        class com.google.common.collect.d3.a extends R2 {
            final d3 h;

            @Override  // com.google.common.collect.R2
            Q2 K() {
                return d3.this;
            }

            @Override  // com.google.common.collect.a3
            public u5 i() {
                return this.a().i();
            }

            @Override  // com.google.common.collect.a3
            public Iterator iterator() {
                return this.i();
            }

            @Override  // com.google.common.collect.R2
            @J1.c
            @d
            Object k() {
                return super.k();
            }

            @Override  // com.google.common.collect.a3
            O2 z() {
                class com.google.common.collect.d3.a.a extends O2 {
                    final com.google.common.collect.d3.a e;

                    public Map.Entry U(int v) {
                        return new AbstractMap.SimpleImmutableEntry(d3.this.g.a().get(v), d3.this.h.get(v));
                    }

                    @Override
                    public Object get(int v) {
                        return this.U(v);
                    }

                    @Override  // com.google.common.collect.K2
                    boolean h() {
                        return true;
                    }

                    @Override  // com.google.common.collect.O2
                    @J1.c
                    @d
                    Object k() {
                        return super.k();
                    }

                    @Override
                    public int size() {
                        return d3.this.size();
                    }
                }

                return new com.google.common.collect.d3.a.a(this);
            }
        }

        return this.isEmpty() ? a3.B() : new com.google.common.collect.d3.a(this);
    }

    private static d3 h0(Map.Entry[] arr_map$Entry) {
        return d3.g0(c4.K(), false, arr_map$Entry, arr_map$Entry.length);
    }

    @Override
    public NavigableMap headMap(Object object0, boolean z) {
        return this.k0(object0, z);
    }

    @Override
    public SortedMap headMap(Object object0) {
        return this.j0(object0);
    }

    @Override
    @o3.a
    public Map.Entry higherEntry(Object object0) {
        return this.T0(object0, false).firstEntry();
    }

    @Override
    @o3.a
    public Object higherKey(Object object0) {
        return D3.T(this.higherEntry(object0));
    }

    @Override  // com.google.common.collect.Q2
    a3 i() {
        throw new AssertionError("should never be called");
    }

    private d3 i0(int v, int v1) {
        if(v == 0 && v1 == this.size()) {
            return this;
        }
        return v == v1 ? d3.e0(this.comparator()) : new d3(this.g.I0(v, v1), this.h.R(v, v1));
    }

    @Override  // com.google.common.collect.Q2
    K2 j() {
        throw new AssertionError("should never be called");
    }

    public d3 j0(Object object0) {
        return this.k0(object0, false);
    }

    public d3 k0(Object object0, boolean z) {
        Object object1 = H.E(object0);
        return this.i0(0, this.g.J0(object1, z));
    }

    @Override  // com.google.common.collect.Q2
    public Set keySet() {
        return this.m0();
    }

    // 去混淆评级： 低(20)
    @Override
    @o3.a
    public Map.Entry lastEntry() {
        return this.isEmpty() ? null : ((Map.Entry)this.m().a().get(this.size() - 1));
    }

    @Override
    public Object lastKey() {
        return this.m0().last();
    }

    @Override
    @o3.a
    public Map.Entry lowerEntry(Object object0) {
        return this.k0(object0, false).lastEntry();
    }

    @Override
    @o3.a
    public Object lowerKey(Object object0) {
        return D3.T(this.lowerEntry(object0));
    }

    @Override  // com.google.common.collect.Q2
    public a3 m() {
        return super.m();
    }

    public k3 m0() {
        return this.g;
    }

    // 检测为 Lambda 实现
    private static int n0(Comparator comparator0, Map.Entry map$Entry0, Map.Entry map$Entry1) [...]

    @Override
    public NavigableSet navigableKeySet() {
        return this.p0();
    }

    public static com.google.common.collect.d3.b o0() {
        return new com.google.common.collect.d3.b(c4.K());
    }

    public k3 p0() {
        return this.g;
    }

    @Override
    @a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    @a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.Q2
    boolean q() {
        return this.g.h() || this.h.h();
    }

    public static d3 q0() {
        return d3.k;
    }

    public static d3 r0(Comparable comparable0, Object object0) {
        return d3.M0(c4.K(), comparable0, object0);
    }

    @Override  // com.google.common.collect.Q2
    public a3 s() {
        return this.m0();
    }

    public static d3 s0(Comparable comparable0, Object object0, Comparable comparable1, Object object1) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1)});
    }

    @Override
    public int size() {
        return this.h.size();
    }

    @Override
    public NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
        return this.R0(object0, z, object1, z1);
    }

    @Override
    public SortedMap subMap(Object object0, Object object1) {
        return this.Q0(object0, object1);
    }

    public static d3 t0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2)});
    }

    @Override
    public NavigableMap tailMap(Object object0, boolean z) {
        return this.T0(object0, z);
    }

    @Override
    public SortedMap tailMap(Object object0) {
        return this.S0(object0);
    }

    public static d3 u0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2, Comparable comparable3, Object object3) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2), Q2.l(comparable3, object3)});
    }

    public static d3 v0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2), Q2.l(comparable3, object3), Q2.l(comparable4, object4)});
    }

    @Override  // com.google.common.collect.Q2
    public Collection values() {
        return this.K();
    }

    public static d3 w0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2), Q2.l(comparable3, object3), Q2.l(comparable4, object4), Q2.l(comparable5, object5)});
    }

    public static d3 x0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5, Comparable comparable6, Object object6) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2), Q2.l(comparable3, object3), Q2.l(comparable4, object4), Q2.l(comparable5, object5), Q2.l(comparable6, object6)});
    }

    public static d3 y0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5, Comparable comparable6, Object object6, Comparable comparable7, Object object7) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2), Q2.l(comparable3, object3), Q2.l(comparable4, object4), Q2.l(comparable5, object5), Q2.l(comparable6, object6), Q2.l(comparable7, object7)});
    }

    public static d3 z0(Comparable comparable0, Object object0, Comparable comparable1, Object object1, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5, Comparable comparable6, Object object6, Comparable comparable7, Object object7, Comparable comparable8, Object object8) {
        return d3.h0(new Map.Entry[]{Q2.l(comparable0, object0), Q2.l(comparable1, object1), Q2.l(comparable2, object2), Q2.l(comparable3, object3), Q2.l(comparable4, object4), Q2.l(comparable5, object5), Q2.l(comparable6, object6), Q2.l(comparable7, object7), Q2.l(comparable8, object8)});
    }
}

