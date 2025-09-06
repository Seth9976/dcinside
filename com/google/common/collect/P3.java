package com.google.common.collect;

import J1.b;
import com.google.common.base.C;
import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.base.J;
import com.google.common.base.t;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

@b(emulated = true)
@C1
public final class p3 {
    static final class j extends V1 {
        private final Iterable b;

        private j(Iterable iterable0) {
            this.b = iterable0;
        }

        j(Iterable iterable0, a p3$a0) {
            this(iterable0);
        }

        @Override
        public Iterator iterator() {
            return q3.e0(this.b.iterator());
        }

        @Override  // com.google.common.collect.V1
        public String toString() {
            return this.b.toString();
        }
    }

    @d4
    public static Object A(Iterable iterable0, @d4 Object object0) {
        return q3.K(iterable0.iterator(), object0);
    }

    public static int B(Iterable iterable0, I i0) {
        return q3.L(iterable0.iterator(), i0);
    }

    // 去混淆评级： 低(20)
    public static boolean C(Iterable iterable0) {
        return iterable0 instanceof Collection ? ((Collection)iterable0).isEmpty() : !iterable0.iterator().hasNext();
    }

    public static Iterable D(Iterable iterable0, int v) {
        class g extends V1 {
            final Iterable b;
            final int c;

            g(Iterable iterable0, int v) {
                this.c = v;
                super();
            }

            @Override
            public Iterator iterator() {
                return q3.M(this.b.iterator(), this.c);
            }
        }

        H.E(iterable0);
        H.e(v >= 0, "limit is negative");
        return new g(iterable0, v);
    }

    public static Iterable E(Iterable iterable0, Comparator comparator0) {
        class i extends V1 {
            final Iterable b;
            final Comparator c;

            i(Iterable iterable0, Comparator comparator0) {
                this.c = comparator0;
                super();
            }

            @Override
            public Iterator iterator() {
                W1 w10 = new W1();
                return q3.N(p3.T(this.b, w10), this.c);
            }
        }

        H.F(iterable0, "iterables");
        H.F(comparator0, "comparator");
        return new j(new i(iterable0, comparator0), null);
    }

    public static Iterable F(Iterable iterable0, int v) {
        class c extends V1 {
            final Iterable b;
            final int c;

            c(Iterable iterable0, int v) {
                this.c = v;
                super();
            }

            @Override
            public Iterator iterator() {
                return q3.O(this.b.iterator(), this.c);
            }
        }

        H.E(iterable0);
        H.d(v > 0);
        return new c(iterable0, v);
    }

    public static Iterable G(Iterable iterable0, int v) {
        class com.google.common.collect.p3.b extends V1 {
            final Iterable b;
            final int c;

            com.google.common.collect.p3.b(Iterable iterable0, int v) {
                this.c = v;
                super();
            }

            @Override
            public Iterator iterator() {
                return q3.P(this.b.iterator(), this.c);
            }
        }

        H.E(iterable0);
        H.d(v > 0);
        return new com.google.common.collect.p3.b(iterable0, v);
    }

    // 去混淆评级： 低(20)
    @O1.a
    public static boolean H(Iterable iterable0, Collection collection0) {
        return iterable0 instanceof Collection ? ((Collection)iterable0).removeAll(((Collection)H.E(collection0))) : q3.U(iterable0.iterator(), collection0);
    }

    @o3.a
    static Object I(Iterable iterable0, I i0) {
        H.E(i0);
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(i0.apply(object0)) {
                iterator0.remove();
                return object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @O1.a
    public static boolean J(Iterable iterable0, I i0) {
        return !(iterable0 instanceof RandomAccess) || !(iterable0 instanceof List) ? q3.V(iterable0.iterator(), i0) : p3.K(((List)iterable0), ((I)H.E(i0)));
    }

    private static boolean K(List list0, I i0) {
        int v = 0;
        int v1 = 0;
        while(v < list0.size()) {
            Object object0 = list0.get(v);
            if(!i0.apply(object0)) {
                if(v > v1) {
                    try {
                        list0.set(v1, object0);
                    }
                    catch(UnsupportedOperationException unused_ex) {
                        p3.O(list0, i0, v1, v);
                        return true;
                    }
                    catch(IllegalArgumentException unused_ex) {
                        p3.O(list0, i0, v1, v);
                        return true;
                    }
                }
                ++v1;
            }
            ++v;
        }
        list0.subList(v1, list0.size()).clear();
        return v != v1;
    }

    // 去混淆评级： 低(20)
    @O1.a
    public static boolean L(Iterable iterable0, Collection collection0) {
        return iterable0 instanceof Collection ? ((Collection)iterable0).retainAll(((Collection)H.E(collection0))) : q3.W(iterable0.iterator(), collection0);
    }

    // 去混淆评级： 低(20)
    public static int M(Iterable iterable0) {
        return iterable0 instanceof Collection ? ((Collection)iterable0).size() : q3.Y(iterable0.iterator());
    }

    public static Iterable N(Iterable iterable0, int v) {
        class f extends V1 {
            final Iterable b;
            final int c;

            f(Iterable iterable0, int v) {
                this.c = v;
                super();
            }

            @Override
            public Iterator iterator() {
                class com.google.common.collect.p3.f.a implements Iterator {
                    boolean a;
                    final Iterator b;

                    com.google.common.collect.p3.f.a(Iterator iterator0) {
                        this.b = iterator0;
                        super();
                        this.a = true;
                    }

                    @Override
                    public boolean hasNext() {
                        return this.b.hasNext();
                    }

                    @Override
                    @d4
                    public Object next() {
                        Object object0 = this.b.next();
                        this.a = false;
                        return object0;
                    }

                    @Override
                    public void remove() {
                        c1.e(!this.a);
                        this.b.remove();
                    }
                }

                Iterable iterable0 = this.b;
                if(iterable0 instanceof List) {
                    return ((List)iterable0).subList(Math.min(((List)iterable0).size(), this.c), ((List)iterable0).size()).iterator();
                }
                Iterator iterator0 = iterable0.iterator();
                q3.b(iterator0, this.c);
                return new com.google.common.collect.p3.f.a(this, iterator0);
            }
        }

        H.E(iterable0);
        H.e(v >= 0, "number to skip cannot be negative");
        return new f(iterable0, v);
    }

    private static void O(List list0, I i0, int v, int v1) {
        for(int v2 = list0.size() - 1; v2 > v1; --v2) {
            if(i0.apply(list0.get(v2))) {
                list0.remove(v2);
            }
        }
        for(int v3 = v1 - 1; v3 >= v; --v3) {
            list0.remove(v3);
        }
    }

    static Object[] P(Iterable iterable0) {
        return p3.d(iterable0).toArray();
    }

    @J1.c
    public static Object[] Q(Iterable iterable0, Class class0) {
        return p3.R(iterable0, Z3.i(class0, 0));
    }

    static Object[] R(Iterable iterable0, Object[] arr_object) {
        return p3.d(iterable0).toArray(arr_object);
    }

    public static String S(Iterable iterable0) {
        return q3.a0(iterable0.iterator());
    }

    public static Iterable T(Iterable iterable0, t t0) {
        class e extends V1 {
            final Iterable b;
            final t c;

            e(Iterable iterable0, t t0) {
                this.c = t0;
                super();
            }

            @Override
            public Iterator iterator() {
                return q3.b0(this.b.iterator(), this.c);
            }
        }

        H.E(iterable0);
        H.E(t0);
        return new e(iterable0, t0);
    }

    public static C U(Iterable iterable0, I i0) {
        return q3.c0(iterable0.iterator(), i0);
    }

    @Deprecated
    public static Iterable V(K2 k20) {
        return (Iterable)H.E(k20);
    }

    public static Iterable W(Iterable iterable0) {
        H.E(iterable0);
        return !(iterable0 instanceof j) && !(iterable0 instanceof K2) ? new j(iterable0, null) : iterable0;
    }

    // 去混淆评级： 低(20)
    @O1.a
    public static boolean a(Collection collection0, Iterable iterable0) {
        return iterable0 instanceof Collection ? collection0.addAll(((Collection)iterable0)) : q3.a(collection0, ((Iterable)H.E(iterable0)).iterator());
    }

    public static boolean b(Iterable iterable0, I i0) {
        return q3.c(iterable0.iterator(), i0);
    }

    public static boolean c(Iterable iterable0, I i0) {
        return q3.d(iterable0.iterator(), i0);
    }

    private static Collection d(Iterable iterable0) {
        return iterable0 instanceof Collection ? ((Collection)iterable0) : z3.s(iterable0.iterator());
    }

    public static Iterable e(Iterable iterable0) {
        return V1.g(iterable0);
    }

    public static Iterable f(Iterable iterable0, Iterable iterable1) {
        return V1.h(iterable0, iterable1);
    }

    public static Iterable g(Iterable iterable0, Iterable iterable1, Iterable iterable2) {
        return V1.i(iterable0, iterable1, iterable2);
    }

    public static Iterable h(Iterable iterable0, Iterable iterable1, Iterable iterable2, Iterable iterable3) {
        return V1.j(iterable0, iterable1, iterable2, iterable3);
    }

    @SafeVarargs
    public static Iterable i(Iterable[] arr_iterable) {
        return V1.k(arr_iterable);
    }

    public static Iterable j(Iterable iterable0) {
        class h extends V1 {
            final Iterable b;

            h(Iterable iterable0) {
            }

            @Override
            public Iterator iterator() {
                Iterable iterable0 = this.b;
                return iterable0 instanceof Queue ? new t1(((Queue)iterable0)) : q3.o(iterable0.iterator());
            }

            @Override  // com.google.common.collect.V1
            public String toString() {
                return "Iterables.consumingIterable(...)";
            }
        }

        H.E(iterable0);
        return new h(iterable0);
    }

    // 去混淆评级： 低(20)
    public static boolean k(Iterable iterable0, @o3.a Object object0) {
        return iterable0 instanceof Collection ? d1.j(((Collection)iterable0), object0) : q3.p(iterable0.iterator(), object0);
    }

    public static Iterable l(Iterable iterable0) {
        class a extends V1 {
            final Iterable b;

            a(Iterable iterable0) {
            }

            @Override
            public Iterator iterator() {
                return q3.q(this.b);
            }

            @Override  // com.google.common.collect.V1
            public String toString() {
                return this.b.toString() + " (cycled)";
            }
        }

        H.E(iterable0);
        return new a(iterable0);
    }

    @SafeVarargs
    public static Iterable m(Object[] arr_object) {
        return p3.l(z3.t(arr_object));
    }

    // 去混淆评级： 低(20)
    public static boolean n(Iterable iterable0, Iterable iterable1) {
        return !(iterable0 instanceof Collection) || !(iterable1 instanceof Collection) || ((Collection)iterable0).size() == ((Collection)iterable1).size() ? q3.s(iterable0.iterator(), iterable1.iterator()) : false;
    }

    public static Iterable o(Iterable iterable0, I i0) {
        class d extends V1 {
            final Iterable b;
            final I c;

            d(Iterable iterable0, I i0) {
                this.c = i0;
                super();
            }

            @Override
            public Iterator iterator() {
                return q3.w(this.b.iterator(), this.c);
            }
        }

        H.E(iterable0);
        H.E(i0);
        return new d(iterable0, i0);
    }

    @J1.c
    public static Iterable p(Iterable iterable0, Class class0) {
        H.E(iterable0);
        H.E(class0);
        return p3.o(iterable0, J.o(class0));
    }

    @d4
    public static Object q(Iterable iterable0, I i0) {
        return q3.y(iterable0.iterator(), i0);
    }

    @o3.a
    public static Object r(Iterable iterable0, I i0, @o3.a Object object0) {
        return q3.z(iterable0.iterator(), i0, object0);
    }

    public static int s(Iterable iterable0, @o3.a Object object0) {
        if(iterable0 instanceof S3) {
            return ((S3)iterable0).y3(object0);
        }
        return iterable0 instanceof Set ? ((Set)iterable0).contains(object0) : q3.D(iterable0.iterator(), object0);
    }

    @d4
    public static Object t(Iterable iterable0, int v) {
        H.E(iterable0);
        return iterable0 instanceof List ? ((List)iterable0).get(v) : q3.E(iterable0.iterator(), v);
    }

    @d4
    public static Object u(Iterable iterable0, int v, @d4 Object object0) {
        H.E(iterable0);
        q3.f(v);
        if(iterable0 instanceof List) {
            return v >= ((List)iterable0).size() ? object0 : ((List)iterable0).get(v);
        }
        Iterator iterator0 = iterable0.iterator();
        q3.b(iterator0, v);
        return q3.I(iterator0, object0);
    }

    @d4
    public static Object v(Iterable iterable0, @d4 Object object0) {
        return q3.I(iterable0.iterator(), object0);
    }

    @d4
    public static Object w(Iterable iterable0) {
        if(iterable0 instanceof List) {
            if(((List)iterable0).isEmpty()) {
                throw new NoSuchElementException();
            }
            return p3.y(((List)iterable0));
        }
        return q3.G(iterable0.iterator());
    }

    @d4
    public static Object x(Iterable iterable0, @d4 Object object0) {
        if(iterable0 instanceof Collection) {
            if(((Collection)iterable0).isEmpty()) {
                return object0;
            }
            return iterable0 instanceof List ? p3.y(((List)iterable0)) : q3.H(iterable0.iterator(), object0);
        }
        return q3.H(iterable0.iterator(), object0);
    }

    @d4
    private static Object y(List list0) {
        return list0.get(list0.size() - 1);
    }

    @d4
    public static Object z(Iterable iterable0) {
        return q3.J(iterable0.iterator());
    }
}

