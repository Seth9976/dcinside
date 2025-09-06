package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,275:1\n224#1:279\n225#1:281\n226#1,3:288\n229#1:297\n224#1:301\n225#1:303\n226#1,3:310\n229#1:319\n93#2:276\n93#2:278\n95#2:298\n95#2:300\n87#2,7:333\n87#2:348\n324#3:277\n320#3:280\n324#3:299\n320#3:302\n320#3:320\n262#3,7:341\n270#3,3:350\n51#4,6:282\n33#4,6:291\n51#4,6:304\n33#4,6:313\n51#4,6:321\n33#4,6:327\n47#5:340\n196#6:349\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n177#1:279\n177#1:281\n177#1:288,3\n177#1:297\n194#1:301\n194#1:303\n194#1:310,3\n194#1:319\n175#1:276\n178#1:278\n192#1:298\n195#1:300\n242#1:333,7\n243#1:348\n175#1:277\n177#1:280\n192#1:299\n194#1:302\n224#1:320\n242#1:341,7\n242#1:350,3\n177#1:282,6\n177#1:291,6\n194#1:304,6\n194#1:313,6\n225#1:321,6\n228#1:327,6\n242#1:340\n243#1:349\n*E\n"})
public final class FocusOwnerImpl implements FocusOwner {
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
    private FocusTargetModifierNode a;
    @l
    private final FocusInvalidationManager b;
    @l
    private final Modifier c;
    public LayoutDirection d;

    public FocusOwnerImpl(@l Function1 function10) {
        L.p(function10, "onRequestApplyChangesListener");
        super();
        this.a = new FocusTargetModifierNode();
        this.b = new FocusInvalidationManager(function10);
        this.c = new ModifierNodeElement() {
            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public Node a() {
                return this.p();
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(@m Object object0) {
                return object0 == this;
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.c.o().hashCode();
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public void m(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "<this>");
                inspectorInfo0.d("RootFocusTarget");
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public Node n(Node modifier$Node0) {
                return this.q(((FocusTargetModifierNode)modifier$Node0));
            }

            @l
            public FocusTargetModifierNode p() {
                return this.c.o();
            }

            @l
            public FocusTargetModifierNode q(@l FocusTargetModifierNode focusTargetModifierNode0) {
                L.p(focusTargetModifierNode0, "node");
                return focusTargetModifierNode0;
            }
        };
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void a(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "<set-?>");
        this.d = layoutDirection0;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @l
    public Modifier b() {
        return this.c;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void c() {
        if(this.a.l0() == FocusStateImpl.d) {
            this.a.o0(FocusStateImpl.a);
        }
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void d(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "node");
        this.b.f(focusTargetModifierNode0);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean e(@l RotaryScrollEvent rotaryScrollEvent0) {
        RotaryInputModifierNode rotaryInputModifierNode0;
        L.p(rotaryScrollEvent0, "event");
        FocusTargetModifierNode focusTargetModifierNode0 = FocusTraversalKt.b(this.a);
        List list0 = null;
        if(focusTargetModifierNode0 == null) {
            rotaryInputModifierNode0 = null;
        }
        else {
            Node modifier$Node0 = DelegatableNodeKt.m(focusTargetModifierNode0, 0x4000);
            if(!(modifier$Node0 instanceof RotaryInputModifierNode)) {
                modifier$Node0 = null;
            }
            rotaryInputModifierNode0 = (RotaryInputModifierNode)modifier$Node0;
        }
        if(rotaryInputModifierNode0 != null) {
            List list1 = DelegatableNodeKt.c(rotaryInputModifierNode0, 0x4000);
            if(list1 instanceof List) {
                list0 = list1;
            }
            if(list0 != null) {
                int v = list0.size() - 1;
                if(v >= 0) {
                    while(true) {
                        if(((RotaryInputModifierNode)list0.get(v)).q(rotaryScrollEvent0)) {
                            return true;
                        }
                        if(v - 1 < 0) {
                            break;
                        }
                        --v;
                    }
                }
            }
            if(rotaryInputModifierNode0.q(rotaryScrollEvent0)) {
                return true;
            }
            if(rotaryInputModifierNode0.x(rotaryScrollEvent0)) {
                return true;
            }
            if(list0 != null) {
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(((RotaryInputModifierNode)list0.get(v2)).x(rotaryScrollEvent0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean f(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "keyEvent");
        FocusTargetModifierNode focusTargetModifierNode0 = FocusTraversalKt.b(this.a);
        if(focusTargetModifierNode0 == null) {
            throw new IllegalStateException("Event can\'t be processed because we do not have an active focus target.");
        }
        KeyInputModifierNode keyInputModifierNode0 = this.q(focusTargetModifierNode0);
        List list0 = null;
        if(keyInputModifierNode0 == null) {
            Node modifier$Node0 = DelegatableNodeKt.m(focusTargetModifierNode0, 0x2000);
            if(!(modifier$Node0 instanceof KeyInputModifierNode)) {
                modifier$Node0 = null;
            }
            keyInputModifierNode0 = (KeyInputModifierNode)modifier$Node0;
        }
        if(keyInputModifierNode0 != null) {
            List list1 = DelegatableNodeKt.c(keyInputModifierNode0, 0x2000);
            if(list1 instanceof List) {
                list0 = list1;
            }
            if(list0 != null) {
                int v = list0.size() - 1;
                if(v >= 0) {
                    while(true) {
                        if(((KeyInputModifierNode)list0.get(v)).m(keyEvent0)) {
                            return true;
                        }
                        if(v - 1 < 0) {
                            break;
                        }
                        --v;
                    }
                }
            }
            if(keyInputModifierNode0.m(keyEvent0)) {
                return true;
            }
            if(keyInputModifierNode0.w(keyEvent0)) {
                return true;
            }
            if(list0 != null) {
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(((KeyInputModifierNode)list0.get(v2)).w(keyEvent0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void g(@l FocusEventModifierNode focusEventModifierNode0) {
        L.p(focusEventModifierNode0, "node");
        this.b.d(focusEventModifierNode0);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @l
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection0 = this.d;
        if(layoutDirection0 != null) {
            return layoutDirection0;
        }
        L.S("layoutDirection");
        return null;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void h(boolean z, boolean z1) {
        FocusStateImpl focusStateImpl1;
        FocusStateImpl focusStateImpl0 = this.a.l0();
        if(FocusTransactionsKt.d(this.a, z, z1)) {
            FocusTargetModifierNode focusTargetModifierNode0 = this.a;
            switch(focusStateImpl0) {
                case 1: 
                case 2: 
                case 3: {
                    focusStateImpl1 = FocusStateImpl.a;
                    break;
                }
                case 4: {
                    focusStateImpl1 = FocusStateImpl.d;
                    break;
                }
                default: {
                    throw new J();
                }
            }
            focusTargetModifierNode0.o0(focusStateImpl1);
        }
    }

    @Override  // androidx.compose.ui.focus.FocusManager
    public boolean i(int v) {
        FocusTargetModifierNode focusTargetModifierNode0 = FocusTraversalKt.b(this.a);
        if(focusTargetModifierNode0 == null) {
            return false;
        }
        FocusRequester focusRequester0 = FocusTraversalKt.a(focusTargetModifierNode0, v, this.getLayoutDirection());
        Companion focusRequester$Companion0 = FocusRequester.b;
        if(L.g(focusRequester0, focusRequester$Companion0.b())) {
            return false;
        }
        return L.g(focusRequester0, focusRequester$Companion0.d()) ? FocusTraversalKt.e(this.a, v, this.getLayoutDirection(), new Function1() {
            final FocusTargetModifierNode e;

            {
                this.e = focusTargetModifierNode0;
                super(1);
            }

            @l
            public final Boolean a(@l FocusTargetModifierNode focusTargetModifierNode0) {
                L.p(focusTargetModifierNode0, "destination");
                if(L.g(focusTargetModifierNode0, this.e)) {
                    return false;
                }
                Node modifier$Node0 = DelegatableNodeKt.m(focusTargetModifierNode0, 0x400);
                if(!(modifier$Node0 instanceof FocusTargetModifierNode)) {
                    modifier$Node0 = null;
                }
                if(((FocusTargetModifierNode)modifier$Node0) == null) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                return Boolean.valueOf(FocusTransactionsKt.h(focusTargetModifierNode0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((FocusTargetModifierNode)object0));
            }
        }) || this.t(v) : focusRequester0.d(androidx.compose.ui.focus.FocusOwnerImpl.moveFocus.1.e);

        final class androidx.compose.ui.focus.FocusOwnerImpl.moveFocus.1 extends N implements Function1 {
            public static final androidx.compose.ui.focus.FocusOwnerImpl.moveFocus.1 e;

            static {
                androidx.compose.ui.focus.FocusOwnerImpl.moveFocus.1.e = new androidx.compose.ui.focus.FocusOwnerImpl.moveFocus.1();
            }

            androidx.compose.ui.focus.FocusOwnerImpl.moveFocus.1() {
                super(1);
            }

            @l
            public final Boolean a(@l FocusTargetModifierNode focusTargetModifierNode0) {
                L.p(focusTargetModifierNode0, "it");
                return Boolean.valueOf(FocusTransactionsKt.h(focusTargetModifierNode0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((FocusTargetModifierNode)object0));
            }
        }

    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void j(@l FocusPropertiesModifierNode focusPropertiesModifierNode0) {
        L.p(focusPropertiesModifierNode0, "node");
        this.b.e(focusPropertiesModifierNode0);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @m
    public Rect k() {
        FocusTargetModifierNode focusTargetModifierNode0 = FocusTraversalKt.b(this.a);
        return focusTargetModifierNode0 == null ? null : FocusTraversalKt.d(focusTargetModifierNode0);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void l() {
        FocusTransactionsKt.d(this.a, true, true);
    }

    @Override  // androidx.compose.ui.focus.FocusManager
    public void m(boolean z) {
        this.h(z, true);
    }

    public static void n() {
    }

    @l
    public final FocusTargetModifierNode o() {
        return this.a;
    }

    public static void p() {
    }

    private final KeyInputModifierNode q(DelegatableNode delegatableNode0) {
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        Node modifier$Node1 = null;
        if((modifier$Node0.D() & 0x2400) != 0) {
            for(Node modifier$Node2 = modifier$Node0.F(); modifier$Node2 != null; modifier$Node2 = modifier$Node2.F()) {
                if((modifier$Node2.J() & 0x2400) != 0) {
                    if((0x400 & modifier$Node2.J()) != 0) {
                        return (KeyInputModifierNode)modifier$Node1;
                    }
                    if(!(modifier$Node2 instanceof KeyInputModifierNode)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    modifier$Node1 = modifier$Node2;
                    continue;
                }
            }
        }
        return (KeyInputModifierNode)modifier$Node1;
    }

    public final void r(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<set-?>");
        this.a = focusTargetModifierNode0;
    }

    @ExperimentalComposeUiApi
    private final void s(DelegatableNode delegatableNode0, int v, Function1 function10, Function1 function11) {
        List list0 = DelegatableNodeKt.c(delegatableNode0, v);
        if(!(list0 instanceof List)) {
            list0 = null;
        }
        if(list0 != null) {
            int v1 = list0.size() - 1;
            if(v1 >= 0) {
                while(true) {
                    function10.invoke(list0.get(v1));
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
        }
        function10.invoke(delegatableNode0);
        function11.invoke(delegatableNode0);
        if(list0 != null) {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                function11.invoke(list0.get(v3));
            }
        }
    }

    // 去混淆评级： 低(25)
    private final boolean t(int v) {
        if(this.a.k0().c() && !this.a.k0().a() && (FocusDirection.n(v, 1) ? true : FocusDirection.n(v, 2))) {
            this.m(false);
            return this.a.k0().a() ? this.i(v) : false;
        }
        return false;
    }
}

