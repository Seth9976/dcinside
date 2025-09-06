package kotlin.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.l;

class c0 extends b0 {
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final Map.Entry L0(Map map0, Function1 function10) {
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

    @f
    @k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final Map.Entry M0(Map map0, Comparator comparator0) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        return (Map.Entry)E.V3(map0.entrySet(), comparator0);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @kotlin.c0(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Map.Entry N0(Map map0, Function1 function10) {
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

    @k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Map.Entry O0(Map map0, Comparator comparator0) {
        L.p(map0, "<this>");
        L.p(comparator0, "comparator");
        return (Map.Entry)E.n4(map0.entrySet(), comparator0);
    }
}

