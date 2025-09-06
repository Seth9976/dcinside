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

@b
@f
public final class n {
    static final class a {
        private static final byte[] a;

        static {
            byte[] arr_b = new byte[0x80];
            Arrays.fill(arr_b, -1);
            for(int v1 = 0; v1 < 10; ++v1) {
                arr_b[v1 + 0x30] = (byte)v1;
            }
            for(int v = 0; v < 26; ++v) {
                arr_b[v + 65] = (byte)(v + 10);
                arr_b[v + 97] = (byte)(v + 10);
            }
            a.a = arr_b;
        }

        static int a(char c) {
            return c < 0x80 ? a.a[c] : -1;
        }
    }

    static enum com.google.common.primitives.n.b implements Comparator {
        INSTANCE;

        private static com.google.common.primitives.n.b[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((long[])object0), ((long[])object1));
        }

        public int g(long[] arr_v, long[] arr_v1) {
            int v = Math.min(arr_v.length, arr_v1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = n.e(arr_v[v1], arr_v1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_v.length - arr_v1.length;
        }

        @Override
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @b
    static class c extends AbstractList implements Serializable, RandomAccess {
        final long[] a;
        final int b;
        final int c;
        private static final long d;

        c(long[] arr_v) {
            this(arr_v, 0, arr_v.length);
        }

        c(long[] arr_v, int v, int v1) {
            this.a = arr_v;
            this.b = v;
            this.c = v1;
        }

        public Long a(int v) {
            H.C(v, this.size());
            return (long)this.a[this.b + v];
        }

        public Long b(int v, Long long0) {
            H.C(v, this.size());
            long v1 = this.a[this.b + v];
            this.a[this.b + v] = (long)(((Long)H.E(long0)));
            return v1;
        }

        long[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Long && n.n(this.a, ((long)(((Long)object0))), this.b, this.c) != -1;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 instanceof c) {
                int v = this.size();
                if(((c)object0).size() != v) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a[this.b + v1] != ((c)object0).a[((c)object0).b + v1]) {
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
                v1 = v1 * 0x1F + n.l(this.a[v]);
                ++v;
            }
            return v1;
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Long) {
                int v = n.n(this.a, ((long)(((Long)object0))), this.b, this.c);
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
            if(object0 instanceof Long) {
                int v = n.r(this.a, ((long)(((Long)object0))), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Long)object0));
        }

        @Override
        public int size() {
            return this.c - this.b;
        }

        @Override
        public List subList(int v, int v1) {
            H.f0(v, v1, this.size());
            return v == v1 ? Collections.emptyList() : new c(this.a, v + this.b, this.b + v1);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(this.size() * 10);
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

    static final class d extends i implements Serializable {
        static final i c = null;
        private static final long d = 1L;

        static {
            d.c = new d();
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.o(((Long)object0));
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.p(((String)object0));
        }

        protected String o(Long long0) {
            return long0.toString();
        }

        protected Long p(String s) {
            return Long.decode(s);
        }

        private Object q() {
            return d.c;
        }

        @Override
        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static final int a = 8;
    public static final long b = 0x4000000000000000L;

    public static void A(long[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        Arrays.sort(arr_v, v, v1);
        n.w(arr_v, v, v1);
    }

    public static i B() {
        return d.c;
    }

    public static long[] C(Collection collection0) {
        if(collection0 instanceof c) {
            return ((c)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        long[] arr_v = new long[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_v[v] = ((Number)H.E(arr_object[v])).longValue();
        }
        return arr_v;
    }

    public static byte[] D(long v) {
        byte[] arr_b = new byte[8];
        for(int v1 = 7; v1 >= 0; --v1) {
            arr_b[v1] = (byte)(((int)(0xFFL & v)));
            v >>= 8;
        }
        return arr_b;
    }

    @o3.a
    public static Long E(String s) {
        return n.F(s, 10);
    }

    @o3.a
    public static Long F(String s, int v) {
        int v1 = 0;
        if(((String)H.E(s)).isEmpty()) {
            return null;
        }
        if(v < 2 || v > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + v);
        }
        if(s.charAt(0) == 45) {
            v1 = 1;
        }
        if(v1 == s.length()) {
            return null;
        }
        int v2 = v1 + 1;
        int v3 = a.a(s.charAt(v1));
        if(v3 >= 0 && v3 < v) {
            long v4 = (long)(-v3);
            while(v2 < s.length()) {
                int v5 = a.a(s.charAt(v2));
                if(v5 >= 0 && v5 < v && v4 >= 0x8000000000000000L / ((long)v)) {
                    long v6 = v4 * ((long)v);
                    if(v6 < (((long)v5) ^ 0x8000000000000000L)) {
                        return null;
                    }
                    v4 = v6 - ((long)v5);
                    ++v2;
                    continue;
                }
                return null;
            }
            if(v1 != 0) {
                return v4;
            }
            return v4 == 0x8000000000000000L ? null : ((long)(-v4));
        }
        return null;
    }

    public static List c(long[] arr_v) {
        return arr_v.length == 0 ? Collections.emptyList() : new c(arr_v);
    }

    private static int d(long v) {
        H.p(v == ((long)(((int)v))), "the total number of elements (%s) in the arrays must fit in an int", v);
        return (int)v;
    }

    public static int e(long v, long v1) {
        int v2 = Long.compare(v, v1);
        if(v2 < 0) {
            return -1;
        }
        return v2 <= 0 ? 0 : 1;
    }

    public static long[] f(long[][] arr2_v) {
        long v = 0L;
        for(int v1 = 0; v1 < arr2_v.length; ++v1) {
            v += (long)arr2_v[v1].length;
        }
        long[] arr_v = new long[n.d(v)];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_v.length; ++v2) {
            long[] arr_v1 = arr2_v[v2];
            System.arraycopy(arr_v1, 0, arr_v, v3, arr_v1.length);
            v3 += arr_v1.length;
        }
        return arr_v;
    }

    public static long g(long v, long v1, long v2) {
        H.s(v1 <= v2, "min (%s) must be less than or equal to max (%s)", v1, v2);
        return Math.min(Math.max(v, v1), v2);
    }

    public static boolean h(long[] arr_v, long v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public static long[] i(long[] arr_v, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_v.length >= v ? arr_v : Arrays.copyOf(arr_v, v + v1);
    }

    public static long j(byte[] arr_b) {
        H.m(arr_b.length >= 8, "array too small: %s < %s", arr_b.length, 8);
        return n.k(arr_b[0], arr_b[1], arr_b[2], arr_b[3], arr_b[4], arr_b[5], arr_b[6], arr_b[7]);
    }

    public static long k(byte b, byte b1, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7) {
        return (((long)b1) & 0xFFL) << 0x30 | (((long)b) & 0xFFL) << 56 | (((long)b2) & 0xFFL) << 40 | (((long)b3) & 0xFFL) << 0x20 | (((long)b4) & 0xFFL) << 24 | (((long)b5) & 0xFFL) << 16 | (((long)b6) & 0xFFL) << 8 | ((long)b7) & 0xFFL;
    }

    public static int l(long v) [...] // Inlined contents

    public static int m(long[] arr_v, long v) {
        return n.n(arr_v, v, 0, arr_v.length);
    }

    private static int n(long[] arr_v, long v, int v1, int v2) {
        while(v1 < v2) {
            if(arr_v[v1] == v) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    public static int o(long[] arr_v, long[] arr_v1) {
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

    public static String p(String s, long[] arr_v) {
        H.E(s);
        if(arr_v.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_v.length * 10);
        stringBuilder0.append(arr_v[0]);
        for(int v = 1; v < arr_v.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(arr_v[v]);
        }
        return stringBuilder0.toString();
    }

    public static int q(long[] arr_v, long v) {
        return n.r(arr_v, v, 0, arr_v.length);
    }

    private static int r(long[] arr_v, long v, int v1, int v2) {
        for(int v3 = v2 - 1; v3 >= v1; --v3) {
            if(arr_v[v3] == v) {
                return v3;
            }
        }
        return -1;
    }

    public static Comparator s() {
        return com.google.common.primitives.n.b.a;
    }

    public static long t(long[] arr_v) {
        H.d(arr_v.length > 0);
        long v1 = arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            long v2 = arr_v[v];
            if(v2 > v1) {
                v1 = v2;
            }
        }
        return v1;
    }

    public static long u(long[] arr_v) {
        H.d(arr_v.length > 0);
        long v1 = arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            long v2 = arr_v[v];
            if(v2 < v1) {
                v1 = v2;
            }
        }
        return v1;
    }

    public static void v(long[] arr_v) {
        H.E(arr_v);
        n.w(arr_v, 0, arr_v.length);
    }

    public static void w(long[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            long v3 = arr_v[v];
            arr_v[v] = arr_v[v2];
            arr_v[v2] = v3;
            ++v;
        }
    }

    public static void x(long[] arr_v, int v) {
        n.y(arr_v, v, 0, arr_v.length);
    }

    public static void y(long[] arr_v, int v, int v1, int v2) {
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
        n.w(arr_v, v1, v5);
        n.w(arr_v, v5, v2);
        n.w(arr_v, v1, v2);
    }

    public static void z(long[] arr_v) {
        H.E(arr_v);
        n.A(arr_v, 0, arr_v.length);
    }
}

