package androidx.compose.ui.util;

import A3.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n33#1,6:207\n33#1,6:213\n33#1,6:219\n33#1,6:225\n33#1,6:231\n33#1,6:237\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:207,6\n102#1:213,6\n117#1:219,6\n134#1:225,6\n153#1:231,6\n201#1:237,6\n*E\n"})
public final class ListUtilsKt {
    public static final boolean a(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m
    public static final Object c(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    public static final void d(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "action");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(list0.get(v1));
        }
    }

    public static final void e(@l List list0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "action");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(v1, list0.get(v1));
        }
    }

    public static final void f(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "action");
        int v = list0.size() - 1;
        if(v >= 0) {
            while(true) {
                function10.invoke(list0.get(v));
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
    }

    @l
    public static final List g(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "transform");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list1.add(function10.invoke(list0.get(v1)));
        }
        return list1;
    }

    @l
    public static final Collection h(@l List list0, @l Collection collection0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            collection0.add(function10.invoke(list0.get(v1)));
        }
        return collection0;
    }

    @m
    public static final Object i(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "selector");
        if(list0.isEmpty()) {
            return null;
        }
        Object object0 = list0.get(0);
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        int v = u.J(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) < 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    public static final int j(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "selector");
        int v = list0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((Number)function10.invoke(list0.get(v1))).intValue();
        }
        return v2;
    }
}

