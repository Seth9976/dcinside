package com.google.common.collect;

import J1.b;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.common.base.t;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@b
@C1
public abstract class c4 implements Comparator {
    @d
    @e
    static class a extends c4 {
        private final AtomicInteger c;
        private final ConcurrentMap d;

        a() {
            this.c = new AtomicInteger(0);
            this.d = f4.l(new B3()).i();
        }

        private Integer S(Object object0) {
            Integer integer0 = (Integer)this.d.get(object0);
            if(integer0 == null) {
                integer0 = this.c.getAndIncrement();
                Integer integer1 = (Integer)this.d.putIfAbsent(object0, integer0);
                return integer1 == null ? integer0 : integer1;
            }
            return integer0;
        }

        int T(Object object0) {
            return System.identityHashCode(object0);
        }

        @Override  // com.google.common.collect.c4
        public int compare(@o3.a Object object0, @o3.a Object object1) {
            if(object0 == object1) {
                return 0;
            }
            if(object0 == null) {
                return -1;
            }
            if(object1 == null) {
                return 1;
            }
            int v = this.T(object0);
            int v1 = this.T(object1);
            if(v != v1) {
                return v < v1 ? -1 : 1;
            }
            int v2 = this.S(object0).compareTo(this.S(object1));
            if(v2 == 0) {
                throw new AssertionError();
            }
            return v2;
        }

        @Override
        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    @d
    static class com.google.common.collect.c4.b {
        static final c4 a;

        static {
            com.google.common.collect.c4.b.a = new a();
        }
    }

    @e
    static class c extends ClassCastException {
        final Object a;
        private static final long b;

        c(Object object0) {
            super("Cannot compare value: " + object0);
            this.a = object0;
        }
    }

    static final int a = 1;
    static final int b = -1;

    public List A(Iterator iterator0, int v) {
        H.E(iterator0);
        c1.b(v, "k");
        if(v != 0 && iterator0.hasNext()) {
            if(v >= 0x3FFFFFFF) {
                ArrayList arrayList0 = z3.s(iterator0);
                Collections.sort(arrayList0, this);
                if(arrayList0.size() > v) {
                    arrayList0.subList(v, arrayList0.size()).clear();
                }
                arrayList0.trimToSize();
                return DesugarCollections.unmodifiableList(arrayList0);
            }
            k5 k50 = k5.e(v, this);
            k50.h(iterator0);
            return k50.k();
        }
        return Collections.emptyList();
    }

    @b(serializable = true)
    public c4 B() {
        return new s3(this);
    }

    @d4
    public Object C(Iterable iterable0) {
        return this.F(iterable0.iterator());
    }

    @d4
    public Object D(@d4 Object object0, @d4 Object object1) {
        return this.compare(object0, object1) >= 0 ? object0 : object1;
    }

    @d4
    public Object E(@d4 Object object0, @d4 Object object1, @d4 Object object2, Object[] arr_object) {
        Object object3 = this.D(this.D(object0, object1), object2);
        for(int v = 0; v < arr_object.length; ++v) {
            object3 = this.D(object3, arr_object[v]);
        }
        return object3;
    }

    @d4
    public Object F(Iterator iterator0) {
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = this.D(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    @d4
    public Object G(Iterable iterable0) {
        return this.J(iterable0.iterator());
    }

    @d4
    public Object H(@d4 Object object0, @d4 Object object1) {
        return this.compare(object0, object1) <= 0 ? object0 : object1;
    }

    @d4
    public Object I(@d4 Object object0, @d4 Object object1, @d4 Object object2, Object[] arr_object) {
        Object object3 = this.H(this.H(object0, object1), object2);
        for(int v = 0; v < arr_object.length; ++v) {
            object3 = this.H(object3, arr_object[v]);
        }
        return object3;
    }

    @d4
    public Object J(Iterator iterator0) {
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = this.H(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    @b(serializable = true)
    public static c4 K() {
        return V3.e;
    }

    @b(serializable = true)
    public c4 L() {
        return new X3(this);
    }

    @b(serializable = true)
    public c4 M() {
        return new Y3(this);
    }

    c4 N() {
        return this.O(D3.R());
    }

    @b(serializable = true)
    public c4 O(t t0) {
        return new z(t0, this);
    }

    @b(serializable = true)
    public c4 P() {
        return new x4(this);
    }

    public List Q(Iterable iterable0) {
        Object[] arr_object = p3.P(iterable0);
        Arrays.sort(arr_object, this);
        return z3.r(Arrays.asList(arr_object));
    }

    @b(serializable = true)
    public static c4 R() {
        return x5.c;
    }

    @b(serializable = true)
    public static c4 b() {
        return r.c;
    }

    @Override
    public abstract int compare(@d4 Object arg1, @d4 Object arg2);

    @d
    public static c4 g() {
        return com.google.common.collect.c4.b.a;
    }

    @Deprecated
    public int i(List list0, @d4 Object object0) {
        return Collections.binarySearch(list0, object0, this);
    }

    @b(serializable = true)
    public static c4 j(Iterable iterable0) {
        return new q1(iterable0);
    }

    @b(serializable = true)
    public c4 k(Comparator comparator0) {
        return new q1(this, ((Comparator)H.E(comparator0)));
    }

    @b(serializable = true)
    public static c4 n(Object object0, Object[] arr_object) {
        return c4.o(z3.c(object0, arr_object));
    }

    @b(serializable = true)
    public static c4 o(List list0) {
        return new K1(list0);
    }

    @b(serializable = true)
    @Deprecated
    public static c4 p(c4 c40) {
        return (c4)H.E(c40);
    }

    @b(serializable = true)
    public static c4 q(Comparator comparator0) {
        return comparator0 instanceof c4 ? ((c4)comparator0) : new j1(comparator0);
    }

    public List s(Iterable iterable0, int v) {
        return this.P().z(iterable0, v);
    }

    public List u(Iterator iterator0, int v) {
        return this.P().A(iterator0, v);
    }

    public O2 w(Iterable iterable0) {
        return O2.Q(this, iterable0);
    }

    public boolean x(Iterable iterable0) {
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            for(Object object0 = iterator0.next(); iterator0.hasNext(); object0 = object1) {
                Object object1 = iterator0.next();
                if(this.compare(object0, object1) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean y(Iterable iterable0) {
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            for(Object object0 = iterator0.next(); iterator0.hasNext(); object0 = object1) {
                Object object1 = iterator0.next();
                if(this.compare(object0, object1) >= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public List z(Iterable iterable0, int v) {
        if(iterable0 instanceof Collection && ((long)((Collection)iterable0).size()) <= ((long)v) * 2L) {
            Object[] arr_object = ((Collection)iterable0).toArray();
            Arrays.sort(arr_object, this);
            if(arr_object.length > v) {
                arr_object = Arrays.copyOf(arr_object, v);
            }
            return DesugarCollections.unmodifiableList(Arrays.asList(arr_object));
        }
        return this.A(iterable0.iterator(), v);
    }
}

