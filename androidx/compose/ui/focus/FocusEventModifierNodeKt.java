package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,75:1\n87#2:76\n91#2:106\n87#2:107\n87#2:118\n340#3:77\n206#3,2:78\n208#3,7:83\n215#3,15:91\n78#3,9:109\n88#3,7:120\n1182#4:80\n1161#4,2:81\n48#5:90\n47#6:108\n196#7:119\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n45#1:76\n65#1:106\n65#1:107\n68#1:118\n45#1:77\n45#1:78,2\n45#1:83,7\n45#1:91,15\n65#1:109,9\n65#1:120,7\n45#1:80\n45#1:81,2\n45#1:90\n65#1:108\n68#1:119\n*E\n"})
public final class FocusEventModifierNodeKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            try {
                arr_v[FocusStateImpl.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    public static final FocusState a(@l FocusEventModifierNode focusEventModifierNode0) {
        L.p(focusEventModifierNode0, "<this>");
        if(!focusEventModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusEventModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, focusEventModifierNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
    label_8:
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & 0x400) == 0) {
                DelegatableNodeKt.b(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & 0x400) != 0) {
                        if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                            continue label_8;
                        }
                        FocusState focusState0 = ((FocusTargetModifierNode)modifier$Node1).l0();
                        switch(((Enum)focusState0)) {
                            case 1: 
                            case 2: 
                            case 3: {
                                return focusState0;
                            }
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
        return FocusStateImpl.d;
    }

    @ExperimentalComposeUiApi
    public static final void b(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        if(!focusTargetModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = focusTargetModifierNode0.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(focusTargetModifierNode0);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & 0x1400) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & 0x1400) != 0) {
                        if((0x400 & modifier$Node0.J()) != 0) {
                            return;
                        }
                        if(!(modifier$Node0 instanceof FocusEventModifierNode)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        ((FocusEventModifierNode)modifier$Node0).K(FocusEventModifierNodeKt.a(((FocusEventModifierNode)modifier$Node0)));
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
    }
}

