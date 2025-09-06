package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.SemanticsModifierNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,436:1\n73#2:437\n73#2:471\n681#3:438\n612#3,8:439\n635#3,3:447\n620#3,2:450\n613#3:452\n682#3:453\n614#3,11:454\n638#3,3:465\n625#3:468\n615#3:469\n684#3:470\n605#3,15:472\n635#3,3:487\n620#3,2:490\n613#3:492\n606#3,19:493\n638#3,3:512\n625#3:515\n615#3:516\n608#3:517\n460#4,11:518\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n391#1:437\n395#1:471\n391#1:438\n391#1:439,8\n391#1:447,3\n391#1:450,2\n391#1:452\n391#1:453\n391#1:454,11\n391#1:465,3\n391#1:468\n391#1:469\n391#1:470\n395#1:472,15\n395#1:487,3\n395#1:490,2\n395#1:492\n395#1:493,19\n395#1:512,3\n395#1:515\n395#1:516\n395#1:517\n405#1:518,11\n*E\n"})
public final class SemanticsNodeKt {
    private static final int d(SemanticsNode semanticsNode0) {
        return semanticsNode0.l() + 2000000000;
    }

    @m
    public static final LayoutNode e(@l LayoutNode layoutNode0, @l Function1 function10) {
        L.p(layoutNode0, "<this>");
        L.p(function10, "selector");
        for(LayoutNode layoutNode1 = layoutNode0.C0(); layoutNode1 != null; layoutNode1 = layoutNode1.C0()) {
            if(((Boolean)function10.invoke(layoutNode1)).booleanValue()) {
                return layoutNode1;
            }
        }
        return null;
    }

    private static final List f(LayoutNode layoutNode0, List list0) {
        MutableVector mutableVector0 = layoutNode0.G0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode1);
                if(semanticsModifierNode0 == null) {
                    SemanticsNodeKt.f(layoutNode1, list0);
                }
                else {
                    list0.add(semanticsModifierNode0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return list0;
    }

    static List g(LayoutNode layoutNode0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        return SemanticsNodeKt.f(layoutNode0, list0);
    }

    @m
    public static final SemanticsModifierNode h(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "<this>");
        NodeChain nodeChain0 = layoutNode0.x0();
        if((nodeChain0.k() & 8) != 0) {
            for(Node modifier$Node0 = nodeChain0.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
                if((modifier$Node0.J() & 8) != 0 && modifier$Node0 instanceof SemanticsModifierNode && ((SemanticsModifierNode)modifier$Node0).c0().k()) {
                    return (SemanticsModifierNode)modifier$Node0;
                }
                if((modifier$Node0.D() & 8) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public static void i(LayoutNode layoutNode0) {
    }

    @m
    public static final SemanticsModifierNode j(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "<this>");
        NodeChain nodeChain0 = layoutNode0.x0();
        if((nodeChain0.k() & 8) != 0) {
            for(Node modifier$Node0 = nodeChain0.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
                if((modifier$Node0.J() & 8) != 0 && modifier$Node0 instanceof SemanticsModifierNode) {
                    return (SemanticsModifierNode)modifier$Node0;
                }
                if((modifier$Node0.D() & 8) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public static void k(LayoutNode layoutNode0) {
    }

    private static final Role l(SemanticsNode semanticsNode0) {
        return (Role)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsProperties.a.u());
    }

    private static final int m(SemanticsNode semanticsNode0) {
        return semanticsNode0.l() + 1000000000;
    }
}

