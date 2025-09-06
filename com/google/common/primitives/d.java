package com.google.common.primitives;

import J1.b;
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
import java.util.regex.Pattern;

@b(emulated = true)
@f
public final class d extends e {
    @b
    static class a extends AbstractList implements Serializable, RandomAccess {
        final double[] a;
        final int b;
        final int c;
        private static final long d;

        a(double[] arr_f) {
            this(arr_f, 0, arr_f.length);
        }

        a(double[] arr_f, int v, int v1) {
            this.a = arr_f;
            this.b = v;
            this.c = v1;
        }

        public Double a(int v) {
            H.C(v, this.size());
            return (double)this.a[this.b + v];
        }

        public Double b(int v, Double double0) {
            H.C(v, this.size());
            double f = this.a[this.b + v];
            this.a[this.b + v] = (double)(((Double)H.E(double0)));
            return f;
        }

        double[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Double && d.l(this.a, ((double)(((Double)object0))), this.b, this.c) != -1;
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
                v1 = v1 * 0x1F + d.j(this.a[v]);
                ++v;
            }
            return v1;
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Double) {
                int v = d.l(this.a, ((double)(((Double)object0))), this.b, this.c);
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
            if(object0 instanceof Double) {
                int v = d.q(this.a, ((double)(((Double)object0))), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Double)object0));
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

    static final class com.google.common.primitives.d.b extends i implements Serializable {
        static final i c = null;
        private static final long d = 1L;

        static {
            com.google.common.primitives.d.b.c = new com.google.common.primitives.d.b();
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.o(((Double)object0));
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.p(((String)object0));
        }

        protected String o(Double double0) {
            return double0.toString();
        }

        protected Double p(String s) {
            return Double.valueOf(s);
        }

        private Object q() {
            return com.google.common.primitives.d.b.c;
        }

        @Override
        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    static enum c implements Comparator {
        INSTANCE;

        private static c[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((double[])object0), ((double[])object1));
        }

        public int g(double[] arr_f, double[] arr_f1) {
            int v = Math.min(arr_f.length, arr_f1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = Double.compare(arr_f[v1], arr_f1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_f.length - arr_f1.length;
        }

        @Override
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    public static final int a = 8;
    @J1.c
    @J1.d
    static final Pattern b;

    static {
        d.b = d.i();
    }

    public static i A() {
        return com.google.common.primitives.d.b.c;
    }

    public static double[] B(Collection collection0) {
        if(collection0 instanceof a) {
            return ((a)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        double[] arr_f = new double[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_f[v] = ((Number)H.E(arr_object[v])).doubleValue();
        }
        return arr_f;
    }

    @J1.c
    @J1.d
    @o3.a
    public static Double C(String s) {
        if(d.b.matcher(s).matches()) {
            try {
                return Double.parseDouble(s);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }

    public static List c(double[] arr_f) {
        return arr_f.length == 0 ? Collections.emptyList() : new a(arr_f);
    }

    public static int d(double f, double f1) {
        return Double.compare(f, f1);
    }

    public static double[] e(double[][] arr2_f) {
        int v1 = 0;
        for(int v = 0; v < arr2_f.length; ++v) {
            v1 += arr2_f[v].length;
        }
        double[] arr_f = new double[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_f.length; ++v2) {
            double[] arr_f1 = arr2_f[v2];
            System.arraycopy(arr_f1, 0, arr_f, v3, arr_f1.length);
            v3 += arr_f1.length;
        }
        return arr_f;
    }

    public static double f(double f, double f1, double f2) {
        if(f1 > f2) {
            throw new IllegalArgumentException(P.e("min (%s) must be less than or equal to max (%s)", new Object[]{f1, f2}));
        }
        return Math.min(Math.max(f, f1), f2);
    }

    public static boolean g(double[] arr_f, double f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_f[v] == f) {
                return true;
            }
        }
        return false;
    }

    public static double[] h(double[] arr_f, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_f.length >= v ? arr_f : Arrays.copyOf(arr_f, v + v1);
    }

    // 去混淆评级： 中等(160)
    @J1.c
    private static Pattern i() {
        return Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d++(?:\\.\\d*+)?|\\.\\d++)(?:[eE][+-]?\\d++)?[fFdD]?|0[xX](?:[0-9a-fA-F]++(?:\\.[0-9a-fA-F]*+)?|\\.[0-9a-fA-F]++)[pP][+-]?\\d++[fFdD]?)");
    }

    public static int j(double f) {
        return f.hashCode();
    }

    public static int k(double[] arr_f, double f) {
        return d.l(arr_f, f, 0, arr_f.length);
    }

    private static int l(double[] arr_f, double f, int v, int v1) {
        while(v < v1) {
            if(arr_f[v] == f) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static int m(double[] arr_f, double[] arr_f1) {
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

    // 去混淆评级： 低(20)
    public static boolean n(double f) {
        return 0xFFF0000000000000L < ((long)f) && ((long)f) < 0x7FF0000000000000L;
    }

    public static String o(String s, double[] arr_f) {
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

    public static int p(double[] arr_f, double f) {
        return d.q(arr_f, f, 0, arr_f.length);
    }

    private static int q(double[] arr_f, double f, int v, int v1) {
        for(int v2 = v1 - 1; v2 >= v; --v2) {
            if(arr_f[v2] == f) {
                return v2;
            }
        }
        return -1;
    }

    public static Comparator r() {
        return c.a;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double s(double[] arr_f) {
        H.d(arr_f.length > 0);
        double f = arr_f[0];
        for(int v = 1; v < arr_f.length; ++v) {
            f = Math.max(f, arr_f[v]);
        }
        return f;
    }

    @J1.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double t(double[] arr_f) {
        H.d(arr_f.length > 0);
        double f = arr_f[0];
        for(int v = 1; v < arr_f.length; ++v) {
            f = Math.min(f, arr_f[v]);
        }
        return f;
    }

    public static void u(double[] arr_f) {
        H.E(arr_f);
        d.v(arr_f, 0, arr_f.length);
    }

    public static void v(double[] arr_f, int v, int v1) {
        H.E(arr_f);
        H.f0(v, v1, arr_f.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            double f = arr_f[v];
            arr_f[v] = arr_f[v2];
            arr_f[v2] = f;
            ++v;
        }
    }

    public static void w(double[] arr_f, int v) {
        d.x(arr_f, v, 0, arr_f.length);
    }

    public static void x(double[] arr_f, int v, int v1, int v2) {
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
        d.v(arr_f, v1, v5);
        d.v(arr_f, v5, v2);
        d.v(arr_f, v1, v2);
    }

    public static void y(double[] arr_f) {
        H.E(arr_f);
        d.z(arr_f, 0, arr_f.length);
    }

    public static void z(double[] arr_f, int v, int v1) {
        H.E(arr_f);
        H.f0(v, v1, arr_f.length);
        Arrays.sort(arr_f, v, v1);
        d.v(arr_f, v, v1);
    }
}

