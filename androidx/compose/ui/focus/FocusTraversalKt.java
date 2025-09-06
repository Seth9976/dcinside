package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,173:1\n1#2:174\n87#3:175\n87#3:205\n87#3:235\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n340#4:206\n206#4,2:207\n208#4,7:212\n215#4,15:220\n314#4:236\n78#4,17:237\n1182#5:179\n1161#5,2:180\n1182#5:209\n1161#5,2:210\n48#6:189\n48#6:219\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n142#1:175\n156#1:205\n168#1:235\n142#1:176\n142#1:177,2\n142#1:182,7\n142#1:190,15\n156#1:206\n156#1:207,2\n156#1:212,7\n156#1:220,15\n168#1:236\n168#1:237,17\n142#1:179\n142#1:180,2\n156#1:209\n156#1:210,2\n142#1:189\n156#1:219\n*E\n"})
public final class FocusTraversalKt {
    public final class WhenMappings {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
            int[] arr_v1 = new int[FocusStateImpl.values().length];
            try {
                arr_v1[FocusStateImpl.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FocusStateImpl.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FocusStateImpl.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FocusStateImpl.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.b = arr_v1;
        }
    }

    @l
    public static final FocusRequester a(@l FocusTargetModifierNode focusTargetModifierNode0, int v, @l LayoutDirection layoutDirection0) {
        FocusRequester focusRequester0;
        L.p(focusTargetModifierNode0, "$this$customFocusSearch");
        L.p(layoutDirection0, "layoutDirection");
        FocusProperties focusProperties0 = focusTargetModifierNode0.i0();
        if(FocusDirection.n(v, 1)) {
            return focusProperties0.a();
        }
        if(FocusDirection.n(v, 2)) {
            return focusProperties0.b();
        }
        if(FocusDirection.n(v, 5)) {
            return focusProperties0.e();
        }
        if(FocusDirection.n(v, 6)) {
            return focusProperties0.h();
        }
        if(FocusDirection.n(v, 3)) {
            switch(layoutDirection0) {
                case 1: {
                    focusRequester0 = focusProperties0.getStart();
                    break;
                }
                case 2: {
                    focusRequester0 = focusProperties0.getEnd();
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(L.g(focusRequester0, FocusRequester.b.d())) {
                focusRequester0 = null;
            }
            return focusRequester0 == null ? focusProperties0.d() : focusRequester0;
        }
        if(FocusDirection.n(v, 4)) {
            switch(layoutDirection0) {
                case 1: {
                    focusRequester0 = focusProperties0.getEnd();
                    break;
                }
                case 2: {
                    focusRequester0 = focusProperties0.getStart();
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(L.g(focusRequester0, FocusRequester.b.d())) {
                focusRequester0 = null;
            }
            return focusRequester0 == null ? focusProperties0.c() : focusRequester0;
        }
        if(FocusDirection.n(v, 7)) {
            return (FocusRequester)focusProperties0.n().invoke(FocusDirection.k(v));
        }
        if(!FocusDirection.n(v, 8)) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        return (FocusRequester)focusProperties0.f().invoke(FocusDirection.k(v));
    }

    @m
    public static final FocusTargetModifierNode b(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        switch(focusTargetModifierNode0.l0()) {
            case 2: {
                if(!focusTargetModifierNode0.getNode().Q()) {
                    throw new IllegalStateException("Check failed.");
                }
                MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
                Node modifier$Node0 = focusTargetModifierNode0.getNode().F();
                if(modifier$Node0 == null) {
                    DelegatableNodeKt.b(mutableVector0, focusTargetModifierNode0.getNode());
                }
                else {
                    mutableVector0.b(modifier$Node0);
                }
            label_11:
                while(mutableVector0.O()) {
                    Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
                    if((modifier$Node1.D() & 0x400) == 0) {
                        DelegatableNodeKt.b(mutableVector0, modifier$Node1);
                    }
                    else {
                        while(modifier$Node1 != null) {
                            if((modifier$Node1.J() & 0x400) == 0) {
                                modifier$Node1 = modifier$Node1.F();
                                continue;
                            }
                            if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                                continue label_11;
                            }
                            FocusTargetModifierNode focusTargetModifierNode1 = FocusTraversalKt.b(((FocusTargetModifierNode)modifier$Node1));
                            if(focusTargetModifierNode1 != null) {
                                return focusTargetModifierNode1;
                            }
                            continue label_11;
                        }
                    }
                }
                return null;
            }
            case 1: 
            case 3: {
                return focusTargetModifierNode0;
            }
            case 4: {
                return null;
            }
            default: {
                throw new J();
            }
        }
    }

    private static final FocusTargetModifierNode c(FocusTargetModifierNode focusTargetModifierNode0) {
        if(!focusTargetModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = focusTargetModifierNode0.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(focusTargetModifierNode0);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & 0x400) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & 0x400) != 0 && modifier$Node0 instanceof FocusTargetModifierNode && ((FocusTargetModifierNode)modifier$Node0).i0().r()) {
                        return (FocusTargetModifierNode)modifier$Node0;
                    }
                    modifier$Node0 = modifier$Node0.O();
                }
            }
            layoutNode0 = layoutNode0.C0();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.x0();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.r();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
        return null;
    }

    @ExperimentalComposeUiApi
    @l
    public static final Rect d(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        NodeCoordinator nodeCoordinator0 = focusTargetModifierNode0.G();
        if(nodeCoordinator0 != null) {
            Rect rect0 = LayoutCoordinatesKt.d(nodeCoordinator0).E(nodeCoordinator0, false);
            return rect0 == null ? Rect.e.a() : rect0;
        }
        return Rect.e.a();
    }

    public static final boolean e(@l FocusTargetModifierNode focusTargetModifierNode0, int v, @l LayoutDirection layoutDirection0, @l Function1 function10) {
        int v1;
        L.p(focusTargetModifierNode0, "$this$focusSearch");
        L.p(layoutDirection0, "layoutDirection");
        L.p(function10, "onFound");
        if((FocusDirection.n(v, 1) ? true : FocusDirection.n(v, 2))) {
            return OneDimensionalFocusSearchKt.h(focusTargetModifierNode0, v, function10);
        }
        if((((FocusDirection.n(v, 3) ? true : FocusDirection.n(v, 4)) ? true : FocusDirection.n(v, 5)) ? true : FocusDirection.n(v, 6))) {
            Boolean boolean0 = TwoDimensionalFocusSearchKt.t(focusTargetModifierNode0, v, function10);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        if(FocusDirection.n(v, 7)) {
            switch(layoutDirection0) {
                case 1: {
                    v1 = 4;
                    break;
                }
                case 2: {
                    v1 = 3;
                    break;
                }
                default: {
                    throw new J();
                }
            }
            FocusTargetModifierNode focusTargetModifierNode1 = FocusTraversalKt.b(focusTargetModifierNode0);
            if(focusTargetModifierNode1 != null) {
                Boolean boolean1 = TwoDimensionalFocusSearchKt.t(focusTargetModifierNode1, v1, function10);
                return boolean1 == null ? false : boolean1.booleanValue();
            }
            return false;
        }
        if(!FocusDirection.n(v, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + FocusDirection.p(v)).toString());
        }
        FocusTargetModifierNode focusTargetModifierNode2 = FocusTraversalKt.b(focusTargetModifierNode0);
        FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode2 == null ? null : FocusTraversalKt.c(focusTargetModifierNode2);
        return focusTargetModifierNode3 == null || L.g(focusTargetModifierNode3, focusTargetModifierNode0) ? false : ((Boolean)function10.invoke(focusTargetModifierNode3)).booleanValue();
    }

    @m
    public static final FocusTargetModifierNode f(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        if(!focusTargetModifierNode0.getNode().Q()) {
            return null;
        }
        if(!focusTargetModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, focusTargetModifierNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
    label_10:
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & 0x400) == 0) {
                DelegatableNodeKt.b(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & 0x400) != 0) {
                        if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                            continue label_10;
                        }
                        switch(((FocusTargetModifierNode)modifier$Node1).l0()) {
                            case 1: 
                            case 2: 
                            case 3: {
                                return (FocusTargetModifierNode)modifier$Node1;
                            }
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static void g(FocusTargetModifierNode focusTargetModifierNode0) {
    }

    public static final boolean h(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        NodeCoordinator nodeCoordinator0 = focusTargetModifierNode0.G();
        if(nodeCoordinator0 != null) {
            LayoutNode layoutNode0 = nodeCoordinator0.M0();
            if(layoutNode0 != null && layoutNode0.u()) {
                NodeCoordinator nodeCoordinator1 = focusTargetModifierNode0.G();
                if(nodeCoordinator1 != null) {
                    LayoutNode layoutNode1 = nodeCoordinator1.M0();
                    return layoutNode1 != null && layoutNode1.o();
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static void i(FocusTargetModifierNode focusTargetModifierNode0) {
    }
}

