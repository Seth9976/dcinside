package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,92:1\n87#2:93\n87#2:123\n87#2:153\n340#3:94\n206#3,2:95\n208#3,7:100\n215#3,15:108\n340#3:124\n206#3,2:125\n208#3,7:130\n215#3,15:138\n340#3:154\n206#3,2:155\n208#3,7:160\n215#3,15:168\n1182#4:97\n1161#4,2:98\n1182#4:127\n1161#4,2:128\n1182#4:157\n1161#4,2:158\n48#5:107\n48#5:137\n48#5:167\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n40#1:93\n63#1:123\n87#1:153\n40#1:94\n40#1:95,2\n40#1:100,7\n40#1:108,15\n63#1:124\n63#1:125,2\n63#1:130,7\n63#1:138,15\n87#1:154\n87#1:155,2\n87#1:160,7\n87#1:168,15\n40#1:97\n40#1:98,2\n63#1:127\n63#1:128,2\n87#1:157\n87#1:158,2\n40#1:107\n63#1:137\n87#1:167\n*E\n"})
public final class FocusRequesterModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final boolean a(@l FocusRequesterModifierNode focusRequesterModifierNode0) {
        L.p(focusRequesterModifierNode0, "<this>");
        if(!focusRequesterModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusRequesterModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, focusRequesterModifierNode0.getNode());
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
                    if((modifier$Node1.J() & 0x400) == 0) {
                        modifier$Node1 = modifier$Node1.F();
                        continue;
                    }
                    if(modifier$Node1 instanceof FocusTargetModifierNode && FocusTransactionsKt.a(((FocusTargetModifierNode)modifier$Node1))) {
                        return true;
                    }
                    continue label_8;
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final boolean b(@l FocusRequesterModifierNode focusRequesterModifierNode0) {
        L.p(focusRequesterModifierNode0, "<this>");
        if(!focusRequesterModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusRequesterModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, focusRequesterModifierNode0.getNode());
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
                    if((modifier$Node1.J() & 0x400) == 0) {
                        modifier$Node1 = modifier$Node1.F();
                        continue;
                    }
                    if(modifier$Node1 instanceof FocusTargetModifierNode && FocusTransactionsKt.f(((FocusTargetModifierNode)modifier$Node1))) {
                        return true;
                    }
                    continue label_8;
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final boolean c(@l FocusRequesterModifierNode focusRequesterModifierNode0) {
        L.p(focusRequesterModifierNode0, "<this>");
        if(!focusRequesterModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusRequesterModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, focusRequesterModifierNode0.getNode());
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
                    if((modifier$Node1.J() & 0x400) == 0) {
                        modifier$Node1 = modifier$Node1.F();
                        continue;
                    }
                    if(modifier$Node1 instanceof FocusTargetModifierNode && FocusTransactionsKt.h(((FocusTargetModifierNode)modifier$Node1))) {
                        return true;
                    }
                    continue label_8;
                }
            }
        }
        return false;
    }
}

