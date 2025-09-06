package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,423:1\n1#2:424\n1161#3,2:425\n1161#3,2:429\n1182#3:435\n1161#3,2:436\n1182#3:465\n1161#3,2:466\n359#4:427\n523#4:428\n48#4:445\n460#4,11:480\n460#4,11:499\n87#5:431\n87#5:461\n340#6:432\n206#6,2:433\n208#6,7:438\n215#6,15:446\n346#6:462\n237#6,2:463\n239#6,12:468\n251#6,8:491\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n120#1:425,2\n178#1:429,2\n179#1:435\n179#1:436,2\n214#1:465\n214#1:466,2\n125#1:427\n125#1:428\n179#1:445\n225#1:480,11\n257#1:499,11\n179#1:431\n214#1:461\n179#1:432\n179#1:433,2\n179#1:438,7\n179#1:446,15\n214#1:462\n214#1:463,2\n214#1:468,12\n214#1:491,8\n*E\n"})
public final class TwoDimensionalFocusSearchKt {
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
    private static final String a = "This function should only be used for 2-D focus search";
    @l
    private static final String b = "ActiveParent must have a focusedChild";

    @ExperimentalComposeUiApi
    private static final FocusTargetModifierNode b(FocusTargetModifierNode focusTargetModifierNode0) {
        if(focusTargetModifierNode0.k0() != FocusStateImpl.b) {
            throw new IllegalStateException("Check failed.");
        }
        FocusTargetModifierNode focusTargetModifierNode1 = FocusTraversalKt.b(focusTargetModifierNode0);
        if(focusTargetModifierNode1 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        return focusTargetModifierNode1;
    }

    // 去混淆评级： 低(30)
    private static final boolean c(Rect rect0, Rect rect1, Rect rect2, int v) {
        if(!TwoDimensionalFocusSearchKt.d(rect2, v, rect0) && TwoDimensionalFocusSearchKt.d(rect1, v, rect0)) {
            return TwoDimensionalFocusSearchKt.e(rect2, v, rect0) ? FocusDirection.n(v, 3) || FocusDirection.n(v, 4) || TwoDimensionalFocusSearchKt.f(rect1, v, rect0) < TwoDimensionalFocusSearchKt.g(rect2, v, rect0) : true;
        }
        return false;
    }

    // 去混淆评级： 低(28)
    private static final boolean d(Rect rect0, int v, Rect rect1) {
        if((FocusDirection.n(v, 3) ? true : FocusDirection.n(v, 4))) {
            return rect0.j() > rect1.B() && rect0.B() < rect1.j();
        }
        if(!(FocusDirection.n(v, 5) ? true : FocusDirection.n(v, 6))) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return rect0.x() > rect1.t() && rect0.t() < rect1.x();
    }

    private static final boolean e(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.n(v, 3)) {
            return rect1.t() >= rect0.x();
        }
        if(FocusDirection.n(v, 4)) {
            return rect1.x() <= rect0.t();
        }
        if(FocusDirection.n(v, 5)) {
            return rect1.B() >= rect0.j();
        }
        if(!FocusDirection.n(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return rect1.j() <= rect0.B();
    }

    private static final float f(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.n(v, 3)) {
            return Math.max(0.0f, rect1.t() - rect0.x());
        }
        if(FocusDirection.n(v, 4)) {
            return Math.max(0.0f, rect0.t() - rect1.x());
        }
        if(FocusDirection.n(v, 5)) {
            return Math.max(0.0f, rect1.B() - rect0.j());
        }
        if(!FocusDirection.n(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return Math.max(0.0f, rect0.B() - rect1.j());
    }

    private static final float g(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.n(v, 3)) {
            return Math.max(1.0f, rect1.t() - rect0.t());
        }
        if(FocusDirection.n(v, 4)) {
            return Math.max(1.0f, rect0.x() - rect1.x());
        }
        if(FocusDirection.n(v, 5)) {
            return Math.max(1.0f, rect1.B() - rect0.B());
        }
        if(!FocusDirection.n(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return Math.max(1.0f, rect0.j() - rect1.j());
    }

    private static final Rect h(Rect rect0) {
        return new Rect(rect0.x(), rect0.j(), rect0.x(), rect0.j());
    }

    @ExperimentalComposeUiApi
    private static final void i(DelegatableNode delegatableNode0, MutableVector mutableVector0) {
        if(!delegatableNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.b(mutableVector1, delegatableNode0.getNode());
        }
        else {
            mutableVector1.b(modifier$Node0);
        }
    label_7:
        while(mutableVector1.O()) {
            Node modifier$Node1 = (Node)mutableVector1.e0(mutableVector1.J() - 1);
            if((modifier$Node1.D() & 0x400) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.J() & 0x400) != 0 && modifier$Node2 instanceof FocusTargetModifierNode) {
                        if(((FocusTargetModifierNode)modifier$Node2).i0().r()) {
                            mutableVector0.b(((FocusTargetModifierNode)modifier$Node2));
                            continue label_7;
                        }
                        else {
                            Object object0 = ((FocusTargetModifierNode)modifier$Node2).i0().n().invoke(FocusDirection.k(7));
                            Companion focusRequester$Companion0 = FocusRequester.b;
                            if(L.g(((FocusRequester)object0), focusRequester$Companion0.d())) {
                                object0 = null;
                            }
                            if(((FocusRequester)object0) != null) {
                                if(L.g(((FocusRequester)object0), focusRequester$Companion0.b())) {
                                    continue label_7;
                                }
                                MutableVector mutableVector2 = ((FocusRequester)object0).f();
                                int v = mutableVector2.J();
                                if(v <= 0) {
                                    continue label_7;
                                }
                                Object[] arr_object = mutableVector2.F();
                                int v1 = 0;
                                do {
                                    TwoDimensionalFocusSearchKt.i(((FocusRequesterModifierNode)arr_object[v1]), mutableVector0);
                                    ++v1;
                                }
                                while(v1 < v);
                                continue label_7;
                            }
                        }
                    }
                    modifier$Node2 = modifier$Node2.F();
                }
            }
            DelegatableNodeKt.b(mutableVector1, modifier$Node1);
        }
    }

    @ExperimentalComposeUiApi
    private static final FocusTargetModifierNode j(MutableVector mutableVector0, Rect rect0, int v) {
        Rect rect1;
        if(FocusDirection.n(v, 3)) {
            rect1 = rect0.R(rect0.G() + 1.0f, 0.0f);
        }
        else {
            if(FocusDirection.n(v, 4)) {
                rect1 = rect0.R(-(rect0.G() + 1.0f), 0.0f);
                goto label_11;
            }
            if(FocusDirection.n(v, 5)) {
                rect1 = rect0.R(0.0f, rect0.r() + 1.0f);
            }
            else if(FocusDirection.n(v, 6)) {
                rect1 = rect0.R(0.0f, -(rect0.r() + 1.0f));
            }
            else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
    label_11:
        int v1 = mutableVector0.J();
        FocusTargetModifierNode focusTargetModifierNode0 = null;
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v2 = 0;
            while(true) {
                FocusTargetModifierNode focusTargetModifierNode1 = (FocusTargetModifierNode)arr_object[v2];
                if(FocusTraversalKt.h(focusTargetModifierNode1)) {
                    Rect rect2 = FocusTraversalKt.d(focusTargetModifierNode1);
                    if(TwoDimensionalFocusSearchKt.m(rect2, rect1, rect0, v)) {
                        focusTargetModifierNode0 = focusTargetModifierNode1;
                        rect1 = rect2;
                    }
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        return focusTargetModifierNode0;
    }

    @ExperimentalComposeUiApi
    public static final boolean k(@l FocusTargetModifierNode focusTargetModifierNode0, int v, @l Function1 function10) {
        Rect rect0;
        L.p(focusTargetModifierNode0, "$this$findChildCorrespondingToFocusEnter");
        L.p(function10, "onFound");
        Object object0 = focusTargetModifierNode0.i0().n().invoke(FocusDirection.k(v));
        Companion focusRequester$Companion0 = FocusRequester.b;
        Object object1 = null;
        if(L.g(((FocusRequester)object0), focusRequester$Companion0.d())) {
            object0 = null;
        }
        if(((FocusRequester)object0) != null) {
            return L.g(((FocusRequester)object0), focusRequester$Companion0.b()) ? false : ((FocusRequester)object0).d(function10);
        }
        MutableVector mutableVector0 = new MutableVector(new FocusTargetModifierNode[16], 0);
        TwoDimensionalFocusSearchKt.i(focusTargetModifierNode0, mutableVector0);
        boolean z = true;
        if(mutableVector0.J() <= 1) {
            if(!mutableVector0.N()) {
                object1 = mutableVector0.F()[0];
            }
            return ((FocusTargetModifierNode)object1) == null ? false : ((Boolean)function10.invoke(((FocusTargetModifierNode)object1))).booleanValue();
        }
        if(FocusDirection.n(v, 7)) {
            v = 4;
        }
        if((FocusDirection.n(v, 4) ? true : FocusDirection.n(v, 6))) {
            rect0 = TwoDimensionalFocusSearchKt.s(FocusTraversalKt.d(focusTargetModifierNode0));
        }
        else {
            if(!FocusDirection.n(v, 3)) {
                z = FocusDirection.n(v, 5);
            }
            if(!z) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            rect0 = TwoDimensionalFocusSearchKt.h(FocusTraversalKt.d(focusTargetModifierNode0));
        }
        FocusTargetModifierNode focusTargetModifierNode1 = TwoDimensionalFocusSearchKt.j(mutableVector0, rect0, v);
        return focusTargetModifierNode1 == null ? false : ((Boolean)function10.invoke(focusTargetModifierNode1)).booleanValue();
    }

    @ExperimentalComposeUiApi
    private static final boolean l(FocusTargetModifierNode focusTargetModifierNode0, FocusTargetModifierNode focusTargetModifierNode1, int v, Function1 function10) {
        if(TwoDimensionalFocusSearchKt.r(focusTargetModifierNode0, focusTargetModifierNode1, v, function10)) {
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
                boolean z = TwoDimensionalFocusSearchKt.r(this.e, this.f, this.g, this.h);
                return z || !beyondBoundsLayout$BeyondBoundsScope0.a() ? Boolean.valueOf(z) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((BeyondBoundsScope)object0));
            }
        });
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    private static final boolean m(Rect rect0, Rect rect1, Rect rect2, int v) {
        if(TwoDimensionalFocusSearchKt.n(rect0, v, rect2)) {
            return TwoDimensionalFocusSearchKt.n(rect1, v, rect2) ? TwoDimensionalFocusSearchKt.c(rect2, rect0, rect1, v) || !TwoDimensionalFocusSearchKt.c(rect2, rect1, rect0, v) && TwoDimensionalFocusSearchKt.q(v, rect2, rect0) < TwoDimensionalFocusSearchKt.q(v, rect2, rect1) : true;
        }
        return false;
    }

    private static final boolean n(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.n(v, 3)) {
            return (rect1.x() > rect0.x() || rect1.t() >= rect0.x()) && rect1.t() > rect0.t();
        }
        if(FocusDirection.n(v, 4)) {
            return (rect1.t() < rect0.t() || rect1.x() <= rect0.t()) && rect1.x() < rect0.x();
        }
        if(FocusDirection.n(v, 5)) {
            return (rect1.j() > rect0.j() || rect1.B() >= rect0.j()) && rect1.B() > rect0.B();
        }
        if(!FocusDirection.n(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return (rect1.B() < rect0.B() || rect1.j() <= rect0.B()) && rect1.j() < rect0.j();
    }

    private static final float o(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.n(v, 3)) {
            return Math.max(0.0f, rect1.t() - rect0.x());
        }
        if(FocusDirection.n(v, 4)) {
            return Math.max(0.0f, rect0.t() - rect1.x());
        }
        if(FocusDirection.n(v, 5)) {
            return Math.max(0.0f, rect1.B() - rect0.j());
        }
        if(!FocusDirection.n(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return Math.max(0.0f, rect0.B() - rect1.j());
    }

    private static final float p(Rect rect0, int v, Rect rect1) {
        boolean z = true;
        if((FocusDirection.n(v, 3) ? true : FocusDirection.n(v, 4))) {
            return rect1.B() + rect1.r() / 2.0f - (rect0.B() + rect0.r() / 2.0f);
        }
        if(!FocusDirection.n(v, 5)) {
            z = FocusDirection.n(v, 6);
        }
        if(!z) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return rect1.t() + rect1.G() / 2.0f - (rect0.t() + rect0.G() / 2.0f);
    }

    private static final long q(int v, Rect rect0, Rect rect1) {
        long v1 = (long)Math.abs(TwoDimensionalFocusSearchKt.o(rect1, v, rect0));
        long v2 = (long)Math.abs(TwoDimensionalFocusSearchKt.p(rect1, v, rect0));
        return 13L * v1 * v1 + v2 * v2;
    }

    @ExperimentalComposeUiApi
    private static final boolean r(FocusTargetModifierNode focusTargetModifierNode0, FocusTargetModifierNode focusTargetModifierNode1, int v, Function1 function10) {
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
        while(mutableVector0.O()) {
            FocusTargetModifierNode focusTargetModifierNode2 = TwoDimensionalFocusSearchKt.j(mutableVector0, FocusTraversalKt.d(focusTargetModifierNode1), v);
            if(focusTargetModifierNode2 == null) {
                return false;
            }
            if(focusTargetModifierNode2.i0().r()) {
                return ((Boolean)function10.invoke(focusTargetModifierNode2)).booleanValue();
            }
            Object object0 = focusTargetModifierNode2.i0().n().invoke(FocusDirection.k(v));
            Companion focusRequester$Companion0 = FocusRequester.b;
            if(L.g(((FocusRequester)object0), focusRequester$Companion0.d())) {
                object0 = null;
            }
            if(((FocusRequester)object0) != null) {
                return L.g(((FocusRequester)object0), focusRequester$Companion0.b()) ? false : ((FocusRequester)object0).d(function10);
            }
            if(TwoDimensionalFocusSearchKt.l(focusTargetModifierNode2, focusTargetModifierNode1, v, function10)) {
                return true;
            }
            mutableVector0.a0(focusTargetModifierNode2);
        }
        return false;
    }

    private static final Rect s(Rect rect0) {
        return new Rect(rect0.t(), rect0.B(), rect0.t(), rect0.B());
    }

    @ExperimentalComposeUiApi
    @m
    public static final Boolean t(@l FocusTargetModifierNode focusTargetModifierNode0, int v, @l Function1 function10) {
        L.p(focusTargetModifierNode0, "$this$twoDimensionalFocusSearch");
        L.p(function10, "onFound");
        int[] arr_v = WhenMappings.a;
        switch(arr_v[focusTargetModifierNode0.l0().ordinal()]) {
            case 1: {
                FocusTargetModifierNode focusTargetModifierNode1 = FocusTraversalKt.f(focusTargetModifierNode0);
                if(focusTargetModifierNode1 != null) {
                    switch(arr_v[focusTargetModifierNode1.l0().ordinal()]) {
                        case 1: {
                            Boolean boolean0 = TwoDimensionalFocusSearchKt.t(focusTargetModifierNode1, v, function10);
                            if(!L.g(boolean0, Boolean.FALSE)) {
                                return boolean0;
                            }
                            Object object0 = focusTargetModifierNode1.i0().f().invoke(FocusDirection.k(v));
                            Companion focusRequester$Companion0 = FocusRequester.b;
                            if(L.g(((FocusRequester)object0), focusRequester$Companion0.d())) {
                                object0 = null;
                            }
                            if(((FocusRequester)object0) != null) {
                                return L.g(((FocusRequester)object0), focusRequester$Companion0.b()) ? null : Boolean.valueOf(((FocusRequester)object0).d(function10));
                            }
                            return Boolean.valueOf(TwoDimensionalFocusSearchKt.l(focusTargetModifierNode0, TwoDimensionalFocusSearchKt.b(focusTargetModifierNode1), v, function10));
                        }
                        case 2: 
                        case 3: {
                            return Boolean.valueOf(TwoDimensionalFocusSearchKt.l(focusTargetModifierNode0, focusTargetModifierNode1, v, function10));
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
                return Boolean.valueOf(TwoDimensionalFocusSearchKt.k(focusTargetModifierNode0, v, function10));
            }
            case 4: {
                return focusTargetModifierNode0.i0().r() ? ((Boolean)function10.invoke(focusTargetModifierNode0)) : false;
            }
            default: {
                throw new J();
            }
        }
    }
}

