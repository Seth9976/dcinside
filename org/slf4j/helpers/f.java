package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

public final class f {
    static final char a = '{';
    static final char b = '}';
    static final String c = "{}";
    private static final char d = '\\';

    public static final d a(String s, Object[] arr_object) {
        Throwable throwable0 = f.k(arr_object);
        if(throwable0 != null) {
            arr_object = f.s(arr_object);
        }
        return f.b(s, arr_object, throwable0);
    }

    public static final d b(String s, Object[] arr_object, Throwable throwable0) {
        int v3;
        if(s == null) {
            return new d(null, arr_object, throwable0);
        }
        if(arr_object == null) {
            return new d(s);
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 50);
        int v = 0;
        int v1 = 0;
        while(v < arr_object.length) {
            int v2 = s.indexOf("{}", v1);
            if(v2 == -1) {
                if(v1 == 0) {
                    return new d(s, arr_object, throwable0);
                }
                stringBuilder0.append(s, v1, s.length());
                return new d(stringBuilder0.toString(), arr_object, throwable0);
            }
            if(f.n(s, v2)) {
                if(f.m(s, v2)) {
                    stringBuilder0.append(s, v1, v2 - 1);
                    f.f(stringBuilder0, arr_object[v], new HashMap());
                    goto label_26;
                }
                else {
                    --v;
                    stringBuilder0.append(s, v1, v2 - 1);
                    stringBuilder0.append('{');
                    v3 = v2 + 1;
                    goto label_27;
                }
                goto label_24;
            }
            else {
            label_24:
                stringBuilder0.append(s, v1, v2);
                f.f(stringBuilder0, arr_object[v], new HashMap());
            }
        label_26:
            v3 = v2 + 2;
        label_27:
            v1 = v3;
            ++v;
        }
        stringBuilder0.append(s, v1, s.length());
        return new d(stringBuilder0.toString(), arr_object, throwable0);
    }

    private static void c(StringBuilder stringBuilder0, boolean[] arr_z) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_z.length; ++v) {
            stringBuilder0.append(arr_z[v]);
            if(v != arr_z.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    private static void d(StringBuilder stringBuilder0, byte[] arr_b) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(((int)arr_b[v]));
            if(v != arr_b.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    private static void e(StringBuilder stringBuilder0, char[] arr_c) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_c.length; ++v) {
            stringBuilder0.append(arr_c[v]);
            if(v != arr_c.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    private static void f(StringBuilder stringBuilder0, Object object0, Map map0) {
        if(object0 == null) {
            stringBuilder0.append("null");
            return;
        }
        if(!object0.getClass().isArray()) {
            f.q(stringBuilder0, object0);
            return;
        }
        if(object0 instanceof boolean[]) {
            f.c(stringBuilder0, ((boolean[])object0));
            return;
        }
        if(object0 instanceof byte[]) {
            f.d(stringBuilder0, ((byte[])object0));
            return;
        }
        if(object0 instanceof char[]) {
            f.e(stringBuilder0, ((char[])object0));
            return;
        }
        if(object0 instanceof short[]) {
            f.r(stringBuilder0, ((short[])object0));
            return;
        }
        if(object0 instanceof int[]) {
            f.l(stringBuilder0, ((int[])object0));
            return;
        }
        if(object0 instanceof long[]) {
            f.o(stringBuilder0, ((long[])object0));
            return;
        }
        if(object0 instanceof float[]) {
            f.h(stringBuilder0, ((float[])object0));
            return;
        }
        if(object0 instanceof double[]) {
            f.g(stringBuilder0, ((double[])object0));
            return;
        }
        f.p(stringBuilder0, ((Object[])object0), map0);
    }

    private static void g(StringBuilder stringBuilder0, double[] arr_f) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_f.length; ++v) {
            stringBuilder0.append(arr_f[v]);
            if(v != arr_f.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    private static void h(StringBuilder stringBuilder0, float[] arr_f) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_f.length; ++v) {
            stringBuilder0.append(arr_f[v]);
            if(v != arr_f.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    public static final d i(String s, Object object0) {
        return f.a(s, new Object[]{object0});
    }

    public static final d j(String s, Object object0, Object object1) {
        return f.a(s, new Object[]{object0, object1});
    }

    static final Throwable k(Object[] arr_object) {
        if(arr_object != null && arr_object.length != 0) {
            Object object0 = arr_object[arr_object.length - 1];
            return object0 instanceof Throwable ? ((Throwable)object0) : null;
        }
        return null;
    }

    private static void l(StringBuilder stringBuilder0, int[] arr_v) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_v.length; ++v) {
            stringBuilder0.append(arr_v[v]);
            if(v != arr_v.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    static final boolean m(String s, int v) {
        return v >= 2 && s.charAt(v - 2) == 92;
    }

    static final boolean n(String s, int v) {
        return v == 0 ? false : s.charAt(v - 1) == 92;
    }

    private static void o(StringBuilder stringBuilder0, long[] arr_v) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_v.length; ++v) {
            stringBuilder0.append(arr_v[v]);
            if(v != arr_v.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    private static void p(StringBuilder stringBuilder0, Object[] arr_object, Map map0) {
        stringBuilder0.append('[');
        if(map0.containsKey(arr_object)) {
            stringBuilder0.append("...");
        }
        else {
            map0.put(arr_object, null);
            for(int v = 0; v < arr_object.length; ++v) {
                f.f(stringBuilder0, arr_object[v], map0);
                if(v != arr_object.length - 1) {
                    stringBuilder0.append(", ");
                }
            }
            map0.remove(arr_object);
        }
        stringBuilder0.append(']');
    }

    private static void q(StringBuilder stringBuilder0, Object object0) {
        try {
            stringBuilder0.append(object0.toString());
        }
        catch(Throwable throwable0) {
            m.d(("SLF4J: Failed toString() invocation on an object of type [" + object0.getClass().getName() + "]"), throwable0);
            stringBuilder0.append("[FAILED toString()]");
        }
    }

    private static void r(StringBuilder stringBuilder0, short[] arr_v) {
        stringBuilder0.append('[');
        for(int v = 0; v < arr_v.length; ++v) {
            stringBuilder0.append(((int)arr_v[v]));
            if(v != arr_v.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
    }

    private static Object[] s(Object[] arr_object) {
        if(arr_object == null || arr_object.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        Object[] arr_object1 = new Object[arr_object.length - 1];
        System.arraycopy(arr_object, 0, arr_object1, 0, arr_object.length - 1);
        return arr_object1;
    }
}

