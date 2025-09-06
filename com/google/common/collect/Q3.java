package com.google.common.collect;

import J1.b;
import J1.c;
import com.google.common.base.B;
import com.google.common.base.C;
import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.base.J;
import com.google.common.base.t;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import o3.a;

@b(emulated = true)
@C1
public final class q3 {
    static final class k extends com.google.common.collect.b {
        private final Object[] c;
        static final v5 d;

        static {
            k.d = new k(new Object[0], 0);
        }

        k(Object[] arr_object, int v) {
            super(arr_object.length, v);
            this.c = arr_object;
        }

        @Override  // com.google.common.collect.b
        @d4
        protected Object a(int v) {
            return this.c[v];
        }
    }

    static class l implements Iterator {
        @a
        private Iterator a;
        private Iterator b;
        @a
        private Iterator c;
        @a
        private Deque d;

        l(Iterator iterator0) {
            this.b = q3.t();
            this.c = (Iterator)H.E(iterator0);
        }

        @a
        private Iterator a() {
            while(true) {
                if(this.c != null && this.c.hasNext()) {
                    return this.c;
                }
                if(this.d == null || this.d.isEmpty()) {
                    break;
                }
                this.c = (Iterator)this.d.removeFirst();
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            while(!((Iterator)H.E(this.b)).hasNext()) {
                Iterator iterator0 = this.a();
                this.c = iterator0;
                if(iterator0 == null) {
                    return false;
                }
                Object object0 = iterator0.next();
                Iterator iterator1 = (Iterator)object0;
                this.b = iterator1;
                if(iterator1 instanceof l) {
                    l q3$l0 = (l)iterator1;
                    this.b = q3$l0.b;
                    if(this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if(q3$l0.d != null) {
                        while(!q3$l0.d.isEmpty()) {
                            this.d.addFirst(((Iterator)q3$l0.d.removeLast()));
                        }
                    }
                    this.c = q3$l0.c;
                }
            }
            return true;
        }

        @Override
        @d4
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = this.b;
            return this.b.next();
        }

        @Override
        public void remove() {
            Iterator iterator0 = this.a;
            if(iterator0 == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            iterator0.remove();
            this.a = null;
        }
    }

    static enum m implements Iterator {
        INSTANCE;

        private static m[] a() [...] // Inlined contents

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            c1.e(false);
        }
    }

    static class n extends u5 {
        final Queue a;

        public n(Iterable iterable0, Comparator comparator0) {
            this.a = new PriorityQueue(2, (e4 e40, e4 e41) -> comparator0.compare(e40.peek(), e41.peek()));
            for(Object object0: iterable0) {
                Iterator iterator1 = (Iterator)object0;
                if(iterator1.hasNext()) {
                    e4 e40 = q3.S(iterator1);
                    this.a.add(e40);
                }
            }
        }

        // 检测为 Lambda 实现
        private static int b(Comparator comparator0, e4 e40, e4 e41) [...]

        @Override
        public boolean hasNext() {
            return !this.a.isEmpty();
        }

        @Override
        @d4
        public Object next() {
            e4 e40 = (e4)this.a.remove();
            Object object0 = e40.next();
            if(e40.hasNext()) {
                this.a.add(e40);
            }
            return object0;
        }
    }

    static class o implements e4 {
        private final Iterator a;
        private boolean b;
        @a
        private Object c;

        public o(Iterator iterator0) {
            this.a = (Iterator)H.E(iterator0);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean hasNext() {
            return this.b || this.a.hasNext();
        }

        @Override  // com.google.common.collect.e4
        @d4
        public Object next() {
            if(!this.b) {
                return this.a.next();
            }
            Object object1 = this.c;
            this.b = false;
            this.c = null;
            return object1;
        }

        @Override  // com.google.common.collect.e4
        @d4
        public Object peek() {
            if(!this.b) {
                Object object0 = this.a.next();
                this.c = object0;
                this.b = true;
            }
            return this.c;
        }

        @Override  // com.google.common.collect.e4
        public void remove() {
            H.h0(!this.b, "Can\'t remove after you\'ve peeked at next");
            this.a.remove();
        }
    }

    static final class p extends u5 {
        private Object a;
        private static final Object b;

        static {
            p.b = new Object();
        }

        p(Object object0) {
            this.a = object0;
        }

        @Override
        public boolean hasNext() {
            return this.a != p.b;
        }

        @Override
        @d4
        public Object next() {
            Object object0 = this.a;
            Object object1 = p.b;
            if(object0 == object1) {
                throw new NoSuchElementException();
            }
            this.a = object1;
            return object0;
        }
    }

    @SafeVarargs
    public static u5 A(Object[] arr_object) {
        return q3.B(arr_object, 0);
    }

    static v5 B(Object[] arr_object, int v) {
        if(arr_object.length == 0) {
            H.d0(v, arr_object.length);
            return q3.u();
        }
        return new k(arr_object, v);
    }

    public static u5 C(Enumeration enumeration0) {
        class j extends u5 {
            final Enumeration a;

            j(Enumeration enumeration0) {
            }

            @Override
            public boolean hasNext() {
                return this.a.hasMoreElements();
            }

            @Override
            @d4
            public Object next() {
                return this.a.nextElement();
            }
        }

        H.E(enumeration0);
        return new j(enumeration0);
    }

    public static int D(Iterator iterator0, @a Object object0) {
        int v;
        for(v = 0; q3.p(iterator0, object0); ++v) {
        }
        return v;
    }

    @d4
    public static Object E(Iterator iterator0, int v) {
        q3.f(v);
        int v1 = q3.b(iterator0, v);
        if(!iterator0.hasNext()) {
            throw new IndexOutOfBoundsException("position (" + v + ") must be less than the number of elements that remained (" + v1 + ")");
        }
        return iterator0.next();
    }

    @d4
    public static Object F(Iterator iterator0, int v, @d4 Object object0) {
        q3.f(v);
        q3.b(iterator0, v);
        return q3.I(iterator0, object0);
    }

    @d4
    public static Object G(Iterator iterator0) {
        Object object0;
        do {
            object0 = iterator0.next();
        }
        while(iterator0.hasNext());
        return object0;
    }

    // 去混淆评级： 低(20)
    @d4
    public static Object H(Iterator iterator0, @d4 Object object0) {
        return iterator0.hasNext() ? q3.G(iterator0) : object0;
    }

    // 去混淆评级： 低(20)
    @d4
    public static Object I(Iterator iterator0, @d4 Object object0) {
        return iterator0.hasNext() ? iterator0.next() : object0;
    }

    @d4
    public static Object J(Iterator iterator0) {
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("expected one element but was: <");
        stringBuilder0.append(object0);
        for(int v = 0; v < 4 && iterator0.hasNext(); ++v) {
            stringBuilder0.append(", ");
            Object object1 = iterator0.next();
            stringBuilder0.append(object1);
        }
        if(iterator0.hasNext()) {
            stringBuilder0.append(", ...");
        }
        stringBuilder0.append('>');
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    // 去混淆评级： 低(20)
    @d4
    public static Object K(Iterator iterator0, @d4 Object object0) {
        return iterator0.hasNext() ? q3.J(iterator0) : object0;
    }

    public static int L(Iterator iterator0, I i0) {
        H.F(i0, "predicate");
        for(int v = 0; iterator0.hasNext(); ++v) {
            Object object0 = iterator0.next();
            if(i0.apply(object0)) {
                return v;
            }
        }
        return -1;
    }

    public static Iterator M(Iterator iterator0, int v) {
        class h implements Iterator {
            private int a;
            final int b;
            final Iterator c;

            h(int v, Iterator iterator0) {
                this.c = iterator0;
                super();
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b && this.c.hasNext();
            }

            @Override
            @d4
            public Object next() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                ++this.a;
                return this.c.next();
            }

            @Override
            public void remove() {
                this.c.remove();
            }
        }

        H.E(iterator0);
        H.e(v >= 0, "limit is negative");
        return new h(v, iterator0);
    }

    public static u5 N(Iterable iterable0, Comparator comparator0) {
        H.F(iterable0, "iterators");
        H.F(comparator0, "comparator");
        return new n(iterable0, comparator0);
    }

    public static u5 O(Iterator iterator0, int v) {
        return q3.Q(iterator0, v, true);
    }

    public static u5 P(Iterator iterator0, int v) {
        return q3.Q(iterator0, v, false);
    }

    private static u5 Q(Iterator iterator0, int v, boolean z) {
        class e extends u5 {
            final Iterator a;
            final int b;
            final boolean c;

            e(Iterator iterator0, int v, boolean z) {
                this.b = v;
                this.c = z;
                super();
            }

            public List a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] arr_object = new Object[this.b];
                int v;
                for(v = 0; v < this.b && this.a.hasNext(); ++v) {
                    Object object0 = this.a.next();
                    arr_object[v] = object0;
                }
                for(int v1 = v; v1 < this.b; ++v1) {
                    arr_object[v1] = null;
                }
                List list0 = DesugarCollections.unmodifiableList(Arrays.asList(arr_object));
                return this.c || v == this.b ? list0 : list0.subList(0, v);
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.a();
            }
        }

        H.E(iterator0);
        H.d(v > 0);
        return new e(iterator0, v, z);
    }

    @Deprecated
    public static e4 R(e4 e40) {
        return (e4)H.E(e40);
    }

    // 去混淆评级： 低(20)
    public static e4 S(Iterator iterator0) {
        return iterator0 instanceof o ? ((o)iterator0) : new o(iterator0);
    }

    @a
    static Object T(Iterator iterator0) {
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            iterator0.remove();
            return object0;
        }
        return null;
    }

    @O1.a
    public static boolean U(Iterator iterator0, Collection collection0) {
        H.E(collection0);
        boolean z = false;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(collection0.contains(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    @O1.a
    public static boolean V(Iterator iterator0, I i0) {
        H.E(i0);
        boolean z = false;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(i0.apply(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    @O1.a
    public static boolean W(Iterator iterator0, Collection collection0) {
        H.E(collection0);
        boolean z = false;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    public static u5 X(@d4 Object object0) {
        return new p(object0);
    }

    public static int Y(Iterator iterator0) {
        long v;
        for(v = 0L; iterator0.hasNext(); ++v) {
            iterator0.next();
        }
        return com.google.common.primitives.l.z(v);
    }

    @c
    public static Object[] Z(Iterator iterator0, Class class0) {
        return p3.Q(z3.s(iterator0), class0);
    }

    @O1.a
    public static boolean a(Collection collection0, Iterator iterator0) {
        H.E(collection0);
        H.E(iterator0);
        boolean z;
        for(z = false; iterator0.hasNext(); z |= collection0.add(object0)) {
            Object object0 = iterator0.next();
        }
        return z;
    }

    public static String a0(Iterator iterator0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        for(boolean z = true; iterator0.hasNext(); z = false) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @O1.a
    public static int b(Iterator iterator0, int v) {
        H.E(iterator0);
        int v1 = 0;
        H.e(v >= 0, "numberToAdvance must be nonnegative");
        while(v1 < v && iterator0.hasNext()) {
            iterator0.next();
            ++v1;
        }
        return v1;
    }

    public static Iterator b0(Iterator iterator0, t t0) {
        class g extends l5 {
            final t b;

            g(Iterator iterator0, t t0) {
                this.b = t0;
                super(iterator0);
            }

            @Override  // com.google.common.collect.l5
            @d4
            Object a(@d4 Object object0) {
                return this.b.apply(object0);
            }
        }

        H.E(t0);
        return new g(iterator0, t0);
    }

    public static boolean c(Iterator iterator0, I i0) {
        H.E(i0);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!i0.apply(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static C c0(Iterator iterator0, I i0) {
        H.E(iterator0);
        H.E(i0);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(i0.apply(object0)) {
                return C.f(object0);
            }
            if(false) {
                break;
            }
        }
        return C.a();
    }

    public static boolean d(Iterator iterator0, I i0) {
        return q3.L(iterator0, i0) != -1;
    }

    @Deprecated
    public static u5 d0(u5 u50) {
        return (u5)H.E(u50);
    }

    public static Enumeration e(Iterator iterator0) {
        class com.google.common.collect.q3.a implements Enumeration {
            final Iterator a;

            com.google.common.collect.q3.a(Iterator iterator0) {
            }

            @Override
            public boolean hasMoreElements() {
                return this.a.hasNext();
            }

            @Override
            @d4
            public Object nextElement() {
                return this.a.next();
            }
        }

        H.E(iterator0);
        return new com.google.common.collect.q3.a(iterator0);
    }

    public static u5 e0(Iterator iterator0) {
        class com.google.common.collect.q3.b extends u5 {
            final Iterator a;

            com.google.common.collect.q3.b(Iterator iterator0) {
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            @d4
            public Object next() {
                return this.a.next();
            }
        }

        H.E(iterator0);
        return iterator0 instanceof u5 ? ((u5)iterator0) : new com.google.common.collect.q3.b(iterator0);
    }

    static void f(int v) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("position (" + v + ") must not be negative");
        }
    }

    static void g(Iterator iterator0) {
        H.E(iterator0);
        while(iterator0.hasNext()) {
            iterator0.next();
            iterator0.remove();
        }
    }

    public static Iterator h(Iterator iterator0) {
        return new l(iterator0);
    }

    public static Iterator i(Iterator iterator0, Iterator iterator1) {
        H.E(iterator0);
        H.E(iterator1);
        return q3.h(q3.n(new Iterator[]{iterator0, iterator1}));
    }

    public static Iterator j(Iterator iterator0, Iterator iterator1, Iterator iterator2) {
        H.E(iterator0);
        H.E(iterator1);
        H.E(iterator2);
        return q3.h(q3.n(new Iterator[]{iterator0, iterator1, iterator2}));
    }

    public static Iterator k(Iterator iterator0, Iterator iterator1, Iterator iterator2, Iterator iterator3) {
        H.E(iterator0);
        H.E(iterator1);
        H.E(iterator2);
        H.E(iterator3);
        return q3.h(q3.n(new Iterator[]{iterator0, iterator1, iterator2, iterator3}));
    }

    public static Iterator l(Iterator[] arr_iterator) {
        return q3.m(((Iterator[])Arrays.copyOf(arr_iterator, arr_iterator.length)));
    }

    static Iterator m(Iterator[] arr_iterator) {
        Iterator[] arr_iterator1 = (Iterator[])H.E(arr_iterator);
        for(int v = 0; v < arr_iterator1.length; ++v) {
            H.E(arr_iterator1[v]);
        }
        return q3.h(q3.n(arr_iterator));
    }

    private static Iterator n(Iterator[] arr_iterator) {
        class d extends u5 {
            int a;
            final Iterator[] b;

            d(Iterator[] arr_iterator) {
                this.a = 0;
            }

            public Iterator a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator iterator0 = this.b[this.a];
                Objects.requireNonNull(iterator0);
                int v = this.a;
                this.b[v] = null;
                this.a = v + 1;
                return iterator0;
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b.length;
            }

            @Override
            public Object next() {
                return this.a();
            }
        }

        return new d(arr_iterator);
    }

    public static Iterator o(Iterator iterator0) {
        class i extends u5 {
            final Iterator a;

            i(Iterator iterator0) {
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            @d4
            public Object next() {
                Object object0 = this.a.next();
                this.a.remove();
                return object0;
            }

            @Override
            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        }

        H.E(iterator0);
        return new i(iterator0);
    }

    public static boolean p(Iterator iterator0, @a Object object0) {
        if(object0 == null) {
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(object1 != null) {
                    continue;
                }
                return true;
            }
        }
        else {
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                if(object0.equals(object2)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static Iterator q(Iterable iterable0) {
        class com.google.common.collect.q3.c implements Iterator {
            Iterator a;
            final Iterable b;

            com.google.common.collect.q3.c(Iterable iterable0) {
                this.a = q3.v();
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean hasNext() {
                return this.a.hasNext() || this.b.iterator().hasNext();
            }

            @Override
            @d4
            public Object next() {
                if(!this.a.hasNext()) {
                    Iterator iterator0 = this.b.iterator();
                    this.a = iterator0;
                    if(!iterator0.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.a.next();
            }

            @Override
            public void remove() {
                this.a.remove();
            }
        }

        H.E(iterable0);
        return new com.google.common.collect.q3.c(iterable0);
    }

    @SafeVarargs
    public static Iterator r(Object[] arr_object) {
        return q3.q(z3.t(arr_object));
    }

    public static boolean s(Iterator iterator0, Iterator iterator1) {
        while(iterator0.hasNext()) {
            if(!iterator1.hasNext()) {
                return false;
            }
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            if(!B.a(object0, object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return !iterator1.hasNext();
    }

    static u5 t() {
        return q3.u();
    }

    static v5 u() {
        return k.d;
    }

    static Iterator v() {
        return m.a;
    }

    public static u5 w(Iterator iterator0, I i0) {
        class f extends com.google.common.collect.c {
            final Iterator c;
            final I d;

            f(Iterator iterator0, I i0) {
                this.d = i0;
                super();
            }

            @Override  // com.google.common.collect.c
            @a
            protected Object a() {
                while(this.c.hasNext()) {
                    Object object0 = this.c.next();
                    if(this.d.apply(object0)) {
                        return object0;
                    }
                    if(false) {
                        break;
                    }
                }
                return this.b();
            }
        }

        H.E(iterator0);
        H.E(i0);
        return new f(iterator0, i0);
    }

    @c
    public static u5 x(Iterator iterator0, Class class0) {
        return q3.w(iterator0, J.o(class0));
    }

    @d4
    public static Object y(Iterator iterator0, I i0) {
        H.E(iterator0);
        H.E(i0);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(i0.apply(object0)) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException();
    }

    @a
    public static Object z(Iterator iterator0, I i0, @a Object object0) {
        H.E(iterator0);
        H.E(i0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(i0.apply(object1)) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return object0;
    }
}

