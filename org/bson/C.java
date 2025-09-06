package org.bson;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
public class c {
    private static final int[] A = null;
    private static volatile boolean B = false;
    private static volatile boolean C = false;
    private static final org.bson.util.c D = null;
    private static final org.bson.util.c E = null;
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 11;
    public static final byte m = 12;
    public static final byte n = 13;
    public static final byte o = 14;
    public static final byte p = 15;
    public static final byte q = 16;
    public static final byte r = 17;
    public static final byte s = 18;
    public static final byte t = -1;
    public static final byte u = 0x7F;
    public static final byte v = 0;
    public static final byte w = 1;
    public static final byte x = 2;
    public static final byte y = 3;
    private static final int z = 0x100;

    static {
        int[] arr_v = new int[0xFFFF];
        c.A = arr_v;
        arr_v[103] = 0x100;
        arr_v[105] = 2;
        arr_v[109] = 8;
        arr_v[0x73] = 0x20;
        arr_v[99] = 0x80;
        arr_v[120] = 4;
        arr_v[100] = 1;
        arr_v[0x74] = 16;
        arr_v[0x75] = 0x40;
        c.D = new org.bson.util.c();
        c.E = new org.bson.util.c();
    }

    public static void a(Class class0, q0 q00) {
        c.C = true;
        org.bson.util.c c0 = c.E;
        List list0 = (List)c0.c(class0);
        if(list0 == null) {
            list0 = new CopyOnWriteArrayList();
            c0.f(class0, list0);
        }
        list0.add(q00);
    }

    public static void b(Class class0, q0 q00) {
        c.B = true;
        org.bson.util.c c0 = c.D;
        List list0 = (List)c0.c(class0);
        if(list0 == null) {
            list0 = new CopyOnWriteArrayList();
            c0.f(class0, list0);
        }
        list0.add(q00);
    }

    // 去混淆评级： 低(40)
    public static Object c(Object object0) {
        return object0;
    }

    // 去混淆评级： 低(40)
    public static Object d(Object object0) {
        return object0;
    }

    public static void e() {
        c.g();
        c.f();
    }

    public static void f() {
        c.C = false;
        c.E.b();
    }

    public static void g() {
        c.B = false;
        c.D.b();
    }

    public static i h(byte[] arr_b) {
        return new k().c(arr_b);
    }

    public static byte[] i(i i0) {
        return new l().d(i0);
    }

    public static List j(Class class0) {
        return (List)c.E.c(class0);
    }

    public static List k(Class class0) {
        return (List)c.D.c(class0);
    }

    public static boolean l() [...] // 潜在的解密器

    public static boolean m() [...] // 潜在的解密器

    public static int n(char c) {
        int v = c.A[c];
        if(v == 0) {
            throw new IllegalArgumentException(String.format("Unrecognized flag [%c]", Character.valueOf(c)));
        }
        return v;
    }

    public static int o(String s) {
        if(s == null) {
            return 0;
        }
        char[] arr_c = s.toLowerCase().toCharArray();
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            v1 |= c.n(arr_c[v]);
        }
        return v1;
    }

    public static String p(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = c.A;
            if(v1 >= arr_v.length) {
                break;
            }
            if((arr_v[v1] & v) > 0) {
                stringBuilder0.append(((char)v1));
                v -= arr_v[v1];
            }
        }
        if(v > 0) {
            throw new IllegalArgumentException("Some flags could not be recognized.");
        }
        return stringBuilder0.toString();
    }

    public static void q(Class class0, q0 q00) {
        c.j(class0).remove(q00);
    }

    public static void r(Class class0) {
        c.E.g(class0);
    }

    public static void s(Class class0, q0 q00) {
        c.k(class0).remove(q00);
    }

    public static void t(Class class0) {
        c.D.g(class0);
    }

    public static int u(Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException("Argument shouldn\'t be null");
        }
        if(object0 instanceof Number) {
            return ((Number)object0).intValue();
        }
        if(!(object0 instanceof Boolean)) {
            throw new IllegalArgumentException("Can\'t convert: " + object0.getClass().getName() + " to int");
        }
        return ((Boolean)object0).booleanValue();
    }
}

