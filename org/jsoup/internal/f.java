package org.jsoup.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.function.Function;

public final class f {
    private static final Function a;
    private static final Function b;
    private static final Function c;
    private static final Function d;

    static {
        f.a = new b();
        f.b = new c();
        f.c = new d();
        f.d = new e();
    }

    public static Function e() {
        return f.d;
    }

    private static Object f(Object object0) {
        return new ArrayList();
    }

    private static Object g(Object object0) {
        return new HashSet();
    }

    private static Object h(Object object0) {
        return new HashMap();
    }

    private static Object i(Object object0) {
        return new IdentityHashMap();
    }

    public static Function j() {
        return f.a;
    }

    public static Function k() {
        return f.c;
    }

    public static Function l() {
        return f.b;
    }
}

