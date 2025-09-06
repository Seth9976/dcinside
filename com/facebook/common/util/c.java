package com.facebook.common.util;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class c {
    private static final int a = 0x1F;

    public static int a(int v) [...] // Inlined contents

    public static int b(int v, int v1) [...] // Inlined contents

    public static int c(int v, int v1, int v2) [...] // Inlined contents

    public static int d(int v, int v1, int v2, int v3) {
        return (((v + 0x1F) * 0x1F + v1) * 0x1F + v2) * 0x1F + v3;
    }

    public static int e(int v, int v1, int v2, int v3, int v4) {
        return ((((v + 0x1F) * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4;
    }

    public static int f(int v, int v1, int v2, int v3, int v4, int v5) {
        return (((((v + 0x1F) * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5;
    }

    public static int g(@h Object object0) {
        return object0 == null ? 0x1F : object0.hashCode() + 0x1F;
    }

    public static int h(@h Object object0, @h Object object1) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        if(object1 != null) {
            v = object1.hashCode();
        }
        return (v1 + 0x1F) * 0x1F + v;
    }

    public static int i(@h Object object0, @h Object object1, @h Object object2) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = object1 == null ? 0 : object1.hashCode();
        if(object2 != null) {
            v = object2.hashCode();
        }
        return ((v1 + 0x1F) * 0x1F + v2) * 0x1F + v;
    }

    public static int j(@h Object object0, @h Object object1, @h Object object2, @h Object object3) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = object1 == null ? 0 : object1.hashCode();
        int v3 = object2 == null ? 0 : object2.hashCode();
        if(object3 != null) {
            v = object3.hashCode();
        }
        return c.d(v1, v2, v3, v);
    }

    public static int k(@h Object object0, @h Object object1, @h Object object2, @h Object object3, @h Object object4) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = object1 == null ? 0 : object1.hashCode();
        int v3 = object2 == null ? 0 : object2.hashCode();
        int v4 = object3 == null ? 0 : object3.hashCode();
        if(object4 != null) {
            v = object4.hashCode();
        }
        return c.e(v1, v2, v3, v4, v);
    }

    public static int l(@h Object object0, @h Object object1, @h Object object2, @h Object object3, @h Object object4, @h Object object5) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = object1 == null ? 0 : object1.hashCode();
        int v2 = object2 == null ? 0 : object2.hashCode();
        int v3 = object3 == null ? 0 : object3.hashCode();
        int v4 = object4 == null ? 0 : object4.hashCode();
        return object5 == null ? c.f(v, v1, v2, v3, v4, 0) : c.f(v, v1, v2, v3, v4, object5.hashCode());
    }
}

