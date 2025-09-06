package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n350#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
class Z {
    @b0
    @i(name = "getOrImplicitDefaultNullable")
    public static final Object a(@l Map map0, Object object0) {
        L.p(map0, "<this>");
        if(map0 instanceof W) {
            return ((W)map0).h1(object0);
        }
        Object object1 = map0.get(object0);
        if(object1 == null && !map0.containsKey(object0)) {
            throw new NoSuchElementException("Key " + object0 + " is missing in the map.");
        }
        return object1;
    }

    @l
    public static final Map b(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "defaultValue");
        return map0 instanceof W ? Z.b(((W)map0).n(), function10) : new X(map0, function10);
    }

    @l
    @i(name = "withDefaultMutable")
    public static final Map c(@l Map map0, @l Function1 function10) {
        L.p(map0, "<this>");
        L.p(function10, "defaultValue");
        return map0 instanceof f0 ? Z.c(((f0)map0).n(), function10) : new g0(map0, function10);
    }
}

