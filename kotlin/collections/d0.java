package kotlin.collections;

import A3.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.U;
import kotlin.V;
import kotlin.h0;
import kotlin.internal.e;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import y4.l;
import z3.i;

@s0({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n97#1,5:596\n112#1,5:601\n153#1,3:606\n144#1:609\n216#1:610\n217#1:612\n145#1:613\n216#1:614\n217#1:616\n1#2:611\n1#2:615\n1948#3,14:617\n1971#3,14:631\n2318#3,14:645\n2341#3,14:659\n1872#3,3:673\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n77#1:596,5\n90#1:601,5\n126#1:606,3\n136#1:609\n136#1:610\n136#1:612\n136#1:613\n144#1:614\n144#1:616\n136#1:611\n231#1:617,14\n242#1:631,14\n391#1:645,14\n402#1:659,14\n575#1:673,3\n*E\n"})
class d0 extends c0 {
    @U
    @h0(version = "1.4")
    @f
    private static final Float A1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)function10.invoke(object0)).floatValue(); iterator0.hasNext(); f = Math.min(f, ((Number)function10.invoke(object1)).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object B1(Map map0, Comparator comparator0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Object object1 = function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Object object3 = function10.invoke(object2);
            if(comparator0.compare(object1, object3) > 0) {
                object1 = object3;
            }
        }
        return object1;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object C1(Map map0, Comparator comparator0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Object object1 = function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Object object3 = function10.invoke(object2);
            if(comparator0.compare(object1, object3) > 0) {
                object1 = object3;
            }
        }
        return object1;
    }

    @h0(version = "1.4")
    @f
    private static final Map.Entry D1(Map map0, Comparator comparator0) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        return (Map.Entry)E.n4(map0.entrySet(), comparator0);
    }

    @h0(version = "1.7")
    @f
    @i(name = "minWithOrThrow")
    private static final Map.Entry E1(Map map0, Comparator comparator0) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        return (Map.Entry)E.o4(map0.entrySet(), comparator0);
    }

    public static final boolean F1(@l Map map0) {
        L.p(map0, "<this>");
        return map0.isEmpty();
    }

    public static final boolean G1(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        if(map0.isEmpty()) {
            return true;
        }
        for(Object object0: map0.entrySet()) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @h0(version = "1.1")
    @l
    public static final Map H1(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "action");
        for(Object object0: map0.entrySet()) {
            function10.invoke(((Map.Entry)object0));
        }
        return map0;
    }

    @h0(version = "1.4")
    @l
    public static final Map I1(@l Map map0, @l o o0) {
        L.p(map0, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(Object object0: map0.entrySet()) {
            if(v < 0) {
                u.Z();
            }
            o0.invoke(v, object0);
            ++v;
        }
        return map0;
    }

    @l
    public static List J1(@l Map map0) {
        L.p(map0, "<this>");
        if(map0.size() == 0) {
            return u.H();
        }
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return u.H();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return u.k(new V(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()));
        }
        List list0 = new ArrayList(map0.size());
        ((ArrayList)list0).add(new V(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()));
        do {
            Object object1 = iterator0.next();
            ((ArrayList)list0).add(new V(((Map.Entry)object1).getKey(), ((Map.Entry)object1).getValue()));
        }
        while(iterator0.hasNext());
        return list0;
    }

    public static final boolean P0(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        if(map0.isEmpty()) {
            return true;
        }
        for(Object object0: map0.entrySet()) {
            if(!((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static final boolean Q0(@l Map map0) {
        L.p(map0, "<this>");
        return !map0.isEmpty();
    }

    public static final boolean R0(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        if(map0.isEmpty()) {
            return false;
        }
        for(Object object0: map0.entrySet()) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @f
    private static final Iterable S0(Map map0) {
        L.p(map0, "<this>");
        return map0.entrySet();
    }

    @l
    public static m T0(@l Map map0) {
        L.p(map0, "<this>");
        return u.A1(map0.entrySet());
    }

    @f
    private static final int U0(Map map0) {
        L.p(map0, "<this>");
        return map0.size();
    }

    public static final int V0(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "predicate");
        int v = 0;
        if(map0.isEmpty()) {
            return 0;
        }
        for(Object object0: map0.entrySet()) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                ++v;
            }
        }
        return v;
    }

    @h0(version = "1.5")
    @f
    private static final Object W0(Map map0, Function1 function10) {
        Object object0 = null;
        L.p(map0, "<this>");
        L.p(function10, "transform");
        for(Object object1: map0.entrySet()) {
            Object object2 = function10.invoke(((Map.Entry)object1));
            if(object2 != null) {
                object0 = object2;
                break;
            }
        }
        if(object0 == null) {
            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
        }
        return object0;
    }

    @h0(version = "1.5")
    @f
    private static final Object X0(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "transform");
        for(Object object0: map0.entrySet()) {
            Object object1 = function10.invoke(((Map.Entry)object0));
            if(object1 != null) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @l
    public static final List Y0(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            u.q0(list0, ((Iterable)function10.invoke(((Map.Entry)object0))));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapSequence")
    public static final List Z0(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            u.r0(list0, ((m)function10.invoke(((Map.Entry)object0))));
        }
        return list0;
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapSequenceTo")
    public static final Collection a1(@l Map map0, @l Collection collection0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: map0.entrySet()) {
            u.r0(collection0, ((m)function10.invoke(((Map.Entry)object0))));
        }
        return collection0;
    }

    @l
    public static final Collection b1(@l Map map0, @l Collection collection0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: map0.entrySet()) {
            u.q0(collection0, ((Iterable)function10.invoke(((Map.Entry)object0))));
        }
        return collection0;
    }

    @e
    public static final void c1(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "action");
        for(Object object0: map0.entrySet()) {
            function10.invoke(((Map.Entry)object0));
        }
    }

    @l
    public static final List d1(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList(map0.size());
        for(Object object0: map0.entrySet()) {
            list0.add(function10.invoke(((Map.Entry)object0)));
        }
        return list0;
    }

    @l
    public static final List e1(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            Object object1 = function10.invoke(((Map.Entry)object0));
            if(object1 != null) {
                list0.add(object1);
            }
        }
        return list0;
    }

    @l
    public static final Collection f1(@l Map map0, @l Collection collection0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: map0.entrySet()) {
            Object object1 = function10.invoke(((Map.Entry)object0));
            if(object1 != null) {
                collection0.add(object1);
            }
        }
        return collection0;
    }

    @l
    public static final Collection g1(@l Map map0, @l Collection collection0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: map0.entrySet()) {
            collection0.add(function10.invoke(((Map.Entry)object0)));
        }
        return collection0;
    }

    @h0(version = "1.4")
    @f
    private static final Map.Entry h1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return (Map.Entry)object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return (Map.Entry)object0;
    }

    @h0(version = "1.7")
    @f
    @i(name = "maxByOrThrow")
    private static final Map.Entry i1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            Comparable comparable0 = (Comparable)function10.invoke(object0);
            while(true) {
                Object object1 = iterator0.next();
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) < 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
        return (Map.Entry)object0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double j1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)function10.invoke(object0)).doubleValue(); iterator0.hasNext(); f = Math.max(f, ((Number)function10.invoke(object1)).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float k1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)function10.invoke(object0)).floatValue(); iterator0.hasNext(); f = Math.max(f, ((Number)function10.invoke(object1)).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable l1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable m1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double n1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)function10.invoke(object0)).doubleValue(); iterator0.hasNext(); f = Math.max(f, ((Number)function10.invoke(object1)).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Float o1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)function10.invoke(object0)).floatValue(); iterator0.hasNext(); f = Math.max(f, ((Number)function10.invoke(object1)).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object p1(Map map0, Comparator comparator0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Object object1 = function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Object object3 = function10.invoke(object2);
            if(comparator0.compare(object1, object3) < 0) {
                object1 = object3;
            }
        }
        return object1;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object q1(Map map0, Comparator comparator0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Object object1 = function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Object object3 = function10.invoke(object2);
            if(comparator0.compare(object1, object3) < 0) {
                object1 = object3;
            }
        }
        return object1;
    }

    @h0(version = "1.4")
    @f
    private static final Map.Entry r1(Map map0, Comparator comparator0) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        return (Map.Entry)E.V3(map0.entrySet(), comparator0);
    }

    @h0(version = "1.7")
    @f
    @i(name = "maxWithOrThrow")
    private static final Map.Entry s1(Map map0, Comparator comparator0) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        return (Map.Entry)E.W3(map0.entrySet(), comparator0);
    }

    @h0(version = "1.4")
    @f
    private static final Map.Entry t1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return (Map.Entry)object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return (Map.Entry)object0;
    }

    @h0(version = "1.7")
    @f
    @i(name = "minByOrThrow")
    private static final Map.Entry u1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            Comparable comparable0 = (Comparable)function10.invoke(object0);
            while(true) {
                Object object1 = iterator0.next();
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) > 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
        return (Map.Entry)object0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double v1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)function10.invoke(object0)).doubleValue(); iterator0.hasNext(); f = Math.min(f, ((Number)function10.invoke(object1)).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float w1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)function10.invoke(object0)).floatValue(); iterator0.hasNext(); f = Math.min(f, ((Number)function10.invoke(object1)).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable x1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable y1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double z1(Map map0, Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)function10.invoke(object0)).doubleValue(); iterator0.hasNext(); f = Math.min(f, ((Number)function10.invoke(object1)).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }
}

