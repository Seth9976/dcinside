package kotlin.collections;

import A3.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.V;
import kotlin.W0;
import kotlin.b;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.r;
import kotlin.sequences.m;
import y4.l;
import z3.i;

@s0({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n412#1:823\n423#1:828\n520#1,6:833\n545#1,6:839\n1#2:814\n1246#3,4:815\n1246#3,4:819\n1246#3,4:824\n1246#3,4:829\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n462#1:823\n477#1:828\n535#1:833,6\n560#1:839,6\n412#1:815,4\n423#1:819,4\n462#1:824,4\n477#1:829,4\n*E\n"})
class b0 extends a0 {
    @l
    public static final Map A(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @f
    private static final void A0(Map map0, Object object0, Object object1) {
        L.p(map0, "<this>");
        map0.put(object0, object1);
    }

    @l
    public static final Map B(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0.getKey())).booleanValue()) {
                ((AbstractMap)map1).put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @l
    public static Map B0(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            switch(((Collection)iterable0).size()) {
                case 0: {
                    return Y.z();
                }
                case 1: {
                    if(iterable0 instanceof List) {
                        return Y.k(((V)((List)iterable0).get(0)));
                    }
                    Object object0 = iterable0.iterator().next();
                    return Y.k(((V)object0));
                }
                default: {
                    return b0.C0(iterable0, new LinkedHashMap(Y.j(((Collection)iterable0).size())));
                }
            }
        }
        return b0.k0(b0.C0(iterable0, new LinkedHashMap()));
    }

    @l
    public static final Map C(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @l
    public static final Map C0(@l Iterable iterable0, @l Map map0) {
        L.p(iterable0, "<this>");
        L.p(map0, "destination");
        Y.w0(map0, iterable0);
        return map0;
    }

    @l
    public static final Map D(@l Map map0, @l Map map1, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(map1, "destination");
        L.p(function10, "predicate");
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @h0(version = "1.1")
    @l
    public static Map D0(@l Map map0) {
        L.p(map0, "<this>");
        switch(map0.size()) {
            case 0: {
                return Y.z();
            }
            case 1: {
                return a0.o(map0);
            }
            default: {
                return Y.J0(map0);
            }
        }
    }

    @l
    public static final Map E(@l Map map0, @l Map map1, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(map1, "destination");
        L.p(function10, "predicate");
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                map1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @h0(version = "1.1")
    @l
    public static final Map E0(@l Map map0, @l Map map1) {
        L.p(map0, "<this>");
        L.p(map1, "destination");
        map1.putAll(map0);
        return map1;
    }

    @l
    public static final Map F(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0.getValue())).booleanValue()) {
                ((AbstractMap)map1).put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return map1;
    }

    @l
    public static final Map F0(@l m m0) {
        L.p(m0, "<this>");
        return b0.k0(b0.G0(m0, new LinkedHashMap()));
    }

    @f
    private static final Object G(Map map0, Object object0) {
        L.p(map0, "<this>");
        return map0.get(object0);
    }

    @l
    public static final Map G0(@l m m0, @l Map map0) {
        L.p(m0, "<this>");
        L.p(map0, "destination");
        Y.x0(map0, m0);
        return map0;
    }

    @f
    private static final Object H(Map map0, Object object0, a a0) {
        L.p(map0, "<this>");
        L.p(a0, "defaultValue");
        Object object1 = map0.get(object0);
        return object1 == null ? a0.invoke() : object1;
    }

    @l
    public static Map H0(@l V[] arr_v) {
        L.p(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                return Y.z();
            }
            case 1: {
                return Y.k(arr_v[0]);
            }
            default: {
                return b0.I0(arr_v, new LinkedHashMap(Y.j(arr_v.length)));
            }
        }
    }

    public static final Object I(@l Map map0, Object object0, @l a a0) {
        L.p(map0, "<this>");
        L.p(a0, "defaultValue");
        Object object1 = map0.get(object0);
        return object1 != null || map0.containsKey(object0) ? object1 : a0.invoke();
    }

    @l
    public static final Map I0(@l V[] arr_v, @l Map map0) {
        L.p(arr_v, "<this>");
        L.p(map0, "destination");
        Y.y0(map0, arr_v);
        return map0;
    }

    public static final Object J(@l Map map0, Object object0, @l a a0) {
        L.p(map0, "<this>");
        L.p(a0, "defaultValue");
        Object object1 = map0.get(object0);
        if(object1 == null) {
            object1 = a0.invoke();
            map0.put(object0, object1);
        }
        return object1;
    }

    @h0(version = "1.1")
    @l
    public static Map J0(@l Map map0) {
        L.p(map0, "<this>");
        return new LinkedHashMap(map0);
    }

    @h0(version = "1.1")
    public static Object K(@l Map map0, Object object0) {
        L.p(map0, "<this>");
        return Z.a(map0, object0);
    }

    @f
    private static final V K0(Map.Entry map$Entry0) {
        L.p(map$Entry0, "<this>");
        return new V(map$Entry0.getKey(), map$Entry0.getValue());
    }

    @h0(version = "1.1")
    @f
    private static final HashMap L() {
        return new HashMap();
    }

    @l
    public static HashMap M(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        HashMap hashMap0 = new HashMap(Y.j(arr_v.length));
        Y.y0(hashMap0, arr_v);
        return hashMap0;
    }

    @h0(version = "1.3")
    @f
    private static final Object N(Map map0, a a0) {
        L.p(a0, "defaultValue");
        return map0.isEmpty() ? a0.invoke() : map0;
    }

    @f
    private static final boolean O(Map map0) {
        L.p(map0, "<this>");
        return !map0.isEmpty();
    }

    @h0(version = "1.3")
    @f
    private static final boolean P(Map map0) {
        return map0 == null || map0.isEmpty();
    }

    @f
    private static final Iterator Q(Map map0) {
        L.p(map0, "<this>");
        return map0.entrySet().iterator();
    }

    @h0(version = "1.1")
    @f
    private static final LinkedHashMap R() {
        return new LinkedHashMap();
    }

    @l
    public static final LinkedHashMap S(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        return (LinkedHashMap)b0.I0(arr_v, new LinkedHashMap(Y.j(arr_v.length)));
    }

    @l
    public static final Map T(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "transform");
        Map map1 = new LinkedHashMap(Y.j(map0.size()));
        for(Object object0: map0.entrySet()) {
            map1.put(function10.invoke(object0), ((Map.Entry)object0).getValue());
        }
        return map1;
    }

    @l
    public static final Map U(@l Map map0, @l Map map1, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(map1, "destination");
        L.p(function10, "transform");
        for(Object object0: map0.entrySet()) {
            map1.put(function10.invoke(object0), ((Map.Entry)object0).getValue());
        }
        return map1;
    }

    @f
    private static final Map V() {
        return Y.z();
    }

    @l
    public static Map W(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        return arr_v.length <= 0 ? Y.z() : b0.I0(arr_v, new LinkedHashMap(Y.j(arr_v.length)));
    }

    @l
    public static final Map X(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "transform");
        Map map1 = new LinkedHashMap(Y.j(map0.size()));
        for(Object object0: map0.entrySet()) {
            map1.put(((Map.Entry)object0).getKey(), function10.invoke(object0));
        }
        return map1;
    }

    @l
    public static final Map Y(@l Map map0, @l Map map1, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(map1, "destination");
        L.p(function10, "transform");
        for(Object object0: map0.entrySet()) {
            map1.put(((Map.Entry)object0).getKey(), function10.invoke(object0));
        }
        return map1;
    }

    @h0(version = "1.1")
    @l
    public static final Map Z(@l Map map0, @l Iterable iterable0) {
        L.p(map0, "<this>");
        L.p(iterable0, "keys");
        Map map1 = Y.J0(map0);
        u.H0(map1.keySet(), iterable0);
        return b0.k0(map1);
    }

    @h0(version = "1.1")
    @l
    public static Map a0(@l Map map0, Object object0) {
        L.p(map0, "<this>");
        Map map1 = Y.J0(map0);
        map1.remove(object0);
        return b0.k0(map1);
    }

    @h0(version = "1.1")
    @l
    public static final Map b0(@l Map map0, @l m m0) {
        L.p(map0, "<this>");
        L.p(m0, "keys");
        Map map1 = Y.J0(map0);
        u.J0(map1.keySet(), m0);
        return b0.k0(map1);
    }

    @h0(version = "1.1")
    @l
    public static final Map c0(@l Map map0, @l Object[] arr_object) {
        L.p(map0, "<this>");
        L.p(arr_object, "keys");
        Map map1 = Y.J0(map0);
        u.K0(map1.keySet(), arr_object);
        return b0.k0(map1);
    }

    @h0(version = "1.1")
    @f
    private static final void d0(Map map0, Iterable iterable0) {
        L.p(map0, "<this>");
        L.p(iterable0, "keys");
        u.H0(map0.keySet(), iterable0);
    }

    @h0(version = "1.1")
    @f
    private static final void e0(Map map0, Object object0) {
        L.p(map0, "<this>");
        map0.remove(object0);
    }

    @h0(version = "1.1")
    @f
    private static final void f0(Map map0, m m0) {
        L.p(map0, "<this>");
        L.p(m0, "keys");
        u.J0(map0.keySet(), m0);
    }

    @h0(version = "1.1")
    @f
    private static final void g0(Map map0, Object[] arr_object) {
        L.p(map0, "<this>");
        L.p(arr_object, "keys");
        u.K0(map0.keySet(), arr_object);
    }

    @f
    @i(name = "mutableIterator")
    private static final Iterator h0(Map map0) {
        L.p(map0, "<this>");
        return map0.entrySet().iterator();
    }

    @h0(version = "1.1")
    @f
    private static final Map i0() {
        return new LinkedHashMap();
    }

    @l
    public static Map j0(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        Map map0 = new LinkedHashMap(Y.j(arr_v.length));
        Y.y0(map0, arr_v);
        return map0;
    }

    @l
    public static final Map k0(@l Map map0) {
        L.p(map0, "<this>");
        switch(map0.size()) {
            case 0: {
                return Y.z();
            }
            case 1: {
                return a0.o(map0);
            }
            default: {
                return map0;
            }
        }
    }

    @f
    private static final Map l0(Map map0) {
        return map0 == null ? Y.z() : map0;
    }

    @l
    public static final Map m0(@l Map map0, @l Iterable iterable0) {
        L.p(map0, "<this>");
        L.p(iterable0, "pairs");
        if(map0.isEmpty()) {
            return Y.B0(iterable0);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        Y.w0(linkedHashMap0, iterable0);
        return linkedHashMap0;
    }

    @l
    public static Map n0(@l Map map0, @l Map map1) {
        L.p(map0, "<this>");
        L.p(map1, "map");
        Map map2 = new LinkedHashMap(map0);
        ((AbstractMap)map2).putAll(map1);
        return map2;
    }

    @l
    public static Map o0(@l Map map0, @l V v0) {
        L.p(map0, "<this>");
        L.p(v0, "pair");
        if(map0.isEmpty()) {
            return Y.k(v0);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        linkedHashMap0.put(v0.e(), v0.f());
        return linkedHashMap0;
    }

    @l
    public static final Map p0(@l Map map0, @l m m0) {
        L.p(map0, "<this>");
        L.p(m0, "pairs");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        Y.x0(linkedHashMap0, m0);
        return b0.k0(linkedHashMap0);
    }

    @l
    public static final Map q0(@l Map map0, @l V[] arr_v) {
        L.p(map0, "<this>");
        L.p(arr_v, "pairs");
        if(map0.isEmpty()) {
            return Y.H0(arr_v);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(map0);
        Y.y0(linkedHashMap0, arr_v);
        return linkedHashMap0;
    }

    @f
    private static final void r0(Map map0, Iterable iterable0) {
        L.p(map0, "<this>");
        L.p(iterable0, "pairs");
        Y.w0(map0, iterable0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.6")
    @f
    private static final Map s(int v, @b Function1 function10) {
        L.p(function10, "builderAction");
        Map map0 = Y.h(v);
        function10.invoke(map0);
        return Y.d(map0);
    }

    @f
    private static final void s0(Map map0, Map map1) {
        L.p(map0, "<this>");
        L.p(map1, "map");
        map0.putAll(map1);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.6")
    @f
    private static final Map t(@b Function1 function10) {
        L.p(function10, "builderAction");
        Map map0 = Y.g();
        function10.invoke(map0);
        return Y.d(map0);
    }

    @f
    private static final void t0(Map map0, V v0) {
        L.p(map0, "<this>");
        L.p(v0, "pair");
        map0.put(v0.e(), v0.f());
    }

    @f
    private static final Object u(Map.Entry map$Entry0) {
        L.p(map$Entry0, "<this>");
        return map$Entry0.getKey();
    }

    @f
    private static final void u0(Map map0, m m0) {
        L.p(map0, "<this>");
        L.p(m0, "pairs");
        Y.x0(map0, m0);
    }

    @f
    private static final Object v(Map.Entry map$Entry0) {
        L.p(map$Entry0, "<this>");
        return map$Entry0.getValue();
    }

    @f
    private static final void v0(Map map0, V[] arr_v) {
        L.p(map0, "<this>");
        L.p(arr_v, "pairs");
        Y.y0(map0, arr_v);
    }

    @f
    private static final boolean w(Map map0, Object object0) {
        L.p(map0, "<this>");
        return map0.containsKey(object0);
    }

    public static void w0(@l Map map0, @l Iterable iterable0) {
        L.p(map0, "<this>");
        L.p(iterable0, "pairs");
        for(Object object0: iterable0) {
            map0.put(((V)object0).a(), ((V)object0).b());
        }
    }

    @f
    private static final boolean x(Map map0, Object object0) {
        L.p(map0, "<this>");
        return map0.containsKey(object0);
    }

    public static void x0(@l Map map0, @l m m0) {
        L.p(map0, "<this>");
        L.p(m0, "pairs");
        for(Object object0: m0) {
            map0.put(((V)object0).a(), ((V)object0).b());
        }
    }

    @f
    private static final boolean y(Map map0, Object object0) {
        L.p(map0, "<this>");
        return map0.containsValue(object0);
    }

    public static void y0(@l Map map0, @l V[] arr_v) {
        L.p(map0, "<this>");
        L.p(arr_v, "pairs");
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            map0.put(v1.a(), v1.b());
        }
    }

    @l
    public static Map z() {
        L.n(I.a, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return I.a;
    }

    @f
    private static final Object z0(Map map0, Object object0) {
        L.p(map0, "<this>");
        return v0.k(map0).remove(object0);
    }
}

