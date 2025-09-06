package com.google.common.primitives;

import J1.b;
import J1.d;
import com.google.common.base.H;
import com.google.common.base.P;
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
public final class g extends h {
    @b
    static class a extends AbstractList implements Serializable, RandomAccess {
        final float[] a;
        final int b;
        final int c;
        private static final long d;

        a(float[] arr_f) {
            this(arr_f, 0, arr_f.length);
        }

        a(float[] arr_f, int v, int v1) {
            this.a = arr_f;
            this.b = v;
            this.c = v1;
        }

        public Float a(int v) {
            H.C(v, this.size());
            return (float)this.a[this.b + v];
        }

        public Float b(int v, Float float0) {
            H.C(v, this.size());
            float f = this.a[this.b + v];
            this.a[this.b + v] = (float)(((Float)H.E(float0)));
            return f;
        }

        float[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Float && g.k(this.a, ((float)(((Float)object0))), this.b, this.c) != -1;
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
                v1 = v1 * 0x1F + g.i(this.a[v]);
                ++v;
            }
            return v1;
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Float) {
                int v = g.k(this.a, ((float)(((Float)object0))), this.b, this.c);
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
            if(object0 instanceof Float) {
                int v = g.p(this.a, ((float)(((Float)object0))), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Float)object0));
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
            StringBuilder stringBuilder0 = new StringBuilder(this.size() * 12);
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

    static final class com.google.common.primitives.g.b extends i implements Serializable {
        static final i c = null;
        private static final long d = 1L;

        static {
            com.google.common.primitives.g.b.c = new com.google.common.primitives.g.b();
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.o(((Float)object0));
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.p(((String)object0));
        }

        protected String o(Float float0) {
            return float0.toString();
        }

        protected Float p(String s) {
            return Float.valueOf(s);
        }

        private Object q() {
            return com.google.common.primitives.g.b.c;
        }

        @Override
        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    static enum c implements Comparator {
        INSTANCE;

        private static c[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((float[])object0), ((float[])object1));
        }

        public int g(float[] arr_f, float[] arr_f1) {
            int v = Math.min(arr_f.length, arr_f1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = Float.compare(arr_f[v1], arr_f1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_f.length - arr_f1.length;
        }

        @Override
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    public static final int a = 4;

    public static float[] A(Collection collection0) {
        if(collection0 instanceof a) {
            return ((a)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        float[] arr_f = new float[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_f[v] = ((Number)H.E(arr_object[v])).floatValue();
        }
        return arr_f;
    }

    @J1.c
    @d
    @o3.a
    public static Float B(String s) {
        if(com.google.common.primitives.d.b.matcher(s).matches()) {
            try {
                return Float.parseFloat(s);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }

    public static List c(float[] arr_f) {
        return arr_f.length == 0 ? Collections.emptyList() : new a(arr_f);
    }

    public static int d(float f, float f1) {
        return Float.compare(f, f1);
    }

    public static float[] e(float[][] arr2_f) {
        int v1 = 0;
        for(int v = 0; v < arr2_f.length; ++v) {
            v1 += arr2_f[v].length;
        }
        float[] arr_f = new float[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_f.length; ++v2) {
            float[] arr_f1 = arr2_f[v2];
            System.arraycopy(arr_f1, 0, arr_f, v3, arr_f1.length);
            v3 += arr_f1.length;
        }
        return arr_f;
    }

    public static float f(float f, float f1, float f2) {
        if(f1 > f2) {
            throw new IllegalArgumentException(P.e("min (%s) must be less than or equal to max (%s)", new Object[]{f1, f2}));
        }
        return Math.min(Math.max(f, f1), f2);
    }

    public static boolean g(float[] arr_f, float f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_f[v] == f) {
                return true;
            }
        }
        return false;
    }

    public static float[] h(float[] arr_f, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_f.length >= v ? arr_f : Arrays.copyOf(arr_f, v + v1);
    }

    public static int i(float f) {
        return f.hashCode();
    }

    public static int j(float[] arr_f, float f) {
        return g.k(arr_f, f, 0, arr_f.length);
    }

    private static int k(float[] arr_f, float f, int v, int v1) {
        while(v < v1) {
            if(arr_f[v] == f) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static int l(float[] arr_f, float[] arr_f1) {
        H.F(arr_f, "array");
        H.F(arr_f1, "target");
        if(arr_f1.length == 0) {
            return 0;
        }
        int v = 0;
    label_5:
        while(v < arr_f.length - arr_f1.length + 1) {
            int v1 = 0;
            while(v1 < arr_f1.length) {
                if(arr_f[v + v1] == arr_f1[v1]) {
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

    public static boolean m(float f) {
        return -Infinityf < f && f < Infinityf;
    }

    public static String n(String s, float[] arr_f) {
        H.E(s);
        if(arr_f.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_f.length * 12);
        stringBuilder0.append(arr_f[0]);
        for(int v = 1; v < arr_f.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(arr_f[v]);
        }
        return stringBuilder0.toString();
    }

    public static int o(float[] arr_f, float f) {
        return g.p(arr_f, f, 0, arr_f.length);
    }

    private static int p(float[] arr_f, float f, int v, int v1) {
        for(int v2 = v1 - 1; v2 >= v; --v2) {
            if(arr_f[v2] == f) {
                return v2;
            }
        }
        return -1;
    }

    public static Comparator q() {
        return c.a;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float r(float[] arr_f) {
        H.d(arr_f.length > 0);
        float f = arr_f[0];
        for(int v = 1; v < arr_f.length; ++v) {
            f = Math.max(f, arr_f[v]);
        }
        return f;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float s(float[] arr_f) {
        H.d(arr_f.length > 0);
        float f = arr_f[0];
        for(int v = 1; v < arr_f.length; ++v) {
            f = Math.min(f, arr_f[v]);
        }
        return f;
    }

    public static void t(float[] arr_f) {
        H.E(arr_f);
        g.u(arr_f, 0, arr_f.length);
    }

    public static void u(float[] arr_f, int v, int v1) {
        H.E(arr_f);
        H.f0(v, v1, arr_f.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            float f = arr_f[v];
            arr_f[v] = arr_f[v2];
            arr_f[v2] = f;
            ++v;
        }
    }

    public static void v(float[] arr_f, int v) {
        g.w(arr_f, v, 0, arr_f.length);
    }

    public static void w(float[] arr_f, int v, int v1, int v2) {
        H.E(arr_f);
        H.f0(v1, v2, arr_f.length);
        if(arr_f.length <= 1) {
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
        g.u(arr_f, v1, v5);
        g.u(arr_f, v5, v2);
        g.u(arr_f, v1, v2);
    }

    public static void x(float[] arr_f) {
        H.E(arr_f);
        g.y(arr_f, 0, arr_f.length);
    }

    public static void y(float[] arr_f, int v, int v1) {
        H.E(arr_f);
        H.f0(v, v1, arr_f.length);
        Arrays.sort(arr_f, v, v1);
        g.u(arr_f, v, v1);
    }

    public static i z() {
        return com.google.common.primitives.g.b.c;
    }
}

