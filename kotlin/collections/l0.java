package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.b0;
import kotlin.collections.builders.j;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

class l0 {
    @b0
    @h0(version = "1.3")
    @l
    public static Set a(@l Set set0) {
        L.p(set0, "builder");
        return ((j)set0).b();
    }

    @b0
    @h0(version = "1.3")
    @f
    private static final Set b(int v, Function1 function10) {
        L.p(function10, "builderAction");
        Set set0 = k0.e(v);
        function10.invoke(set0);
        return k0.a(set0);
    }

    @b0
    @h0(version = "1.3")
    @f
    private static final Set c(Function1 function10) {
        L.p(function10, "builderAction");
        Set set0 = k0.d();
        function10.invoke(set0);
        return k0.a(set0);
    }

    @b0
    @h0(version = "1.3")
    @l
    public static Set d() {
        return new j();
    }

    @b0
    @h0(version = "1.3")
    @l
    public static Set e(int v) {
        return new j(v);
    }

    @l
    public static Set f(Object object0) {
        Set set0 = Collections.singleton(object0);
        L.o(set0, "singleton(...)");
        return set0;
    }

    @l
    public static final TreeSet g(@l Comparator comparator0, @l Object[] arr_object) {
        L.p(comparator0, "comparator");
        L.p(arr_object, "elements");
        return (TreeSet)p.py(arr_object, new TreeSet(comparator0));
    }

    @l
    public static TreeSet h(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return (TreeSet)p.py(arr_object, new TreeSet());
    }
}

