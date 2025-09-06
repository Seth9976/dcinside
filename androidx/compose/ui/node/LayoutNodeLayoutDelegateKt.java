package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n165#2:1238\n476#3,11:1239\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1161#1:1238\n1161#1:1239,11\n*E\n"})
public final class LayoutNodeLayoutDelegateKt {
    private static final void b(LayoutNode layoutNode0, MutableVector mutableVector0, Function1 function10) {
        MutableVector mutableVector1 = layoutNode0.I0();
        int v = mutableVector1.J();
        if(v > 0) {
            Object[] arr_object = mutableVector1.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(mutableVector0.J() <= v1) {
                    mutableVector0.b(function10.invoke(layoutNode1));
                }
                else {
                    mutableVector0.i0(v1, function10.invoke(layoutNode1));
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        mutableVector0.f0(layoutNode0.a0().size(), mutableVector0.J());
    }
}

