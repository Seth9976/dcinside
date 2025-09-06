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
public final class r extends s {
    static enum a implements Comparator {
        INSTANCE;

        private static a[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((short[])object0), ((short[])object1));
        }

        public int g(short[] arr_v, short[] arr_v1) {
            int v = Math.min(arr_v.length, arr_v1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = r.e(arr_v[v1], arr_v1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_v.length - arr_v1.length;
        }

        @Override
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @b
    static class com.google.common.primitives.r.b extends AbstractList implements Serializable, RandomAccess {
        final short[] a;
        final int b;
        final int c;
        private static final long d;

        com.google.common.primitives.r.b(short[] arr_v) {
            this(arr_v, 0, arr_v.length);
        }

        com.google.common.primitives.r.b(short[] arr_v, int v, int v1) {
            this.a = arr_v;
            this.b = v;
            this.c = v1;
        }

        public Short a(int v) {
            H.C(v, this.size());
            return (short)this.a[this.b + v];
        }

        public Short b(int v, Short short0) {
            H.C(v, this.size());
            int v1 = this.a[this.b + v];
            this.a[this.b + v] = (short)(((Short)H.E(short0)));
            return (short)v1;
        }

        short[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Short && r.n(this.a, ((short)(((Short)object0))), this.b, this.c) != -1;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 instanceof com.google.common.primitives.r.b) {
                int v = this.size();
                if(((com.google.common.primitives.r.b)object0).size() != v) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a[this.b + v1] != ((com.google.common.primitives.r.b)object0).a[((com.google.common.primitives.r.b)object0).b + v1]) {
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
                v1 = v1 * 0x1F + r.l(this.a[v]);
                ++v;
            }
            return v1;
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Short) {
                int v = r.n(this.a, ((short)(((Short)object0))), this.b, this.c);
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
            if(object0 instanceof Short) {
                int v = r.r(this.a, ((short)(((Short)object0))), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Short)object0));
        }

        @Override
        public int size() {
            return this.c - this.b;
        }

        @Override
        public List subList(int v, int v1) {
            H.f0(v, v1, this.size());
            return v == v1 ? Collections.emptyList() : new com.google.common.primitives.r.b(this.a, v + this.b, this.b + v1);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(this.size() * 6);
            stringBuilder0.append('[');
            stringBuilder0.append(((int)this.a[this.b]));
            int v = this.b;
            while(true) {
                ++v;
                if(v >= this.c) {
                    break;
                }
                stringBuilder0.append(", ");
                stringBuilder0.append(((int)this.a[v]));
            }
            stringBuilder0.append(']');
            return stringBuilder0.toString();
        }
    }

    static final class c extends i implements Serializable {
        static final i c = null;
        private static final long d = 1L;

        static {
            c.c = new c();
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.o(((Short)object0));
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.p(((String)object0));
        }

        protected String o(Short short0) {
            return short0.toString();
        }

        protected Short p(String s) {
            return Short.decode(s);
        }

        private Object q() {
            return c.c;
        }

        @Override
        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    public static final int a = 2;
    public static final short b = 0x4000;

    public static void A(short[] arr_v) {
        H.E(arr_v);
        r.B(arr_v, 0, arr_v.length);
    }

    public static void B(short[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        Arrays.sort(arr_v, v, v1);
        r.w(arr_v, v, v1);
    }

    public static i C() {
        return c.c;
    }

    public static short[] D(Collection collection0) {
        if(collection0 instanceof com.google.common.primitives.r.b) {
            return ((com.google.common.primitives.r.b)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        short[] arr_v = new short[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_v[v] = ((Number)H.E(arr_object[v])).shortValue();
        }
        return arr_v;
    }

    @J1.c
    public static byte[] E(short v) {
        return new byte[]{((byte)(v >> 8)), ((byte)v)};
    }

    public static List c(short[] arr_v) {
        return arr_v.length == 0 ? Collections.emptyList() : new com.google.common.primitives.r.b(arr_v);
    }

    public static short d(long v) {
        H.p(((long)(((short)(((int)v))))) == v, "Out of range: %s", v);
        return (short)(((int)v));
    }

    public static int e(short v, short v1) {
        return v - v1;
    }

    public static short[] f(short[][] arr2_v) {
        int v1 = 0;
        for(int v = 0; v < arr2_v.length; ++v) {
            v1 += arr2_v[v].length;
        }
        short[] arr_v = new short[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_v.length; ++v2) {
            short[] arr_v1 = arr2_v[v2];
            System.arraycopy(arr_v1, 0, arr_v, v3, arr_v1.length);
            v3 += arr_v1.length;
        }
        return arr_v;
    }

    public static short g(short v, short v1, short v2) {
        H.m(v1 <= v2, "min (%s) must be less than or equal to max (%s)", ((int)v1), ((int)v2));
        if(v < v1) {
            return v1;
        }
        return v < v2 ? v : v2;
    }

    public static boolean h(short[] arr_v, short v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public static short[] i(short[] arr_v, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_v.length >= v ? arr_v : Arrays.copyOf(arr_v, v + v1);
    }

    @J1.c
    public static short j(byte[] arr_b) {
        H.m(arr_b.length >= 2, "array too small: %s < %s", arr_b.length, 2);
        return r.k(arr_b[0], arr_b[1]);
    }

    @J1.c
    public static short k(byte b, byte b1) {
        return (short)(b << 8 | b1 & 0xFF);
    }

    public static int l(short v) {
        return v;
    }

    public static int m(short[] arr_v, short v) {
        return r.n(arr_v, v, 0, arr_v.length);
    }

    private static int n(short[] arr_v, short v, int v1, int v2) {
        while(v1 < v2) {
            if(arr_v[v1] == v) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    public static int o(short[] arr_v, short[] arr_v1) {
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

    public static String p(String s, short[] arr_v) {
        H.E(s);
        if(arr_v.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_v.length * 6);
        stringBuilder0.append(((int)arr_v[0]));
        for(int v = 1; v < arr_v.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(((int)arr_v[v]));
        }
        return stringBuilder0.toString();
    }

    public static int q(short[] arr_v, short v) {
        return r.r(arr_v, v, 0, arr_v.length);
    }

    private static int r(short[] arr_v, short v, int v1, int v2) {
        for(int v3 = v2 - 1; v3 >= v1; --v3) {
            if(arr_v[v3] == v) {
                return v3;
            }
        }
        return -1;
    }

    public static Comparator s() {
        return a.a;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short t(short[] arr_v) {
        H.d(arr_v.length > 0);
        short v1 = arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            short v2 = arr_v[v];
            if(v2 > v1) {
                v1 = v2;
            }
        }
        return v1;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short u(short[] arr_v) {
        H.d(arr_v.length > 0);
        short v1 = arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            short v2 = arr_v[v];
            if(v2 < v1) {
                v1 = v2;
            }
        }
        return v1;
    }

    public static void v(short[] arr_v) {
        H.E(arr_v);
        r.w(arr_v, 0, arr_v.length);
    }

    public static void w(short[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            short v3 = arr_v[v];
            arr_v[v] = arr_v[v2];
            arr_v[v2] = v3;
            ++v;
        }
    }

    public static void x(short[] arr_v, int v) {
        r.y(arr_v, v, 0, arr_v.length);
    }

    public static void y(short[] arr_v, int v, int v1, int v2) {
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
        r.w(arr_v, v1, v5);
        r.w(arr_v, v5, v2);
        r.w(arr_v, v1, v2);
    }

    public static short z(long v) {
        if(v > 0x7FFFL) {
            return 0x7FFF;
        }
        return v < 0xFFFFFFFFFFFF8000L ? 0xFFFF8000 : ((short)(((int)v)));
    }
}

