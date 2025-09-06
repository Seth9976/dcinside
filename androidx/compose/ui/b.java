package androidx.compose.ui;

import A3.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class b {
    public static boolean a(Element modifier$Element0, @l Function1 function10) {
        L.p(function10, "predicate");
        return ((Boolean)function10.invoke(modifier$Element0)).booleanValue();
    }

    public static boolean b(Element modifier$Element0, @l Function1 function10) {
        L.p(function10, "predicate");
        return ((Boolean)function10.invoke(modifier$Element0)).booleanValue();
    }

    public static Object c(Element modifier$Element0, Object object0, @l o o0) {
        L.p(o0, "operation");
        return o0.invoke(object0, modifier$Element0);
    }

    public static Object d(Element modifier$Element0, Object object0, @l o o0) {
        L.p(o0, "operation");
        return o0.invoke(modifier$Element0, object0);
    }
}

