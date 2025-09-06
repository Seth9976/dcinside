package com.google.common.collect;

import J1.b;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.t;
import com.google.common.math.f;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.a;

@b(emulated = true)
@C1
public final class z3 {
    static class c extends AbstractList {
        final List a;

        c(List list0) {
            this.a = (List)H.E(list0);
        }

        @Override
        public void add(int v, @d4 Object object0) {
            this.a.add(v, object0);
        }

        @Override
        public boolean addAll(int v, Collection collection0) {
            return this.a.addAll(v, collection0);
        }

        @Override
        public boolean contains(@a Object object0) {
            return this.a.contains(object0);
        }

        @Override
        @d4
        public Object get(int v) {
            return this.a.get(v);
        }

        @Override
        @d4
        public Object remove(int v) {
            return this.a.remove(v);
        }

        @Override
        @d4
        public Object set(int v, @d4 Object object0) {
            return this.a.set(v, object0);
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    static final class d extends AbstractList {
        private final CharSequence a;

        d(CharSequence charSequence0) {
            this.a = charSequence0;
        }

        public Character a(int v) {
            H.C(v, this.size());
            return Character.valueOf(this.a.charAt(v));
        }

        @Override
        public Object get(int v) {
            return this.a(v);
        }

        @Override
        public int size() {
            return this.a.length();
        }
    }

    static class e extends AbstractList implements Serializable, RandomAccess {
        @d4
        final Object a;
        final Object[] b;
        @J1.d
        private static final long c;

        e(@d4 Object object0, Object[] arr_object) {
            this.a = object0;
            this.b = (Object[])H.E(arr_object);
        }

        @Override
        @d4
        public Object get(int v) {
            H.C(v, this.size());
            return v == 0 ? this.a : this.b[v - 1];
        }

        @Override
        public int size() {
            return f.t(this.b.length, 1);
        }
    }

    static class com.google.common.collect.z3.f extends AbstractList {
        final List a;
        final int b;

        com.google.common.collect.z3.f(List list0, int v) {
            this.a = list0;
            this.b = v;
        }

        public List a(int v) {
            H.C(v, this.size());
            int v1 = v * this.b;
            return this.a.subList(v1, Math.min(this.b + v1, this.a.size()));
        }

        @Override
        public Object get(int v) {
            return this.a(v);
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public int size() {
            return f.g(this.a.size(), this.b, RoundingMode.CEILING);
        }
    }

    static class g extends c implements RandomAccess {
        g(List list0) {
            super(list0);
        }
    }

    static class h extends com.google.common.collect.z3.f implements RandomAccess {
        h(List list0, int v) {
            super(list0, v);
        }
    }

    static class i extends j implements RandomAccess {
        i(List list0) {
            super(list0);
        }
    }

    static class j extends AbstractList {
        private final List a;

        j(List list0) {
            this.a = (List)H.E(list0);
        }

        @Override
        public void add(int v, @d4 Object object0) {
            int v1 = this.d(v);
            this.a.add(v1, object0);
        }

        List b() {
            return this.a;
        }

        private int c(int v) {
            int v1 = this.size();
            H.C(v, v1);
            return v1 - 1 - v;
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        private int d(int v) {
            int v1 = this.size();
            H.d0(v, v1);
            return v1 - v;
        }

        @Override
        @d4
        public Object get(int v) {
            int v1 = this.c(v);
            return this.a.get(v1);
        }

        @Override
        public Iterator iterator() {
            return this.listIterator();
        }

        @Override
        public ListIterator listIterator(int v) {
            class com.google.common.collect.z3.j.a implements ListIterator {
                boolean a;
                final ListIterator b;
                final j c;

                com.google.common.collect.z3.j.a(ListIterator listIterator0) {
                    this.b = listIterator0;
                    super();
                }

                @Override
                public void add(@d4 Object object0) {
                    this.b.add(object0);
                    this.b.previous();
                    this.a = false;
                }

                @Override
                public boolean hasNext() {
                    return this.b.hasPrevious();
                }

                @Override
                public boolean hasPrevious() {
                    return this.b.hasNext();
                }

                @Override
                @d4
                public Object next() {
                    if(!this.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.a = true;
                    return this.b.previous();
                }

                @Override
                public int nextIndex() {
                    int v = this.b.nextIndex();
                    return j.this.d(v);
                }

                @Override
                @d4
                public Object previous() {
                    if(!this.hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.a = true;
                    return this.b.next();
                }

                @Override
                public int previousIndex() {
                    return this.nextIndex() - 1;
                }

                @Override
                public void remove() {
                    c1.e(this.a);
                    this.b.remove();
                    this.a = false;
                }

                @Override
                public void set(@d4 Object object0) {
                    H.g0(this.a);
                    this.b.set(object0);
                }
            }

            int v1 = this.d(v);
            return new com.google.common.collect.z3.j.a(this, this.a.listIterator(v1));
        }

        @Override
        @d4
        public Object remove(int v) {
            int v1 = this.c(v);
            return this.a.remove(v1);
        }

        @Override
        protected void removeRange(int v, int v1) {
            this.subList(v, v1).clear();
        }

        @Override
        @d4
        public Object set(int v, @d4 Object object0) {
            int v1 = this.c(v);
            return this.a.set(v1, object0);
        }

        @Override
        public int size() {
            return this.a.size();
        }

        @Override
        public List subList(int v, int v1) {
            H.f0(v, v1, this.size());
            int v2 = this.d(v1);
            int v3 = this.d(v);
            return z3.B(this.a.subList(v2, v3));
        }
    }

    static final class k extends O2 {
        private final String e;

        k(String s) {
            this.e = s;
        }

        @Override  // com.google.common.collect.O2
        public O2 R(int v, int v1) {
            H.f0(v, v1, this.size());
            return z3.g(this.e.substring(v, v1));
        }

        public Character U(int v) {
            H.C(v, this.size());
            return Character.valueOf(this.e.charAt(v));
        }

        @Override
        public Object get(int v) {
            return this.U(v);
        }

        @Override  // com.google.common.collect.K2
        boolean h() {
            return false;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.O2
        public int indexOf(@a Object object0) {
            return object0 instanceof Character ? this.e.indexOf(((Character)object0).charValue()) : -1;
        }

        @Override  // com.google.common.collect.O2
        @J1.c
        @J1.d
        Object k() {
            return super.k();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.O2
        public int lastIndexOf(@a Object object0) {
            return object0 instanceof Character ? this.e.lastIndexOf(((Character)object0).charValue()) : -1;
        }

        @Override
        public int size() {
            return this.e.length();
        }

        @Override  // com.google.common.collect.O2
        public List subList(int v, int v1) {
            return this.R(v, v1);
        }
    }

    static class l extends AbstractList implements Serializable, RandomAccess {
        final List a;
        final t b;
        private static final long c;

        l(List list0, t t0) {
            this.a = (List)H.E(list0);
            this.b = (t)H.E(t0);
        }

        @Override
        @d4
        public Object get(int v) {
            Object object0 = this.a.get(v);
            return this.b.apply(object0);
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return this.listIterator();
        }

        @Override
        public ListIterator listIterator(int v) {
            class com.google.common.collect.z3.l.a extends m5 {
                final l b;

                com.google.common.collect.z3.l.a(ListIterator listIterator0) {
                    super(listIterator0);
                }

                @Override  // com.google.common.collect.l5
                Object a(Object object0) {
                    return l.this.b.apply(object0);
                }
            }

            return new com.google.common.collect.z3.l.a(this, this.a.listIterator(v));
        }

        @Override
        public Object remove(int v) {
            Object object0 = this.a.remove(v);
            return this.b.apply(object0);
        }

        @Override
        protected void removeRange(int v, int v1) {
            this.a.subList(v, v1).clear();
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    static class m extends AbstractSequentialList implements Serializable {
        final List a;
        final t b;
        private static final long c;

        m(List list0, t t0) {
            this.a = (List)H.E(list0);
            this.b = (t)H.E(t0);
        }

        @Override
        public ListIterator listIterator(int v) {
            class com.google.common.collect.z3.m.a extends m5 {
                final m b;

                com.google.common.collect.z3.m.a(ListIterator listIterator0) {
                    super(listIterator0);
                }

                @Override  // com.google.common.collect.l5
                @d4
                Object a(@d4 Object object0) {
                    return m.this.b.apply(object0);
                }
            }

            return new com.google.common.collect.z3.m.a(this, this.a.listIterator(v));
        }

        @Override
        protected void removeRange(int v, int v1) {
            this.a.subList(v, v1).clear();
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    static class n extends AbstractList implements Serializable, RandomAccess {
        @d4
        final Object a;
        @d4
        final Object b;
        final Object[] c;
        @J1.d
        private static final long d;

        n(@d4 Object object0, @d4 Object object1, Object[] arr_object) {
            this.a = object0;
            this.b = object1;
            this.c = (Object[])H.E(arr_object);
        }

        @Override
        @d4
        public Object get(int v) {
            switch(v) {
                case 0: {
                    return this.a;
                }
                case 1: {
                    return this.b;
                }
                default: {
                    H.C(v, this.size());
                    return this.c[v - 2];
                }
            }
        }

        @Override
        public int size() {
            return f.t(this.c.length, 2);
        }
    }

    public static List A(List list0, int v) {
        H.E(list0);
        H.d(v > 0);
        return list0 instanceof RandomAccess ? new h(list0, v) : new com.google.common.collect.z3.f(list0, v);
    }

    public static List B(List list0) {
        if(list0 instanceof O2) {
            return ((O2)list0).O();
        }
        if(list0 instanceof j) {
            return ((j)list0).b();
        }
        return list0 instanceof RandomAccess ? new i(list0) : new j(list0);
    }

    // 去混淆评级： 低(20)
    static List C(List list0, int v, int v1) {
        class com.google.common.collect.z3.a extends g {
            @J1.d
            private static final long b;

            com.google.common.collect.z3.a(List list0) {
            }

            @Override
            public ListIterator listIterator(int v) {
                return this.a.listIterator(v);
            }
        }


        class com.google.common.collect.z3.b extends c {
            @J1.d
            private static final long b;

            com.google.common.collect.z3.b(List list0) {
            }

            @Override
            public ListIterator listIterator(int v) {
                return this.a.listIterator(v);
            }
        }

        return list0 instanceof RandomAccess ? new com.google.common.collect.z3.a(list0).subList(v, v1) : new com.google.common.collect.z3.b(list0).subList(v, v1);
    }

    public static List D(List list0, t t0) {
        return list0 instanceof RandomAccess ? new l(list0, t0) : new m(list0, t0);
    }

    static boolean a(List list0, int v, Iterable iterable0) {
        ListIterator listIterator0 = list0.listIterator(v);
        boolean z = false;
        for(Object object0: iterable0) {
            listIterator0.add(object0);
            z = true;
        }
        return z;
    }

    public static List b(@d4 Object object0, @d4 Object object1, Object[] arr_object) {
        return new n(object0, object1, arr_object);
    }

    public static List c(@d4 Object object0, Object[] arr_object) {
        return new e(object0, arr_object);
    }

    public static List d(List list0) {
        return A.c(list0);
    }

    @SafeVarargs
    public static List e(List[] arr_list) {
        return z3.d(Arrays.asList(arr_list));
    }

    static List f(Iterable iterable0) [...] // Inlined contents

    public static O2 g(String s) {
        return new k(((String)H.E(s)));
    }

    public static List h(CharSequence charSequence0) {
        return new d(((CharSequence)H.E(charSequence0)));
    }

    @J1.e
    static int i(int v) {
        c1.b(v, "arraySize");
        return com.google.common.primitives.l.z(((long)v) + 5L + ((long)(v / 10)));
    }

    static boolean j(List list0, @a Object object0) {
        if(object0 == H.E(list0)) {
            return true;
        }
        if(!(object0 instanceof List)) {
            return false;
        }
        int v = list0.size();
        if(v != ((List)object0).size()) {
            return false;
        }
        if(list0 instanceof RandomAccess && ((List)object0) instanceof RandomAccess) {
            for(int v1 = 0; v1 < v; ++v1) {
                if(!B.a(list0.get(v1), ((List)object0).get(v1))) {
                    return false;
                }
            }
            return true;
        }
        return q3.s(list0.iterator(), ((List)object0).iterator());
    }

    static int k(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    static int l(List list0, @a Object object0) {
        if(list0 instanceof RandomAccess) {
            return z3.m(list0, object0);
        }
        ListIterator listIterator0 = list0.listIterator();
        while(listIterator0.hasNext()) {
            if(B.a(object0, listIterator0.next())) {
                return listIterator0.previousIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    private static int m(List list0, @a Object object0) {
        int v = list0.size();
        int v1 = 0;
        if(object0 == null) {
            while(v1 < v) {
                if(list0.get(v1) == null) {
                    return v1;
                }
                ++v1;
            }
            return -1;
        }
        while(v1 < v) {
            if(object0.equals(list0.get(v1))) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    static int n(List list0, @a Object object0) {
        if(list0 instanceof RandomAccess) {
            return z3.o(list0, object0);
        }
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            if(B.a(object0, listIterator0.previous())) {
                return listIterator0.nextIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    private static int o(List list0, @a Object object0) {
        if(object0 == null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                if(list0.get(v) == null) {
                    return v;
                }
            }
            return -1;
        }
        for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
            if(object0.equals(list0.get(v1))) {
                return v1;
            }
        }
        return -1;
    }

    static ListIterator p(List list0, int v) {
        return new c(list0).listIterator(v);
    }

    @b(serializable = true)
    public static ArrayList q() {
        return new ArrayList();
    }

    @b(serializable = true)
    public static ArrayList r(Iterable iterable0) {
        H.E(iterable0);
        return iterable0 instanceof Collection ? new ArrayList(((Collection)iterable0)) : z3.s(iterable0.iterator());
    }

    @b(serializable = true)
    public static ArrayList s(Iterator iterator0) {
        ArrayList arrayList0 = z3.q();
        q3.a(arrayList0, iterator0);
        return arrayList0;
    }

    @b(serializable = true)
    @SafeVarargs
    public static ArrayList t(Object[] arr_object) {
        H.E(arr_object);
        ArrayList arrayList0 = new ArrayList(z3.i(arr_object.length));
        Collections.addAll(arrayList0, arr_object);
        return arrayList0;
    }

    @b(serializable = true)
    public static ArrayList u(int v) {
        c1.b(v, "initialArraySize");
        return new ArrayList(v);
    }

    @b(serializable = true)
    public static ArrayList v(int v) {
        return new ArrayList(z3.i(v));
    }

    @J1.c
    @J1.d
    public static CopyOnWriteArrayList w() {
        return new CopyOnWriteArrayList();
    }

    // 去混淆评级： 低(20)
    @J1.c
    @J1.d
    public static CopyOnWriteArrayList x(Iterable iterable0) {
        return iterable0 instanceof Collection ? new CopyOnWriteArrayList(((Collection)iterable0)) : new CopyOnWriteArrayList(z3.r(iterable0));
    }

    @b(serializable = true)
    public static LinkedList y() {
        return new LinkedList();
    }

    @b(serializable = true)
    public static LinkedList z(Iterable iterable0) {
        LinkedList linkedList0 = z3.y();
        p3.a(linkedList0, iterable0);
        return linkedList0;
    }
}

