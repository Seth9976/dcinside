package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,753:1\n635#1,6:765\n643#1,3:772\n646#1,3:778\n666#1,6:781\n612#1,8:787\n635#1,3:795\n620#1,2:798\n613#1,12:800\n638#1,3:812\n625#1:815\n615#1:816\n618#1,2:817\n635#1,3:819\n620#1,5:822\n638#1,3:827\n625#1:830\n635#1,6:831\n657#1,15:837\n666#1,6:852\n651#1,21:858\n612#1,8:879\n635#1,3:887\n620#1,2:890\n613#1,12:892\n638#1,3:904\n625#1:907\n615#1:908\n643#1,6:909\n1162#2:754\n1182#2:755\n1161#2,2:756\n1162#2:771\n523#3:758\n523#3:759\n523#3:760\n523#3:761\n523#3:775\n728#3,2:776\n1#4:762\n69#5:763\n196#6:764\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n268#1:765,6\n297#1:772,3\n297#1:778,3\n308#1:781,6\n605#1:787,8\n605#1:795,3\n605#1:798,2\n605#1:800,12\n605#1:812,3\n605#1:815\n605#1:816\n612#1:817,2\n612#1:819,3\n612#1:822,5\n612#1:827,3\n612#1:830\n619#1:831,6\n651#1:837,15\n658#1:852,6\n674#1:858,21\n681#1:879,8\n681#1:887,3\n681#1:890,2\n681#1:892,12\n681#1:904,3\n681#1:907\n681#1:908\n697#1:909,6\n100#1:754\n101#1:755\n101#1:756,2\n295#1:771\n112#1:758\n113#1:759\n175#1:760\n190#1:761\n299#1:775\n299#1:776,2\n243#1:763\n243#1:764\n*E\n"})
public final class NodeChain {
    @s0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,753:1\n523#2:754\n523#2:755\n523#2:756\n523#2:757\n523#2:758\n523#2:759\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n350#1:754\n355#1:755\n358#1:756\n365#1:757\n371#1:758\n372#1:759\n*E\n"})
    final class Differ implements DiffCallback {
        @l
        private Node a;
        private int b;
        @l
        private MutableVector c;
        @l
        private MutableVector d;
        final NodeChain e;

        public Differ(@l Node modifier$Node0, int v, @l MutableVector mutableVector0, @l MutableVector mutableVector1) {
            L.p(modifier$Node0, "node");
            L.p(mutableVector0, "before");
            L.p(mutableVector1, "after");
            this.e = nodeChain0;
            super();
            this.a = modifier$Node0;
            this.b = v;
            this.c = mutableVector0;
            this.d = mutableVector1;
        }

        @Override  // androidx.compose.ui.node.DiffCallback
        public boolean a(int v, int v1) {
            return NodeChainKt.d(((Element)this.c.F()[v]), ((Element)this.d.F()[v1])) != 0;
        }

        @Override  // androidx.compose.ui.node.DiffCallback
        public void b(int v, int v1) {
            Node modifier$Node0 = this.a;
            Node modifier$Node1 = this.e.g(((Element)this.d.F()[v1]), modifier$Node0);
            this.a = modifier$Node1;
            if(modifier$Node1.Q()) {
                throw new IllegalStateException("Check failed.");
            }
            this.a.a0(true);
            Logger nodeChain$Logger0 = this.e.i;
            if(nodeChain$Logger0 != null) {
                nodeChain$Logger0.b(v, v1, ((Element)this.d.F()[v1]), modifier$Node0, this.a);
            }
            int v2 = this.b | this.a.J();
            this.b = v2;
            this.a.W(v2);
        }

        @Override  // androidx.compose.ui.node.DiffCallback
        public void c(int v, int v1) {
            Node modifier$Node0 = this.a.O();
            L.m(modifier$Node0);
            this.a = modifier$Node0;
            Element modifier$Element0 = (Element)this.c.F()[v];
            Element modifier$Element1 = (Element)this.d.F()[v1];
            if(L.g(modifier$Element0, modifier$Element1)) {
                Logger nodeChain$Logger1 = this.e.i;
                if(nodeChain$Logger1 != null) {
                    nodeChain$Logger1.e(v, v1, modifier$Element0, modifier$Element1, this.a);
                }
            }
            else {
                Node modifier$Node1 = this.a;
                this.a = this.e.N(modifier$Element0, modifier$Element1, modifier$Node1);
                Logger nodeChain$Logger0 = this.e.i;
                if(nodeChain$Logger0 != null) {
                    nodeChain$Logger0.a(v, v1, modifier$Element0, modifier$Element1, modifier$Node1, this.a);
                }
            }
            int v2 = this.b | this.a.J();
            this.b = v2;
            this.a.W(v2);
        }

        @l
        public final MutableVector d() {
            return this.d;
        }

        public final int e() {
            return this.b;
        }

        @l
        public final MutableVector f() {
            return this.c;
        }

        @l
        public final Node g() {
            return this.a;
        }

        public final void h(@l MutableVector mutableVector0) {
            L.p(mutableVector0, "<set-?>");
            this.d = mutableVector0;
        }

        public final void i(int v) {
            this.b = v;
        }

        public final void j(@l MutableVector mutableVector0) {
            L.p(mutableVector0, "<set-?>");
            this.c = mutableVector0;
        }

        public final void k(@l Node modifier$Node0) {
            L.p(modifier$Node0, "<set-?>");
            this.a = modifier$Node0;
        }

        @Override  // androidx.compose.ui.node.DiffCallback
        public void remove(int v) {
            Node modifier$Node0 = this.a.O();
            L.m(modifier$Node0);
            this.a = modifier$Node0;
            Logger nodeChain$Logger0 = this.e.i;
            if(nodeChain$Logger0 != null) {
                nodeChain$Logger0.d(v, ((Element)this.c.F()[v]), this.a);
            }
            this.a = this.e.i(this.a);
        }
    }

    public interface Logger {
        void a(int arg1, int arg2, @l Element arg3, @l Element arg4, @l Node arg5, @l Node arg6);

        void b(int arg1, int arg2, @l Element arg3, @l Node arg4, @l Node arg5);

        void c(int arg1, @l Element arg2, @l Element arg3, @l Node arg4);

        void d(int arg1, @l Element arg2, @l Node arg3);

        void e(int arg1, int arg2, @l Element arg3, @l Element arg4, @l Node arg5);
    }

    @l
    private final LayoutNode a;
    @l
    private final InnerNodeCoordinator b;
    @l
    private NodeCoordinator c;
    @l
    private final Node d;
    @l
    private Node e;
    @m
    private MutableVector f;
    @m
    private MutableVector g;
    @m
    private Differ h;
    @m
    private Logger i;

    public NodeChain(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        super();
        this.a = layoutNode0;
        InnerNodeCoordinator innerNodeCoordinator0 = new InnerNodeCoordinator(layoutNode0);
        this.b = innerNodeCoordinator0;
        this.c = innerNodeCoordinator0;
        Node modifier$Node0 = innerNodeCoordinator0.M2();
        this.d = modifier$Node0;
        this.e = modifier$Node0;
    }

    private final boolean A() {
        return this.e == NodeChainKt.a;
    }

    private final void B() {
        if(this.e == NodeChainKt.a) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = this.e;
        modifier$Node0.e0(NodeChainKt.a);
        NodeChainKt.a.Z(modifier$Node0);
        this.e = NodeChainKt.a;
    }

    private final Node C(Node modifier$Node0) {
        Node modifier$Node1 = modifier$Node0.F();
        Node modifier$Node2 = modifier$Node0.O();
        if(modifier$Node1 != null) {
            modifier$Node1.e0(modifier$Node2);
            modifier$Node0.Z(null);
        }
        if(modifier$Node2 != null) {
            modifier$Node2.Z(modifier$Node1);
            modifier$Node0.e0(null);
        }
        L.m(modifier$Node1);
        return modifier$Node1;
    }

    private final Node D(Node modifier$Node0, Node modifier$Node1) {
        Node modifier$Node2 = modifier$Node0.O();
        if(modifier$Node2 != null) {
            modifier$Node1.e0(modifier$Node2);
            modifier$Node2.Z(modifier$Node1);
            modifier$Node0.e0(null);
        }
        Node modifier$Node3 = modifier$Node0.F();
        if(modifier$Node3 != null) {
            modifier$Node1.Z(modifier$Node3);
            modifier$Node3.e0(modifier$Node1);
            modifier$Node0.Z(null);
        }
        modifier$Node1.h0(modifier$Node0.G());
        return modifier$Node1;
    }

    public final void E() {
        MutableVector mutableVector0 = this.f;
        if(mutableVector0 == null) {
            return;
        }
        Node modifier$Node0 = this.d.O();
        for(int v = mutableVector0.J() - 1; modifier$Node0 != null && v >= 0; --v) {
            if(modifier$Node0.Q()) {
                modifier$Node0.V();
                modifier$Node0.C();
            }
            modifier$Node0 = modifier$Node0.O();
        }
    }

    private final void F(MutableVector mutableVector0, int v, MutableVector mutableVector1, int v1, Node modifier$Node0) {
        MyersDiffKt.e(v, v1, this.l(modifier$Node0, mutableVector0, mutableVector1));
    }

    private final void G() {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator0;
        InnerNodeCoordinator innerNodeCoordinator0 = this.b;
        for(Node modifier$Node0 = this.d.O(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            if((2 & modifier$Node0.J()) == 0 || !(modifier$Node0 instanceof LayoutModifierNode)) {
                modifier$Node0.h0(innerNodeCoordinator0);
            }
            else {
                if(modifier$Node0.G() == null) {
                    layoutModifierNodeCoordinator0 = new LayoutModifierNodeCoordinator(this.a, ((LayoutModifierNode)modifier$Node0));
                    modifier$Node0.h0(layoutModifierNodeCoordinator0);
                }
                else {
                    NodeCoordinator nodeCoordinator0 = modifier$Node0.G();
                    L.n(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator0 = (LayoutModifierNodeCoordinator)nodeCoordinator0;
                    layoutModifierNodeCoordinator0.P3(((LayoutModifierNode)modifier$Node0));
                    if(layoutModifierNodeCoordinator0.N3() != modifier$Node0) {
                        layoutModifierNodeCoordinator0.f3();
                    }
                }
                innerNodeCoordinator0.u3(layoutModifierNodeCoordinator0);
                layoutModifierNodeCoordinator0.t3(innerNodeCoordinator0);
                innerNodeCoordinator0 = layoutModifierNodeCoordinator0;
            }
        }
        LayoutNode layoutNode0 = this.a.C0();
        innerNodeCoordinator0.u3((layoutNode0 == null ? null : layoutNode0.e0()));
        this.c = innerNodeCoordinator0;
    }

    public final Object H(int v) {
        if((this.k() & v) != 0) {
            for(Node modifier$Node0 = this.r(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
                if((modifier$Node0.J() & v) != 0) {
                    L.y(3, "T");
                    return modifier$Node0;
                }
            }
        }
        return null;
    }

    public final void I(int v, @l Function1 function10) {
        L.p(function10, "block");
        if((this.k() & v) == 0) {
            return;
        }
        for(Node modifier$Node0 = this.r(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            if((modifier$Node0.J() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
        }
    }

    public final void J(@l Function1 function10) {
        L.p(function10, "block");
        for(Node modifier$Node0 = this.r(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            function10.invoke(modifier$Node0);
        }
    }

    public final void K(int v, Function1 function10) {
        L.p(function10, "block");
        if((this.k() & v) != 0) {
            for(Node modifier$Node0 = this.r(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
                if((modifier$Node0.J() & v) != 0) {
                    L.y(3, "T");
                    function10.invoke(modifier$Node0);
                }
            }
        }
    }

    private final void L() {
        if(this.e != NodeChainKt.a) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = NodeChainKt.a.F();
        if(modifier$Node0 == null) {
            modifier$Node0 = this.d;
        }
        this.e = modifier$Node0;
        modifier$Node0.e0(null);
        NodeChainKt.a.Z(null);
        if(this.e == NodeChainKt.a) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void M(@l Modifier modifier0) {
        boolean z;
        L.p(modifier0, "m");
        this.B();
        MutableVector mutableVector0 = this.f;
        int v = 0;
        if(mutableVector0 == null) {
            mutableVector0 = new MutableVector(new Element[0], 0);
        }
        MutableVector mutableVector1 = NodeChainKt.e(modifier0, (this.g == null ? new MutableVector(new Element[16], 0) : this.g));
        if(mutableVector1.J() == mutableVector0.J()) {
            Node modifier$Node0 = this.d.O();
            int v1 = mutableVector0.J() - 1;
            int v2 = 0;
            z = false;
        alab1:
            while(modifier$Node0 != null && v1 >= 0) {
                Element modifier$Element0 = (Element)mutableVector0.F()[v1];
                Element modifier$Element1 = (Element)mutableVector1.F()[v1];
                int v3 = NodeChainKt.d(modifier$Element0, modifier$Element1);
                switch(v3) {
                    case 0: {
                        Logger nodeChain$Logger1 = this.i;
                        if(nodeChain$Logger1 != null) {
                            nodeChain$Logger1.c(v1, modifier$Element0, modifier$Element1, modifier$Node0);
                        }
                        ++v1;
                        modifier$Node0 = modifier$Node0.F();
                        break alab1;
                    }
                    case 1: {
                        Node modifier$Node1 = this.N(modifier$Element0, modifier$Element1, modifier$Node0);
                        Logger nodeChain$Logger2 = this.i;
                        if(nodeChain$Logger2 != null) {
                            nodeChain$Logger2.a(v1, v1, modifier$Element0, modifier$Element1, modifier$Node0, modifier$Node1);
                        }
                        modifier$Node0 = modifier$Node1;
                        break;
                    }
                    default: {
                        if(v3 == 2) {
                            Logger nodeChain$Logger0 = this.i;
                            if(nodeChain$Logger0 != null) {
                                nodeChain$Logger0.e(v1, v1, modifier$Element0, modifier$Element1, modifier$Node0);
                            }
                        }
                    }
                }
                if(!modifier$Node0.Q()) {
                    z = true;
                }
                v2 |= modifier$Node0.J();
                modifier$Node0.W(v2);
                modifier$Node0 = modifier$Node0.O();
                --v1;
            }
            if(v1 > 0) {
                if(modifier$Node0 == null) {
                    throw new IllegalStateException("Check failed.");
                }
                this.F(mutableVector0, v1, mutableVector1, v1, modifier$Node0);
                v = 1;
                z = true;
            }
        }
        else if(mutableVector0.J() == 0) {
            int v4 = mutableVector1.J() - 1;
            Node modifier$Node2 = this.d;
            while(true) {
                Node modifier$Node3 = modifier$Node2;
                if(v4 < 0) {
                    break;
                }
                Element modifier$Element2 = (Element)mutableVector1.F()[v4];
                modifier$Node2 = this.g(modifier$Element2, modifier$Node3);
                Logger nodeChain$Logger3 = this.i;
                if(nodeChain$Logger3 != null) {
                    nodeChain$Logger3.b(0, v4, modifier$Element2, modifier$Node3, modifier$Node2);
                }
                v |= modifier$Node2.J();
                modifier$Node2.W(v);
                --v4;
            }
            v = 1;
            z = true;
        }
        else if(mutableVector1.J() == 0) {
            int v5 = mutableVector0.J() - 1;
            for(Node modifier$Node4 = this.d.O(); modifier$Node4 != null && v5 >= 0; modifier$Node4 = modifier$Node4.O()) {
                Logger nodeChain$Logger4 = this.i;
                if(nodeChain$Logger4 != null) {
                    nodeChain$Logger4.d(v5, ((Element)mutableVector0.F()[v5]), modifier$Node4);
                }
                this.i(modifier$Node4);
                --v5;
            }
            v = 1;
            z = false;
        }
        else {
            this.F(mutableVector0, mutableVector0.J(), mutableVector1, mutableVector1.J(), this.d);
            v = 1;
            z = true;
        }
        this.f = mutableVector1;
        mutableVector0.l();
        this.g = mutableVector0;
        this.L();
        if(v != 0) {
            this.G();
        }
        if(z && this.a.o()) {
            this.f(true);
        }
    }

    private final Node N(Element modifier$Element0, Element modifier$Element1, Node modifier$Node0) {
        if(modifier$Element0 instanceof ModifierNodeElement && modifier$Element1 instanceof ModifierNodeElement) {
            Node modifier$Node1 = NodeChainKt.f(((ModifierNodeElement)modifier$Element1), modifier$Node0);
            if(modifier$Node1 != modifier$Node0) {
                if(modifier$Node1.Q()) {
                    throw new IllegalStateException("Check failed.");
                }
                modifier$Node1.a0(true);
                if(modifier$Node0.Q()) {
                    NodeKindKt.c(modifier$Node0);
                    modifier$Node0.C();
                }
                return this.D(modifier$Node0, modifier$Node1);
            }
            if(((ModifierNodeElement)modifier$Element1).j()) {
                if(modifier$Node1.Q()) {
                    NodeKindKt.d(modifier$Node1);
                    return modifier$Node1;
                }
                modifier$Node1.f0(true);
            }
            return modifier$Node1;
        }
        if(!(modifier$Node0 instanceof BackwardsCompatNode)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((BackwardsCompatNode)modifier$Node0).n0(modifier$Element1);
        if(modifier$Node0.Q()) {
            NodeKindKt.d(modifier$Node0);
            return modifier$Node0;
        }
        modifier$Node0.f0(true);
        return modifier$Node0;
    }

    public final void O(@m Logger nodeChain$Logger0) {
        this.i = nodeChain$Logger0;
    }

    public final void f(boolean z) {
        for(Node modifier$Node0 = this.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
            if(!modifier$Node0.Q()) {
                modifier$Node0.A();
                if(z) {
                    if(modifier$Node0.I()) {
                        NodeKindKt.a(modifier$Node0);
                    }
                    if(modifier$Node0.P()) {
                        NodeKindKt.d(modifier$Node0);
                    }
                }
                modifier$Node0.a0(false);
                modifier$Node0.f0(false);
            }
        }
    }

    private final Node g(Element modifier$Element0, Node modifier$Node0) {
        Node modifier$Node1;
        if(modifier$Element0 instanceof ModifierNodeElement) {
            modifier$Node1 = ((ModifierNodeElement)modifier$Element0).a();
            modifier$Node1.b0(NodeKindKt.f(modifier$Node1));
        }
        else {
            modifier$Node1 = new BackwardsCompatNode(modifier$Element0);
        }
        if(modifier$Node1.Q()) {
            throw new IllegalStateException("Check failed.");
        }
        modifier$Node1.a0(true);
        return this.z(modifier$Node1, modifier$Node0);
    }

    public final void h() {
        for(Node modifier$Node0 = this.r(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
            if(modifier$Node0.Q()) {
                modifier$Node0.C();
            }
        }
    }

    private final Node i(Node modifier$Node0) {
        if(modifier$Node0.Q()) {
            NodeKindKt.c(modifier$Node0);
            modifier$Node0.C();
        }
        return this.C(modifier$Node0);
    }

    public final Object j(int v, Function1 function10) {
        L.p(function10, "block");
        if((this.k() & v) != 0) {
            for(Node modifier$Node0 = this.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
                if((modifier$Node0.J() & v) != 0) {
                    L.y(3, "T");
                    if(((Boolean)function10.invoke(modifier$Node0)).booleanValue()) {
                        return modifier$Node0;
                    }
                }
                if((modifier$Node0.D() & v) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    private final int k() {
        return this.e.D();
    }

    private final Differ l(Node modifier$Node0, MutableVector mutableVector0, MutableVector mutableVector1) {
        Differ nodeChain$Differ0 = this.h;
        if(nodeChain$Differ0 == null) {
            nodeChain$Differ0 = new Differ(this, modifier$Node0, modifier$Node0.D(), mutableVector0, mutableVector1);
            this.h = nodeChain$Differ0;
            return nodeChain$Differ0;
        }
        nodeChain$Differ0.k(modifier$Node0);
        nodeChain$Differ0.i(modifier$Node0.D());
        nodeChain$Differ0.j(mutableVector0);
        nodeChain$Differ0.h(mutableVector1);
        return nodeChain$Differ0;
    }

    @l
    public final Node m() {
        return this.e;
    }

    @l
    public final InnerNodeCoordinator n() {
        return this.b;
    }

    @l
    public final LayoutNode o() {
        return this.a;
    }

    @l
    public final List p() {
        MutableVector mutableVector0 = this.f;
        if(mutableVector0 == null) {
            return u.H();
        }
        MutableVector mutableVector1 = new MutableVector(new ModifierInfo[mutableVector0.J()], 0);
        Node modifier$Node0 = this.m();
        for(int v = 0; modifier$Node0 != null && modifier$Node0 != this.r(); ++v) {
            NodeCoordinator nodeCoordinator0 = modifier$Node0.G();
            if(nodeCoordinator0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            mutableVector1.b(new ModifierInfo(((Modifier)mutableVector0.F()[v]), nodeCoordinator0, nodeCoordinator0.G2()));
            modifier$Node0 = modifier$Node0.F();
        }
        return mutableVector1.k();
    }

    @l
    public final NodeCoordinator q() {
        return this.c;
    }

    @l
    public final Node r() {
        return this.d;
    }

    public final boolean s(int v) {
        return (v & this.k()) != 0;
    }

    public final boolean t(int v) {
        return (v & this.k()) != 0;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        if(this.e == this.d) {
            stringBuilder0.append("]");
        }
        else {
            for(Node modifier$Node0 = this.m(); modifier$Node0 != null && modifier$Node0 != this.r(); modifier$Node0 = modifier$Node0.F()) {
                stringBuilder0.append(String.valueOf(modifier$Node0));
                if(modifier$Node0.F() == this.d) {
                    stringBuilder0.append("]");
                    break;
                }
                stringBuilder0.append(",");
            }
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final Object u(int v) {
        if((this.k() & v) != 0) {
            for(Node modifier$Node0 = this.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
                if((modifier$Node0.J() & v) != 0) {
                    L.y(3, "T");
                    return modifier$Node0;
                }
                if((modifier$Node0.D() & v) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final void v(int v, @l Function1 function10) {
        L.p(function10, "block");
        if((this.k() & v) == 0) {
            return;
        }
        for(Node modifier$Node0 = this.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
            if((modifier$Node0.J() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
            if((modifier$Node0.D() & v) == 0) {
                return;
            }
        }
    }

    public final void w(@l Function1 function10) {
        L.p(function10, "block");
        for(Node modifier$Node0 = this.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
            function10.invoke(modifier$Node0);
        }
    }

    public final void x(int v, Function1 function10) {
        L.p(function10, "block");
        if((this.k() & v) != 0) {
            for(Node modifier$Node0 = this.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
                if((modifier$Node0.J() & v) != 0) {
                    L.y(3, "T");
                    function10.invoke(modifier$Node0);
                }
                if((modifier$Node0.D() & v) == 0) {
                    break;
                }
            }
        }
    }

    public final void y(@l Function1 function10) {
        L.p(function10, "block");
        for(Node modifier$Node0 = this.m(); modifier$Node0 != null && modifier$Node0 != this.r(); modifier$Node0 = modifier$Node0.F()) {
            function10.invoke(modifier$Node0);
        }
    }

    private final Node z(Node modifier$Node0, Node modifier$Node1) {
        Node modifier$Node2 = modifier$Node1.O();
        if(modifier$Node2 != null) {
            modifier$Node2.Z(modifier$Node0);
            modifier$Node0.e0(modifier$Node2);
        }
        modifier$Node1.e0(modifier$Node0);
        modifier$Node0.Z(modifier$Node1);
        return modifier$Node0;
    }
}

