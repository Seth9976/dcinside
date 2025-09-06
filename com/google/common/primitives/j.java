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
public final class com.google.common.primitives.j implements Serializable {
    static class a {
    }

    static class com.google.common.primitives.j.b extends AbstractList implements Serializable, RandomAccess {
        private final com.google.common.primitives.j a;

        private com.google.common.primitives.j.b(com.google.common.primitives.j j0) {
            this.a = j0;
        }

        com.google.common.primitives.j.b(com.google.common.primitives.j j0, a j$a0) {
            this(j0);
        }

        public Integer a(int v) {
            return this.a.k(v);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return this.indexOf(object0) >= 0;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 instanceof com.google.common.primitives.j.b) {
                return this.a.equals(((com.google.common.primitives.j.b)object0).a);
            }
            if(!(object0 instanceof List)) {
                return false;
            }
            if(this.size() != ((List)object0).size()) {
                return false;
            }
            int v = this.a.b;
            for(Object object1: ((List)object0)) {
                if(object1 instanceof Integer && this.a.a[v] == ((int)(((Integer)object1)))) {
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
            return object0 instanceof Integer ? this.a.l(((int)(((Integer)object0)))) : -1;
        }

        // 去混淆评级： 低(20)
        @Override
        public int lastIndexOf(@o3.a Object object0) {
            return object0 instanceof Integer ? this.a.o(((int)(((Integer)object0)))) : -1;
        }

        @Override
        public int size() {
            return this.a.p();
        }

        @Override
        public List subList(int v, int v1) {
            return this.a.B(v, v1).d();
        }

        @Override
        public String toString() {
            return this.a.toString();
        }
    }

    public static final class c {
        private int[] a;
        private int b;

        c(int v) {
            this.b = 0;
            this.a = new int[v];
        }

        @O1.a
        public c a(int v) {
            this.g(1);
            int v1 = this.b;
            this.a[v1] = v;
            this.b = v1 + 1;
            return this;
        }

        @O1.a
        public c b(com.google.common.primitives.j j0) {
            this.g(j0.p());
            System.arraycopy(j0.a, j0.b, this.a, this.b, j0.p());
            this.b += j0.p();
            return this;
        }

        @O1.a
        public c c(Iterable iterable0) {
            if(iterable0 instanceof Collection) {
                return this.d(((Collection)iterable0));
            }
            for(Object object0: iterable0) {
                this.a(((int)(((Integer)object0))));
            }
            return this;
        }

        @O1.a
        public c d(Collection collection0) {
            this.g(collection0.size());
            for(Object object0: collection0) {
                int v = this.b;
                this.b = v + 1;
                this.a[v] = (int)(((Integer)object0));
            }
            return this;
        }

        @O1.a
        public c e(int[] arr_v) {
            this.g(arr_v.length);
            System.arraycopy(arr_v, 0, this.a, this.b, arr_v.length);
            this.b += arr_v.length;
            return this;
        }

        public com.google.common.primitives.j f() {
            return this.b == 0 ? com.google.common.primitives.j.d : new com.google.common.primitives.j(this.a, 0, this.b, null);
        }

        private void g(int v) {
            int v1 = this.b + v;
            int[] arr_v = this.a;
            if(v1 > arr_v.length) {
                this.a = Arrays.copyOf(arr_v, c.h(arr_v.length, v1));
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

    private final int[] a;
    private final transient int b;
    private final int c;
    private static final com.google.common.primitives.j d;

    static {
        com.google.common.primitives.j.d = new com.google.common.primitives.j(new int[0]);
    }

    private com.google.common.primitives.j(int[] arr_v) {
        this(arr_v, 0, arr_v.length);
    }

    private com.google.common.primitives.j(int[] arr_v, int v, int v1) {
        this.a = arr_v;
        this.b = v;
        this.c = v1;
    }

    com.google.common.primitives.j(int[] arr_v, int v, int v1, a j$a0) {
        this(arr_v, v, v1);
    }

    // 去混淆评级： 低(20)
    Object A() {
        return this.m() ? com.google.common.primitives.j.d : this;
    }

    public com.google.common.primitives.j B(int v, int v1) {
        H.f0(v, v1, this.p());
        return v == v1 ? com.google.common.primitives.j.d : new com.google.common.primitives.j(this.a, v + this.b, this.b + v1);
    }

    public int[] C() {
        return Arrays.copyOfRange(this.a, this.b, this.c);
    }

    // 去混淆评级： 低(20)
    public com.google.common.primitives.j D() {
        return this.n() ? new com.google.common.primitives.j(this.C()) : this;
    }

    Object E() {
        return this.D();
    }

    public List d() {
        return new com.google.common.primitives.j.b(this, null);
    }

    public static c e() {
        return new c(10);
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof com.google.common.primitives.j)) {
            return false;
        }
        if(this.p() != ((com.google.common.primitives.j)object0).p()) {
            return false;
        }
        for(int v = 0; v < this.p(); ++v) {
            if(this.k(v) != ((com.google.common.primitives.j)object0).k(v)) {
                return false;
            }
        }
        return true;
    }

    public static c f(int v) {
        H.k(v >= 0, "Invalid initialCapacity: %s", v);
        return new c(v);
    }

    public boolean g(int v) {
        return this.l(v) >= 0;
    }

    // 去混淆评级： 低(20)
    public static com.google.common.primitives.j h(Iterable iterable0) {
        return iterable0 instanceof Collection ? com.google.common.primitives.j.i(((Collection)iterable0)) : com.google.common.primitives.j.e().c(iterable0).f();
    }

    @Override
    public int hashCode() {
        int v = this.b;
        int v1 = 1;
        while(v < this.c) {
            v1 = v1 * 0x1F + l.l(this.a[v]);
            ++v;
        }
        return v1;
    }

    // 去混淆评级： 低(20)
    public static com.google.common.primitives.j i(Collection collection0) {
        return collection0.isEmpty() ? com.google.common.primitives.j.d : new com.google.common.primitives.j(l.D(collection0));
    }

    public static com.google.common.primitives.j j(int[] arr_v) {
        return arr_v.length == 0 ? com.google.common.primitives.j.d : new com.google.common.primitives.j(Arrays.copyOf(arr_v, arr_v.length));
    }

    public int k(int v) {
        H.C(v, this.p());
        return this.a[this.b + v];
    }

    public int l(int v) {
        for(int v1 = this.b; v1 < this.c; ++v1) {
            if(this.a[v1] == v) {
                return v1 - this.b;
            }
        }
        return -1;
    }

    public boolean m() {
        return this.c == this.b;
    }

    private boolean n() {
        return this.b > 0 || this.c < this.a.length;
    }

    public int o(int v) {
        for(int v1 = this.c - 1; true; --v1) {
            int v2 = this.b;
            if(v1 < v2) {
                break;
            }
            if(this.a[v1] == v) {
                return v1 - v2;
            }
        }
        return -1;
    }

    public int p() {
        return this.c - this.b;
    }

    public static com.google.common.primitives.j q() {
        return com.google.common.primitives.j.d;
    }

    public static com.google.common.primitives.j r(int v) {
        return new com.google.common.primitives.j(new int[]{v});
    }

    public static com.google.common.primitives.j s(int v, int v1) {
        return new com.google.common.primitives.j(new int[]{v, v1});
    }

    @Override
    public String toString() {
        if(this.m()) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.p() * 5);
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

    public static com.google.common.primitives.j u(int v, int v1, int v2) {
        return new com.google.common.primitives.j(new int[]{v, v1, v2});
    }

    public static com.google.common.primitives.j w(int v, int v1, int v2, int v3) {
        return new com.google.common.primitives.j(new int[]{v, v1, v2, v3});
    }

    public static com.google.common.primitives.j x(int v, int v1, int v2, int v3, int v4) {
        return new com.google.common.primitives.j(new int[]{v, v1, v2, v3, v4});
    }

    public static com.google.common.primitives.j y(int v, int v1, int v2, int v3, int v4, int v5) {
        return new com.google.common.primitives.j(new int[]{v, v1, v2, v3, v4, v5});
    }

    public static com.google.common.primitives.j z(int v, int[] arr_v) {
        H.e(arr_v.length <= 0x7FFFFFFE, "the total number of elements must fit in an int");
        int[] arr_v1 = new int[arr_v.length + 1];
        arr_v1[0] = v;
        System.arraycopy(arr_v, 0, arr_v1, 1, arr_v.length);
        return new com.google.common.primitives.j(arr_v1);
    }
}

