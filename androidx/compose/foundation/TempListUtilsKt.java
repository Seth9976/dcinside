package androidx.compose.foundation;

import A3.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n33#2,6:109\n33#2,6:115\n69#2,4:121\n74#2:126\n1#3:125\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n38#1:109,6\n61#1:115,6\n82#1:121,4\n82#1:126\n*E\n"})
public final class TempListUtilsKt {
    @l
    public static final List a(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                list1.add(object0);
            }
        }
        return list1;
    }

    public static final Object b(@l List list0, Object object0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "operation");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, list0.get(v1));
        }
        return object0;
    }

    @l
    public static final List c(@l List list0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "transform");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = o0.invoke(v1, list0.get(v1));
            if(object0 != null) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @m
    public static final Comparable d(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "selector");
        if(list0.isEmpty()) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(list0.get(0));
        int v = u.J(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(list0.get(v1));
                if(comparable1.compareTo(comparable0) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }
}

