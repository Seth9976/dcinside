package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,47:1\n151#2,3:48\n33#2,4:51\n154#2,2:55\n38#2:57\n156#2:58\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:48,3\n32#1:51,4\n32#1:55,2\n32#1:57\n32#1:58\n*E\n"})
public final class MeasureScopeWithLayoutNodeKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            try {
                arr_v[LayoutState.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    public static final List a(@l IntrinsicMeasureScope intrinsicMeasureScope0) {
        L.p(intrinsicMeasureScope0, "scope");
        LayoutNode layoutNode0 = ((MeasureScopeWithLayoutNode)intrinsicMeasureScope0).M0();
        boolean z = MeasureScopeWithLayoutNodeKt.b(layoutNode0);
        List list0 = layoutNode0.c0();
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            LayoutNode layoutNode1 = (LayoutNode)list0.get(v1);
            list1.add((z ? layoutNode1.Y() : layoutNode1.Z()));
        }
        return list1;
    }

    private static final boolean b(LayoutNode layoutNode0) {
        switch(layoutNode0.m0()) {
            case 1: 
            case 2: {
                return true;
            }
            case 3: 
            case 4: {
                return false;
            }
            case 5: {
                LayoutNode layoutNode1 = layoutNode0.C0();
                if(layoutNode1 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                return MeasureScopeWithLayoutNodeKt.b(layoutNode1);
            }
            default: {
                throw new J();
            }
        }
    }
}

