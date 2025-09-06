package com.unity3d.scar.adapter.common;

import P2.d;

public class b extends n {
    public static final String a = "Cannot show ad that is not loaded for placement %s";
    public static final String b = "Missing queryInfoMetadata for ad %s";

    public b(c c0, String s, Object[] arr_object) {
        super(c0, s, arr_object);
    }

    public b(c c0, Object[] arr_object) {
        super(c0, null, arr_object);
    }

    public static b a(d d0) {
        String s = String.format("Cannot show ad that is not loaded for placement %s", d0.c());
        return new b(c.t, s, new Object[]{d0.c(), d0.d(), s});
    }

    public static b b(String s) {
        return new b(c.g, s, new Object[0]);
    }

    public static b c(d d0, String s) {
        return new b(c.n, s, new Object[]{d0.c(), d0.d(), s});
    }

    public static b d(d d0, String s) {
        return new b(c.s, s, new Object[]{d0.c(), d0.d(), s});
    }

    public static b e(String s) {
        return new b(c.j, s, new Object[]{s});
    }

    public static b f(String s, String s1, String s2) {
        return new b(c.q, s2, new Object[]{s, s1, s2});
    }

    public static b g(d d0) {
        String s = String.format("Missing queryInfoMetadata for ad %s", d0.c());
        return new b(c.o, s, new Object[]{d0.c(), d0.d(), s});
    }

    @Override  // com.unity3d.scar.adapter.common.n
    public String getDomain() {
        return "GMA";
    }
}

