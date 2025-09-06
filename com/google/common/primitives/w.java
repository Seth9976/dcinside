package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import java.util.Arrays;
import java.util.Comparator;

@b
@f
public final class w {
    static enum a implements Comparator {
        INSTANCE;

        private static a[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((int[])object0), ((int[])object1));
        }

        public int g(int[] arr_v, int[] arr_v1) {
            int v = Math.min(arr_v.length, arr_v1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = arr_v[v1];
                int v3 = arr_v1[v1];
                if(v2 != v3) {
                    return w.b(v2, v3);
                }
            }
            return arr_v.length - arr_v1.length;
        }

        @Override
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    static final long a = 0xFFFFFFFFL;

    public static int a(long v) {
        H.p(v >> 0x20 == 0L, "out of range: %s", v);
        return (int)v;
    }

    public static int b(int v, int v1) {
        return l.e(v ^ 0x80000000, v1 ^ 0x80000000);
    }

    @O1.a
    public static int c(String s) {
        p p0 = p.a(s);
        try {
            return w.k(p0.a, p0.b);
        }
        catch(NumberFormatException numberFormatException0) {
            NumberFormatException numberFormatException1 = new NumberFormatException("Error parsing value: " + s);
            numberFormatException1.initCause(numberFormatException0);
            throw numberFormatException1;
        }
    }

    public static int d(int v, int v1) {
        return (int)((((long)v) & 0xFFFFFFFFL) / (((long)v1) & 0xFFFFFFFFL));
    }

    static int e(int v) [...] // Inlined contents

    public static String f(String s, int[] arr_v) {
        H.E(s);
        if(arr_v.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_v.length * 5);
        stringBuilder0.append(w.s(arr_v[0]));
        for(int v = 1; v < arr_v.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(w.s(arr_v[v]));
        }
        return stringBuilder0.toString();
    }

    public static Comparator g() {
        return a.a;
    }

    public static int h(int[] arr_v) {
        H.d(arr_v.length > 0);
        int v1 = w.e(arr_v[0]);
        for(int v = 1; v < arr_v.length; ++v) {
            int v2 = w.e(arr_v[v]);
            if(v2 > v1) {
                v1 = v2;
            }
        }
        return v1 ^ 0x80000000;
    }

    public static int i(int[] arr_v) {
        H.d(arr_v.length > 0);
        int v1 = w.e(arr_v[0]);
        for(int v = 1; v < arr_v.length; ++v) {
            int v2 = w.e(arr_v[v]);
            if(v2 < v1) {
                v1 = v2;
            }
        }
        return v1 ^ 0x80000000;
    }

    @O1.a
    public static int j(String s) {
        return w.k(s, 10);
    }

    @O1.a
    public static int k(String s, int v) {
        H.E(s);
        long v1 = Long.parseLong(s, v);
        if((0xFFFFFFFFL & v1) != v1) {
            throw new NumberFormatException("Input " + s + " in base " + v + " is not in the range of an unsigned integer");
        }
        return (int)v1;
    }

    public static int l(int v, int v1) {
        return (int)((((long)v) & 0xFFFFFFFFL) % (((long)v1) & 0xFFFFFFFFL));
    }

    public static int m(long v) {
        if(v <= 0L) {
            return 0;
        }
        return v < 0x100000000L ? ((int)v) : -1;
    }

    public static void n(int[] arr_v) {
        H.E(arr_v);
        w.o(arr_v, 0, arr_v.length);
    }

    public static void o(int[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        for(int v2 = v; v2 < v1; ++v2) {
            arr_v[v2] = w.e(arr_v[v2]);
        }
        Arrays.sort(arr_v, v, v1);
        while(v < v1) {
            arr_v[v] = w.e(arr_v[v]);
            ++v;
        }
    }

    public static void p(int[] arr_v) {
        H.E(arr_v);
        w.q(arr_v, 0, arr_v.length);
    }

    public static void q(int[] arr_v, int v, int v1) {
        H.E(arr_v);
        H.f0(v, v1, arr_v.length);
        for(int v2 = v; v2 < v1; ++v2) {
            arr_v[v2] ^= 0x7FFFFFFF;
        }
        Arrays.sort(arr_v, v, v1);
        while(v < v1) {
            arr_v[v] ^= 0x7FFFFFFF;
            ++v;
        }
    }

    public static long r(int v) [...] // Inlined contents

    public static String s(int v) {
        return w.t(v, 10);
    }

    public static String t(int v, int v1) {
        return Long.toString(((long)v) & 0xFFFFFFFFL, v1);
    }
}

