package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.base.J;
import com.google.common.base.t;
import com.google.common.math.f;
import j..util.Objects;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@b
@C1
public final class d1 {
    static class a extends AbstractCollection {
        final Collection a;
        final I b;

        a(Collection collection0, I i0) {
            this.a = collection0;
            this.b = i0;
        }

        a a(I i0) {
            I i1 = J.d(this.b, i0);
            return new a(this.a, i1);
        }

        @Override
        public boolean add(@d4 Object object0) {
            H.d(this.b.apply(object0));
            return this.a.add(object0);
        }

        @Override
        public boolean addAll(Collection collection0) {
            for(Object object0: collection0) {
                H.d(this.b.apply(object0));
            }
            return this.a.addAll(collection0);
        }

        @Override
        public void clear() {
            p3.J(this.a, this.b);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean contains(@o3.a Object object0) {
            return d1.j(this.a, object0) ? this.b.apply(object0) : false;
        }

        @Override
        public boolean containsAll(Collection collection0) {
            return d1.b(this, collection0);
        }

        @Override
        public boolean isEmpty() {
            return !p3.c(this.a, this.b);
        }

        @Override
        public Iterator iterator() {
            return q3.w(this.a.iterator(), this.b);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean remove(@o3.a Object object0) {
            return this.contains(object0) && this.a.remove(object0);
        }

        @Override
        public boolean removeAll(Collection collection0) {
            boolean z = false;
            Iterator iterator0 = this.a.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(this.b.apply(object0) && collection0.contains(object0)) {
                    iterator0.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override
        public boolean retainAll(Collection collection0) {
            boolean z = false;
            Iterator iterator0 = this.a.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(this.b.apply(object0) && !collection0.contains(object0)) {
                    iterator0.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override
        public int size() {
            int v = 0;
            for(Object object0: this.a) {
                if(this.b.apply(object0)) {
                    ++v;
                }
            }
            return v;
        }

        @Override
        public Object[] toArray() {
            return z3.s(this.iterator()).toArray();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return z3.s(this.iterator()).toArray(arr_object);
        }
    }

    static final class com.google.common.collect.d1.b extends AbstractCollection {
        final O2 a;
        final Comparator b;
        final int c;

        com.google.common.collect.d1.b(Iterable iterable0, Comparator comparator0) {
            O2 o20 = O2.Q(comparator0, iterable0);
            this.a = o20;
            this.b = comparator0;
            this.c = com.google.common.collect.d1.b.a(o20, comparator0);
        }

        private static int a(List list0, Comparator comparator0) {
            int v = 1;
            int v1 = 1;
            int v2;
            for(v2 = 1; v < list0.size(); ++v2) {
                if(comparator0.compare(list0.get(v - 1), list0.get(v)) < 0) {
                    v1 = f.u(v1, f.a(v, v2));
                    if(v1 == 0x7FFFFFFF) {
                        return 0x7FFFFFFF;
                    }
                    v2 = 0;
                }
                ++v;
            }
            return f.u(v1, f.a(v, v2));
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof List ? d1.e(this.a, ((List)object0)) : false;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Iterator iterator() {
            return new c(this.a, this.b);
        }

        @Override
        public int size() {
            return this.c;
        }

        @Override
        public String toString() {
            return "orderedPermutationCollection(" + this.a + ")";
        }
    }

    static final class c extends com.google.common.collect.c {
        @o3.a
        List c;
        final Comparator d;

        c(List list0, Comparator comparator0) {
            this.c = z3.r(list0);
            this.d = comparator0;
        }

        @Override  // com.google.common.collect.c
        @o3.a
        protected Object a() {
            return this.e();
        }

        void d() {
            int v = this.f();
            if(v == -1) {
                this.c = null;
                return;
            }
            Objects.requireNonNull(this.c);
            int v1 = this.g(v);
            Collections.swap(this.c, v, v1);
            Collections.reverse(this.c.subList(v + 1, this.c.size()));
        }

        @o3.a
        protected List e() {
            List list0 = this.c;
            if(list0 == null) {
                return (List)this.b();
            }
            List list1 = O2.r(list0);
            this.d();
            return list1;
        }

        int f() {
            Objects.requireNonNull(this.c);
            for(int v = this.c.size() - 2; v >= 0; --v) {
                Object object0 = this.c.get(v);
                Object object1 = this.c.get(v + 1);
                if(this.d.compare(object0, object1) < 0) {
                    return v;
                }
            }
            return -1;
        }

        int g(int v) {
            Objects.requireNonNull(this.c);
            Object object0 = this.c.get(v);
            for(int v1 = this.c.size() - 1; v1 > v; --v1) {
                Object object1 = this.c.get(v1);
                if(this.d.compare(object0, object1) < 0) {
                    return v1;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    static final class d extends AbstractCollection {
        final O2 a;

        d(O2 o20) {
            this.a = o20;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof List ? d1.e(this.a, ((List)object0)) : false;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Iterator iterator() {
            return new e(this.a);
        }

        @Override
        public int size() {
            return f.h(this.a.size());
        }

        @Override
        public String toString() {
            return "permutations(" + this.a + ")";
        }
    }

    static class e extends com.google.common.collect.c {
        final List c;
        final int[] d;
        final int[] e;
        int f;

        e(List list0) {
            this.c = new ArrayList(list0);
            int v = list0.size();
            int[] arr_v = new int[v];
            this.d = arr_v;
            int[] arr_v1 = new int[v];
            this.e = arr_v1;
            Arrays.fill(arr_v, 0);
            Arrays.fill(arr_v1, 1);
            this.f = 0x7FFFFFFF;
        }

        @Override  // com.google.common.collect.c
        @o3.a
        protected Object a() {
            return this.e();
        }

        void d() {
            int v = this.c.size();
            this.f = v - 1;
            if(v - 1 == -1) {
                return;
            }
            int v1 = 0;
            while(true) {
                int v2 = this.f;
                int v3 = this.d[v2];
                int v4 = this.e[v2] + v3;
                if(v4 >= 0) {
                    if(v4 != v2 + 1) {
                        Collections.swap(this.c, v2 - v3 + v1, v2 - v4 + v1);
                        this.d[this.f] = v4;
                        break;
                    }
                    if(v2 == 0) {
                        break;
                    }
                    ++v1;
                }
                this.f();
            }
        }

        @o3.a
        protected List e() {
            if(this.f <= 0) {
                return (List)this.b();
            }
            List list0 = O2.r(this.c);
            this.d();
            return list0;
        }

        void f() {
            int v = this.f;
            this.e[v] = -this.e[v];
            this.f = v - 1;
        }
    }

    static class com.google.common.collect.d1.f extends AbstractCollection {
        final Collection a;
        final t b;

        com.google.common.collect.d1.f(Collection collection0, t t0) {
            this.a = (Collection)H.E(collection0);
            this.b = (t)H.E(t0);
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return q3.b0(this.a.iterator(), this.b);
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    static boolean b(Collection collection0, Collection collection1) {
        for(Object object0: collection1) {
            if(!collection0.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static a4 c(Collection collection0) {
        a4 a40 = new a4();
        for(Object object0: collection0) {
            a40.v(object0, a40.g(object0) + 1);
        }
        return a40;
    }

    // 去混淆评级： 低(20)
    public static Collection d(Collection collection0, I i0) {
        return collection0 instanceof a ? ((a)collection0).a(i0) : new a(((Collection)H.E(collection0)), ((I)H.E(i0)));
    }

    private static boolean e(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return false;
        }
        a4 a40 = d1.c(list0);
        a4 a41 = d1.c(list1);
        if(list0.size() != list1.size()) {
            return false;
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(a40.l(v) != a41.g(a40.j(v))) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder f(int v) {
        c1.b(v, "size");
        return new StringBuilder(((int)Math.min(((long)v) * 8L, 0x40000000L)));
    }

    public static Collection g(Iterable iterable0) {
        return d1.h(iterable0, c4.K());
    }

    public static Collection h(Iterable iterable0, Comparator comparator0) {
        return new com.google.common.collect.d1.b(iterable0, comparator0);
    }

    public static Collection i(Collection collection0) {
        return new d(O2.r(collection0));
    }

    static boolean j(Collection collection0, @o3.a Object object0) {
        H.E(collection0);
        try {
            return collection0.contains(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            return false;
        }
    }

    static boolean k(Collection collection0, @o3.a Object object0) {
        H.E(collection0);
        try {
            return collection0.remove(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            return false;
        }
    }

    static String l(Collection collection0) {
        StringBuilder stringBuilder0 = d1.f(collection0.size());
        stringBuilder0.append('[');
        boolean z = true;
        for(Object object0: collection0) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            if(object0 == collection0) {
                stringBuilder0.append("(this Collection)");
            }
            else {
                stringBuilder0.append(object0);
            }
            z = false;
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    public static Collection m(Collection collection0, t t0) {
        return new com.google.common.collect.d1.f(collection0, t0);
    }
}

