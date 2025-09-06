package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.W0;
import kotlin.b;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.r;
import y4.l;
import y4.m;

class m0 extends l0 {
    @W0(markerClass = {r.class})
    @h0(version = "1.6")
    @f
    private static final Set i(int v, @b Function1 function10) {
        L.p(function10, "builderAction");
        Set set0 = k0.e(v);
        function10.invoke(set0);
        return k0.a(set0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.6")
    @f
    private static final Set j(@b Function1 function10) {
        L.p(function10, "builderAction");
        Set set0 = k0.d();
        function10.invoke(set0);
        return k0.a(set0);
    }

    @l
    public static Set k() {
        return J.a;
    }

    @h0(version = "1.1")
    @f
    private static final HashSet l() {
        return new HashSet();
    }

    @l
    public static HashSet m(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return (HashSet)p.py(arr_object, new HashSet(Y.j(arr_object.length)));
    }

    @h0(version = "1.1")
    @f
    private static final LinkedHashSet n() {
        return new LinkedHashSet();
    }

    @l
    public static final LinkedHashSet o(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return (LinkedHashSet)p.py(arr_object, new LinkedHashSet(Y.j(arr_object.length)));
    }

    @h0(version = "1.1")
    @f
    private static final Set p() {
        return new LinkedHashSet();
    }

    @l
    public static Set q(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return (Set)p.py(arr_object, new LinkedHashSet(Y.j(arr_object.length)));
    }

    @l
    public static final Set r(@l Set set0) {
        L.p(set0, "<this>");
        switch(set0.size()) {
            case 0: {
                return k0.k();
            }
            case 1: {
                Object object0 = set0.iterator().next();
                return k0.f(object0);
            }
            default: {
                return set0;
            }
        }
    }

    @f
    private static final Set s(Set set0) {
        return set0 == null ? k0.k() : set0;
    }

    @f
    private static final Set t() {
        return k0.k();
    }

    @l
    public static Set u(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return kotlin.collections.l.mz(arr_object);
    }

    @h0(version = "1.4")
    @l
    public static final Set v(@m Object object0) {
        return object0 == null ? k0.k() : k0.f(object0);
    }

    @h0(version = "1.4")
    @l
    public static final Set w(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return (Set)kotlin.collections.l.Ua(arr_object, new LinkedHashSet());
    }
}

