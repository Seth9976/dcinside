package kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.U;
import kotlin.c0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.l;
import z3.i;

@s0({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1437#2,14:173\n1843#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
class t extends s {
    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object A(m m0, Comparator comparator0) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        return u.I1(m0, comparator0);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable B(m m0) {
        L.p(m0, "<this>");
        return u.U1(m0);
    }

    @h0(version = "1.1")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double C(m m0) {
        L.p(m0, "<this>");
        return u.V1(m0);
    }

    @h0(version = "1.1")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float D(m m0) {
        L.p(m0, "<this>");
        return u.W1(m0);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object E(m m0, Function1 function10) {
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

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object F(m m0, Comparator comparator0) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        return u.a2(m0, comparator0);
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal G(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(Object object0: m0) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(object0)));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger H(m m0, Function1 function10) {
        L.p(m0, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(Object object0: m0) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(object0)));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    @y4.l
    public static final SortedSet I(@y4.l m m0) {
        L.p(m0, "<this>");
        return (SortedSet)u.a3(m0, new TreeSet());
    }

    @y4.l
    public static final SortedSet J(@y4.l m m0, @y4.l Comparator comparator0) {
        L.p(m0, "<this>");
        L.p(comparator0, "comparator");
        return (SortedSet)u.a3(m0, new TreeSet(comparator0));
    }

    @y4.l
    public static final m u(@y4.l m m0, @y4.l Class class0) {
        static final class a extends N implements Function1 {
            final Class e;

            a(Class class0) {
                this.e = class0;
                super(1);
            }

            public final Boolean a(Object object0) {
                return Boolean.valueOf(this.e.isInstance(object0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

        L.p(m0, "<this>");
        L.p(class0, "klass");
        m m1 = p.p0(m0, new a(class0));
        L.n(m1, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return m1;
    }

    @y4.l
    public static final Collection v(@y4.l m m0, @y4.l Collection collection0, @y4.l Class class0) {
        L.p(m0, "<this>");
        L.p(collection0, "destination");
        L.p(class0, "klass");
        for(Object object0: m0) {
            if(class0.isInstance(object0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable w(m m0) {
        L.p(m0, "<this>");
        return p.C1(m0);
    }

    @h0(version = "1.1")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double x(m m0) {
        L.p(m0, "<this>");
        return u.D1(m0);
    }

    @h0(version = "1.1")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float y(m m0) {
        L.p(m0, "<this>");
        return u.E1(m0);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object z(m m0, Function1 function10) {
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
}

