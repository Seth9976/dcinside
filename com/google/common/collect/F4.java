package com.google.common.collect;

import J1.b;
import J1.d;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@b(emulated = true)
@C1
final class f4 {
    static Object[] a(Object[] arr_object, int v, int v1, Object[] arr_object1) {
        return Arrays.copyOfRange(arr_object, v, v1, arr_object1.getClass());
    }

    static Class b(Enum enum0) {
        return enum0.getDeclaringClass();
    }

    static Object[] c(Object[] arr_object, int v) {
        if(arr_object.length != 0) {
            arr_object = Arrays.copyOf(arr_object, 0);
        }
        return Arrays.copyOf(arr_object, v);
    }

    static Map d(int v) {
        return e1.B(v);
    }

    static Set e(int v) {
        return f1.l(v);
    }

    static Map f(int v) {
        return h1.n0(v);
    }

    static Set g(int v) {
        return i1.S(v);
    }

    static Set h() {
        return f1.h();
    }

    static Map i() {
        return e1.w();
    }

    static int j(int v) {
        return v;
    }

    static int k(int v) {
        return v;
    }

    @d
    static B3 l(B3 b30) {
        return b30.l();
    }
}

