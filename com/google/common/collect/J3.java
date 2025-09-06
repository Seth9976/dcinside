package com.google.common.collect;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.common.math.f;
import j..util.function.Function.-CC;
import j..util.stream.Collector.-CC;
import j..util.stream.Collector.Characteristics;
import j..util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.ToIntFunction;

@c
@C1
public abstract class j3 extends W2 implements M4 {
    public static class a extends b {
        private final Comparator e;
        @e
        Object[] f;
        private int[] g;
        private int h;
        private boolean i;

        public a(Comparator comparator0) {
            super(true);
            this.e = (Comparator)H.E(comparator0);
            this.f = new Object[4];
            this.g = new int[4];
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public com.google.common.collect.K2.b a(Object object0) {
            return this.o(object0);
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public com.google.common.collect.K2.b b(Object[] arr_object) {
            return this.p(arr_object);
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public com.google.common.collect.K2.b c(Iterable iterable0) {
            return this.q(iterable0);
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public com.google.common.collect.K2.b d(Iterator iterator0) {
            return this.r(iterator0);
        }

        @Override  // com.google.common.collect.W2$b
        public K2 e() {
            return this.t();
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public b g(Object object0) {
            return this.o(object0);
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public b h(Object[] arr_object) {
            return this.p(arr_object);
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public b i(Iterable iterable0) {
            return this.q(iterable0);
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public b j(Iterator iterator0) {
            return this.r(iterator0);
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public b k(Object object0, int v) {
            return this.s(object0, v);
        }

        @Override  // com.google.common.collect.W2$b
        public W2 l() {
            return this.t();
        }

        @Override  // com.google.common.collect.W2$b
        @O1.a
        public b m(Object object0, int v) {
            return this.x(object0, v);
        }

        @O1.a
        public a o(Object object0) {
            return this.s(object0, 1);
        }

        @O1.a
        public a p(Object[] arr_object) {
            for(int v = 0; v < arr_object.length; ++v) {
                this.o(arr_object[v]);
            }
            return this;
        }

        @O1.a
        public a q(Iterable iterable0) {
            if(iterable0 instanceof S3) {
                for(Object object0: ((S3)iterable0).entrySet()) {
                    this.s(((com.google.common.collect.S3.a)object0).b0(), ((com.google.common.collect.S3.a)object0).getCount());
                }
                return this;
            }
            for(Object object1: iterable0) {
                this.o(object1);
            }
            return this;
        }

        @O1.a
        public a r(Iterator iterator0) {
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                this.o(object0);
            }
            return this;
        }

        @O1.a
        public a s(Object object0, int v) {
            H.E(object0);
            c1.b(v, "occurrences");
            if(v == 0) {
                return this;
            }
            this.w();
            int v1 = this.h;
            this.f[v1] = object0;
            this.g[v1] = v;
            this.h = v1 + 1;
            return this;
        }

        public j3 t() {
            this.v();
            int v = this.h;
            if(v == 0) {
                return j3.b0(this.e);
            }
            t4 t40 = (t4)k3.N(this.e, v, this.f);
            long[] arr_v = new long[this.h + 1];
            for(int v1 = 0; v1 < this.h; ++v1) {
                arr_v[v1 + 1] = arr_v[v1] + ((long)this.g[v1]);
            }
            this.i = true;
            return new s4(t40, arr_v, 0, this.h);
        }

        private void u(boolean z) {
            int v = this.h;
            if(v == 0) {
                return;
            }
            Object[] arr_object = Arrays.copyOf(this.f, v);
            Arrays.sort(arr_object, this.e);
            int v2 = 1;
            for(int v1 = 1; v1 < arr_object.length; ++v1) {
                if(this.e.compare(arr_object[v2 - 1], arr_object[v1]) < 0) {
                    arr_object[v2] = arr_object[v1];
                    ++v2;
                }
            }
            Arrays.fill(arr_object, v2, this.h, null);
            if(z) {
                int v3 = this.h;
                if(v2 * 4 > v3 * 3) {
                    arr_object = Arrays.copyOf(arr_object, f.t(v3, v3 / 2 + 1));
                }
            }
            int[] arr_v = new int[arr_object.length];
            for(int v4 = 0; v4 < this.h; ++v4) {
                int v5 = Arrays.binarySearch(arr_object, 0, v2, this.f[v4], this.e);
                int v6 = this.g[v4];
                if(v6 >= 0) {
                    arr_v[v5] += v6;
                }
                else {
                    arr_v[v5] = ~v6;
                }
            }
            this.f = arr_object;
            this.g = arr_v;
            this.h = v2;
        }

        private void v() {
            int v2;
            this.u(false);
            int v1 = 0;
            for(int v = 0; true; ++v) {
                v2 = this.h;
                if(v >= v2) {
                    break;
                }
                int[] arr_v = this.g;
                int v3 = arr_v[v];
                if(v3 > 0) {
                    this.f[v1] = this.f[v];
                    arr_v[v1] = v3;
                    ++v1;
                }
            }
            Arrays.fill(this.f, v1, v2, null);
            Arrays.fill(this.g, v1, this.h, 0);
            this.h = v1;
        }

        private void w() {
            Object[] arr_object = this.f;
            if(this.h == arr_object.length) {
                this.u(true);
            }
            else if(this.i) {
                this.f = Arrays.copyOf(arr_object, arr_object.length);
            }
            this.i = false;
        }

        @O1.a
        public a x(Object object0, int v) {
            H.E(object0);
            c1.b(v, "count");
            this.w();
            int v1 = this.h;
            this.f[v1] = object0;
            this.g[v1] = ~v;
            this.h = v1 + 1;
            return this;
        }
    }

    @d
    static final class com.google.common.collect.j3.b implements Serializable {
        final Comparator a;
        final Object[] b;
        final int[] c;

        com.google.common.collect.j3.b(M4 m40) {
            this.a = m40.comparator();
            int v = m40.entrySet().size();
            this.b = new Object[v];
            this.c = new int[v];
            int v1 = 0;
            for(Object object0: m40.entrySet()) {
                this.b[v1] = ((com.google.common.collect.S3.a)object0).b0();
                this.c[v1] = ((com.google.common.collect.S3.a)object0).getCount();
                ++v1;
            }
        }

        Object a() {
            a j3$a0 = new a(this.a);
            for(int v = 0; v < this.b.length; ++v) {
                j3$a0.s(this.b[v], this.c[v]);
            }
            return j3$a0.t();
        }
    }

    @P1.b
    @o3.a
    transient j3 f;
    private static final long g = 0xDECAFL;

    @O1.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static j3 A0(Object object0, Object object1, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException();
    }

    @O1.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static j3 B0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object[] arr_object) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.M4
    public M4 B3(Object object0, y y0) {
        return this.F0(object0, y0);
    }

    public static a C0(Comparator comparator0) {
        return new a(comparator0);
    }

    public static a D0() {
        return new a(c4.K().P());
    }

    public j3 E0(Object object0, y y0, Object object1, y y1) {
        H.y(this.comparator().compare(object0, object1) <= 0, "Expected lowerBound <= upperBound but %s > %s", object0, object1);
        return this.F0(object0, y0).c0(object1, y1);
    }

    public abstract j3 F0(Object arg1, y arg2);

    @G2
    static Collector G0(Comparator comparator0) {
        return j3.H0(comparator0, Function.-CC.identity(), (Object object0) -> 1);
    }

    @G2
    static Collector H0(Comparator comparator0, Function function0, ToIntFunction toIntFunction0) {
        H.E(comparator0);
        H.E(function0);
        H.E(toIntFunction0);
        return Collector.-CC.of(new e3(comparator0), (S3 s30, Object object0) -> j3.m0(object0, s30, function0, toIntFunction0), (S3 s30, S3 s31) -> {
            s30.addAll(s31);
            return s30;
        }, new h3(comparator0), new Characteristics[0]);
    }

    @Override  // com.google.common.collect.W2
    @O1.e("Use toImmutableSortedMultiset.")
    @G2
    @Deprecated
    static Collector I() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.W2
    @O1.e("Use toImmutableSortedMultiset.")
    @G2
    @Deprecated
    static Collector J(Function function0, ToIntFunction toIntFunction0) {
        throw new UnsupportedOperationException();
    }

    // 检测为 Lambda 实现
    public static int N(Object object0) [...]

    @O1.e("Use naturalOrder.")
    @Deprecated
    public static a Q() {
        throw new UnsupportedOperationException();
    }

    public static j3 R(Iterable iterable0) {
        return j3.S(c4.K(), iterable0);
    }

    public static j3 S(Comparator comparator0, Iterable iterable0) {
        if(iterable0 instanceof j3 && comparator0.equals(((j3)iterable0).comparator())) {
            return ((j3)iterable0).h() ? j3.Y(comparator0, ((j3)iterable0).y().a()) : ((j3)iterable0);
        }
        return new a(comparator0).q(iterable0).t();
    }

    public static j3 T(Comparator comparator0, Iterator iterator0) {
        H.E(comparator0);
        return new a(comparator0).r(iterator0).t();
    }

    public static j3 U(Iterator iterator0) {
        return j3.T(c4.K(), iterator0);
    }

    public static j3 V(Comparable[] arr_comparable) {
        return j3.S(c4.K(), Arrays.asList(arr_comparable));
    }

    @O1.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static j3 W(Object[] arr_object) {
        throw new UnsupportedOperationException();
    }

    public static j3 X(M4 m40) {
        return j3.Y(m40.comparator(), z3.r(m40.entrySet()));
    }

    private static j3 Y(Comparator comparator0, Collection collection0) {
        if(collection0.isEmpty()) {
            return j3.b0(comparator0);
        }
        com.google.common.collect.O2.a o2$a0 = new com.google.common.collect.O2.a(collection0.size());
        long[] arr_v = new long[collection0.size() + 1];
        int v = 0;
        for(Object object0: collection0) {
            o2$a0.j(((com.google.common.collect.S3.a)object0).b0());
            arr_v[v + 1] = arr_v[v] + ((long)((com.google.common.collect.S3.a)object0).getCount());
            ++v;
        }
        return new s4(new t4(o2$a0.n(), comparator0), arr_v, 0, collection0.size());
    }

    @Override  // com.google.common.collect.M4
    public M4 Y0() {
        return this.Z();
    }

    @Override  // com.google.common.collect.M4
    public M4 Y2(Object object0, y y0, Object object1, y y1) {
        return this.E0(object0, y0, object1, y1);
    }

    public j3 Z() {
        j3 j30 = this.f;
        if(j30 == null) {
            j30 = this.isEmpty() ? j3.b0(c4.q(this.comparator()).P()) : new y1(this);
            this.f = j30;
        }
        return j30;
    }

    public abstract k3 a0();

    static j3 b0(Comparator comparator0) {
        return c4.K().equals(comparator0) ? s4.m : new s4(comparator0);
    }

    public abstract j3 c0(Object arg1, y arg2);

    @Override  // com.google.common.collect.M4
    public final Comparator comparator() {
        return this.a0().comparator();
    }

    @Override  // com.google.common.collect.M4
    public NavigableSet f() {
        return this.a0();
    }

    @Override  // com.google.common.collect.W2, com.google.common.collect.M4
    public Set f() {
        return this.a0();
    }

    @Override  // com.google.common.collect.M4
    public SortedSet f() {
        return this.a0();
    }

    private static int g0(Object object0) [...] // Inlined contents

    // 检测为 Lambda 实现
    private static void i0(Function function0, ToIntFunction toIntFunction0, S3 s30, Object object0) [...]

    @d
    private void j(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    // 检测为 Lambda 实现
    private static S3 j0(S3 s30, S3 s31) [...]

    @Override  // com.google.common.collect.W2
    @d
    Object k() {
        return new com.google.common.collect.j3.b(this);
    }

    private static j3 k0(Comparator comparator0, S3 s30) {
        return j3.Y(comparator0, s30.entrySet());
    }

    @G2
    private static void m0(Object object0, S3 s30, Function function0, ToIntFunction toIntFunction0) {
        s30.T0(H.E(function0.apply(object0)), toIntFunction0.applyAsInt(object0));
    }

    public static a n0() {
        return new a(c4.K());
    }

    public static j3 o0() {
        return s4.m;
    }

    public static j3 p0(Comparable comparable0) {
        return new s4(((t4)k3.j0(comparable0)), new long[]{0L, 1L}, 0, 1);
    }

    @Override  // com.google.common.collect.M4
    @O1.a
    @O1.e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public final com.google.common.collect.S3.a pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.M4
    @O1.a
    @O1.e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public final com.google.common.collect.S3.a pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public static j3 q0(Comparable comparable0, Comparable comparable1) {
        return j3.S(c4.K(), Arrays.asList(new Comparable[]{comparable0, comparable1}));
    }

    public static j3 r0(Comparable comparable0, Comparable comparable1, Comparable comparable2) {
        return j3.S(c4.K(), Arrays.asList(new Comparable[]{comparable0, comparable1, comparable2}));
    }

    public static j3 s0(Comparable comparable0, Comparable comparable1, Comparable comparable2, Comparable comparable3) {
        return j3.S(c4.K(), Arrays.asList(new Comparable[]{comparable0, comparable1, comparable2, comparable3}));
    }

    public static j3 t0(Comparable comparable0, Comparable comparable1, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return j3.S(c4.K(), Arrays.asList(new Comparable[]{comparable0, comparable1, comparable2, comparable3, comparable4}));
    }

    @Override  // com.google.common.collect.M4
    public M4 t1(Object object0, y y0) {
        return this.c0(object0, y0);
    }

    public static j3 u0(Comparable comparable0, Comparable comparable1, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable[] arr_comparable) {
        ArrayList arrayList0 = z3.u(arr_comparable.length + 6);
        Collections.addAll(arrayList0, new Comparable[]{comparable0, comparable1, comparable2, comparable3, comparable4, comparable5});
        Collections.addAll(arrayList0, arr_comparable);
        return j3.S(c4.K(), arrayList0);
    }

    @O1.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static j3 v0(Object object0) {
        throw new UnsupportedOperationException();
    }

    @O1.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static j3 w0(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.W2
    public a3 x() {
        return this.a0();
    }

    @O1.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static j3 y0(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException();
    }

    @O1.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static j3 z0(Object object0, Object object1, Object object2, Object object3) {
        throw new UnsupportedOperationException();
    }
}

