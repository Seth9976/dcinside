package com.google.common.collect;

import J1.b;
import O1.j;
import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.base.t;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

@b
@j(containerOf = {"C"})
@C1
public final class h4 extends i4 implements I, Serializable {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[y.values().length];
            a.a = arr_v;
            try {
                arr_v[y.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[y.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class com.google.common.collect.h4.b implements t {
        static final com.google.common.collect.h4.b a;

        static {
            com.google.common.collect.h4.b.a = new com.google.common.collect.h4.b();
        }

        public w1 a(h4 h40) {
            return h40.a;
        }

        // 检测为 Lambda 实现
        @Override  // com.google.common.base.t
        public Object apply(Object object0) [...]
    }

    static class c extends c4 implements Serializable {
        static final c4 c;
        private static final long d;

        static {
            c.c = new c();
        }

        public int S(h4 h40, h4 h41) {
            return p1.n().i(h40.a, h41.a).i(h40.b, h41.b).m();
        }

        @Override  // com.google.common.collect.c4
        public int compare(Object object0, Object object1) {
            return this.S(((h4)object0), ((h4)object1));
        }
    }

    static class d implements t {
        static final d a;

        static {
            d.a = new d();
        }

        public w1 a(h4 h40) {
            return h40.b;
        }

        // 检测为 Lambda 实现
        @Override  // com.google.common.base.t
        public Object apply(Object object0) [...]
    }

    final w1 a;
    final w1 b;
    private static final h4 c;
    private static final long d;

    static {
        h4.c = new h4(w1.c(), w1.a());
    }

    private h4(w1 w10, w1 w11) {
        this.a = (w1)H.E(w10);
        this.b = (w1)H.E(w11);
        if(w10.f(w11) > 0 || w10 == w1.a() || w11 == w1.c()) {
            throw new IllegalArgumentException("Invalid range: " + h4.I(w10, w11));
        }
    }

    public Comparable A() {
        return this.a.i();
    }

    public static h4 B(Comparable comparable0, Comparable comparable1) {
        return h4.k(w1.b(comparable0), w1.d(comparable1));
    }

    public static h4 C(Comparable comparable0, Comparable comparable1) {
        return h4.k(w1.b(comparable0), w1.b(comparable1));
    }

    public static h4 D(Comparable comparable0, y y0, Comparable comparable1, y y1) {
        H.E(y0);
        H.E(y1);
        w1 w10 = y0 == y.b ? w1.b(comparable0) : w1.d(comparable0);
        return y1 == y.b ? h4.k(w10, w1.d(comparable1)) : h4.k(w10, w1.b(comparable1));
    }

    static c4 E() {
        return c.c;
    }

    // 去混淆评级： 低(20)
    Object F() {
        return this.equals(h4.c) ? h4.a() : this;
    }

    public static h4 G(Comparable comparable0) {
        return h4.f(comparable0, comparable0);
    }

    public h4 H(h4 h40) {
        int v = this.a.f(h40.a);
        int v1 = this.b.f(h40.b);
        if(v <= 0 && v1 >= 0) {
            return this;
        }
        if(v >= 0 && v1 <= 0) {
            return h40;
        }
        w1 w10 = v > 0 ? h40.a : this.a;
        return v1 < 0 ? h4.k(w10, h40.b) : h4.k(w10, this.b);
    }

    private static String I(w1 w10, w1 w11) {
        StringBuilder stringBuilder0 = new StringBuilder(16);
        w10.g(stringBuilder0);
        stringBuilder0.append("..");
        w11.h(stringBuilder0);
        return stringBuilder0.toString();
    }

    public static h4 J(Comparable comparable0, y y0) {
        switch(y0) {
            case 1: {
                return h4.x(comparable0);
            }
            case 2: {
                return h4.d(comparable0);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    static t K() {
        return (Object object0) -> this.a(((h4)object0));
    }

    public y L() {
        return this.b.n();
    }

    public Comparable M() {
        return this.b.i();
    }

    public static h4 a() {
        return h4.c;
    }

    @Override  // com.google.common.base.I
    @Deprecated
    public boolean apply(Object object0) {
        return this.b(((Comparable)object0));
    }

    @Deprecated
    public boolean b(Comparable comparable0) {
        return this.i(comparable0);
    }

    public static h4 c(Comparable comparable0) {
        return h4.k(w1.d(comparable0), w1.a());
    }

    public static h4 d(Comparable comparable0) {
        return h4.k(w1.c(), w1.b(comparable0));
    }

    public h4 e(B1 b10) {
        H.E(b10);
        w1 w10 = this.a.e(b10);
        w1 w11 = this.b.e(b10);
        return w10 != this.a || w11 != this.b ? h4.k(w10, w11) : this;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.common.base.I
    public boolean equals(@o3.a Object object0) {
        return object0 instanceof h4 && this.a.equals(((h4)object0).a) && this.b.equals(((h4)object0).b);
    }

    public static h4 f(Comparable comparable0, Comparable comparable1) {
        return h4.k(w1.d(comparable0), w1.b(comparable1));
    }

    public static h4 g(Comparable comparable0, Comparable comparable1) {
        return h4.k(w1.d(comparable0), w1.d(comparable1));
    }

    static int h(Comparable comparable0, Comparable comparable1) {
        return comparable0.compareTo(comparable1);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    public boolean i(Comparable comparable0) {
        H.E(comparable0);
        return this.a.k(comparable0) && !this.b.k(comparable0);
    }

    public boolean j(Iterable iterable0) {
        if(p3.C(iterable0)) {
            return true;
        }
        if(iterable0 instanceof SortedSet) {
            Comparator comparator0 = ((SortedSet)iterable0).comparator();
            if(c4.K().equals(comparator0) || comparator0 == null) {
                return this.i(((Comparable)((SortedSet)iterable0).first())) && this.i(((Comparable)((SortedSet)iterable0).last()));
            }
        }
        for(Object object0: iterable0) {
            if(!this.i(((Comparable)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    static h4 k(w1 w10, w1 w11) {
        return new h4(w10, w11);
    }

    public static h4 l(Comparable comparable0, y y0) {
        switch(a.a[y0.ordinal()]) {
            case 1: {
                return h4.p(comparable0);
            }
            case 2: {
                return h4.c(comparable0);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static h4 m(Iterable iterable0) {
        H.E(iterable0);
        if(iterable0 instanceof SortedSet) {
            Comparator comparator0 = ((SortedSet)iterable0).comparator();
            if(c4.K().equals(comparator0) || comparator0 == null) {
                return h4.f(((Comparable)((SortedSet)iterable0).first()), ((Comparable)((SortedSet)iterable0).last()));
            }
        }
        Iterator iterator0 = iterable0.iterator();
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)H.E(((Comparable)object0));
        Comparable comparable1;
        for(comparable1 = comparable0; iterator0.hasNext(); comparable1 = (Comparable)c4.K().D(comparable1, comparable2)) {
            Object object1 = iterator0.next();
            Comparable comparable2 = (Comparable)H.E(((Comparable)object1));
            comparable0 = (Comparable)c4.K().H(comparable0, comparable2);
        }
        return h4.f(comparable0, comparable1);
    }

    public boolean n(h4 h40) {
        return this.a.f(h40.a) <= 0 && this.b.f(h40.b) >= 0;
    }

    public h4 o(h4 h40) {
        if(this.a.f(h40.b) < 0 && h40.a.f(this.b) < 0) {
            throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + h40);
        }
        boolean z = this.a.f(h40.a) < 0;
        h4 h41 = z ? this : h40;
        if(!z) {
            h40 = this;
        }
        return h4.k(h41.b, h40.a);
    }

    public static h4 p(Comparable comparable0) {
        return h4.k(w1.b(comparable0), w1.a());
    }

    public boolean q() {
        w1 w10 = w1.c();
        return this.a != w10;
    }

    public boolean r() {
        w1 w10 = w1.a();
        return this.b != w10;
    }

    public h4 s(h4 h40) {
        int v = this.a.f(h40.a);
        int v1 = this.b.f(h40.b);
        if(v >= 0 && v1 <= 0) {
            return this;
        }
        if(v <= 0 && v1 >= 0) {
            return h40;
        }
        w1 w10 = v < 0 ? h40.a : this.a;
        w1 w11 = v1 > 0 ? h40.b : this.b;
        H.y(w10.f(w11) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, h40);
        return h4.k(w10, w11);
    }

    @Override
    public String toString() {
        return h4.I(this.a, this.b);
    }

    public boolean u(h4 h40) {
        return this.a.f(h40.b) <= 0 && h40.a.f(this.b) <= 0;
    }

    public boolean w() {
        return this.a.equals(this.b);
    }

    public static h4 x(Comparable comparable0) {
        return h4.k(w1.c(), w1.d(comparable0));
    }

    static t y() {
        return (Object object0) -> this.a(((h4)object0));
    }

    public y z() {
        return this.a.m();
    }
}

