package com.facebook.common.internal;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public final class com.facebook.common.internal.n {
    private static String a(int v, int v1, @h String s) {
        if(v < 0) {
            return com.facebook.common.internal.n.r("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return com.facebook.common.internal.n.r("%s (%s) must be less than size (%s)", new Object[]{s, v, v1});
    }

    private static String b(int v, int v1, @h String s) {
        if(v < 0) {
            return com.facebook.common.internal.n.r("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return com.facebook.common.internal.n.r("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
    }

    private static String c(int v, int v1, int v2) {
        if(v >= 0 && v <= v2) {
            return v1 < 0 || v1 > v2 ? com.facebook.common.internal.n.b(v1, v2, "end index") : com.facebook.common.internal.n.r("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        return com.facebook.common.internal.n.b(v, v2, "start index");
    }

    public static void d(@h Boolean boolean0) {
        if(boolean0 != null && !boolean0.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, @h Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static void f(boolean z, @h String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalArgumentException(com.facebook.common.internal.n.r(s, arr_object));
        }
    }

    public static int g(int v, int v1) {
        return com.facebook.common.internal.n.h(v, v1, "index");
    }

    public static int h(int v, int v1, @h String s) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(com.facebook.common.internal.n.a(v, v1, s));
        }
        return v;
    }

    public static Object i(@h Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object j(@h Object object0, @h Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static Object k(@h Object object0, @h String s, Object[] arr_object) {
        if(object0 == null) {
            throw new NullPointerException(com.facebook.common.internal.n.r(s, arr_object));
        }
        return object0;
    }

    public static int l(int v, int v1) {
        return com.facebook.common.internal.n.m(v, v1, "index");
    }

    public static int m(int v, int v1, @h String s) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(com.facebook.common.internal.n.b(v, v1, s));
        }
        return v;
    }

    public static void n(int v, int v1, int v2) {
        if(v < 0 || v1 < v || v1 > v2) {
            throw new IndexOutOfBoundsException(com.facebook.common.internal.n.c(v, v1, v2));
        }
    }

    public static void o(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z, @h Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }

    public static void q(boolean z, @h String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalStateException(com.facebook.common.internal.n.r(s, arr_object));
        }
    }

    static String r(@h String s, Object[] arr_object) {
        String s1 = String.valueOf(s);
        StringBuilder stringBuilder0 = new StringBuilder(s1.length() + arr_object.length * 16);
        int v = 0;
        int v1 = 0;
        while(v < arr_object.length) {
            int v2 = s1.indexOf("%s", v1);
            if(v2 == -1) {
                break;
            }
            stringBuilder0.append(s1.substring(v1, v2));
            stringBuilder0.append(arr_object[v]);
            v1 = v2 + 2;
            ++v;
        }
        stringBuilder0.append(s1.substring(v1));
        if(v < arr_object.length) {
            stringBuilder0.append(" [");
            int v3 = v + 1;
            stringBuilder0.append(arr_object[v]);
            while(v3 < arr_object.length) {
                stringBuilder0.append(", ");
                stringBuilder0.append(arr_object[v3]);
                ++v3;
            }
            stringBuilder0.append(']');
        }
        return stringBuilder0.toString();
    }
}

