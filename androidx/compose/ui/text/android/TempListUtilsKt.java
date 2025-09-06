package androidx.compose.ui.text.android;

import A3.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,85:1\n34#1,6:86\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n55#1:86,6\n*E\n"})
public final class TempListUtilsKt {
    public static final void a(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "action");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(list0.get(v1));
        }
    }

    @l
    public static final Collection b(@l List list0, @l Collection collection0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(collection0, "destination");
        L.p(function10, "transform");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            collection0.add(function10.invoke(list0.get(v1)));
        }
        return collection0;
    }

    @l
    public static final List c(@l List list0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "transform");
        switch(list0.size()) {
            case 0: 
            case 1: {
                return u.H();
            }
            default: {
                List list1 = new ArrayList();
                int v = 0;
                Object object0 = list0.get(0);
                int v1 = u.J(list0);
                while(v < v1) {
                    ++v;
                    Object object1 = list0.get(v);
                    list1.add(o0.invoke(object0, object1));
                    object0 = object1;
                }
                return list1;
            }
        }
    }
}

