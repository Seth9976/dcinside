package kotlin.sequences;

import A3.o;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.D0;
import kotlin.H0;
import kotlin.S0;
import kotlin.U;
import kotlin.V;
import kotlin.W0;
import kotlin.c0;
import kotlin.collections.P;
import kotlin.collections.k0;
import kotlin.collections.p0;
import kotlin.comparisons.g.a;
import kotlin.comparisons.g.c;
import kotlin.f0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.text.v;
import y4.l;
import z3.i;

@s0({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n183#1,2:3113\n320#1,7:3115\n1328#1,3:3123\n743#1,4:3126\n708#1,4:3130\n726#1,4:3134\n779#1,4:3138\n1021#1,3:3142\n1024#1,3:3152\n1041#1,3:3155\n1044#1,3:3165\n1328#1,3:3182\n1317#1,2:3185\n1#2:3122\n381#3,7:3145\n381#3,7:3158\n381#3,7:3168\n381#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n91#1:3113,2\n103#1:3115,7\n462#1:3123,3\n662#1:3126,4\n678#1:3130,4\n693#1:3134,4\n764#1:3138,4\n992#1:3142,3\n992#1:3152,3\n1007#1:3155,3\n1007#1:3165,3\n1110#1:3182,3\n1148#1:3185,2\n992#1:3145,7\n1007#1:3158,7\n1023#1:3168,7\n1043#1:3175,7\n*E\n"})
class u extends t {
    @f
    private static final Object A0(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        Object object0 = null;
        for(Object object1: m0) {
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                object0 = object1;
            }
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object A1(m m0, Comparator comparator0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @h0(version = "1.4")
    @l
    public static final m A2(@l m m0, Object object0, @l o o0) {
        L.p(m0, "<this>");
        L.p(o0, "operation");
        return p.w2(m0, object0, o0);
    }

    public static final Object B0(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        return iterator0.next();
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object B1(m m0, Comparator comparator0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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
    @l
    public static final m B2(@l m m0, Object object0, @l A3.p p0) {
        L.p(m0, "<this>");
        L.p(p0, "operation");
        return u.x2(m0, object0, p0);
    }

    public static final Object C0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @h0(version = "1.4")
    @y4.m
    public static Comparable C1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    public static final Object C2(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return object0;
    }

    @h0(version = "1.5")
    @f
    private static final Object D0(m m0, Function1 function10) {
        Object object0 = null;
        L.p(m0, "<this>");
        L.p(function10, "transform");
        for(Object object1: m0) {
            Object object2 = function10.invoke(object1);
            if(object2 != null) {
                object0 = object2;
                break;
            }
        }
        if(object0 == null) {
            throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
        }
        return object0;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Double D1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    public static final Object D2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        Object object0 = null;
        boolean z = false;
        for(Object object1: m0) {
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z = true;
                object0 = object1;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return object0;
    }

    @h0(version = "1.5")
    @f
    private static final Object E0(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "transform");
        for(Object object0: m0) {
            Object object1 = function10.invoke(object0);
            if(object1 != null) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Float E1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @y4.m
    public static final Object E2(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        return iterator0.hasNext() ? null : object0;
    }

    @y4.m
    public static Object F0(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        return !iterator0.hasNext() ? null : iterator0.next();
    }

    @h0(version = "1.7")
    @i(name = "maxOrThrow")
    public static final double F1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @y4.m
    public static final Object F2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        boolean z = false;
        Object object0 = null;
        for(Object object1: m0) {
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                if(z) {
                    return null;
                }
                z = true;
                object0 = object1;
            }
        }
        return z ? object0 : null;
    }

    @y4.m
    public static final Object G0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @h0(version = "1.7")
    @i(name = "maxOrThrow")
    public static final float G1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.max(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @l
    public static final m G2(@l m m0) {
        public static final class x implements m {
            final m a;

            x(m m0) {
                this.a = m0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                List list0 = p.d3(this.a);
                kotlin.collections.u.m0(list0);
                return list0.iterator();
            }
        }

        L.p(m0, "<this>");
        return new x(m0);
    }

    @l
    public static final m H0(@l m m0, @l Function1 function10) {
        final class kotlin.sequences.u.i extends H implements Function1 {
            public static final kotlin.sequences.u.i a;

            static {
                kotlin.sequences.u.i.a = new kotlin.sequences.u.i();
            }

            kotlin.sequences.u.i() {
                super(1, m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
            }

            public final Iterator a(m m0) {
                L.p(m0, "p0");
                return m0.iterator();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((m)object0));
            }
        }

        L.p(m0, "<this>");
        L.p(function10, "transform");
        return new kotlin.sequences.i(m0, function10, kotlin.sequences.u.i.a);
    }

    @h0(version = "1.7")
    @l
    @i(name = "maxOrThrow")
    public static final Comparable H1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @l
    public static final m H2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        return p.K2(m0, new a(function10));
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapIndexedIterable")
    public static final m I0(@l m m0, @l o o0) {
        final class j extends H implements Function1 {
            public static final j a;

            static {
                j.a = new j();
            }

            j() {
                super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
            }

            public final Iterator a(Iterable iterable0) {
                L.p(iterable0, "p0");
                return iterable0.iterator();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Iterable)object0));
            }
        }

        L.p(m0, "<this>");
        L.p(o0, "transform");
        return s.h(m0, o0, j.a);
    }

    @h0(version = "1.4")
    @y4.m
    public static final Object I1(@l m m0, @l Comparator comparator0) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @l
    public static final m I2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        return p.K2(m0, new c(function10));
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedIterableTo")
    private static final Collection J0(m m0, Collection collection0, o o0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(Object object0: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            kotlin.collections.u.q0(collection0, ((Iterable)o0.invoke(v, object0)));
            ++v;
        }
        return collection0;
    }

    @h0(version = "1.7")
    @i(name = "maxWithOrThrow")
    public static final Object J1(@l m m0, @l Comparator comparator0) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @l
    public static final m J2(@l m m0) {
        L.p(m0, "<this>");
        return p.K2(m0, kotlin.comparisons.a.x());
    }

    public static final boolean K(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapIndexedSequence")
    public static final m K0(@l m m0, @l o o0) {
        final class k extends H implements Function1 {
            public static final k a;

            static {
                k.a = new k();
            }

            k() {
                super(1, m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
            }

            public final Iterator a(m m0) {
                L.p(m0, "p0");
                return m0.iterator();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((m)object0));
            }
        }

        L.p(m0, "<this>");
        L.p(o0, "transform");
        return s.h(m0, o0, k.a);
    }

    @h0(version = "1.4")
    @y4.m
    public static final Object K1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
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
        return object0;
    }

    @l
    public static m K2(@l m m0, @l Comparator comparator0) {
        public static final class y implements m {
            final m a;
            final Comparator b;

            y(m m0, Comparator comparator0) {
                this.a = m0;
                this.b = comparator0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                List list0 = p.d3(this.a);
                kotlin.collections.u.p0(list0, this.b);
                return list0.iterator();
            }
        }

        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        return new y(m0, comparator0);
    }

    public static final boolean L(@l m m0) {
        L.p(m0, "<this>");
        return m0.iterator().hasNext();
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "flatMapIndexedSequenceTo")
    private static final Collection L0(m m0, Collection collection0, o o0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(Object object0: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            kotlin.collections.u.r0(collection0, ((m)o0.invoke(v, object0)));
            ++v;
        }
        return collection0;
    }

    @h0(version = "1.7")
    @i(name = "minByOrThrow")
    public static final Object L1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
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
        return object0;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final int L2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        int v = 0;
        for(Object object0: m0) {
            v += ((Number)function10.invoke(object0)).intValue();
        }
        return v;
    }

    public static final boolean M(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapIterable")
    public static final m M0(@l m m0, @l Function1 function10) {
        final class h extends H implements Function1 {
            public static final h a;

            static {
                h.a = new h();
            }

            h() {
                super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
            }

            public final Iterator a(Iterable iterable0) {
                L.p(iterable0, "p0");
                return iterable0.iterator();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Iterable)object0));
            }
        }

        L.p(m0, "<this>");
        L.p(function10, "transform");
        return new kotlin.sequences.i(m0, function10, h.a);
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double M1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @c0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    public static final double M2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(Object object0: m0) {
            f += ((Number)function10.invoke(object0)).doubleValue();
        }
        return f;
    }

    @l
    public static Iterable N(@l m m0) {
        @s0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,17:1\n2921#2:18\n*E\n"})
        public static final class kotlin.sequences.u.a implements B3.a, Iterable {
            final m a;

            public kotlin.sequences.u.a(m m0) {
                this.a = m0;
                super();
            }

            @Override
            public Iterator iterator() {
                return this.a.iterator();
            }
        }

        L.p(m0, "<this>");
        return new kotlin.sequences.u.a(m0);
    }

    @U
    @h0(version = "1.4")
    @l
    @i(name = "flatMapIterableTo")
    public static final Collection N0(@l m m0, @l Collection collection0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: m0) {
            kotlin.collections.u.q0(collection0, ((Iterable)function10.invoke(object0)));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float N1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @i(name = "sumOfByte")
    public static final int N2(@l m m0) {
        L.p(m0, "<this>");
        int v = 0;
        for(Object object0: m0) {
            v += ((Number)object0).byteValue();
        }
        return v;
    }

    @f
    private static final m O(m m0) {
        L.p(m0, "<this>");
        return m0;
    }

    @l
    public static final Collection O0(@l m m0, @l Collection collection0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: m0) {
            kotlin.collections.u.r0(collection0, ((m)function10.invoke(object0)));
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable O1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @i(name = "sumOfDouble")
    public static final double O2(@l m m0) {
        L.p(m0, "<this>");
        double f = 0.0;
        for(Object object0: m0) {
            f += ((Number)object0).doubleValue();
        }
        return f;
    }

    @l
    public static final Map P(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap();
        for(Object object0: m0) {
            V v0 = (V)function10.invoke(object0);
            map0.put(v0.e(), v0.f());
        }
        return map0;
    }

    public static final Object P0(@l m m0, Object object0, @l o o0) {
        L.p(m0, "<this>");
        L.p(o0, "operation");
        for(Object object1: m0) {
            object0 = o0.invoke(object0, object1);
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable P1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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
    @i(name = "sumOfDouble")
    private static final double P2(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        double f = 0.0;
        for(Object object0: m0) {
            f += ((Number)function10.invoke(object0)).doubleValue();
        }
        return f;
    }

    @l
    public static final Map Q(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(Object object0: m0) {
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    public static final Object Q0(@l m m0, Object object0, @l A3.p p0) {
        L.p(m0, "<this>");
        L.p(p0, "operation");
        int v = 0;
        for(Object object1: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            object0 = p0.invoke(v, object0, object1);
            ++v;
        }
        return object0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double Q1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @i(name = "sumOfFloat")
    public static final float Q2(@l m m0) {
        L.p(m0, "<this>");
        float f = 0.0f;
        for(Object object0: m0) {
            f += ((Number)object0).floatValue();
        }
        return f;
    }

    @l
    public static final Map R(@l m m0, @l Function1 function10, @l Function1 function11) {
        L.p(m0, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(Object object0: m0) {
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    public static final void R0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "action");
        for(Object object0: m0) {
            function10.invoke(object0);
        }
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Float R1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @i(name = "sumOfInt")
    public static final int R2(@l m m0) {
        L.p(m0, "<this>");
        int v = 0;
        for(Object object0: m0) {
            v += ((Number)object0).intValue();
        }
        return v;
    }

    @l
    public static final Map S(@l m m0, @l Map map0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(Object object0: m0) {
            map0.put(function10.invoke(object0), object0);
        }
        return map0;
    }

    public static final void S0(@l m m0, @l o o0) {
        L.p(m0, "<this>");
        L.p(o0, "action");
        int v = 0;
        for(Object object0: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            o0.invoke(v, object0);
            ++v;
        }
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object S1(m m0, Comparator comparator0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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
    @i(name = "sumOfInt")
    private static final int S2(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        int v = 0;
        for(Object object0: m0) {
            v += ((Number)function10.invoke(object0)).intValue();
        }
        return v;
    }

    @l
    public static final Map T(@l m m0, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(m0, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(Object object0: m0) {
            map0.put(function10.invoke(object0), function11.invoke(object0));
        }
        return map0;
    }

    @l
    public static final Map T0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(Object object0: m0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(object0);
        }
        return map0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Object T1(m m0, Comparator comparator0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @i(name = "sumOfLong")
    public static final long T2(@l m m0) {
        L.p(m0, "<this>");
        long v = 0L;
        for(Object object0: m0) {
            v += ((Number)object0).longValue();
        }
        return v;
    }

    @l
    public static final Map U(@l m m0, @l Map map0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(map0, "destination");
        L.p(function10, "transform");
        for(Object object0: m0) {
            V v0 = (V)function10.invoke(object0);
            map0.put(v0.e(), v0.f());
        }
        return map0;
    }

    @l
    public static final Map U0(@l m m0, @l Function1 function10, @l Function1 function11) {
        L.p(m0, "<this>");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(Object object0: m0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(function11.invoke(object0));
        }
        return map0;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Comparable U1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfLong")
    private static final long U2(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(Object object0: m0) {
            v += ((Number)function10.invoke(object0)).longValue();
        }
        return v;
    }

    @h0(version = "1.3")
    @l
    public static final Map V(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "valueSelector");
        Map map0 = new LinkedHashMap();
        for(Object object0: m0) {
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @l
    public static final Map V0(@l m m0, @l Map map0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        for(Object object0: m0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(object0);
        }
        return map0;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Double V1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @i(name = "sumOfShort")
    public static final int V2(@l m m0) {
        L.p(m0, "<this>");
        int v = 0;
        for(Object object0: m0) {
            v += ((Number)object0).shortValue();
        }
        return v;
    }

    @h0(version = "1.3")
    @l
    public static final Map W(@l m m0, @l Map map0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(map0, "destination");
        L.p(function10, "valueSelector");
        for(Object object0: m0) {
            map0.put(object0, function10.invoke(object0));
        }
        return map0;
    }

    @l
    public static final Map W0(@l m m0, @l Map map0, @l Function1 function10, @l Function1 function11) {
        L.p(m0, "<this>");
        L.p(map0, "destination");
        L.p(function10, "keySelector");
        L.p(function11, "valueTransform");
        for(Object object0: m0) {
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(function11.invoke(object0));
        }
        return map0;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Float W1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfUInt")
    private static final int W2(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        int v = 0;
        for(Object object0: m0) {
            v = D0.h(v + ((D0)function10.invoke(object0)).l0());
        }
        return v;
    }

    @i(name = "averageOfByte")
    public static final double X(@l m m0) {
        L.p(m0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: m0) {
            f += (double)((Number)object0).byteValue();
            ++v;
            if(v < 0) {
                kotlin.collections.u.Y();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @h0(version = "1.1")
    @l
    public static final kotlin.collections.L X0(@l m m0, @l Function1 function10) {
        public static final class kotlin.sequences.u.l implements kotlin.collections.L {
            final m a;
            final Function1 b;

            public kotlin.sequences.u.l(m m0, Function1 function10) {
                this.a = m0;
                this.b = function10;
                super();
            }

            @Override  // kotlin.collections.L
            public Object a(Object object0) {
                return this.b.invoke(object0);
            }

            @Override  // kotlin.collections.L
            public Iterator b() {
                return this.a.iterator();
            }
        }

        L.p(m0, "<this>");
        L.p(function10, "keySelector");
        return new kotlin.sequences.u.l(m0, function10);
    }

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final double X1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        double f;
        for(f = ((Number)object0).doubleValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).doubleValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @U
    @W0(markerClass = {kotlin.t.class})
    @h0(version = "1.5")
    @f
    @i(name = "sumOfULong")
    private static final long X2(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        long v = 0L;
        for(Object object0: m0) {
            v = H0.h(v + ((H0)function10.invoke(object0)).l0());
        }
        return v;
    }

    @i(name = "averageOfDouble")
    public static final double Y(@l m m0) {
        L.p(m0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: m0) {
            f += ((Number)object0).doubleValue();
            ++v;
            if(v < 0) {
                kotlin.collections.u.Y();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    public static final int Y0(@l m m0, Object object0) {
        L.p(m0, "<this>");
        int v = 0;
        for(Object object1: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            if(L.g(object0, object1)) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    @h0(version = "1.7")
    @i(name = "minOrThrow")
    public static final float Y1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f;
        for(f = ((Number)object0).floatValue(); iterator0.hasNext(); f = Math.min(f, ((Number)object1).floatValue())) {
            Object object1 = iterator0.next();
        }
        return f;
    }

    @l
    public static m Y2(@l m m0, int v) {
        L.p(m0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return p.g();
        }
        return m0 instanceof e ? ((e)m0).b(v) : new w(m0, v);
    }

    @i(name = "averageOfFloat")
    public static final double Z(@l m m0) {
        L.p(m0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: m0) {
            f += (double)((Number)object0).floatValue();
            ++v;
            if(v < 0) {
                kotlin.collections.u.Y();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    public static final int Z0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        int v = 0;
        for(Object object0: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    @h0(version = "1.7")
    @l
    @i(name = "minOrThrow")
    public static final Comparable Z1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    @l
    public static m Z2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        return new kotlin.sequences.x(m0, function10);
    }

    @i(name = "averageOfInt")
    public static final double a0(@l m m0) {
        L.p(m0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: m0) {
            f += (double)((Number)object0).intValue();
            ++v;
            if(v < 0) {
                kotlin.collections.u.Y();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    public static final int a1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        int v = -1;
        int v1 = 0;
        for(Object object0: m0) {
            if(v1 < 0) {
                kotlin.collections.u.Z();
            }
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                v = v1;
            }
            ++v1;
        }
        return v;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Object a2(@l m m0, @l Comparator comparator0) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @l
    public static final Collection a3(@l m m0, @l Collection collection0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        for(Object object0: m0) {
            collection0.add(object0);
        }
        return collection0;
    }

    @i(name = "averageOfLong")
    public static final double b0(@l m m0) {
        L.p(m0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: m0) {
            f += (double)((Number)object0).longValue();
            ++v;
            if(v < 0) {
                kotlin.collections.u.Y();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    @l
    public static final Appendable b1(@l m m0, @l Appendable appendable0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @y4.m Function1 function10) {
        L.p(m0, "<this>");
        L.p(appendable0, "buffer");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v1 = 0;
        for(Object object0: m0) {
            ++v1;
            if(v1 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v1 > v) {
                break;
            }
            v.b(appendable0, object0, function10);
        }
        if(v >= 0 && v1 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    @h0(version = "1.7")
    @i(name = "minWithOrThrow")
    public static final Object b2(@l m m0, @l Comparator comparator0) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @l
    public static final HashSet b3(@l m m0) {
        L.p(m0, "<this>");
        return (HashSet)u.a3(m0, new HashSet());
    }

    @i(name = "averageOfShort")
    public static final double c0(@l m m0) {
        L.p(m0, "<this>");
        double f = 0.0;
        int v = 0;
        for(Object object0: m0) {
            f += (double)((Number)object0).shortValue();
            ++v;
            if(v < 0) {
                kotlin.collections.u.Y();
            }
        }
        return v == 0 ? NaN : f / ((double)v);
    }

    public static Appendable c1(m m0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? u.b1(m0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : u.b1(m0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? u.b1(m0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : u.b1(m0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @l
    public static final m c2(@l m m0, @l Iterable iterable0) {
        public static final class kotlin.sequences.u.o implements m {
            final Iterable a;
            final m b;

            kotlin.sequences.u.o(Iterable iterable0, m m0) {
                this.a = iterable0;
                this.b = m0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                static final class kotlin.sequences.u.o.a extends N implements Function1 {
                    final Collection e;

                    kotlin.sequences.u.o.a(Collection collection0) {
                        this.e = collection0;
                        super(1);
                    }

                    public final Boolean a(Object object0) {
                        return Boolean.valueOf(this.e.contains(object0));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(object0);
                    }
                }

                Collection collection0 = kotlin.collections.u.t0(this.a);
                if(collection0.isEmpty()) {
                    return this.b.iterator();
                }
                kotlin.sequences.u.o.a u$o$a0 = new kotlin.sequences.u.o.a(collection0);
                return p.u0(this.b, u$o$a0).iterator();
            }
        }

        L.p(m0, "<this>");
        L.p(iterable0, "elements");
        return new kotlin.sequences.u.o(iterable0, m0);
    }

    @l
    public static List c3(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return kotlin.collections.u.H();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return kotlin.collections.u.k(object0);
        }
        List list0 = new ArrayList();
        ((ArrayList)list0).add(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            ((ArrayList)list0).add(object1);
        }
        return list0;
    }

    @h0(version = "1.2")
    @l
    public static final m d0(@l m m0, int v) {
        L.p(m0, "<this>");
        return u.g3(m0, v, v, true);
    }

    @l
    public static final String d1(@l m m0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @y4.m Function1 function10) {
        L.p(m0, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)u.b1(m0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "toString(...)");
        return s;
    }

    @l
    public static final m d2(@l m m0, Object object0) {
        public static final class kotlin.sequences.u.m implements m {
            final m a;
            final Object b;

            kotlin.sequences.u.m(m m0, Object object0) {
                this.a = m0;
                this.b = object0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                static final class kotlin.sequences.u.m.a extends N implements Function1 {
                    final kotlin.jvm.internal.l0.a e;
                    final Object f;

                    kotlin.sequences.u.m.a(kotlin.jvm.internal.l0.a l0$a0, Object object0) {
                        this.e = l0$a0;
                        this.f = object0;
                        super(1);
                    }

                    public final Boolean a(Object object0) {
                        boolean z = true;
                        if(!this.e.a && L.g(object0, this.f)) {
                            this.e.a = true;
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(object0);
                    }
                }

                kotlin.sequences.u.m.a u$m$a0 = new kotlin.sequences.u.m.a(new kotlin.jvm.internal.l0.a(), this.b);
                return p.p0(this.a, u$m$a0).iterator();
            }
        }

        L.p(m0, "<this>");
        return new kotlin.sequences.u.m(m0, object0);
    }

    @l
    public static List d3(@l m m0) {
        L.p(m0, "<this>");
        return (List)u.a3(m0, new ArrayList());
    }

    @h0(version = "1.2")
    @l
    public static final m e0(@l m m0, int v, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "transform");
        return u.h3(m0, v, v, true, function10);
    }

    public static String e1(m m0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return u.d1(m0, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final m e2(@l m m0, @l m m1) {
        public static final class kotlin.sequences.u.p implements m {
            final m a;
            final m b;

            kotlin.sequences.u.p(m m0, m m1) {
                this.a = m0;
                this.b = m1;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                static final class kotlin.sequences.u.p.a extends N implements Function1 {
                    final List e;

                    kotlin.sequences.u.p.a(List list0) {
                        this.e = list0;
                        super(1);
                    }

                    public final Boolean a(Object object0) {
                        return Boolean.valueOf(this.e.contains(object0));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(object0);
                    }
                }

                List list0 = p.c3(this.a);
                if(list0.isEmpty()) {
                    return this.b.iterator();
                }
                kotlin.sequences.u.p.a u$p$a0 = new kotlin.sequences.u.p.a(list0);
                return p.u0(this.b, u$p$a0).iterator();
            }
        }

        L.p(m0, "<this>");
        L.p(m1, "elements");
        return new kotlin.sequences.u.p(m1, m0);
    }

    @l
    public static final Set e3(@l m m0) {
        L.p(m0, "<this>");
        Set set0 = new LinkedHashSet();
        for(Object object0: m0) {
            ((AbstractCollection)set0).add(object0);
        }
        return set0;
    }

    public static boolean f0(@l m m0, Object object0) {
        L.p(m0, "<this>");
        return u.Y0(m0, object0) >= 0;
    }

    public static Object f1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = iterator0.next()) {
        }
        return object0;
    }

    @l
    public static final m f2(@l m m0, @l Object[] arr_object) {
        public static final class n implements m {
            final m a;
            final Object[] b;

            n(m m0, Object[] arr_object) {
                this.a = m0;
                this.b = arr_object;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                static final class kotlin.sequences.u.n.a extends N implements Function1 {
                    final Object[] e;

                    kotlin.sequences.u.n.a(Object[] arr_object) {
                        this.e = arr_object;
                        super(1);
                    }

                    public final Boolean a(Object object0) {
                        return Boolean.valueOf(kotlin.collections.l.s8(this.e, object0));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(object0);
                    }
                }

                kotlin.sequences.u.n.a u$n$a0 = new kotlin.sequences.u.n.a(this.b);
                return p.u0(this.a, u$n$a0).iterator();
            }
        }

        L.p(m0, "<this>");
        L.p(arr_object, "elements");
        return arr_object.length == 0 ? m0 : new n(m0, arr_object);
    }

    @l
    public static final Set f3(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return k0.k();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return k0.f(object0);
        }
        Set set0 = new LinkedHashSet();
        ((AbstractCollection)set0).add(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            ((AbstractCollection)set0).add(object1);
        }
        return set0;
    }

    public static int g0(@l m m0) {
        L.p(m0, "<this>");
        int v = 0;
        Iterator iterator0 = m0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            ++v;
            if(v < 0) {
                kotlin.collections.u.Y();
            }
        }
        return v;
    }

    public static final Object g1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        Object object0 = null;
        boolean z = false;
        for(Object object1: m0) {
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                z = true;
                object0 = object1;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return object0;
    }

    @f
    private static final m g2(m m0, Object object0) {
        L.p(m0, "<this>");
        return u.d2(m0, object0);
    }

    @h0(version = "1.2")
    @l
    public static final m g3(@l m m0, int v, int v1, boolean z) {
        L.p(m0, "<this>");
        return p0.c(m0, v, v1, z, false);
    }

    public static final int h0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        int v = 0;
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                ++v;
                if(v < 0) {
                    kotlin.collections.u.Y();
                }
            }
        }
        return v;
    }

    public static final int h1(@l m m0, Object object0) {
        L.p(m0, "<this>");
        int v = -1;
        int v1 = 0;
        for(Object object1: m0) {
            if(v1 < 0) {
                kotlin.collections.u.Z();
            }
            if(L.g(object0, object1)) {
                v = v1;
            }
            ++v1;
        }
        return v;
    }

    public static final boolean h2(@l m m0) {
        L.p(m0, "<this>");
        return !m0.iterator().hasNext();
    }

    @h0(version = "1.2")
    @l
    public static final m h3(@l m m0, int v, int v1, boolean z, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "transform");
        return p.k1(p0.c(m0, v, v1, z, true), function10);
    }

    @l
    public static final m i0(@l m m0) {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                return object0;
            }
        }

        L.p(m0, "<this>");
        return u.j0(m0, b.e);
    }

    @y4.m
    public static final Object i1(@l m m0) {
        L.p(m0, "<this>");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = iterator0.next()) {
        }
        return object0;
    }

    public static final boolean i2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static m i3(m m0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return u.g3(m0, v, v1, z);
    }

    @l
    public static final m j0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        return new kotlin.sequences.c(m0, function10);
    }

    @y4.m
    public static final Object j1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        Object object0 = null;
        for(Object object1: m0) {
            if(((Boolean)function10.invoke(object1)).booleanValue()) {
                object0 = object1;
            }
        }
        return object0;
    }

    @h0(version = "1.1")
    @l
    public static final m j2(@l m m0, @l Function1 function10) {
        static final class q extends N implements Function1 {
            final Function1 e;

            q(Function1 function10) {
                this.e = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                this.e.invoke(object0);
                return object0;
            }
        }

        L.p(m0, "<this>");
        L.p(function10, "action");
        return p.k1(m0, new q(function10));
    }

    public static m j3(m m0, int v, int v1, boolean z, Function1 function10, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return u.h3(m0, v, v1, z, function10);
    }

    @l
    public static m k0(@l m m0, int v) {
        L.p(m0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v != 0) {
            return m0 instanceof e ? ((e)m0).a(v) : new d(m0, v);
        }
        return m0;
    }

    @l
    public static m k1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "transform");
        return new z(m0, function10);
    }

    @h0(version = "1.4")
    @l
    public static final m k2(@l m m0, @l o o0) {
        static final class r extends N implements o {
            final o e;

            r(o o0) {
                this.e = o0;
                super(2);
            }

            public final Object a(int v, Object object0) {
                this.e.invoke(v, object0);
                return object0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), object1);
            }
        }

        L.p(m0, "<this>");
        L.p(o0, "action");
        return u.l1(m0, new r(o0));
    }

    @l
    public static m k3(@l m m0) {
        L.p(m0, "<this>");
        return new kotlin.sequences.k(m0);
    }

    @l
    public static final m l0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        return new kotlin.sequences.f(m0, function10);
    }

    @l
    public static final m l1(@l m m0, @l o o0) {
        L.p(m0, "<this>");
        L.p(o0, "transform");
        return new kotlin.sequences.y(m0, o0);
    }

    @l
    public static final V l2(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                arrayList0.add(object0);
            }
            else {
                arrayList1.add(object0);
            }
        }
        return new V(arrayList0, arrayList1);
    }

    @l
    public static final m l3(@l m m0, @l m m1) {
        static final class kotlin.sequences.u.z extends N implements o {
            public static final kotlin.sequences.u.z e;

            static {
                kotlin.sequences.u.z.e = new kotlin.sequences.u.z();
            }

            kotlin.sequences.u.z() {
                super(2);
            }

            public final V a(Object object0, Object object1) {
                return r0.a(object0, object1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, object1);
            }
        }

        L.p(m0, "<this>");
        L.p(m1, "other");
        return new kotlin.sequences.l(m0, m1, kotlin.sequences.u.z.e);
    }

    public static final Object m0(@l m m0, int v) {
        static final class kotlin.sequences.u.c extends N implements Function1 {
            final int e;

            kotlin.sequences.u.c(int v) {
                this.e = v;
                super(1);
            }

            public final Object a(int v) {
                throw new IndexOutOfBoundsException("Sequence doesn\'t contain element at index " + this.e + '.');
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

        L.p(m0, "<this>");
        return u.n0(m0, v, new kotlin.sequences.u.c(v));
    }

    @l
    public static final m m1(@l m m0, @l o o0) {
        L.p(m0, "<this>");
        L.p(o0, "transform");
        return p.v0(new kotlin.sequences.y(m0, o0));
    }

    @l
    public static final m m2(@l m m0, @l Iterable iterable0) {
        L.p(m0, "<this>");
        L.p(iterable0, "elements");
        return s.i(p.q(new m[]{m0, kotlin.collections.u.A1(iterable0)}));
    }

    @l
    public static final m m3(@l m m0, @l m m1, @l o o0) {
        L.p(m0, "<this>");
        L.p(m1, "other");
        L.p(o0, "transform");
        return new kotlin.sequences.l(m0, m1, o0);
    }

    public static final Object n0(@l m m0, int v, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "defaultValue");
        if(v < 0) {
            return function10.invoke(v);
        }
        int v1 = 0;
        for(Object object0: m0) {
            if(v == v1) {
                return object0;
            }
            ++v1;
        }
        return function10.invoke(v);
    }

    @l
    public static final Collection n1(@l m m0, @l Collection collection0, @l o o0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(Object object0: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            Object object1 = o0.invoke(v, object0);
            if(object1 != null) {
                collection0.add(object1);
            }
            ++v;
        }
        return collection0;
    }

    @l
    public static final m n2(@l m m0, Object object0) {
        L.p(m0, "<this>");
        return s.i(p.q(new m[]{m0, p.q(new Object[]{object0})}));
    }

    @h0(version = "1.2")
    @l
    public static final m n3(@l m m0) {
        static final class A extends N implements o {
            public static final A e;

            static {
                A.e = new A();
            }

            A() {
                super(2);
            }

            public final V a(Object object0, Object object1) {
                return r0.a(object0, object1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, object1);
            }
        }

        L.p(m0, "<this>");
        return u.o3(m0, A.e);
    }

    @y4.m
    public static final Object o0(@l m m0, int v) {
        L.p(m0, "<this>");
        if(v < 0) {
            return null;
        }
        int v1 = 0;
        for(Object object0: m0) {
            if(v == v1) {
                return object0;
            }
            ++v1;
        }
        return null;
    }

    @l
    public static final Collection o1(@l m m0, @l Collection collection0, @l o o0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "transform");
        int v = 0;
        for(Object object0: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            collection0.add(o0.invoke(v, object0));
            ++v;
        }
        return collection0;
    }

    @l
    public static final m o2(@l m m0, @l m m1) {
        L.p(m0, "<this>");
        L.p(m1, "elements");
        return s.i(p.q(new m[]{m0, m1}));
    }

    @h0(version = "1.2")
    @l
    public static final m o3(@l m m0, @l o o0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {0xB39}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
        static final class B extends kotlin.coroutines.jvm.internal.k implements o {
            Object l;
            Object m;
            int n;
            private Object o;
            final m p;
            final o q;

            B(m m0, o o0, kotlin.coroutines.d d0) {
                this.p = m0;
                this.q = o0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, kotlin.coroutines.d d0) {
                return ((B)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new B(this.p, this.q, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object4;
                Iterator iterator1;
                Object object3;
                kotlin.sequences.o o1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        kotlin.sequences.o o0 = (kotlin.sequences.o)this.o;
                        Iterator iterator0 = this.p.iterator();
                        if(!iterator0.hasNext()) {
                            return S0.a;
                        }
                        Object object2 = iterator0.next();
                        o1 = o0;
                        object3 = object2;
                        iterator1 = iterator0;
                        goto label_18;
                    }
                    case 1: {
                        object4 = this.m;
                        iterator1 = (Iterator)this.l;
                        o1 = (kotlin.sequences.o)this.o;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    object3 = object4;
                label_18:
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    object4 = iterator1.next();
                    Object object5 = this.q.invoke(object3, object4);
                    this.o = o1;
                    this.l = iterator1;
                    this.m = object4;
                    this.n = 1;
                    if(o1.a(object5, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        L.p(m0, "<this>");
        L.p(o0, "transform");
        return p.b(new B(m0, o0, null));
    }

    @l
    public static m p0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        return new kotlin.sequences.h(m0, true, function10);
    }

    @l
    public static m p1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "transform");
        return p.v0(new z(m0, function10));
    }

    @l
    public static final m p2(@l m m0, @l Object[] arr_object) {
        L.p(m0, "<this>");
        L.p(arr_object, "elements");
        return u.m2(m0, kotlin.collections.l.t(arr_object));
    }

    @l
    public static final m q0(@l m m0, @l o o0) {
        static final class kotlin.sequences.u.d extends N implements Function1 {
            final o e;

            kotlin.sequences.u.d(o o0) {
                this.e = o0;
                super(1);
            }

            public final Boolean a(P p0) {
                L.p(p0, "it");
                return (Boolean)this.e.invoke(p0.e(), p0.f());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((P)object0));
            }
        }


        static final class kotlin.sequences.u.e extends N implements Function1 {
            public static final kotlin.sequences.u.e e;

            static {
                kotlin.sequences.u.e.e = new kotlin.sequences.u.e();
            }

            kotlin.sequences.u.e() {
                super(1);
            }

            public final Object a(P p0) {
                L.p(p0, "it");
                return p0.f();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((P)object0));
            }
        }

        L.p(m0, "<this>");
        L.p(o0, "predicate");
        return new z(new kotlin.sequences.h(new kotlin.sequences.k(m0), true, new kotlin.sequences.u.d(o0)), kotlin.sequences.u.e.e);
    }

    @l
    public static final Collection q1(@l m m0, @l Collection collection0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: m0) {
            Object object1 = function10.invoke(object0);
            if(object1 != null) {
                collection0.add(object1);
            }
        }
        return collection0;
    }

    @f
    private static final m q2(m m0, Object object0) {
        L.p(m0, "<this>");
        return u.n2(m0, object0);
    }

    @l
    public static final Collection r0(@l m m0, @l Collection collection0, @l o o0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(o0, "predicate");
        int v = 0;
        for(Object object0: m0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            if(((Boolean)o0.invoke(v, object0)).booleanValue()) {
                collection0.add(object0);
            }
            ++v;
        }
        return collection0;
    }

    @l
    public static final Collection r1(@l m m0, @l Collection collection0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        for(Object object0: m0) {
            collection0.add(function10.invoke(object0));
        }
        return collection0;
    }

    public static final Object r2(@l m m0, @l o o0) {
        L.p(m0, "<this>");
        L.p(o0, "operation");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can\'t be reduced.");
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = o0.invoke(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    public static final m s0(m m0) {
        public static final class kotlin.sequences.u.f extends N implements Function1 {
            public static final kotlin.sequences.u.f e;

            static {
                kotlin.sequences.u.f.e = new kotlin.sequences.u.f();
            }

            public kotlin.sequences.u.f() {
                super(1);
            }

            public final Boolean a(Object object0) {
                L.y(3, "R");
                return Boolean.valueOf(object0 instanceof Object);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

        L.p(m0, "<this>");
        L.w();
        m m1 = p.p0(m0, kotlin.sequences.u.f.e);
        L.n(m1, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return m1;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Object s1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
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
        return object0;
    }

    public static final Object s2(@l m m0, @l A3.p p0) {
        L.p(m0, "<this>");
        L.p(p0, "operation");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can\'t be reduced.");
        }
        Object object0 = iterator0.next();
        for(int v = 1; iterator0.hasNext(); ++v) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            Object object1 = iterator0.next();
            object0 = p0.invoke(v, object0, object1);
        }
        return object0;
    }

    public static final Collection t0(m m0, Collection collection0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        for(Object object0: m0) {
            L.y(3, "R");
            if(object0 instanceof Object) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @h0(version = "1.7")
    @i(name = "maxByOrThrow")
    public static final Object t1(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
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
        return object0;
    }

    @h0(version = "1.4")
    @y4.m
    public static final Object t2(@l m m0, @l A3.p p0) {
        L.p(m0, "<this>");
        L.p(p0, "operation");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        for(int v = 1; iterator0.hasNext(); ++v) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            Object object1 = iterator0.next();
            object0 = p0.invoke(v, object0, object1);
        }
        return object0;
    }

    @l
    public static m u0(@l m m0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        return new kotlin.sequences.h(m0, false, function10);
    }

    @U
    @h0(version = "1.4")
    @f
    private static final double u1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @h0(version = "1.4")
    @y4.m
    public static final Object u2(@l m m0, @l o o0) {
        L.p(m0, "<this>");
        L.p(o0, "operation");
        Iterator iterator0 = m0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = o0.invoke(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    @l
    public static m v0(@l m m0) {
        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(1);
            }

            public final Boolean a(Object object0) {
                return object0 == null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

        L.p(m0, "<this>");
        m m1 = p.u0(m0, g.e);
        L.n(m1, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return m1;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final float v1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @l
    public static final m v2(@l m m0) {
        static final class kotlin.sequences.u.s extends N implements Function1 {
            final m e;

            kotlin.sequences.u.s(m m0) {
                this.e = m0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                if(object0 == null) {
                    throw new IllegalArgumentException("null element found in " + this.e + '.');
                }
                return object0;
            }
        }

        L.p(m0, "<this>");
        return p.k1(m0, new kotlin.sequences.u.s(m0));
    }

    @l
    public static final Collection w0(@l m m0, @l Collection collection0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        for(Object object0: m0) {
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable w1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @h0(version = "1.4")
    @l
    public static m w2(@l m m0, Object object0, @l o o0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {0x907, 0x90B}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
        static final class kotlin.sequences.u.t extends kotlin.coroutines.jvm.internal.k implements o {
            Object l;
            Object m;
            int n;
            private Object o;
            final Object p;
            final m q;
            final o r;

            kotlin.sequences.u.t(Object object0, m m0, o o0, kotlin.coroutines.d d0) {
                this.p = object0;
                this.q = m0;
                this.r = o0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, kotlin.coroutines.d d0) {
                return ((kotlin.sequences.u.t)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new kotlin.sequences.u.t(this.p, this.q, this.r, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object3;
                Iterator iterator0;
                kotlin.sequences.o o1;
                Object object2;
                kotlin.sequences.o o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        o0 = (kotlin.sequences.o)this.o;
                        this.o = o0;
                        this.n = 1;
                        if(o0.a(this.p, this) == object1) {
                            return object1;
                        }
                        object2 = this.p;
                        o1 = o0;
                        iterator0 = this.q.iterator();
                        goto label_20;
                    }
                    case 1: {
                        o0 = (kotlin.sequences.o)this.o;
                        f0.n(object0);
                        object2 = this.p;
                        o1 = o0;
                        iterator0 = this.q.iterator();
                        goto label_20;
                    }
                    case 2: {
                        iterator0 = (Iterator)this.m;
                        object3 = this.l;
                        o1 = (kotlin.sequences.o)this.o;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    object2 = object3;
                label_20:
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object4 = iterator0.next();
                    object3 = this.r.invoke(object2, object4);
                    this.o = o1;
                    this.l = object3;
                    this.m = iterator0;
                    this.n = 2;
                    if(o1.a(object3, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        L.p(m0, "<this>");
        L.p(o0, "operation");
        return p.b(new kotlin.sequences.u.t(object0, m0, o0, null));
    }

    @l
    public static final Collection x0(@l m m0, @l Collection collection0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Comparable x1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @h0(version = "1.4")
    @l
    public static final m x2(@l m m0, Object object0, @l A3.p p0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {0x923, 0x928}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
        static final class kotlin.sequences.u.u extends kotlin.coroutines.jvm.internal.k implements o {
            Object l;
            Object m;
            int n;
            int o;
            private Object p;
            final Object q;
            final m r;
            final A3.p s;

            kotlin.sequences.u.u(Object object0, m m0, A3.p p0, kotlin.coroutines.d d0) {
                this.q = object0;
                this.r = m0;
                this.s = p0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, kotlin.coroutines.d d0) {
                return ((kotlin.sequences.u.u)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new kotlin.sequences.u.u(this.q, this.r, this.s, d0);
                d1.p = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                kotlin.sequences.o o1;
                int v;
                Iterator iterator0;
                Object object2;
                kotlin.sequences.o o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        o0 = (kotlin.sequences.o)this.p;
                        this.p = o0;
                        this.o = 1;
                        if(o0.a(this.q, this) == object1) {
                            return object1;
                        }
                        goto label_11;
                    }
                    case 1: {
                        o0 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                    label_11:
                        object2 = this.q;
                        iterator0 = this.r.iterator();
                        v = 0;
                        o1 = o0;
                        break;
                    }
                    case 2: {
                        int v1 = this.n;
                        iterator0 = (Iterator)this.m;
                        Object object3 = this.l;
                        o1 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        object2 = object3;
                        v = v1;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Object object4 = iterator0.next();
                    A3.p p0 = this.s;
                    if(v < 0) {
                        kotlin.collections.u.Z();
                    }
                    Object object5 = p0.invoke(kotlin.coroutines.jvm.internal.b.f(v), object2, object4);
                    this.p = o1;
                    this.l = object5;
                    this.m = iterator0;
                    this.n = v + 1;
                    this.o = 2;
                    if(o1.a(object5, this) == object1) {
                        return object1;
                    }
                    object2 = object5;
                    ++v;
                }
                return S0.a;
            }
        }

        L.p(m0, "<this>");
        L.p(p0, "operation");
        return p.b(new kotlin.sequences.u.u(object0, m0, p0, null));
    }

    @l
    public static final Collection y0(@l m m0, @l Collection collection0, @l Function1 function10) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Double y1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @h0(version = "1.4")
    @l
    public static final m y2(@l m m0, @l o o0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {0x940, 0x943}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
        static final class kotlin.sequences.u.v extends kotlin.coroutines.jvm.internal.k implements o {
            Object l;
            Object m;
            int n;
            private Object o;
            final m p;
            final o q;

            kotlin.sequences.u.v(m m0, o o0, kotlin.coroutines.d d0) {
                this.p = m0;
                this.q = o0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, kotlin.coroutines.d d0) {
                return ((kotlin.sequences.u.v)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new kotlin.sequences.u.v(this.p, this.q, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Iterator iterator1;
                Object object2;
                kotlin.sequences.o o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
            alab1:
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        o0 = (kotlin.sequences.o)this.o;
                        Iterator iterator0 = this.p.iterator();
                        if(iterator0.hasNext()) {
                            object2 = iterator0.next();
                            this.o = o0;
                            this.l = iterator0;
                            this.m = object2;
                            this.n = 1;
                            if(o0.a(object2, this) == object1) {
                                return object1;
                            }
                            iterator1 = iterator0;
                            goto label_20;
                        }
                        break;
                    }
                    case 1: 
                    case 2: {
                        object2 = this.m;
                        iterator1 = (Iterator)this.l;
                        o0 = (kotlin.sequences.o)this.o;
                        f0.n(object0);
                        while(true) {
                        label_20:
                            if(!iterator1.hasNext()) {
                                break alab1;
                            }
                            Object object3 = iterator1.next();
                            object2 = this.q.invoke(object2, object3);
                            this.o = o0;
                            this.l = iterator1;
                            this.m = object2;
                            this.n = 2;
                            if(o0.a(object2, this) == object1) {
                                return object1;
                            }
                            if(false) {
                                break alab1;
                            }
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }

        L.p(m0, "<this>");
        L.p(o0, "operation");
        return p.b(new kotlin.sequences.u.v(m0, o0, null));
    }

    @f
    private static final Object z0(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "predicate");
        for(Object object0: m0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @U
    @h0(version = "1.4")
    @f
    private static final Float z1(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        Iterator iterator0 = m0.iterator();
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

    @h0(version = "1.4")
    @l
    public static final m z2(@l m m0, @l A3.p p0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {0x95D, 2401}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
        static final class kotlin.sequences.u.w extends kotlin.coroutines.jvm.internal.k implements o {
            Object l;
            Object m;
            int n;
            int o;
            private Object p;
            final m q;
            final A3.p r;

            kotlin.sequences.u.w(m m0, A3.p p0, kotlin.coroutines.d d0) {
                this.q = m0;
                this.r = p0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, kotlin.coroutines.d d0) {
                return ((kotlin.sequences.u.w)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new kotlin.sequences.u.w(this.q, this.r, d0);
                d1.p = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object2;
                Iterator iterator0;
                kotlin.sequences.o o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                int v = 1;
            alab1:
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        o0 = (kotlin.sequences.o)this.p;
                        iterator0 = this.q.iterator();
                        if(iterator0.hasNext()) {
                            object2 = iterator0.next();
                            this.p = o0;
                            this.l = iterator0;
                            this.m = object2;
                            this.o = 1;
                            if(o0.a(object2, this) == object1) {
                                return object1;
                            }
                            goto label_27;
                        }
                        break;
                    }
                    case 1: {
                        object2 = this.m;
                        iterator0 = (Iterator)this.l;
                        o0 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        goto label_27;
                    }
                    case 2: {
                        int v1 = this.n;
                        Object object3 = this.m;
                        iterator0 = (Iterator)this.l;
                        o0 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        v = v1;
                        object2 = object3;
                        while(true) {
                        label_27:
                            if(!iterator0.hasNext()) {
                                break alab1;
                            }
                            A3.p p0 = this.r;
                            if(v < 0) {
                                kotlin.collections.u.Z();
                            }
                            Object object4 = iterator0.next();
                            Object object5 = p0.invoke(kotlin.coroutines.jvm.internal.b.f(v), object2, object4);
                            this.p = o0;
                            this.l = iterator0;
                            this.m = object5;
                            this.n = v + 1;
                            this.o = 2;
                            if(o0.a(object5, this) == object1) {
                                return object1;
                            }
                            object2 = object5;
                            ++v;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }

        L.p(m0, "<this>");
        L.p(p0, "operation");
        return p.b(new kotlin.sequences.u.w(m0, p0, null));
    }
}

