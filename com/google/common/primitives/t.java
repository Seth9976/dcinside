package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import java.util.Arrays;
import java.util.Comparator;

@b
@f
public final class t {
    static enum a implements Comparator {
        INSTANCE;

        private static a[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((byte[])object0), ((byte[])object1));
        }

        public int g(byte[] arr_b, byte[] arr_b1) {
            int v = Math.min(arr_b.length, arr_b1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = t.b(arr_b[v1], arr_b1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_b.length - arr_b1.length;
        }

        @Override
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    public static final byte a = 0x40;

    public static byte a(long v) {
        H.p(((long)(((byte)(((int)v))))) == v, "Out of range: %s", v);
        return (byte)(((int)v));
    }

    public static int b(byte b, byte b1) {
        return b - b1;
    }

    public static String c(String s, byte[] arr_b) {
        H.E(s);
        if(arr_b.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 5);
        stringBuilder0.append(((int)arr_b[0]));
        for(int v = 1; v < arr_b.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(((int)arr_b[v]));
        }
        return stringBuilder0.toString();
    }

    public static Comparator d() {
        return a.a;
    }

    public static byte e(byte[] arr_b) {
        H.d(arr_b.length > 0);
        byte b = arr_b[0];
        for(int v = 1; v < arr_b.length; ++v) {
            byte b1 = arr_b[v];
            if(b1 > b) {
                b = b1;
            }
        }
        return b;
    }

    public static byte f(byte[] arr_b) {
        H.d(arr_b.length > 0);
        byte b = arr_b[0];
        for(int v = 1; v < arr_b.length; ++v) {
            byte b1 = arr_b[v];
            if(b1 < b) {
                b = b1;
            }
        }
        return b;
    }

    public static byte g(long v) {
        if(v > 0x7FL) {
            return 0x7F;
        }
        return v < 0xFFFFFFFFFFFFFF80L ? 0xFFFFFF80 : ((byte)(((int)v)));
    }

    public static void h(byte[] arr_b) {
        H.E(arr_b);
        t.i(arr_b, 0, arr_b.length);
    }

    public static void i(byte[] arr_b, int v, int v1) {
        H.E(arr_b);
        H.f0(v, v1, arr_b.length);
        Arrays.sort(arr_b, v, v1);
        com.google.common.primitives.b.n(arr_b, v, v1);
    }
}

