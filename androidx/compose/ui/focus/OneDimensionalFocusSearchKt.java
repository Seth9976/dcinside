package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,274:1\n188#1,3:307\n191#1,2:311\n194#1,5:314\n203#1,3:319\n206#1,2:323\n209#1,5:326\n1161#2,2:275\n1182#2:281\n1161#2,2:282\n1161#2,2:331\n1182#2:337\n1161#2,2:338\n1161#2,2:374\n1182#2:380\n1161#2,2:381\n87#3:277\n87#3:333\n87#3:376\n87#3:417\n340#4:278\n206#4,2:279\n208#4,7:284\n215#4,15:292\n340#4:334\n206#4,2:335\n208#4,7:340\n215#4,15:348\n340#4:377\n206#4,2:378\n208#4,7:383\n215#4,15:391\n324#4:418\n48#5:291\n53#5:310\n523#5:313\n53#5:322\n523#5:325\n48#5:347\n204#5,11:363\n48#5:390\n492#5,11:406\n53#5:419\n523#5:420\n523#5:421\n53#5:422\n523#5:423\n523#5:424\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n137#1:307,3\n137#1:311,2\n137#1:314,5\n140#1:319,3\n140#1:323,2\n140#1:326,5\n132#1:275,2\n133#1:281\n133#1:282,2\n159#1:331,2\n160#1:337\n160#1:338,2\n170#1:374,2\n171#1:380\n171#1:381,2\n133#1:277\n160#1:333\n171#1:376\n183#1:417\n133#1:278\n133#1:279,2\n133#1:284,7\n133#1:292,15\n160#1:334\n160#1:335,2\n160#1:340,7\n160#1:348,15\n171#1:377\n171#1:378,2\n171#1:383,7\n171#1:391,15\n183#1:418\n133#1:291\n137#1:310\n137#1:313\n140#1:322\n140#1:325\n160#1:347\n163#1:363,11\n171#1:390\n174#1:406,11\n190#1:419\n192#1:420\n194#1:421\n205#1:422\n207#1:423\n209#1:424\n*E\n"})
public final class OneDimensionalFocusSearchKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            try {
                arr_v[FocusStateImpl.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.a.ordinal()] = 2;
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
    private static final String a = "This function should only be used for 1-D focus search";
    @l
    private static final String b = "ActiveParent must have a focusedChild";

    @ExperimentalComposeUiApi
    private static final boolean b(FocusTargetModifierNode focusTargetModifierNode0, Function1 function10) {
        int[] arr_v = WhenMappings.a;
        switch(arr_v[focusTargetModifierNode0.l0().ordinal()]) {
            case 1: {
                FocusTargetModifierNode focusTargetModifierNode1 = FocusTraversalKt.f(focusTargetModifierNode0);
                if(focusTargetModifierNode1 != null) {
                    switch(arr_v[focusTargetModifierNode1.l0().ordinal()]) {
                        case 1: {
                            return OneDimensionalFocusSearchKt.b(focusTargetModifierNode1, function10) || OneDimensionalFocusSearchKt.f(focusTargetModifierNode0, focusTargetModifierNode1, 2, function10) || focusTargetModifierNode0.i0().r() && ((Boolean)function10.invoke(focusTargetModifierNode1)).booleanValue();
                        }
                        case 2: 
                        case 3: {
                            return OneDimensionalFocusSearchKt.f(focusTargetModifierNode0, focusTargetModifierNode1, 2, function10);
                        }
                        case 4: {
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            case 2: 
            case 3: {
                return OneDimensionalFocusSearchKt.i(focusTargetModifierNode0, function10);
            }
            case 4: {
                if(!OneDimensionalFocusSearchKt.i(focusTargetModifierNode0, function10)) {
                    return focusTargetModifierNode0.i0().r() ? ((Boolean)function10.invoke(focusTargetModifierNode0)).booleanValue() : false;
                }
                return true;
            }
            default: {
                throw new J();
            }
        }
    }

    private static final void c(MutableVector mutableVector0, Object object0, Function1 function10) {
        boolean z = false;
        kotlin.ranges.l l0 = new kotlin.ranges.l(0, mutableVector0.J() - 1);
        int v = l0.g();
        int v1 = l0.h();
        if(v <= v1) {
            while(true) {
                if(z) {
                    function10.invoke(mutableVector0.F()[v]);
                }
                if(L.g(mutableVector0.F()[v], object0)) {
                    z = true;
                }
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
    }

    private static final void d(MutableVector mutableVector0, Object object0, Function1 function10) {
        boolean z = false;
        kotlin.ranges.l l0 = new kotlin.ranges.l(0, mutableVector0.J() - 1);
        int v = l0.g();
        int v1 = l0.h();
        if(v <= v1) {
            while(true) {
                if(z) {
                    function10.invoke(mutableVector0.F()[v1]);
                }
                if(L.g(mutableVector0.F()[v1], object0)) {
                    z = true;
                }
                if(v1 == v) {
                    break;
                }
                --v1;
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean e(FocusTargetModifierNode focusTargetModifierNode0, Function1 function10) {
        switch(focusTargetModifierNode0.l0()) {
            case 1: {
                FocusTargetModifierNode focusTargetModifierNode1 = FocusTraversalKt.f(focusTargetModifierNode0);
                if(focusTargetModifierNode1 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                return OneDimensionalFocusSearchKt.e(focusTargetModifierNode1, function10) || OneDimensionalFocusSearchKt.f(focusTargetModifierNode0, focusTargetModifierNode1, 1, function10);
            }
            case 2: 
            case 3: {
                return OneDimensionalFocusSearchKt.j(focusTargetModifierNode0, function10);
            }
            case 4: {
                return focusTargetModifierNode0.i0().r() ? ((Boolean)function10.invoke(focusTargetModifierNode0)).booleanValue() : OneDimensionalFocusSearchKt.j(focusTargetModifierNode0, function10);
            }
            default: {
                throw new J();
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean f(FocusTargetModifierNode focusTargetModifierNode0, FocusTargetModifierNode focusTargetModifierNode1, int v, Function1 function10) {
        if(OneDimensionalFocusSearchKt.k(focusTargetModifierNode0, focusTargetModifierNode1, v, function10)) {
            return true;
        }
        Boolean boolean0 = (Boolean)BeyondBoundsLayoutKt.a(focusTargetModifierNode0, v, new Function1(focusTargetModifierNode0, focusTargetModifierNode1, v, function10) {
            final FocusTargetModifierNode e;
            final FocusTargetModifierNode f;
            final int g;
            final Function1 h;

            {
                this.e = focusTargetModifierNode0;
                this.f = focusTargetModifierNode1;
                this.g = v;
                this.h = function10;
                super(1);
            }

            @m
            public final Boolean a(@l BeyondBoundsScope beyondBoundsLayout$BeyondBoundsScope0) {
                L.p(beyondBoundsLayout$BeyondBoundsScope0, "$this$searchBeyondBounds");
                boolean z = OneDimensionalFocusSearchKt.k(this.e, this.f, this.g, this.h);
                return z || !beyondBoundsLayout$BeyondBoundsScope0.a() ? Boolean.valueOf(z) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((BeyondBoundsScope)object0));
            }
        });
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    private static final boolean g(FocusTargetModifierNode focusTargetModifierNode0) {
        Node modifier$Node0 = DelegatableNodeKt.m(focusTargetModifierNode0, 0x400);
        if(!(modifier$Node0 instanceof FocusTargetModifierNode)) {
            modifier$Node0 = null;
        }
        return ((FocusTargetModifierNode)modifier$Node0) == null;
    }

    @ExperimentalComposeUiApi
    public static final boolean h(@l FocusTargetModifierNode focusTargetModifierNode0, int v, @l Function1 function10) {
        L.p(focusTargetModifierNode0, "$this$oneDimensionalFocusSearch");
        L.p(function10, "onFound");
        if(FocusDirection.n(v, 1)) {
            return OneDimensionalFocusSearchKt.e(focusTargetModifierNode0, function10);
        }
        if(!FocusDirection.n(v, 2)) {
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        return OneDimensionalFocusSearchKt.b(focusTargetModifierNode0, function10);
    }

    @ExperimentalComposeUiApi
    private static final boolean i(FocusTargetModifierNode focusTargetModifierNode0, Function1 function10) {
        MutableVector mutableVector0 = new MutableVector(new FocusTargetModifierNode[16], 0);
        if(!focusTargetModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector1, focusTargetModifierNode0.getNode());
        }
        else {
            mutableVector1.b(modifier$Node0);
        }
    label_8:
        while(mutableVector1.O()) {
            Node modifier$Node1 = (Node)mutableVector1.e0(mutableVector1.J() - 1);
            if((modifier$Node1.D() & 0x400) == 0) {
                DelegatableNodeKt.b(mutableVector1, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & 0x400) != 0) {
                        if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                            continue label_8;
                        }
                        mutableVector0.b(((FocusTargetModifierNode)modifier$Node1));
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
        mutableVector0.k0(FocusableChildrenComparator.a);
        int v = mutableVector0.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector0.F();
            while(true) {
                FocusTargetModifierNode focusTargetModifierNode1 = (FocusTargetModifierNode)arr_object[v1];
                if(FocusTraversalKt.h(focusTargetModifierNode1) && OneDimensionalFocusSearchKt.b(focusTargetModifierNode1, function10)) {
                    return true;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    private static final boolean j(FocusTargetModifierNode focusTargetModifierNode0, Function1 function10) {
        MutableVector mutableVector0 = new MutableVector(new FocusTargetModifierNode[16], 0);
        if(!focusTargetModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector1, focusTargetModifierNode0.getNode());
        }
        else {
            mutableVector1.b(modifier$Node0);
        }
    label_8:
        while(mutableVector1.O()) {
            Node modifier$Node1 = (Node)mutableVector1.e0(mutableVector1.J() - 1);
            if((modifier$Node1.D() & 0x400) == 0) {
                DelegatableNodeKt.b(mutableVector1, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & 0x400) != 0) {
                        if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                            continue label_8;
                        }
                        mutableVector0.b(((FocusTargetModifierNode)modifier$Node1));
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
        mutableVector0.k0(FocusableChildrenComparator.a);
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                FocusTargetModifierNode focusTargetModifierNode1 = (FocusTargetModifierNode)arr_object[v1];
                if(FocusTraversalKt.h(focusTargetModifierNode1) && OneDimensionalFocusSearchKt.e(focusTargetModifierNode1, function10)) {
                    return true;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    private static final boolean k(FocusTargetModifierNode focusTargetModifierNode0, FocusTargetModifierNode focusTargetModifierNode1, int v, Function1 function10) {
        if(focusTargetModifierNode0.l0() != FocusStateImpl.b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        MutableVector mutableVector0 = new MutableVector(new FocusTargetModifierNode[16], 0);
        if(!focusTargetModifierNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetModifierNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector1, focusTargetModifierNode0.getNode());
        }
        else {
            mutableVector1.b(modifier$Node0);
        }
    label_9:
        while(mutableVector1.O()) {
            Node modifier$Node1 = (Node)mutableVector1.e0(mutableVector1.J() - 1);
            if((modifier$Node1.D() & 0x400) == 0) {
                DelegatableNodeKt.b(mutableVector1, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.J() & 0x400) != 0) {
                        if(!(modifier$Node1 instanceof FocusTargetModifierNode)) {
                            continue label_9;
                        }
                        mutableVector0.b(((FocusTargetModifierNode)modifier$Node1));
                        break;
                    }
                    modifier$Node1 = modifier$Node1.F();
                }
            }
        }
        mutableVector0.k0(FocusableChildrenComparator.a);
        if(FocusDirection.n(v, 1)) {
            kotlin.ranges.l l0 = new kotlin.ranges.l(0, mutableVector0.J() - 1);
            int v1 = l0.g();
            int v2 = l0.h();
            if(v1 > v2) {
                return FocusDirection.n(v, 1) || !focusTargetModifierNode0.i0().r() || OneDimensionalFocusSearchKt.g(focusTargetModifierNode0) ? false : ((Boolean)function10.invoke(focusTargetModifierNode0)).booleanValue();
            }
            boolean z = false;
            while(true) {
                if(z) {
                    FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode)mutableVector0.F()[v1];
                    if(FocusTraversalKt.h(focusTargetModifierNode2) && OneDimensionalFocusSearchKt.e(focusTargetModifierNode2, function10)) {
                        return true;
                    }
                }
                if(L.g(mutableVector0.F()[v1], focusTargetModifierNode1)) {
                    z = true;
                }
                if(v1 == v2) {
                    return FocusDirection.n(v, 1) || !focusTargetModifierNode0.i0().r() || OneDimensionalFocusSearchKt.g(focusTargetModifierNode0) ? false : ((Boolean)function10.invoke(focusTargetModifierNode0)).booleanValue();
                }
                ++v1;
            }
        }
        if(!FocusDirection.n(v, 2)) {
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        kotlin.ranges.l l1 = new kotlin.ranges.l(0, mutableVector0.J() - 1);
        int v3 = l1.g();
        int v4 = l1.h();
        if(v3 <= v4) {
            boolean z1 = false;
            while(true) {
                if(z1) {
                    FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode)mutableVector0.F()[v4];
                    if(FocusTraversalKt.h(focusTargetModifierNode3) && OneDimensionalFocusSearchKt.b(focusTargetModifierNode3, function10)) {
                        return true;
                    }
                }
                if(L.g(mutableVector0.F()[v4], focusTargetModifierNode1)) {
                    z1 = true;
                }
                if(v4 == v3) {
                    break;
                }
                --v4;
            }
        }
        return FocusDirection.n(v, 1) || !focusTargetModifierNode0.i0().r() || OneDimensionalFocusSearchKt.g(focusTargetModifierNode0) ? false : ((Boolean)function10.invoke(focusTargetModifierNode0)).booleanValue();
    }
}

