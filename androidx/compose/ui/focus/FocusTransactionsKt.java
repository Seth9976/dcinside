package androidx.compose.ui.focus;

import A3.a;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,242:1\n87#2:243\n87#2:245\n87#2:247\n324#3:244\n324#3:246\n324#3:248\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n55#1:243\n185#1:245\n209#1:247\n55#1:244\n185#1:246\n209#1:248\n*E\n"})
public final class FocusTransactionsKt {
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
                arr_v[FocusStateImpl.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.b.ordinal()] = 3;
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

    @ExperimentalComposeUiApi
    public static final boolean a(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        switch(focusTargetModifierNode0.l0()) {
            case 1: {
                focusTargetModifierNode0.o0(FocusStateImpl.c);
                FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                break;
            }
            case 2: {
                break;
            }
            case 3: 
            case 4: {
                return false;
            }
            default: {
                throw new J();
            }
        }
        return true;
    }

    @ExperimentalComposeUiApi
    private static final boolean b(FocusTargetModifierNode focusTargetModifierNode0, boolean z, boolean z1) {
        FocusTargetModifierNode focusTargetModifierNode1 = FocusTraversalKt.f(focusTargetModifierNode0);
        return focusTargetModifierNode1 == null ? true : FocusTransactionsKt.d(focusTargetModifierNode1, z, z1);
    }

    static boolean c(FocusTargetModifierNode focusTargetModifierNode0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        return FocusTransactionsKt.b(focusTargetModifierNode0, z, z1);
    }

    @ExperimentalComposeUiApi
    public static final boolean d(@l FocusTargetModifierNode focusTargetModifierNode0, boolean z, boolean z1) {
        L.p(focusTargetModifierNode0, "<this>");
        switch(focusTargetModifierNode0.l0()) {
            case 1: {
                focusTargetModifierNode0.o0(FocusStateImpl.d);
                if(!z1) {
                    return true;
                }
                FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                return true;
            }
            case 2: {
                if(z) {
                    focusTargetModifierNode0.o0(FocusStateImpl.d);
                    if(z1) {
                        FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                        return true;
                    }
                }
                return z;
            }
            case 3: {
                if(FocusTransactionsKt.b(focusTargetModifierNode0, z, z1)) {
                    focusTargetModifierNode0.o0(FocusStateImpl.d);
                    if(z1) {
                        FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            case 4: {
                return true;
            }
            default: {
                throw new J();
            }
        }
    }

    public static boolean e(FocusTargetModifierNode focusTargetModifierNode0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return FocusTransactionsKt.d(focusTargetModifierNode0, z, z1);
    }

    @ExperimentalComposeUiApi
    public static final boolean f(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        switch(focusTargetModifierNode0.l0()) {
            case 1: {
                break;
            }
            case 2: {
                focusTargetModifierNode0.o0(FocusStateImpl.a);
                FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                break;
            }
            case 3: 
            case 4: {
                return false;
            }
            default: {
                throw new J();
            }
        }
        return true;
    }

    private static final boolean g(FocusTargetModifierNode focusTargetModifierNode0) {
        ObserverNodeKt.a(focusTargetModifierNode0, new a(focusTargetModifierNode0) {
            final FocusTargetModifierNode e;

            {
                this.e = focusTargetModifierNode0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.i0();
            }
        });
        switch(focusTargetModifierNode0.l0()) {
            case 3: 
            case 4: {
                focusTargetModifierNode0.o0(FocusStateImpl.a);
                return true;
            }
            default: {
                return true;
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean h(@l FocusTargetModifierNode focusTargetModifierNode0) {
        L.p(focusTargetModifierNode0, "<this>");
        if(!focusTargetModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        if(!focusTargetModifierNode0.i0().r()) {
            return TwoDimensionalFocusSearchKt.k(focusTargetModifierNode0, 7, androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1.e);
        }
        Node modifier$Node0 = null;
        int v = WhenMappings.a[focusTargetModifierNode0.l0().ordinal()];
        if(v != 1 && v != 2) {
            switch(v) {
                case 3: {
                    if(!FocusTransactionsKt.c(focusTargetModifierNode0, false, false, 3, null) || !FocusTransactionsKt.g(focusTargetModifierNode0)) {
                        return false;
                    }
                    FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                    return true;
                }
                case 4: {
                    Node modifier$Node1 = DelegatableNodeKt.m(focusTargetModifierNode0, 0x400);
                    if(modifier$Node1 instanceof FocusTargetModifierNode) {
                        modifier$Node0 = modifier$Node1;
                    }
                    if(((FocusTargetModifierNode)modifier$Node0) != null) {
                        return FocusTransactionsKt.i(((FocusTargetModifierNode)modifier$Node0), focusTargetModifierNode0);
                    }
                    if(!FocusTransactionsKt.j(focusTargetModifierNode0) || !FocusTransactionsKt.g(focusTargetModifierNode0)) {
                        return false;
                    }
                    FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                    return true;
                }
                default: {
                    throw new J();
                }
            }
        }
        FocusEventModifierNodeKt.b(focusTargetModifierNode0);
        return true;

        final class androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1 extends N implements Function1 {
            public static final androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1 e;

            static {
                androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1.e = new androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1();
            }

            androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1() {
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

    private static final boolean i(FocusTargetModifierNode focusTargetModifierNode0, FocusTargetModifierNode focusTargetModifierNode1) {
        Node modifier$Node0 = DelegatableNodeKt.m(focusTargetModifierNode1, 0x400);
        Node modifier$Node1 = null;
        if(!(modifier$Node0 instanceof FocusTargetModifierNode)) {
            modifier$Node0 = null;
        }
        if(!L.g(((FocusTargetModifierNode)modifier$Node0), focusTargetModifierNode0)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        boolean z = false;
        int v = WhenMappings.a[focusTargetModifierNode0.l0().ordinal()];
        if(v == 1) {
            z = FocusTransactionsKt.g(focusTargetModifierNode1);
            if(z) {
                focusTargetModifierNode0.o0(FocusStateImpl.b);
                FocusEventModifierNodeKt.b(focusTargetModifierNode1);
                FocusEventModifierNodeKt.b(focusTargetModifierNode0);
            }
        }
        else {
            switch(v) {
                case 2: {
                    break;
                }
                case 3: {
                    if(FocusTraversalKt.f(focusTargetModifierNode0) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if(!FocusTransactionsKt.c(focusTargetModifierNode0, false, false, 3, null) || !FocusTransactionsKt.g(focusTargetModifierNode1)) {
                        return false;
                    }
                    FocusEventModifierNodeKt.b(focusTargetModifierNode1);
                    return true;
                }
                case 4: {
                    Node modifier$Node2 = DelegatableNodeKt.m(focusTargetModifierNode0, 0x400);
                    if(modifier$Node2 instanceof FocusTargetModifierNode) {
                        modifier$Node1 = modifier$Node2;
                    }
                    if(((FocusTargetModifierNode)modifier$Node1) == null && FocusTransactionsKt.j(focusTargetModifierNode0)) {
                        focusTargetModifierNode0.o0(FocusStateImpl.a);
                        FocusEventModifierNodeKt.b(focusTargetModifierNode0);
                        return FocusTransactionsKt.i(focusTargetModifierNode0, focusTargetModifierNode1);
                    }
                    if(((FocusTargetModifierNode)modifier$Node1) != null && FocusTransactionsKt.i(((FocusTargetModifierNode)modifier$Node1), focusTargetModifierNode0)) {
                        z = FocusTransactionsKt.i(focusTargetModifierNode0, focusTargetModifierNode1);
                        if(focusTargetModifierNode0.k0() != FocusStateImpl.b) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                    break;
                }
                default: {
                    throw new J();
                }
            }
        }
        return z;
    }

    private static final boolean j(FocusTargetModifierNode focusTargetModifierNode0) {
        NodeCoordinator nodeCoordinator0 = focusTargetModifierNode0.G();
        if(nodeCoordinator0 != null) {
            LayoutNode layoutNode0 = nodeCoordinator0.M0();
            if(layoutNode0 != null) {
                Owner owner0 = layoutNode0.B0();
                if(owner0 != null) {
                    return owner0.requestFocus();
                }
            }
        }
        throw new IllegalStateException("Owner not initialized.");
    }
}

