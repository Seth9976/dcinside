package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Comparator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,274:1\n48#2:275\n523#2:276\n523#2:277\n1182#3:278\n1161#3,2:279\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n253#1:275\n257#1:276\n258#1:277\n265#1:278\n265#1:279,2\n*E\n"})
final class FocusableChildrenComparator implements Comparator {
    @l
    public static final FocusableChildrenComparator a;

    static {
        FocusableChildrenComparator.a = new FocusableChildrenComparator();
    }

    public int b(@m FocusTargetModifierNode focusTargetModifierNode0, @m FocusTargetModifierNode focusTargetModifierNode1) {
        if(focusTargetModifierNode0 == null || focusTargetModifierNode1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(FocusTraversalKt.h(focusTargetModifierNode0) && FocusTraversalKt.h(focusTargetModifierNode1)) {
            NodeCoordinator nodeCoordinator0 = focusTargetModifierNode0.G();
            LayoutNode layoutNode0 = null;
            LayoutNode layoutNode1 = nodeCoordinator0 == null ? null : nodeCoordinator0.M0();
            if(layoutNode1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            NodeCoordinator nodeCoordinator1 = focusTargetModifierNode1.G();
            if(nodeCoordinator1 != null) {
                layoutNode0 = nodeCoordinator1.M0();
            }
            if(layoutNode0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if(L.g(layoutNode1, layoutNode0)) {
                return 0;
            }
            MutableVector mutableVector0 = this.g(layoutNode1);
            MutableVector mutableVector1 = this.g(layoutNode0);
            int v1 = Math.min(mutableVector0.J() - 1, mutableVector1.J() - 1);
            if(v1 >= 0) {
                for(int v = 0; true; ++v) {
                    if(!L.g(mutableVector0.F()[v], mutableVector1.F()[v])) {
                        return L.t(((LayoutNode)mutableVector0.F()[v]).D0(), ((LayoutNode)mutableVector1.F()[v]).D0());
                    }
                    if(v == v1) {
                        break;
                    }
                }
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        }
        if(FocusTraversalKt.h(focusTargetModifierNode0)) {
            return -1;
        }
        return FocusTraversalKt.h(focusTargetModifierNode1) ? 1 : 0;
    }

    @Override
    public int compare(Object object0, Object object1) {
        return this.b(((FocusTargetModifierNode)object0), ((FocusTargetModifierNode)object1));
    }

    private final MutableVector g(LayoutNode layoutNode0) {
        MutableVector mutableVector0 = new MutableVector(new LayoutNode[16], 0);
        while(layoutNode0 != null) {
            mutableVector0.a(0, layoutNode0);
            layoutNode0 = layoutNode0.C0();
        }
        return mutableVector0;
    }
}

