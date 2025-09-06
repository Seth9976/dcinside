package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifier;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,283:1\n51#1:287\n51#1:289\n51#1:291\n51#1:293\n51#1:295\n51#1:297\n51#1:299\n51#1:301\n51#1:303\n51#1:305\n51#1:307\n51#1:310\n51#1:312\n51#1:314\n51#1:316\n51#1:318\n51#1:320\n51#1:322\n51#1:324\n51#1:326\n51#1:328\n51#1:330\n51#1:332\n51#1:334\n51#1:336\n81#2:284\n67#2:285\n69#2:286\n85#2:288\n71#2:290\n73#2:292\n75#2:294\n77#2:296\n91#2:298\n89#2:300\n83#2:302\n79#2:304\n81#2:306\n67#2:308\n69#2:309\n71#2:311\n73#2:313\n75#2:315\n77#2:317\n79#2:319\n81#2:321\n83#2:323\n85#2:325\n87#2:327\n89#2:329\n91#2:331\n93#2:333\n95#2:335\n69#2:337\n69#2:339\n83#2:340\n71#2:342\n73#2:344\n79#2:346\n87#2:348\n89#2:350\n91#2:352\n87#2:354\n196#3:338\n196#3:341\n196#3:343\n196#3:345\n196#3:347\n196#3:349\n196#3:351\n196#3:353\n340#4:355\n206#4,2:356\n208#4,7:361\n215#4,15:369\n1182#5:358\n1161#5,2:359\n48#6:368\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n103#1:287\n106#1:289\n109#1:291\n112#1:293\n115#1:295\n121#1:297\n124#1:299\n127#1:301\n130#1:303\n133#1:305\n140#1:307\n149#1:310\n152#1:312\n155#1:314\n158#1:316\n161#1:318\n164#1:320\n167#1:322\n170#1:324\n173#1:326\n176#1:328\n179#1:330\n182#1:332\n185#1:334\n188#1:336\n59#1:284\n101#1:285\n103#1:286\n106#1:288\n109#1:290\n112#1:292\n115#1:294\n121#1:296\n124#1:298\n127#1:300\n130#1:302\n133#1:304\n140#1:306\n147#1:308\n149#1:309\n152#1:311\n155#1:313\n158#1:315\n161#1:317\n164#1:319\n167#1:321\n170#1:323\n173#1:325\n176#1:327\n179#1:329\n182#1:331\n185#1:333\n188#1:335\n209#1:337\n212#1:339\n216#1:340\n219#1:342\n222#1:344\n225#1:346\n228#1:348\n237#1:350\n246#1:352\n253#1:354\n209#1:338\n216#1:341\n219#1:343\n222#1:345\n225#1:347\n228#1:349\n237#1:351\n246#1:353\n253#1:355\n253#1:356,2\n253#1:361,7\n253#1:369,15\n253#1:358\n253#1:359,2\n253#1:368\n*E\n"})
public final class NodeKindKt {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;

    public static final void a(@l Node modifier$Node0) {
        L.p(modifier$Node0, "node");
        NodeKindKt.b(modifier$Node0, 1);
    }

    private static final void b(Node modifier$Node0, int v) {
        if(!modifier$Node0.Q()) {
            throw new IllegalStateException("Check failed.");
        }
        if((2 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof LayoutModifierNode) {
            LayoutModifierNodeKt.c(((LayoutModifierNode)modifier$Node0));
            if(v == 2) {
                DelegatableNodeKt.o(modifier$Node0, 2).k3();
            }
        }
        if((0x100 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof GlobalPositionAwareModifierNode) {
            DelegatableNodeKt.p(modifier$Node0).T0();
        }
        if((4 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof DrawModifierNode) {
            DrawModifierNodeKt.a(((DrawModifierNode)modifier$Node0));
        }
        if((8 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof SemanticsModifierNode) {
            SemanticsModifierNodeKt.d(((SemanticsModifierNode)modifier$Node0));
        }
        if((0x40 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof ParentDataModifierNode) {
            ParentDataModifierNodeKt.a(((ParentDataModifierNode)modifier$Node0));
        }
        if((0x400 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof FocusTargetModifierNode) {
            if(v == 2) {
                modifier$Node0.U();
            }
            else {
                DelegatableNodeKt.q(modifier$Node0).getFocusOwner().d(((FocusTargetModifierNode)modifier$Node0));
            }
        }
        if((0x800 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof FocusPropertiesModifierNode && NodeKindKt.k(((FocusPropertiesModifierNode)modifier$Node0))) {
            if(v == 2) {
                NodeKindKt.j(((FocusPropertiesModifierNode)modifier$Node0));
            }
            else {
                DelegatableNodeKt.q(modifier$Node0).getFocusOwner().j(((FocusPropertiesModifierNode)modifier$Node0));
            }
        }
        if((0x1000 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof FocusEventModifierNode && v != 2) {
            DelegatableNodeKt.q(modifier$Node0).getFocusOwner().g(((FocusEventModifierNode)modifier$Node0));
        }
    }

    public static final void c(@l Node modifier$Node0) {
        L.p(modifier$Node0, "node");
        NodeKindKt.b(modifier$Node0, 2);
    }

    public static final void d(@l Node modifier$Node0) {
        L.p(modifier$Node0, "node");
        NodeKindKt.b(modifier$Node0, 0);
    }

    public static final int e(@l Element modifier$Element0) {
        L.p(modifier$Element0, "element");
        int v = modifier$Element0 instanceof LayoutModifier ? 3 : 1;
        if(modifier$Element0 instanceof IntermediateLayoutModifier) {
            v |= 0x200;
        }
        if(modifier$Element0 instanceof DrawModifier) {
            v |= 4;
        }
        if(modifier$Element0 instanceof SemanticsModifier) {
            v |= 8;
        }
        if(modifier$Element0 instanceof PointerInputModifier) {
            v |= 16;
        }
        if(modifier$Element0 instanceof ModifierLocalConsumer || modifier$Element0 instanceof ModifierLocalProvider) {
            v |= 0x20;
        }
        if(modifier$Element0 instanceof FocusEventModifier) {
            v |= 0x1000;
        }
        if(modifier$Element0 instanceof FocusOrderModifier) {
            v |= 0x800;
        }
        if(modifier$Element0 instanceof OnGloballyPositionedModifier) {
            v |= 0x100;
        }
        if(modifier$Element0 instanceof ParentDataModifier) {
            v |= 0x40;
        }
        return !(modifier$Element0 instanceof OnPlacedModifier) && !(modifier$Element0 instanceof OnRemeasuredModifier) && !(modifier$Element0 instanceof LookaheadOnPlacedModifier) ? v : v | 0x80;
    }

    public static final int f(@l Node modifier$Node0) {
        L.p(modifier$Node0, "node");
        int v = modifier$Node0 instanceof LayoutModifierNode ? 3 : 1;
        if(modifier$Node0 instanceof DrawModifierNode) {
            v |= 4;
        }
        if(modifier$Node0 instanceof SemanticsModifierNode) {
            v |= 8;
        }
        if(modifier$Node0 instanceof PointerInputModifierNode) {
            v |= 16;
        }
        if(modifier$Node0 instanceof ModifierLocalNode) {
            v |= 0x20;
        }
        if(modifier$Node0 instanceof ParentDataModifierNode) {
            v |= 0x40;
        }
        if(modifier$Node0 instanceof LayoutAwareModifierNode) {
            v |= 0x80;
        }
        if(modifier$Node0 instanceof GlobalPositionAwareModifierNode) {
            v |= 0x100;
        }
        if(modifier$Node0 instanceof IntermediateLayoutModifierNode) {
            v |= 0x200;
        }
        if(modifier$Node0 instanceof FocusTargetModifierNode) {
            v |= 0x400;
        }
        if(modifier$Node0 instanceof FocusPropertiesModifierNode) {
            v |= 0x800;
        }
        if(modifier$Node0 instanceof FocusEventModifierNode) {
            v |= 0x1000;
        }
        if(modifier$Node0 instanceof KeyInputModifierNode) {
            v |= 0x2000;
        }
        return modifier$Node0 instanceof RotaryInputModifierNode ? v | 0x4000 : v;
    }

    // 去混淆评级： 低(20)
    public static final boolean g(int v) [...] // 潜在的解密器

    public static void h(int v) {
    }

    public static final int i(int v, int v1) {
        return v | v1;
    }

    @ExperimentalComposeUiApi
    private static final void j(FocusPropertiesModifierNode focusPropertiesModifierNode0) {
        if(!focusPropertiesModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusPropertiesModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector0, focusPropertiesModifierNode0.getNode());
        }
        else {
            mutableVector0.b(modifier$Node0);
        }
    label_7:
        while(mutableVector0.O()) {
            Node modifier$Node1 = (Node)mutableVector0.e0(mutableVector0.J() - 1);
            if((modifier$Node1.D() & 0x400) == 0) {
                DelegatableNodeKt.b(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & 0x400) != 0) {
                        if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                            continue label_7;
                        }
                        DelegatableNodeKt.q(focusPropertiesModifierNode0).getFocusOwner().d(((FocusTargetModifierNode)modifier$Node1));
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean k(FocusPropertiesModifierNode focusPropertiesModifierNode0) {
        CanFocusChecker.a.v();
        focusPropertiesModifierNode0.l(CanFocusChecker.a);
        return false;
    }
}

