package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@Stable
@s0({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,201:1\n1182#2:202\n1161#2,2:203\n1182#2:217\n1161#2,2:218\n1#3:205\n460#4,7:206\n48#4:227\n467#4,4:243\n460#4,11:247\n460#4,11:258\n87#5:213\n340#6:214\n206#6,2:215\n208#6,7:220\n215#6,15:228\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n53#1:202\n53#1:203,2\n85#1:217\n85#1:218,2\n84#1:206,7\n85#1:227\n84#1:243,4\n113#1:247,11\n138#1:258,11\n85#1:213\n85#1:214\n85#1:215,2\n85#1:220,7\n85#1:228,15\n*E\n"})
public final class FocusRequester {
    public static final class Companion {
        @StabilityInferred(parameters = 0)
        @ExperimentalComposeUiApi
        public static final class FocusRequesterFactory {
            @l
            public static final FocusRequesterFactory a;
            public static final int b;

            static {
                FocusRequesterFactory.a = new FocusRequesterFactory();
            }

            @l
            public final FocusRequester a() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester b() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester c() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester d() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester e() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester f() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester g() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester h() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester i() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester j() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester k() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester l() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester m() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester n() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester o() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester p() {
                return new FocusRequester();
            }
        }

        private Companion() {
        }

        public Companion(w w0) {
        }

        @ExperimentalComposeUiApi
        @l
        public final FocusRequesterFactory a() {
            return FocusRequesterFactory.a;
        }

        @ExperimentalComposeUiApi
        @l
        public final FocusRequester b() {
            return FocusRequester.e;
        }

        @ExperimentalComposeUiApi
        public static void c() {
        }

        @l
        public final FocusRequester d() {
            return FocusRequester.d;
        }
    }

    @l
    private final MutableVector a;
    @l
    public static final Companion b;
    public static final int c;
    @l
    private static final FocusRequester d;
    @l
    private static final FocusRequester e;

    static {
        FocusRequester.b = new Companion(null);
        FocusRequester.d = new FocusRequester();
        FocusRequester.e = new FocusRequester();
    }

    public FocusRequester() {
        this.a = new MutableVector(new FocusRequesterModifierNode[16], 0);
    }

    public final boolean c() {
        if(!this.a.O()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                if(FocusRequesterModifierNodeKt.a(((FocusRequesterModifierNode)arr_object[v1]))) {
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

    public final boolean d(@l Function1 function10) {
        L.p(function10, "onFound");
        if(L.g(this, FocusRequester.d) || L.g(this, FocusRequester.e)) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if(!this.a.O()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            boolean z = false;
            while(true) {
                FocusRequesterModifierNode focusRequesterModifierNode0 = (FocusRequesterModifierNode)arr_object[v1];
                if(!focusRequesterModifierNode0.getNode().Q()) {
                    break;
                }
                MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
                Node modifier$Node0 = focusRequesterModifierNode0.getNode().F();
                if(modifier$Node0 == null) {
                    DelegatableNodeKt.b(mutableVector1, focusRequesterModifierNode0.getNode());
                }
                else {
                    mutableVector1.b(modifier$Node0);
                }
            label_17:
                while(mutableVector1.O()) {
                    Node modifier$Node1 = (Node)mutableVector1.e0(mutableVector1.J() - 1);
                    if((modifier$Node1.D() & 0x400) == 0) {
                        DelegatableNodeKt.b(mutableVector1, modifier$Node1);
                    }
                    else {
                        while(modifier$Node1 != null) {
                            if((modifier$Node1.J() & 0x400) == 0) {
                                modifier$Node1 = modifier$Node1.F();
                                continue;
                            }
                            if(modifier$Node1 instanceof FocusTargetModifierNode && ((Boolean)function10.invoke(((FocusTargetModifierNode)modifier$Node1))).booleanValue()) {
                                z = true;
                            }
                            else if(true) {
                                continue label_17;
                            }
                            break label_17;
                        }
                    }
                }
                ++v1;
                if(v1 >= v) {
                    return z;
                }
            }
            throw new IllegalStateException("Check failed.");
        }
        return false;
    }

    public final boolean e() {
        if(!this.a.O()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                if(FocusRequesterModifierNodeKt.b(((FocusRequesterModifierNode)arr_object[v1]))) {
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

    @l
    public final MutableVector f() {
        return this.a;
    }

    public static void g() {
    }

    public final void h() {
        this.d(androidx.compose.ui.focus.FocusRequester.requestFocus.1.e);

        final class androidx.compose.ui.focus.FocusRequester.requestFocus.1 extends N implements Function1 {
            public static final androidx.compose.ui.focus.FocusRequester.requestFocus.1 e;

            static {
                androidx.compose.ui.focus.FocusRequester.requestFocus.1.e = new androidx.compose.ui.focus.FocusRequester.requestFocus.1();
            }

            androidx.compose.ui.focus.FocusRequester.requestFocus.1() {
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
}

