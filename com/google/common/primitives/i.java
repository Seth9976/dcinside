package com.google.common.primitives;

import J1.b;
import O1.j;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

@b
@j
@f
public final class i implements Serializable {
    static class a {
    }

    static class com.google.common.primitives.i.b extends AbstractList implements Serializable, RandomAccess {
        private final i a;

        private com.google.common.primitives.i.b(i i0) {
            this.a = i0;
        }

        com.google.common.primitives.i.b(i i0, a i$a0) {
            this(i0);
        }

        public Double a(int v) {
            return this.a.m(v);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return this.indexOf(object0) >= 0;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 instanceof com.google.common.primitives.i.b) {
                return this.a.equals(((com.google.common.primitives.i.b)object0).a);
            }
            if(!(object0 instanceof List)) {
                return false;
            }
            if(this.size() != ((List)object0).size()) {
                return false;
            }
            int v = this.a.b;
            for(Object object1: ((List)object0)) {
                if(object1 instanceof Double && i.e(this.a.a[v], ((double)(((Double)object1))))) {
                    ++v;
                    continue;
                }
                return false;
            }
            return true;
        }

        @Override
        public Object get(int v) {
            return this.a(v);
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        // 去混淆评级： 低(20)
        @Override
        public int indexOf(@o3.a Object object0) {
            return object0 instanceof Double ? this.a.n(((double)(((Double)object0)))) : -1;
        }

        // 去混淆评级： 低(20)
        @Override
        public int lastIndexOf(@o3.a Object object0) {
            return object0 instanceof Double ? this.a.q(((double)(((Double)object0)))) : -1;
        }

        @Override
        public int size() {
            return this.a.r();
        }

        @Override
        public List subList(int v, int v1) {
            return this.a.D(v, v1).f();
        }

        @Override
        public String toString() {
            return this.a.toString();
        }
    }

    public static final class c {
        private double[] a;
        private int b;

        c(int v) {
            this.b = 0;
            this.a = new double[v];
        }

        @O1.a
        public c a(double f) {
            this.g(1);
            int v = this.b;
            this.a[v] = f;
            this.b = v + 1;
            return this;
        }

        @O1.a
        public c b(i i0) {
            this.g(i0.r());
            System.arraycopy(i0.a, i0.b, this.a, this.b, i0.r());
            this.b += i0.r();
            return this;
        }

        @O1.a
        public c c(Iterable iterable0) {
            if(iterable0 instanceof Collection) {
                return this.d(((Collection)iterable0));
            }
            for(Object object0: iterable0) {
                this.a(((double)(((Double)object0))));
            }
            return this;
        }

        @O1.a
        public c d(Collection collection0) {
            this.g(collection0.size());
            for(Object object0: collection0) {
                int v = this.b;
                this.b = v + 1;
                this.a[v] = (double)(((Double)object0));
            }
            return this;
        }

        @O1.a
        public c e(double[] arr_f) {
            this.g(arr_f.length);
            System.arraycopy(arr_f, 0, this.a, this.b, arr_f.length);
            this.b += arr_f.length;
            return this;
        }

        public i f() {
            return this.b == 0 ? i.d : new i(this.a, 0, this.b, null);
        }

        private void g(int v) {
            int v1 = this.b + v;
            double[] arr_f = this.a;
            if(v1 > arr_f.length) {
                this.a = Arrays.copyOf(arr_f, c.h(arr_f.length, v1));
            }
        }

        private static int h(int v, int v1) {
            if(v1 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int v2 = v + (v >> 1) + 1 >= v1 ? v + (v >> 1) + 1 : Integer.highestOneBit(v1 - 1) << 1;
            return v2 >= 0 ? v2 : 0x7FFFFFFF;
        }
    }

    private final double[] a;
    private final transient int b;
    private final int c;
    private static final i d;

    static {
        i.d = new i(new double[0]);
    }

    private i(double[] arr_f) {
        this(arr_f, 0, arr_f.length);
    }

    private i(double[] arr_f, int v, int v1) {
        this.a = arr_f;
        this.b = v;
        this.c = v1;
    }

    i(double[] arr_f, int v, int v1, a i$a0) {
        this(arr_f, v, v1);
    }

    public static i A(double f, double f1, double f2, double f3, double f4, double f5) {
        return new i(new double[]{f, f1, f2, f3, f4, f5});
    }

    public static i B(double f, double[] arr_f) {
        H.e(arr_f.length <= 0x7FFFFFFE, "the total number of elements must fit in an int");
        double[] arr_f1 = new double[arr_f.length + 1];
        arr_f1[0] = f;
        System.arraycopy(arr_f, 0, arr_f1, 1, arr_f.length);
        return new i(arr_f1);
    }

    // 去混淆评级： 低(20)
    Object C() {
        return this.o() ? i.d : this;
    }

    public i D(int v, int v1) {
        H.f0(v, v1, this.r());
        return v == v1 ? i.d : new i(this.a, v + this.b, this.b + v1);
    }

    public double[] E() {
        return Arrays.copyOfRange(this.a, this.b, this.c);
    }

    // 去混淆评级： 低(20)
    public i F() {
        return this.p() ? new i(this.E()) : this;
    }

    Object G() {
        return this.F();
    }

    private static boolean e(double f, double f1) {
        return Double.doubleToLongBits(f) == Double.doubleToLongBits(f1);
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(this.r() != ((i)object0).r()) {
            return false;
        }
        for(int v = 0; v < this.r(); ++v) {
            if(!i.e(this.m(v), ((i)object0).m(v))) {
                return false;
            }
        }
        return true;
    }

    public List f() {
        return new com.google.common.primitives.i.b(this, null);
    }

    public static c g() {
        return new c(10);
    }

    public static c h(int v) {
        H.k(v >= 0, "Invalid initialCapacity: %s", v);
        return new c(v);
    }

    @Override
    public int hashCode() {
        int v = this.b;
        int v1 = 1;
        while(v < this.c) {
            v1 = v1 * 0x1F + d.j(this.a[v]);
            ++v;
        }
        return v1;
    }

    public boolean i(double f) {
        return this.n(f) >= 0;
    }

    // 去混淆评级： 低(20)
    public static i j(Iterable iterable0) {
        return iterable0 instanceof Collection ? i.k(((Collection)iterable0)) : i.g().c(iterable0).f();
    }

    // 去混淆评级： 低(20)
    public static i k(Collection collection0) {
        return collection0.isEmpty() ? i.d : new i(d.B(collection0));
    }

    public static i l(double[] arr_f) {
        return arr_f.length == 0 ? i.d : new i(Arrays.copyOf(arr_f, arr_f.length));
    }

    public double m(int v) {
        H.C(v, this.r());
        return this.a[this.b + v];
    }

    public int n(double f) {
        for(int v = this.b; v < this.c; ++v) {
            if(i.e(this.a[v], f)) {
                return v - this.b;
            }
        }
        return -1;
    }

    public boolean o() {
        return this.c == this.b;
    }

    private boolean p() {
        return this.b > 0 || this.c < this.a.length;
    }

    public int q(double f) {
        for(int v = this.c - 1; v >= this.b; --v) {
            if(i.e(this.a[v], f)) {
                return v - this.b;
            }
        }
        return -1;
    }

    public int r() {
        return this.c - this.b;
    }

    public static i s() {
        return i.d;
    }

    @Override
    public String toString() {
        if(this.o()) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.r() * 5);
        stringBuilder0.append('[');
        stringBuilder0.append(this.a[this.b]);
        int v = this.b;
        while(true) {
            ++v;
            if(v >= this.c) {
                break;
            }
            stringBuilder0.append(", ");
            stringBuilder0.append(this.a[v]);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    public static i u(double f) {
        return new i(new double[]{f});
    }

    public static i w(double f, double f1) {
        return new i(new double[]{f, f1});
    }

    public static i x(double f, double f1, double f2) {
        return new i(new double[]{f, f1, f2});
    }

    public static i y(double f, double f1, double f2, double f3) {
        return new i(new double[]{f, f1, f2, f3});
    }

    public static i z(double f, double f1, double f2, double f3, double f4) {
        return new i(new double[]{f, f1, f2, f3, f4});
    }
}

