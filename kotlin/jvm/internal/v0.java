package kotlin.jvm.internal;

import A3.a;
import A3.b;
import A3.c;
import A3.d;
import A3.e;
import A3.f;
import A3.g;
import A3.h;
import A3.i;
import A3.j;
import A3.k;
import A3.l;
import A3.m;
import A3.n;
import A3.o;
import A3.p;
import A3.q;
import A3.r;
import A3.s;
import A3.t;
import A3.u;
import A3.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

public class v0 {
    public static int A(Object object0) {
        if(object0 instanceof E) {
            return ((E)object0).getArity();
        }
        if(object0 instanceof a) {
            return 0;
        }
        if(object0 instanceof Function1) {
            return 1;
        }
        if(object0 instanceof o) {
            return 2;
        }
        if(object0 instanceof p) {
            return 3;
        }
        if(object0 instanceof q) {
            return 4;
        }
        if(object0 instanceof r) {
            return 5;
        }
        if(object0 instanceof s) {
            return 6;
        }
        if(object0 instanceof t) {
            return 7;
        }
        if(object0 instanceof u) {
            return 8;
        }
        if(object0 instanceof v) {
            return 9;
        }
        if(object0 instanceof b) {
            return 10;
        }
        if(object0 instanceof c) {
            return 11;
        }
        if(object0 instanceof d) {
            return 12;
        }
        if(object0 instanceof e) {
            return 13;
        }
        if(object0 instanceof f) {
            return 14;
        }
        if(object0 instanceof g) {
            return 15;
        }
        if(object0 instanceof h) {
            return 16;
        }
        if(object0 instanceof i) {
            return 17;
        }
        if(object0 instanceof j) {
            return 18;
        }
        if(object0 instanceof k) {
            return 19;
        }
        if(object0 instanceof l) {
            return 20;
        }
        if(object0 instanceof m) {
            return 21;
        }
        return object0 instanceof n ? 22 : -1;
    }

    public static boolean B(Object object0, int v) {
        return object0 instanceof kotlin.v && v0.A(object0) == v;
    }

    // 去混淆评级： 低(30)
    public static boolean C(Object object0) {
        return object0 instanceof Collection && (!(object0 instanceof B3.a) || object0 instanceof B3.b);
    }

    // 去混淆评级： 低(30)
    public static boolean D(Object object0) {
        return object0 instanceof Iterable && (!(object0 instanceof B3.a) || object0 instanceof B3.c);
    }

    // 去混淆评级： 低(30)
    public static boolean E(Object object0) {
        return object0 instanceof Iterator && (!(object0 instanceof B3.a) || object0 instanceof B3.d);
    }

    // 去混淆评级： 低(30)
    public static boolean F(Object object0) {
        return object0 instanceof List && (!(object0 instanceof B3.a) || object0 instanceof B3.e);
    }

    // 去混淆评级： 低(30)
    public static boolean G(Object object0) {
        return object0 instanceof ListIterator && (!(object0 instanceof B3.a) || object0 instanceof B3.f);
    }

    // 去混淆评级： 低(30)
    public static boolean H(Object object0) {
        return object0 instanceof Map && (!(object0 instanceof B3.a) || object0 instanceof B3.g);
    }

    // 去混淆评级： 低(30)
    public static boolean I(Object object0) {
        return object0 instanceof Map.Entry && (!(object0 instanceof B3.a) || object0 instanceof B3.g.a);
    }

    // 去混淆评级： 低(30)
    public static boolean J(Object object0) {
        return object0 instanceof Set && (!(object0 instanceof B3.a) || object0 instanceof B3.h);
    }

    // 去混淆评级： 低(20)
    private static Throwable K(Throwable throwable0) {
        return L.B(throwable0, "kotlin.jvm.internal.v0");
    }

    public static ClassCastException L(ClassCastException classCastException0) {
        throw (ClassCastException)v0.K(classCastException0);
    }

    public static void M(Object object0, String s) {
        v0.N(((object0 == null ? "null" : object0.getClass().getName()) + " cannot be cast to " + s));
    }

    public static void N(String s) {
        throw v0.L(new ClassCastException(s));
    }

    public static Collection a(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.b)) {
            v0.M(object0, "kotlin.collections.MutableCollection");
        }
        return v0.s(object0);
    }

    public static Collection b(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.b)) {
            v0.N(s);
        }
        return v0.s(object0);
    }

    public static Iterable c(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.c)) {
            v0.M(object0, "kotlin.collections.MutableIterable");
        }
        return v0.t(object0);
    }

    public static Iterable d(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.c)) {
            v0.N(s);
        }
        return v0.t(object0);
    }

    public static Iterator e(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.d)) {
            v0.M(object0, "kotlin.collections.MutableIterator");
        }
        return v0.u(object0);
    }

    public static Iterator f(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.d)) {
            v0.N(s);
        }
        return v0.u(object0);
    }

    public static List g(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.e)) {
            v0.M(object0, "kotlin.collections.MutableList");
        }
        return v0.v(object0);
    }

    public static List h(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.e)) {
            v0.N(s);
        }
        return v0.v(object0);
    }

    public static ListIterator i(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.f)) {
            v0.M(object0, "kotlin.collections.MutableListIterator");
        }
        return v0.w(object0);
    }

    public static ListIterator j(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.f)) {
            v0.N(s);
        }
        return v0.w(object0);
    }

    public static Map k(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.g)) {
            v0.M(object0, "kotlin.collections.MutableMap");
        }
        return v0.x(object0);
    }

    public static Map l(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.g)) {
            v0.N(s);
        }
        return v0.x(object0);
    }

    public static Map.Entry m(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.g.a)) {
            v0.M(object0, "kotlin.collections.MutableMap.MutableEntry");
        }
        return v0.y(object0);
    }

    public static Map.Entry n(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.g.a)) {
            v0.N(s);
        }
        return v0.y(object0);
    }

    public static Set o(Object object0) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.h)) {
            v0.M(object0, "kotlin.collections.MutableSet");
        }
        return v0.z(object0);
    }

    public static Set p(Object object0, String s) {
        if(object0 instanceof B3.a && !(object0 instanceof B3.h)) {
            v0.N(s);
        }
        return v0.z(object0);
    }

    public static Object q(Object object0, int v) {
        if(object0 != null && !v0.B(object0, v)) {
            v0.M(object0, "kotlin.jvm.functions.Function" + v);
        }
        return object0;
    }

    public static Object r(Object object0, int v, String s) {
        if(object0 != null && !v0.B(object0, v)) {
            v0.N(s);
        }
        return object0;
    }

    public static Collection s(Object object0) {
        try {
            return (Collection)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }

    public static Iterable t(Object object0) {
        try {
            return (Iterable)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }

    public static Iterator u(Object object0) {
        try {
            return (Iterator)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }

    public static List v(Object object0) {
        try {
            return (List)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }

    public static ListIterator w(Object object0) {
        try {
            return (ListIterator)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }

    public static Map x(Object object0) {
        try {
            return (Map)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }

    public static Map.Entry y(Object object0) {
        try {
            return (Map.Entry)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }

    public static Set z(Object object0) {
        try {
            return (Set)object0;
        }
        catch(ClassCastException classCastException0) {
            throw v0.L(classCastException0);
        }
    }
}

