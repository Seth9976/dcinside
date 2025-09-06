package com.google.common.graph;

import J1.a;
import O1.j;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.z;
import com.google.common.collect.D3;
import com.google.common.collect.c4;
import java.util.Comparator;
import java.util.Map;

@a
@j
@x
public final class w {
    static class com.google.common.graph.w.a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            com.google.common.graph.w.a.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.common.graph.w.a.a[b.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.common.graph.w.a.a[b.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.common.graph.w.a.a[b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED;

        private static b[] a() [...] // Inlined contents
    }

    private final b a;
    @o3.a
    private final Comparator b;

    private w(b w$b0, @o3.a Comparator comparator0) {
        this.a = (b)H.E(w$b0);
        this.b = comparator0;
        H.g0((w$b0 == b.d ? 1 : 0) == (comparator0 == null ? 0 : 1));
    }

    w a() [...] // Inlined contents

    public Comparator b() {
        Comparator comparator0 = this.b;
        if(comparator0 == null) {
            throw new UnsupportedOperationException("This ordering does not define a comparator.");
        }
        return comparator0;
    }

    Map c(int v) {
        switch(this.a) {
            case 1: {
                return D3.a0(v);
            }
            case 2: 
            case 3: {
                return D3.e0(v);
            }
            case 4: {
                return D3.g0(this.b());
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static w d() {
        return new w(b.c, null);
    }

    public static w e() {
        return new w(b.d, c4.K());
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof w ? this.a == ((w)object0).a && B.a(this.b, ((w)object0).b) : false;
    }

    public static w f(Comparator comparator0) {
        Comparator comparator1 = (Comparator)H.E(comparator0);
        return new w(b.d, comparator1);
    }

    public static w g() {
        return new w(b.b, null);
    }

    public b h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b});
    }

    public static w i() {
        return new w(b.a, null);
    }

    @Override
    public String toString() {
        com.google.common.base.z.b z$b0 = z.c(this).f("type", this.a);
        Comparator comparator0 = this.b;
        if(comparator0 != null) {
            z$b0.f("comparator", comparator0);
        }
        return z$b0.toString();
    }
}

