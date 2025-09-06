package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import com.google.common.base.i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@b(emulated = true)
@f
public final class l extends m {
    @b
    static class a extends AbstractList implements Serializable, RandomAccess {
        final int[] a;
        final int b;
        final int c;
        private static final long d;

        a(int[] arr_v) {
            this(arr_v, 0, arr_v.length);
        }

        a(int[] arr_v, int v, int v1) {
            this.a = arr_v;
            this.b = v;
            this.c = v1;
        }

        public Integer a(int v) {
            H.C(v, this.size());
            return (int)this.a[this.b + v];
        }

        public Integer b(int v, Integer integer0) {
            H.C(v, this.size());
            int v1 = this.a[this.b + v];
            this.a[this.b + v] = (int)(((Integer)H.E(integer0)));
            return v1;
        }

        int[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Integer && l.n(this.a, ((int)(((Integer)object0))), this.b, this.c) != -1;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 instanceof a) {
                int v = this.size();
                if(((a)object0).size() != v) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a[this.b + v1] != ((a)object0).a[((a)object0).b + v1]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(object0);
        }

        @Override
        public Object get(int v) {
            return this.a(v);
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

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Integer) {
                int v = l.n(this.a, ((int)(((Integer)object0))), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int lastIndexOf(@o3.a Object object0) {
            if(object0 instanceof Integer) {
                int v = l.r(this.a, ((int)(((Integer)object0))), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Integer)object0));
        }

        @Override
        public int size() {
            return this.c - this.b;
        }

        @Override
        public List subList(int v, int v1) {
            H.f0(v, v1, this.size());
            return v == v1 ? Collections.emptyList() : new a(this.a, v + this.b, this.b + v1);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(this.size() * 5);
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
    }

    static final class com.google.common.primitives.l.b extends i implements Serializable {
        static final i c = null;
        private static final long d = 1L;

        static {
            com.google.common.primitives.l.b.c = new com.google.common.primitives.l.b();
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.o(((Integer)object0));
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.p(((String)object0));
        }

        protected String o(Integer integer0) {
            return integer0.toString();
        }

        protected Integer p(String s) {
            return Integer.decode(s);
        }

        private Object q() {
            return com.google.common.primitives.l.b.c;
        }

        @Override
        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    static enum c implements Comparator {
        INSTANCE;

        private static c[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((int[])object0), ((int[])object1));
        }

        public int g(int[] arr_v, int[] arr_v1) {
            int v = Math.min(arr_v.length, arr_v1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = l.e(arr_v[v1], arr_v1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_v.length - arr_v1.length;
        }

        @Override
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static final int a = 4;
    public static final int b = 0x40000000;

    public static void A(int[] arr_v) {
        H.E(arr_v);
        l.B(arr_v, 0, arr_v.length);
    }

    public static void B(int[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        Arrays.sort(arr_v, v, v1);
        l.w(arr_v, v, v1);
    }

    public static i C() {
        return com.google.common.primitives.l.b.c;
    }

    public static int[] D(Collection collection0) {
        if(collection0 instanceof a) {
            return ((a)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        int[] arr_v = new int[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_v[v] = ((Number)H.E(arr_object[v])).intValue();
        }
        return arr_v;
    }

    public static byte[] E(int v) {
        return new byte[]{((byte)(v >> 24)), ((byte)(v >> 16)), ((byte)(v >> 8)), ((byte)v)};
    }

    @o3.a
    public static Integer F(String s) {
        return l.G(s, 10);
    }

    @o3.a
    public static Integer G(String s, int v) {
        Long long0 = n.F(s, v);
        return long0 == null || ((long)long0) != ((long)long0.intValue()) ? null : long0.intValue();
    }

    public static List c(int[] arr_v) {
        return arr_v.length == 0 ? Collections.emptyList() : new a(arr_v);
    }

    public static int d(long v) {
        H.p(((long)(((int)v))) == v, "Out of range: %s", v);
        return (int)v;
    }

    public static int e(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v <= v1 ? 0 : 1;
    }

    public static int[] f(int[][] arr2_v) {
        int v1 = 0;
        for(int v = 0; v < arr2_v.length; ++v) {
            v1 += arr2_v[v].length;
        }
        int[] arr_v = new int[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_v.length; ++v2) {
            int[] arr_v1 = arr2_v[v2];
            System.arraycopy(arr_v1, 0, arr_v, v3, arr_v1.length);
            v3 += arr_v1.length;
        }
        return arr_v;
    }

    public static int g(int v, int v1, int v2) {
        H.m(v1 <= v2, "min (%s) must be less than or equal to max (%s)", v1, v2);
        return Math.min(Math.max(v, v1), v2);
    }

    public static boolean h(int[] arr_v, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public static int[] i(int[] arr_v, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_v.length >= v ? arr_v : Arrays.copyOf(arr_v, v + v1);
    }

    public static int j(byte[] arr_b) {
        H.m(arr_b.length >= 4, "array too small: %s < %s", arr_b.length, 4);
        return l.k(arr_b[0], arr_b[1], arr_b[2], arr_b[3]);
    }

    public static int k(byte b, byte b1, byte b2, byte b3) {
        return b << 24 | (b1 & 0xFF) << 16 | (b2 & 0xFF) << 8 | b3 & 0xFF;
    }

    public static int l(int v) {
        return v;
    }

    public static int m(int[] arr_v, int v) {
        return l.n(arr_v, v, 0, arr_v.length);
    }

    private static int n(int[] arr_v, int v, int v1, int v2) {
        while(v1 < v2) {
            if(arr_v[v1] == v) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    public static int o(int[] arr_v, int[] arr_v1) {
        H.F(arr_v, "array");
        H.F(arr_v1, "target");
        if(arr_v1.length == 0) {
            return 0;
        }
        int v = 0;
    label_5:
        while(v < arr_v.length - arr_v1.length + 1) {
            int v1 = 0;
            while(v1 < arr_v1.length) {
                if(arr_v[v + v1] == arr_v1[v1]) {
                    ++v1;
                    continue;
                }
                ++v;
                continue label_5;
            }
            return v;
        }
        return -1;
    }

    public static String p(String s, int[] arr_v) {
        H.E(s);
        if(arr_v.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_v.length * 5);
        stringBuilder0.append(arr_v[0]);
        for(int v = 1; v < arr_v.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(arr_v[v]);
        }
        return stringBuilder0.toString();
    }

    public static int q(int[] arr_v, int v) {
        return l.r(arr_v, v, 0, arr_v.length);
    }

    private static int r(int[] arr_v, int v, int v1, int v2) {
        for(int v3 = v2 - 1; v3 >= v1; --v3) {
            if(arr_v[v3] == v) {
                return v3;
            }
        }
        return -1;
    }

    public static Comparator s() {
        return c.a;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int t(int[] arr_v) {
        H.d(arr_v.length > 0);
        int v1 = arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            int v2 = arr_v[v];
            if(v2 > v1) {
                v1 = v2;
            }
        }
        return v1;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int u(int[] arr_v) {
        H.d(arr_v.length > 0);
        int v1 = arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            int v2 = arr_v[v];
            if(v2 < v1) {
                v1 = v2;
            }
        }
        return v1;
    }

    public static void v(int[] arr_v) {
        H.E(arr_v);
        l.w(arr_v, 0, arr_v.length);
    }

    public static void w(int[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            int v3 = arr_v[v];
            arr_v[v] = arr_v[v2];
            arr_v[v2] = v3;
            ++v;
        }
    }

    public static void x(int[] arr_v, int v) {
        l.y(arr_v, v, 0, arr_v.length);
    }

    public static void y(int[] arr_v, int v, int v1, int v2) {
        H.E(arr_v);
        H.f0(v1, v2, arr_v.length);
        if(arr_v.length <= 1) {
            return;
        }
        int v3 = v2 - v1;
        int v4 = -v % v3;
        if(v4 < 0) {
            v4 += v3;
        }
        int v5 = v4 + v1;
        if(v5 == v1) {
            return;
        }
        l.w(arr_v, v1, v5);
        l.w(arr_v, v5, v2);
        l.w(arr_v, v1, v2);
    }

    public static int z(long v) {
        if(v > 0x7FFFFFFFL) {
            return 0x7FFFFFFF;
        }
        return v >= 0xFFFFFFFF80000000L ? ((int)v) : 0x80000000;
    }
}

