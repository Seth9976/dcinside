package androidx.compose.ui.node;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@s0({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,101:1\n76#1,6:102\n76#1,6:108\n76#1,6:114\n76#1,6:120\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n35#1:102,6\n85#1:108,6\n92#1:114,6\n98#1:120,6\n*E\n"})
public abstract class DelegatingNode extends Node {
    @m
    private Node l;
    public static final int m = 8;

    static {
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void A() {
        super.A();
        for(Node modifier$Node0 = this.l; modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            modifier$Node0.h0(this.G());
            modifier$Node0.A();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void C() {
        for(Node modifier$Node0 = this.l; modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            modifier$Node0.C();
        }
        super.C();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void V() {
        super.V();
        for(Node modifier$Node0 = this.l; modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            modifier$Node0.V();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void h0(@m NodeCoordinator nodeCoordinator0) {
        super.h0(nodeCoordinator0);
        for(Node modifier$Node0 = this.l; modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            modifier$Node0.h0(nodeCoordinator0);
        }
    }

    private final void i0(Node modifier$Node0) {
        Node modifier$Node1 = this.l;
        if(modifier$Node1 != null) {
            modifier$Node0.e0(modifier$Node1);
        }
        this.l = modifier$Node0;
    }

    @l
    public final Node j0(@l a a0) {
        L.p(a0, "fn");
        Node modifier$Node0 = this.getNode();
        Node modifier$Node1 = (Node)a0.invoke();
        modifier$Node1.Y(modifier$Node0);
        if(this.Q()) {
            this.h0(modifier$Node0.G());
            modifier$Node1.A();
        }
        this.i0(modifier$Node1);
        return modifier$Node1;
    }

    private final void k0(Function1 function10) {
        for(Node modifier$Node0 = this.l; modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            function10.invoke(modifier$Node0);
        }
    }
}

