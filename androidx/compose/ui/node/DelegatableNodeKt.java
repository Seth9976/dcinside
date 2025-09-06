package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,381:1\n262#1,11:404\n276#1,9:415\n78#1,17:424\n171#1,25:441\n206#1,2:466\n208#1,7:471\n215#1,15:479\n237#1,2:494\n239#1,20:499\n1182#2:382\n1161#2,2:383\n1182#2:397\n1161#2,2:398\n1182#2:401\n1161#2,2:402\n1182#2:468\n1161#2,2:469\n1182#2:496\n1161#2,2:497\n48#3:385\n492#3,11:386\n48#3:400\n48#3:478\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n290#1:404,11\n298#1:415,9\n314#1:424,17\n334#1:441,25\n340#1:466,2\n340#1:471,7\n340#1:479,15\n346#1:494,2\n346#1:499,20\n143#1:382\n143#1:383,2\n207#1:397\n207#1:398,2\n238#1:401\n238#1:402,2\n340#1:468\n340#1:469,2\n346#1:496\n346#1:497,2\n150#1:385\n199#1:386,11\n214#1:400\n340#1:478\n*E\n"})
public final class DelegatableNodeKt {
    @ExperimentalComposeUiApi
    public static final void A(DelegatableNode delegatableNode0, int v, Function1 function10) {
        L.p(delegatableNode0, "$this$visitSubtree");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode().F();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(delegatableNode0);
        NestedVectorStack nestedVectorStack0 = new NestedVectorStack();
        while(layoutNode0 != null) {
            if(modifier$Node0 == null) {
                modifier$Node0 = layoutNode0.x0().m();
            }
            if((modifier$Node0.D() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & v) != 0) {
                        L.y(3, "T");
                        function10.invoke(modifier$Node0);
                    }
                    modifier$Node0 = modifier$Node0.F();
                }
                modifier$Node0 = null;
            }
            nestedVectorStack0.c(layoutNode0.I0());
            layoutNode0 = nestedVectorStack0.a() ? ((LayoutNode)nestedVectorStack0.b()) : null;
        }
    }

    @ExperimentalComposeUiApi
    public static final void B(@l DelegatableNode delegatableNode0, int v, @l Function1 function10) {
        L.p(delegatableNode0, "<this>");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
    label_9:
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & v) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.J() & v) != 0 && !((Boolean)function10.invoke(modifier$Node2)).booleanValue()) {
                        continue label_9;
                    }
                    modifier$Node2 = modifier$Node2.F();
                }
            }
            DelegatableNodeKt.b(mutableVector0, modifier$Node1);
        }
    }

    @ExperimentalComposeUiApi
    public static final void C(DelegatableNode delegatableNode0, int v, Function1 function10) {
        L.p(delegatableNode0, "$this$visitSubtreeIf");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
    label_9:
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & v) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.J() & v) != 0) {
                        L.y(3, "T");
                        if(((Boolean)function10.invoke(modifier$Node2)).booleanValue()) {
                            goto label_17;
                        }
                        continue label_9;
                    }
                label_17:
                    modifier$Node2 = modifier$Node2.F();
                }
            }
            DelegatableNodeKt.b(mutableVector0, modifier$Node1);
        }
    }

    private static final void b(MutableVector mutableVector0, Node modifier$Node0) {
        MutableVector mutableVector1 = DelegatableNodeKt.p(modifier$Node0).I0();
        int v = mutableVector1.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector1.F();
            while(true) {
                mutableVector0.b(((LayoutNode)arr_object[v1]).x0().m());
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    @m
    public static final List c(@l DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "<this>");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(delegatableNode0);
        List list0 = null;
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & v) != 0) {
                        if(list0 == null) {
                            list0 = new ArrayList();
                        }
                        list0.add(modifier$Node0);
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
        return list0;
    }

    @ExperimentalComposeUiApi
    public static final List d(DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "$this$ancestors");
        List list0 = DelegatableNodeKt.c(delegatableNode0, v);
        return list0 instanceof List ? list0 : null;
    }

    @ExperimentalComposeUiApi
    @m
    public static final Node e(@l DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "<this>");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & v) == 0) {
                DelegatableNodeKt.b(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & v) != 0) {
                        return modifier$Node1;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final Object f(DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "$this$firstChild");
        Node modifier$Node0 = DelegatableNodeKt.e(delegatableNode0, v);
        L.y(2, "T");
        return modifier$Node0;
    }

    @ExperimentalComposeUiApi
    public static final boolean g(@l DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "$this$has");
        return (delegatableNode0.getNode().D() & v) != 0;
    }

    @ExperimentalComposeUiApi
    public static final void h(@l DelegatableNode delegatableNode0) {
        L.p(delegatableNode0, "<this>");
        if(delegatableNode0.getNode().Q()) {
            LayoutNode.W0(DelegatableNodeKt.p(delegatableNode0), false, 1, null);
        }
    }

    @ExperimentalComposeUiApi
    @m
    public static final Node i(@l DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "<this>");
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            return null;
        }
        if((modifier$Node0.D() & v) == 0) {
            return null;
        }
        while(modifier$Node0 != null) {
            if((modifier$Node0.J() & v) != 0) {
                return modifier$Node0;
            }
            modifier$Node0 = modifier$Node0.F();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final Object j(DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "$this$localChild");
        Node modifier$Node0 = DelegatableNodeKt.i(delegatableNode0, v);
        L.y(2, "T");
        return modifier$Node0;
    }

    @ExperimentalComposeUiApi
    @m
    public static final Node k(@l DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "<this>");
        for(Node modifier$Node0 = delegatableNode0.getNode().O(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            if((modifier$Node0.J() & v) != 0) {
                return modifier$Node0;
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final Object l(DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "$this$localParent");
        Node modifier$Node0 = DelegatableNodeKt.k(delegatableNode0, v);
        L.y(2, "T");
        return modifier$Node0;
    }

    @ExperimentalComposeUiApi
    @m
    public static final Node m(@l DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "<this>");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(delegatableNode0);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & v) != 0) {
                        return modifier$Node0;
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
    public static final Object n(DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "$this$nearestAncestor");
        Node modifier$Node0 = DelegatableNodeKt.m(delegatableNode0, v);
        L.y(2, "T");
        return modifier$Node0;
    }

    @ExperimentalComposeUiApi
    @l
    public static final NodeCoordinator o(@l DelegatableNode delegatableNode0, int v) {
        L.p(delegatableNode0, "$this$requireCoordinator");
        NodeCoordinator nodeCoordinator0 = delegatableNode0.getNode().G();
        L.m(nodeCoordinator0);
        if(nodeCoordinator0.M2() == delegatableNode0 && NodeKindKt.g(v)) {
            nodeCoordinator0 = nodeCoordinator0.N2();
            L.m(nodeCoordinator0);
        }
        return nodeCoordinator0;
    }

    @ExperimentalComposeUiApi
    @l
    public static final LayoutNode p(@l DelegatableNode delegatableNode0) {
        L.p(delegatableNode0, "<this>");
        NodeCoordinator nodeCoordinator0 = delegatableNode0.getNode().G();
        if(nodeCoordinator0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return nodeCoordinator0.M0();
    }

    @ExperimentalComposeUiApi
    @l
    public static final Owner q(@l DelegatableNode delegatableNode0) {
        L.p(delegatableNode0, "<this>");
        Owner owner0 = DelegatableNodeKt.p(delegatableNode0).B0();
        if(owner0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return owner0;
    }

    @ExperimentalComposeUiApi
    public static final void r(@l DelegatableNode delegatableNode0, int v, @l Function1 function10) {
        L.p(delegatableNode0, "<this>");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(delegatableNode0);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & v) != 0) {
                        function10.invoke(modifier$Node0);
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

    @ExperimentalComposeUiApi
    public static final void s(DelegatableNode delegatableNode0, int v, Function1 function10) {
        L.p(delegatableNode0, "$this$visitAncestors");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(delegatableNode0);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & v) != 0) {
                        L.y(3, "T");
                        function10.invoke(modifier$Node0);
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

    @ExperimentalComposeUiApi
    public static final void t(@l DelegatableNode delegatableNode0, int v, @l Function1 function10) {
        L.p(delegatableNode0, "<this>");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & v) == 0) {
                DelegatableNodeKt.b(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & v) != 0) {
                        function10.invoke(modifier$Node1);
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void u(DelegatableNode delegatableNode0, int v, Function1 function10) {
        L.p(delegatableNode0, "$this$visitChildren");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & v) == 0) {
                DelegatableNodeKt.b(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & v) != 0) {
                        L.y(3, "T");
                        function10.invoke(modifier$Node1);
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void v(@l DelegatableNode delegatableNode0, int v, @l Function1 function10) {
        L.p(delegatableNode0, "<this>");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        if((modifier$Node0.D() & v) == 0) {
            return;
        }
        for(Node modifier$Node1 = modifier$Node0.F(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.F()) {
            if((modifier$Node1.J() & v) != 0) {
                function10.invoke(modifier$Node1);
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void w(DelegatableNode delegatableNode0, int v, Function1 function10) {
        L.p(delegatableNode0, "$this$visitLocalChildren");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        if((modifier$Node0.D() & v) != 0) {
            for(Node modifier$Node1 = modifier$Node0.F(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.F()) {
                if((modifier$Node1.J() & v) != 0) {
                    L.y(3, "T");
                    function10.invoke(modifier$Node1);
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void x(@l DelegatableNode delegatableNode0, int v, @l Function1 function10) {
        L.p(delegatableNode0, "<this>");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        for(Node modifier$Node0 = delegatableNode0.getNode().O(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            if((modifier$Node0.J() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void y(DelegatableNode delegatableNode0, int v, Function1 function10) {
        L.p(delegatableNode0, "$this$visitLocalParents");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        for(Node modifier$Node0 = delegatableNode0.getNode().O(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            if((modifier$Node0.J() & v) != 0) {
                L.y(3, "T");
                function10.invoke(modifier$Node0);
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void z(@l DelegatableNode delegatableNode0, int v, @l Function1 function10) {
        L.p(delegatableNode0, "<this>");
        L.p(function10, "block");
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode().F();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(delegatableNode0);
        NestedVectorStack nestedVectorStack0 = new NestedVectorStack();
        while(layoutNode0 != null) {
            if(modifier$Node0 == null) {
                modifier$Node0 = layoutNode0.x0().m();
            }
            if((modifier$Node0.D() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & v) != 0) {
                        function10.invoke(modifier$Node0);
                    }
                    modifier$Node0 = modifier$Node0.F();
                }
                modifier$Node0 = null;
            }
            nestedVectorStack0.c(layoutNode0.I0());
            layoutNode0 = nestedVectorStack0.a() ? ((LayoutNode)nestedVectorStack0.b()) : null;
        }
    }
}

