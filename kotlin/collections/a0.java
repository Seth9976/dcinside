package kotlin.collections;

import A3.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.V;
import kotlin.b0;
import kotlin.collections.builders.d;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
class a0 extends Z {
    private static final int a = 0x40000000;

    @b0
    @h0(version = "1.3")
    @l
    public static Map d(@l Map map0) {
        L.p(map0, "builder");
        return ((d)map0).m();
    }

    @b0
    @h0(version = "1.3")
    @f
    private static final Map e(int v, Function1 function10) {
        L.p(function10, "builderAction");
        Map map0 = Y.h(v);
        function10.invoke(map0);
        return Y.d(map0);
    }

    @b0
    @h0(version = "1.3")
    @f
    private static final Map f(Function1 function10) {
        L.p(function10, "builderAction");
        Map map0 = Y.g();
        function10.invoke(map0);
        return Y.d(map0);
    }

    @b0
    @h0(version = "1.3")
    @l
    public static Map g() {
        return new d();
    }

    @b0
    @h0(version = "1.3")
    @l
    public static Map h(int v) {
        return new d(v);
    }

    public static final Object i(@l ConcurrentMap concurrentMap0, Object object0, @l a a0) {
        L.p(concurrentMap0, "<this>");
        L.p(a0, "defaultValue");
        Object object1 = concurrentMap0.get(object0);
        if(object1 == null) {
            Object object2 = a0.invoke();
            Object object3 = concurrentMap0.putIfAbsent(object0, object2);
            return object3 == null ? object2 : object3;
        }
        return object1;
    }

    @b0
    public static int j(int v) {
        if(v >= 0) {
            if(v < 3) {
                return v + 1;
            }
            return v >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v) / 0.75f + 1.0f));
        }
        return v;
    }

    @l
    public static Map k(@l V v0) {
        L.p(v0, "pair");
        Map map0 = Collections.singletonMap(v0.e(), v0.f());
        L.o(map0, "singletonMap(...)");
        return map0;
    }

    @h0(version = "1.4")
    @l
    public static final SortedMap l(@l Comparator comparator0, @l V[] arr_v) {
        L.p(comparator0, "comparator");
        L.p(arr_v, "pairs");
        SortedMap sortedMap0 = new TreeMap(comparator0);
        Y.y0(sortedMap0, arr_v);
        return sortedMap0;
    }

    @l
    public static final SortedMap m(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        SortedMap sortedMap0 = new TreeMap();
        Y.y0(sortedMap0, arr_v);
        return sortedMap0;
    }

    @f
    private static final Properties n(Map map0) {
        L.p(map0, "<this>");
        Properties properties0 = new Properties();
        properties0.putAll(map0);
        return properties0;
    }

    @l
    public static final Map o(@l Map map0) {
        L.p(map0, "<this>");
        Object object0 = map0.entrySet().iterator().next();
        Map map1 = Collections.singletonMap(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        L.o(map1, "with(...)");
        return map1;
    }

    @f
    private static final Map p(Map map0) {
        L.p(map0, "<this>");
        return a0.o(map0);
    }

    @l
    public static final SortedMap q(@l Map map0) {
        L.p(map0, "<this>");
        return new TreeMap(map0);
    }

    @l
    public static final SortedMap r(@l Map map0, @l Comparator comparator0) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        SortedMap sortedMap0 = new TreeMap(comparator0);
        ((TreeMap)sortedMap0).putAll(map0);
        return sortedMap0;
    }
}

