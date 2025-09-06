package com.google.common.primitives;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import j..util.Objects;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Arrays;
import java.util.Comparator;
import sun.misc.Unsafe;

@c
@d
@f
public final class u {
    @e
    static class a {
        static enum com.google.common.primitives.u.a.a implements Comparator {
            INSTANCE;

            private static com.google.common.primitives.u.a.a[] b() [...] // Inlined contents

            @Override
            public int compare(Object object0, Object object1) {
                return this.g(((byte[])object0), ((byte[])object1));
            }

            public int g(byte[] arr_b, byte[] arr_b1) {
                int v = Math.min(arr_b.length, arr_b1.length);
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = u.b(arr_b[v1], arr_b1[v1]);
                    if(v2 != 0) {
                        return v2;
                    }
                }
                return arr_b.length - arr_b1.length;
            }

            @Override
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @e
        static enum b implements Comparator {
            INSTANCE;

            static final boolean b;
            static final Unsafe c;
            static final int d;

            static {
                Unsafe unsafe0;
                b.b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
                try {
                    unsafe0 = Unsafe.getUnsafe();
                }
                catch(SecurityException unused_ex) {
                    try {
                        unsafe0 = (Unsafe)AccessController.doPrivileged(new com.google.common.primitives.u.a.b.a());
                    }
                    catch(PrivilegedActionException privilegedActionException0) {
                        throw new RuntimeException("Could not initialize intrinsics", privilegedActionException0.getCause());
                    }
                }
                b.c = unsafe0;
                int v = unsafe0.arrayBaseOffset(byte[].class);
                b.d = v;
                if(!"64".equals(System.getProperty("sun.arch.data.model")) || v % 8 != 0 || unsafe0.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static b[] b() [...] // Inlined contents

            @Override
            public int compare(Object object0, Object object1) {
                return this.g(((byte[])object0), ((byte[])object1));
            }

            public int g(byte[] arr_b, byte[] arr_b1) {
                int v = Math.min(arr_b.length, arr_b1.length);
                int v1;
                for(v1 = 0; v1 < (v & -8); v1 += 8) {
                    long v2 = b.c.getLong(arr_b, ((long)b.d) + ((long)v1));
                    long v3 = b.c.getLong(arr_b1, ((long)b.d) + ((long)v1));
                    if(v2 != v3) {
                        if(b.b) {
                            return y.a(v2, v3);
                        }
                        int v4 = Long.numberOfTrailingZeros(v2 ^ v3);
                        return ((int)(v2 >>> (v4 & -8) & 0xFFL)) - ((int)(v3 >>> (v4 & -8) & 0xFFL));
                    }
                }
                while(v1 < v) {
                    int v5 = u.b(arr_b[v1], arr_b1[v1]);
                    if(v5 != 0) {
                        return v5;
                    }
                    ++v1;
                }
                return arr_b.length - arr_b1.length;
            }

            private static Unsafe i() [...] // Inlined contents

            @Override
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        static final String a;
        static final Comparator b;

        static {
            a.a = "com.google.common.primitives.u$a$UnsafeComparator";
            a.b = a.a();
        }

        static Comparator a() {
            try {
                Object[] arr_object = Class.forName("com.google.common.primitives.u$a$UnsafeComparator").getEnumConstants();
                Objects.requireNonNull(arr_object);
                return (Comparator)arr_object[0];
            }
            catch(Throwable unused_ex) {
                return u.f();
            }
        }
    }

    public static final byte a = (byte)0x80;
    public static final byte b = -1;
    private static final int c = 0xFF;

    @O1.a
    public static byte a(long v) {
        H.p(v >> 8 == 0L, "out of range: %s", v);
        return (byte)(((int)v));
    }

    public static int b(byte b, byte b1) {
        return (b & 0xFF) - (b1 & 0xFF);
    }

    private static byte c(byte b) {
        return (byte)(b ^ 0x80);
    }

    public static String d(String s, byte[] arr_b) {
        H.E(s);
        if(arr_b.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * (s.length() + 3));
        stringBuilder0.append(u.p(arr_b[0]));
        for(int v = 1; v < arr_b.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(u.q(arr_b[v]));
        }
        return stringBuilder0.toString();
    }

    public static Comparator e() {
        return a.b;
    }

    @e
    static Comparator f() {
        return com.google.common.primitives.u.a.a.a;
    }

    public static byte g(byte[] arr_b) {
        H.d(arr_b.length > 0);
        int v1 = u.p(arr_b[0]);
        for(int v = 1; v < arr_b.length; ++v) {
            int v2 = u.p(arr_b[v]);
            if(v2 > v1) {
                v1 = v2;
            }
        }
        return (byte)v1;
    }

    public static byte h(byte[] arr_b) {
        H.d(arr_b.length > 0);
        int v1 = u.p(arr_b[0]);
        for(int v = 1; v < arr_b.length; ++v) {
            int v2 = u.p(arr_b[v]);
            if(v2 < v1) {
                v1 = v2;
            }
        }
        return (byte)v1;
    }

    @O1.a
    public static byte i(String s) {
        return u.j(s, 10);
    }

    @O1.a
    public static byte j(String s, int v) {
        int v1 = Integer.parseInt(((String)H.E(s)), v);
        if(v1 >> 8 != 0) {
            throw new NumberFormatException("out of range: " + v1);
        }
        return (byte)v1;
    }

    public static byte k(long v) {
        if(v > 0xFFL) {
            return -1;
        }
        return v >= 0L ? ((byte)(((int)v))) : 0;
    }

    public static void l(byte[] arr_b) {
        H.E(arr_b);
        u.m(arr_b, 0, arr_b.length);
    }

    public static void m(byte[] arr_b, int v, int v1) {
        H.E(arr_b);
        H.f0(v, v1, arr_b.length);
        for(int v2 = v; v2 < v1; ++v2) {
            arr_b[v2] = u.c(arr_b[v2]);
        }
        Arrays.sort(arr_b, v, v1);
        while(v < v1) {
            arr_b[v] = u.c(arr_b[v]);
            ++v;
        }
    }

    public static void n(byte[] arr_b) {
        H.E(arr_b);
        u.o(arr_b, 0, arr_b.length);
    }

    public static void o(byte[] arr_b, int v, int v1) {
        H.E(arr_b);
        H.f0(v, v1, arr_b.length);
        for(int v2 = v; v2 < v1; ++v2) {
            arr_b[v2] = (byte)(arr_b[v2] ^ 0x7F);
        }
        Arrays.sort(arr_b, v, v1);
        while(v < v1) {
            arr_b[v] = (byte)(arr_b[v] ^ 0x7F);
            ++v;
        }
    }

    public static int p(byte b) [...] // Inlined contents

    public static String q(byte b) {
        return u.r(b, ((byte)10));
    }

    public static String r(byte b, int v) {
        H.k(v >= 2 && v <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", v);
        return Integer.toString(b & 0xFF, v);
    }
}

