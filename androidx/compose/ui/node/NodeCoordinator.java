package androidx.compose.ui.node;

import A3.a;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.k0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1354:1\n100#1,9:1355\n100#1,9:1364\n100#1,9:1373\n111#1:1384\n100#1,15:1385\n111#1:1418\n100#1,15:1419\n121#1:1437\n100#1,9:1438\n122#1:1447\n111#1:1449\n100#1,15:1450\n111#1:1466\n100#1,15:1467\n1#2:1382\n71#3:1383\n79#3:1400\n79#3:1404\n81#3:1409\n81#3:1417\n71#3:1436\n81#3:1448\n81#3:1465\n69#3:1482\n69#3:1483\n75#3:1493\n75#3:1494\n666#4,3:1401\n669#4,3:1406\n196#5:1405\n480#6,4:1410\n485#6:1435\n122#7,3:1414\n126#7:1434\n276#8,9:1484\n290#8:1495\n262#8,7:1496\n291#8,2:1503\n270#8,3:1505\n66#9,5:1508\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n111#1:1355,9\n121#1:1364,9\n126#1:1373,9\n247#1:1384\n247#1:1385,15\n315#1:1418\n315#1:1419,15\n365#1:1437\n365#1:1438,9\n365#1:1447\n382#1:1449\n382#1:1450,15\n386#1:1466\n386#1:1467,15\n247#1:1383\n262#1:1400\n266#1:1404\n313#1:1409\n315#1:1417\n365#1:1436\n382#1:1448\n386#1:1465\n686#1:1482\n1075#1:1483\n1107#1:1493\n1108#1:1494\n264#1:1401,3\n264#1:1406,3\n266#1:1405\n314#1:1410,4\n314#1:1435\n314#1:1414,3\n314#1:1434\n1075#1:1484,9\n1108#1:1495\n1108#1:1496,7\n1108#1:1503,2\n1108#1:1505,3\n1150#1:1508,5\n*E\n"})
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements LayoutCoordinates, Measurable, OwnerScope, Function1 {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final HitTestSource a() {
            return NodeCoordinator.I;
        }

        public static void b() {
        }

        @l
        public final HitTestSource c() {
            return NodeCoordinator.J;
        }
    }

    public interface HitTestSource {
        int a();

        void b(@l LayoutNode arg1, long arg2, @l HitTestResult arg3, boolean arg4, boolean arg5);

        boolean c(@l DelegatableNode arg1);

        boolean d(@l LayoutNode arg1);
    }

    @l
    public static final Companion A = null;
    @l
    public static final String B = "LayoutCoordinate operations are only valid when isAttached is true";
    @l
    public static final String C = "Asking for measurement result of unmeasured layout modifier";
    @l
    private static final Function1 D;
    @l
    private static final Function1 E;
    @l
    private static final ReusableGraphicsLayerScope F;
    @l
    private static final LayerPositionalProperties G;
    @l
    private static final float[] H;
    @l
    private static final HitTestSource I;
    @l
    private static final HitTestSource J;
    @l
    private final LayoutNode h;
    @m
    private NodeCoordinator i;
    @m
    private NodeCoordinator j;
    private boolean k;
    private boolean l;
    @m
    private Function1 m;
    @l
    private Density n;
    @l
    private LayoutDirection o;
    private float p;
    @m
    private MeasureResult q;
    @m
    private LookaheadDelegate r;
    @m
    private Map s;
    private long t;
    private float u;
    @m
    private MutableRect v;
    @m
    private LayerPositionalProperties w;
    @l
    private final a x;
    private boolean y;
    @m
    private OwnedLayer z;

    static {
        NodeCoordinator.A = new Companion(null);
        NodeCoordinator.D = NodeCoordinator.Companion.onCommitAffectingLayerParams.1.e;
        NodeCoordinator.E = NodeCoordinator.Companion.onCommitAffectingLayer.1.e;
        NodeCoordinator.F = new ReusableGraphicsLayerScope();
        NodeCoordinator.G = new LayerPositionalProperties();
        NodeCoordinator.H = Matrix.c(null, 1, null);
        NodeCoordinator.I = new NodeCoordinator.Companion.PointerInputSource.1();
        NodeCoordinator.J = new NodeCoordinator.Companion.SemanticsSource.1();
    }

    public NodeCoordinator(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        super();
        this.h = layoutNode0;
        this.n = this.M0().getDensity();
        this.o = this.M0().getLayoutDirection();
        this.p = 0.8f;
        this.t = 0L;
        this.x = new a() {
            final NodeCoordinator e;

            {
                this.e = nodeCoordinator0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                NodeCoordinator nodeCoordinator0 = this.e.O2();
                if(nodeCoordinator0 != null) {
                    nodeCoordinator0.Y2();
                }
            }
        };
    }

    private final void A2(Canvas canvas0) {
        Node modifier$Node0 = null;
        Node modifier$Node1 = this.M2().O();
        if(modifier$Node1 != null) {
            for(Node modifier$Node2 = this.S2(false); modifier$Node2 != null && (modifier$Node2.D() & 4) != 0; modifier$Node2 = modifier$Node2.F()) {
                if((modifier$Node2.J() & 4) != 0) {
                    if(modifier$Node2 instanceof DrawModifierNode) {
                        modifier$Node0 = modifier$Node2;
                    }
                    modifier$Node0 = (DrawModifierNode)modifier$Node0;
                    break;
                }
                if(modifier$Node2 == modifier$Node1) {
                    break;
                }
            }
        }
        if(modifier$Node0 == null) {
            this.l3(canvas0);
            return;
        }
        this.M0().q0().c(canvas0, IntSizeKt.f(this.a()), this, modifier$Node0);
    }

    @l
    public final Rect A3() {
        if(!this.o()) {
            return Rect.e.a();
        }
        LayoutCoordinates layoutCoordinates0 = LayoutCoordinatesKt.d(this);
        MutableRect mutableRect0 = this.K2();
        long v = this.v2(this.J2());
        mutableRect0.m(-Size.t(v));
        mutableRect0.o(-Size.m(v));
        mutableRect0.n(((float)this.getMeasuredWidth()) + Size.t(v));
        mutableRect0.l(((float)this.getMeasuredHeight()) + Size.m(v));
        NodeCoordinator nodeCoordinator0 = this;
        while(nodeCoordinator0 != layoutCoordinates0) {
            nodeCoordinator0.p3(mutableRect0, false, true);
            if(mutableRect0.j()) {
                return Rect.e.a();
            }
            nodeCoordinator0 = nodeCoordinator0.j;
            L.m(nodeCoordinator0);
        }
        return MutableRectKt.a(mutableRect0);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long B(long v) {
        long v1 = this.L(v);
        return LayoutNodeKt.b(this.M0()).q(v1);
    }

    @l
    public final NodeCoordinator B2(@l NodeCoordinator nodeCoordinator0) {
        L.p(nodeCoordinator0, "other");
        LayoutNode layoutNode0 = nodeCoordinator0.M0();
        LayoutNode layoutNode1 = this.M0();
        if(layoutNode0 == layoutNode1) {
            Node modifier$Node0 = nodeCoordinator0.M2();
            Node modifier$Node1 = this.M2();
            if(!modifier$Node1.getNode().Q()) {
                throw new IllegalStateException("Check failed.");
            }
            for(Node modifier$Node2 = modifier$Node1.getNode().O(); modifier$Node2 != null; modifier$Node2 = modifier$Node2.O()) {
                if((modifier$Node2.J() & 2) != 0 && modifier$Node2 == modifier$Node0) {
                    return nodeCoordinator0;
                }
            }
            return this;
        }
        while(layoutNode0.b0() > layoutNode1.b0()) {
            layoutNode0 = layoutNode0.C0();
            L.m(layoutNode0);
        }
        while(layoutNode1.b0() > layoutNode0.b0()) {
            layoutNode1 = layoutNode1.C0();
            L.m(layoutNode1);
        }
        while(layoutNode0 != layoutNode1) {
            layoutNode0 = layoutNode0.C0();
            layoutNode1 = layoutNode1.C0();
            if(layoutNode0 == null || layoutNode1 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
            if(false) {
                break;
            }
        }
        if(layoutNode1 == this.M0()) {
            return this;
        }
        return layoutNode0 == nodeCoordinator0.M0() ? nodeCoordinator0 : layoutNode0.e0();
    }

    private final void B3(NodeCoordinator nodeCoordinator0, float[] arr_f) {
        if(!L.g(nodeCoordinator0, this)) {
            NodeCoordinator nodeCoordinator1 = this.j;
            L.m(nodeCoordinator1);
            nodeCoordinator1.B3(nodeCoordinator0, arr_f);
            if(!IntOffset.j(this.Z1(), 0L)) {
                Matrix.m(NodeCoordinator.H);
                Matrix.x(NodeCoordinator.H, -((float)(((int)(this.Z1() >> 0x20)))), -((float)(((int)(this.Z1() & 0xFFFFFFFFL)))), 0.0f, 4, null);
                Matrix.u(arr_f, NodeCoordinator.H);
            }
            OwnedLayer ownedLayer0 = this.z;
            if(ownedLayer0 != null) {
                ownedLayer0.i(arr_f);
            }
        }
    }

    public long C2(long v) {
        long v1 = IntOffsetKt.c(v, this.Z1());
        return this.z == null ? v1 : this.z.f(v1, true);
    }

    private final void C3(NodeCoordinator nodeCoordinator0, float[] arr_f) {
        while(!L.g(this, nodeCoordinator0)) {
            OwnedLayer ownedLayer0 = this.z;
            if(ownedLayer0 != null) {
                ownedLayer0.d(arr_f);
            }
            long v = this.Z1();
            if(!IntOffset.j(v, 0L)) {
                Matrix.m(NodeCoordinator.H);
                Matrix.x(NodeCoordinator.H, ((float)(((int)(v >> 0x20)))), ((float)(((int)(v & 0xFFFFFFFFL)))), 0.0f, 4, null);
                Matrix.u(arr_f, NodeCoordinator.H);
            }
            this = this.j;
            L.m(this);
        }
    }

    private final void D2(MutableRect mutableRect0, boolean z) {
        float f = (float)(((int)(this.Z1() >> 0x20)));
        mutableRect0.m(mutableRect0.d() - f);
        mutableRect0.n(mutableRect0.e() - f);
        float f1 = (float)(((int)(this.Z1() & 0xFFFFFFFFL)));
        mutableRect0.o(mutableRect0.g() - f1);
        mutableRect0.l(mutableRect0.b() - f1);
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 != null) {
            ownedLayer0.a(mutableRect0, true);
            if(this.l && z) {
                mutableRect0.i(0.0f, 0.0f, ((float)IntSize.m(this.a())), ((float)IntSize.j(this.a())));
                mutableRect0.j();
            }
        }
    }

    public final void D3(@m Function1 function10, boolean z) {
        boolean z1 = this.m != function10 || z;
        this.m = function10;
        this.d3(function10, z1);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Rect E(@l LayoutCoordinates layoutCoordinates0, boolean z) {
        L.p(layoutCoordinates0, "sourceCoordinates");
        if(!this.o()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if(!layoutCoordinates0.o()) {
            throw new IllegalStateException(("LayoutCoordinates " + layoutCoordinates0 + " is not attached!").toString());
        }
        NodeCoordinator nodeCoordinator0 = this.y3(layoutCoordinates0);
        NodeCoordinator nodeCoordinator1 = this.B2(nodeCoordinator0);
        MutableRect mutableRect0 = this.K2();
        mutableRect0.m(0.0f);
        mutableRect0.o(0.0f);
        mutableRect0.n(((float)IntSize.m(layoutCoordinates0.a())));
        mutableRect0.l(((float)IntSize.j(layoutCoordinates0.a())));
        while(nodeCoordinator0 != nodeCoordinator1) {
            NodeCoordinator.q3(nodeCoordinator0, mutableRect0, z, false, 4, null);
            if(mutableRect0.j()) {
                return Rect.e.a();
            }
            nodeCoordinator0 = nodeCoordinator0.j;
            L.m(nodeCoordinator0);
        }
        this.t2(nodeCoordinator1, mutableRect0, z);
        return MutableRectKt.a(mutableRect0);
    }

    public final boolean E2() {
        return this.y;
    }

    public static void E3(NodeCoordinator nodeCoordinator0, Function1 function10, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if((v & 2) != 0) {
            z = false;
        }
        nodeCoordinator0.D3(function10, z);
    }

    public final long F2() {
        return this.M1();
    }

    private final void F3() {
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 != null) {
            Function1 function10 = this.m;
            if(function10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope0 = NodeCoordinator.F;
            reusableGraphicsLayerScope0.e();
            reusableGraphicsLayerScope0.f(this.M0().getDensity());
            reusableGraphicsLayerScope0.g(IntSizeKt.f(this.a()));
            OwnerSnapshotObserver ownerSnapshotObserver0 = this.L2();
            androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1 nodeCoordinator$updateLayerParameters$10 = new a() {
                final Function1 e;

                {
                    this.e = function10;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    ReusableGraphicsLayerScope reusableGraphicsLayerScope0 = NodeCoordinator.F;
                    this.e.invoke(reusableGraphicsLayerScope0);
                }
            };
            ownerSnapshotObserver0.i(this, NodeCoordinator.D, nodeCoordinator$updateLayerParameters$10);
            LayerPositionalProperties layerPositionalProperties0 = this.w;
            if(layerPositionalProperties0 == null) {
                layerPositionalProperties0 = new LayerPositionalProperties();
                this.w = layerPositionalProperties0;
            }
            layerPositionalProperties0.a(reusableGraphicsLayerScope0);
            ownedLayer0.e(reusableGraphicsLayerScope0.V(), reusableGraphicsLayerScope0.b0(), reusableGraphicsLayerScope0.i(), reusableGraphicsLayerScope0.G(), reusableGraphicsLayerScope0.F(), reusableGraphicsLayerScope0.P0(), reusableGraphicsLayerScope0.Y(), reusableGraphicsLayerScope0.N(), reusableGraphicsLayerScope0.O(), reusableGraphicsLayerScope0.t(), reusableGraphicsLayerScope0.a1(), reusableGraphicsLayerScope0.F0(), reusableGraphicsLayerScope0.d(), reusableGraphicsLayerScope0.l(), reusableGraphicsLayerScope0.V0(), reusableGraphicsLayerScope0.n0(), reusableGraphicsLayerScope0.z(), this.M0().getLayoutDirection(), this.M0().getDensity());
            this.l = reusableGraphicsLayerScope0.d();
        }
        else if(this.m != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.p = NodeCoordinator.F.i();
        Owner owner0 = this.M0().B0();
        if(owner0 != null) {
            owner0.s(this.M0());
        }
    }

    @m
    public final OwnedLayer G2() {
        return this.z;
    }

    protected final void G3(@l LookaheadDelegate lookaheadDelegate0) {
        L.p(lookaheadDelegate0, "lookaheadDelegate");
        this.r = lookaheadDelegate0;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean H() {
        return this.z != null && this.o();
    }

    @m
    protected final Function1 H2() {
        return this.m;
    }

    public final void H3(@m LookaheadScope lookaheadScope0) {
        LookaheadDelegate lookaheadDelegate0 = null;
        if(lookaheadScope0 != null) {
            LookaheadDelegate lookaheadDelegate1 = this.r;
            if(lookaheadDelegate1 != null) {
                lookaheadDelegate0 = lookaheadDelegate1.m2();
            }
            lookaheadDelegate0 = L.g(lookaheadScope0, lookaheadDelegate0) ? this.r : this.w2(lookaheadScope0);
        }
        this.r = lookaheadDelegate0;
    }

    @m
    public final LookaheadDelegate I2() {
        return this.r;
    }

    public final void I3(int v, boolean z, @l Function1 function10) {
        L.p(function10, "block");
        Node modifier$Node0 = this.M2();
        if(!z) {
            modifier$Node0 = modifier$Node0.O();
            if(modifier$Node0 == null) {
                return;
            }
        }
        for(Node modifier$Node1 = this.S2(z); true; modifier$Node1 = modifier$Node1.F()) {
            if(modifier$Node1 == null || (modifier$Node1.D() & v) == 0) {
                return;
            }
            if((modifier$Node1.J() & v) != 0) {
                function10.invoke(modifier$Node1);
            }
            if(modifier$Node1 == modifier$Node0) {
                break;
            }
        }
    }

    public final long J2() {
        return this.n.J(this.M0().getViewConfiguration().e());
    }

    public final void J3(int v, Function1 function10) {
        Node modifier$Node1;
        L.p(function10, "block");
        Node modifier$Node0 = this.M2();
        if(NodeKindKt.g(v)) {
            modifier$Node1 = this.S2(true);
        label_8:
            while(modifier$Node1 != null && (modifier$Node1.D() & v) != 0) {
                if((modifier$Node1.J() & v) != 0) {
                    L.y(3, "T");
                    function10.invoke(modifier$Node1);
                }
                if(modifier$Node1 == modifier$Node0) {
                    break;
                }
                modifier$Node1 = modifier$Node1.F();
            }
        }
        else {
            modifier$Node0 = modifier$Node0.O();
            if(modifier$Node0 != null) {
                modifier$Node1 = this.S2(false);
                goto label_8;
            }
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public final LayoutCoordinates K() {
        if(!this.o()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return this.M0().A0().j;
    }

    @l
    protected final MutableRect K2() {
        MutableRect mutableRect0 = this.v;
        if(mutableRect0 == null) {
            mutableRect0 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this.v = mutableRect0;
        }
        return mutableRect0;
    }

    protected final void K3(@l Canvas canvas0, @l Function1 function10) {
        L.p(canvas0, "canvas");
        L.p(function10, "block");
        float f = (float)(((int)(this.Z1() >> 0x20)));
        float f1 = (float)(((int)(this.Z1() & 0xFFFFFFFFL)));
        canvas0.c(f, f1);
        function10.invoke(canvas0);
        canvas0.c(-f, -f1);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long L(long v) {
        if(!this.o()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        for(NodeCoordinator nodeCoordinator0 = this; nodeCoordinator0 != null; nodeCoordinator0 = nodeCoordinator0.j) {
            v = nodeCoordinator0.z3(v);
        }
        return v;
    }

    private final OwnerSnapshotObserver L2() {
        return LayoutNodeKt.b(this.M0()).getSnapshotObserver();
    }

    // 去混淆评级： 低(30)
    protected final boolean L3(long v) {
        return OffsetKt.b(v) ? this.z == null || !this.l || this.z.h(v) : false;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LayoutNode M0() {
        return this.h;
    }

    @l
    public abstract Node M2();

    @m
    public final NodeCoordinator N2() {
        return this.i;
    }

    @Override  // androidx.compose.ui.layout.Placeable
    protected void O1(long v, float f, @m Function1 function10) {
        NodeCoordinator.e3(this, function10, false, 2, null);
        if(!IntOffset.j(this.Z1(), v)) {
            this.s3(v);
            this.M0().k0().x().Y1();
            OwnedLayer ownedLayer0 = this.z;
            if(ownedLayer0 == null) {
                NodeCoordinator nodeCoordinator0 = this.j;
                if(nodeCoordinator0 != null) {
                    nodeCoordinator0.Y2();
                }
            }
            else {
                ownedLayer0.j(v);
            }
            this.a2(this);
            Owner owner0 = this.M0().B0();
            if(owner0 != null) {
                owner0.s(this.M0());
            }
        }
        this.u = f;
    }

    @m
    public final NodeCoordinator O2() {
        return this.j;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long P(@l LayoutCoordinates layoutCoordinates0, long v) {
        L.p(layoutCoordinates0, "sourceCoordinates");
        NodeCoordinator nodeCoordinator0 = this.y3(layoutCoordinates0);
        NodeCoordinator nodeCoordinator1 = this.B2(nodeCoordinator0);
        while(nodeCoordinator0 != nodeCoordinator1) {
            v = nodeCoordinator0.z3(v);
            nodeCoordinator0 = nodeCoordinator0.j;
            L.m(nodeCoordinator0);
        }
        return this.u2(nodeCoordinator1, v);
    }

    public final float P2() {
        return this.u;
    }

    public final boolean Q2(int v) {
        Node modifier$Node0 = this.S2(NodeKindKt.g(v));
        return modifier$Node0 != null && DelegatableNodeKt.g(modifier$Node0, v);
    }

    public final Object R2(int v) {
        Node modifier$Node1;
        Node modifier$Node0 = this.M2();
        if(NodeKindKt.g(v)) {
            modifier$Node1 = this.S2(true);
        label_7:
            while(modifier$Node1 != null && (modifier$Node1.D() & v) != 0) {
                if((modifier$Node1.J() & v) != 0) {
                    L.y(2, "T");
                    return modifier$Node1;
                }
                if(modifier$Node1 == modifier$Node0) {
                    break;
                }
                modifier$Node1 = modifier$Node1.F();
            }
        }
        else {
            modifier$Node0 = modifier$Node0.O();
            if(modifier$Node0 != null) {
                modifier$Node1 = this.S2(false);
                goto label_7;
            }
        }
        return null;
    }

    private final Node S2(boolean z) {
        if(this.M0().A0() == this) {
            return this.M0().x0().m();
        }
        if(z) {
            NodeCoordinator nodeCoordinator0 = this.j;
            if(nodeCoordinator0 != null) {
                Node modifier$Node0 = nodeCoordinator0.M2();
                return modifier$Node0 == null ? null : modifier$Node0.F();
            }
            return null;
        }
        return this.j == null ? null : this.j.M2();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public AlignmentLinesOwner T1() {
        return this.M0().k0().l();
    }

    @m
    public final Object T2(int v) {
        Node modifier$Node1;
        Node modifier$Node0 = this.M2();
        if(NodeKindKt.g(v)) {
            modifier$Node1 = this.S2(true);
        label_7:
            while(modifier$Node1 != null && (modifier$Node1.D() & v) != 0) {
                if((modifier$Node1.J() & v) != 0) {
                    return modifier$Node1;
                }
                if(modifier$Node1 == modifier$Node0) {
                    break;
                }
                modifier$Node1 = modifier$Node1.F();
            }
        }
        else {
            modifier$Node0 = modifier$Node0.O();
            if(modifier$Node0 != null) {
                modifier$Node1 = this.S2(false);
                goto label_7;
            }
        }
        return null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public final LayoutCoordinates U() {
        if(!this.o()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return this.j;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable U1() {
        return this.i;
    }

    private final void U2(DelegatableNode delegatableNode0, HitTestSource nodeCoordinator$HitTestSource0, long v, HitTestResult hitTestResult0, boolean z, boolean z1) {
        if(delegatableNode0 == null) {
            this.X2(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
            return;
        }
        hitTestResult0.k(delegatableNode0, z1, new a(delegatableNode0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1) {
            final NodeCoordinator e;
            final DelegatableNode f;
            final HitTestSource g;
            final long h;
            final HitTestResult i;
            final boolean j;
            final boolean k;

            {
                this.e = nodeCoordinator0;
                this.f = delegatableNode0;
                this.g = nodeCoordinator$HitTestSource0;
                this.h = v;
                this.i = hitTestResult0;
                this.j = z;
                this.k = z1;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                int v = this.g.a();
                DelegatableNode delegatableNode0 = (DelegatableNode)NodeCoordinatorKt.b(this.f, v, 2);
                this.e.U2(delegatableNode0, this.g, this.h, this.i, this.j, this.k);
            }
        });
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LayoutCoordinates V1() {
        return this;
    }

    private final void V2(DelegatableNode delegatableNode0, HitTestSource nodeCoordinator$HitTestSource0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, float f) {
        if(delegatableNode0 == null) {
            this.X2(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
            return;
        }
        hitTestResult0.l(delegatableNode0, f, z1, new a(delegatableNode0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f) {
            final NodeCoordinator e;
            final DelegatableNode f;
            final HitTestSource g;
            final long h;
            final HitTestResult i;
            final boolean j;
            final boolean k;
            final float l;

            {
                this.e = nodeCoordinator0;
                this.f = delegatableNode0;
                this.g = nodeCoordinator$HitTestSource0;
                this.h = v;
                this.i = hitTestResult0;
                this.j = z;
                this.k = z1;
                this.l = f;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                int v = this.g.a();
                DelegatableNode delegatableNode0 = (DelegatableNode)NodeCoordinatorKt.b(this.f, v, 2);
                this.e.V2(delegatableNode0, this.g, this.h, this.i, this.j, this.k, this.l);
            }
        });
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean W1() {
        return this.q != null;
    }

    public final void W2(@l HitTestSource nodeCoordinator$HitTestSource0, long v, @l HitTestResult hitTestResult0, boolean z, boolean z1) {
        L.p(nodeCoordinator$HitTestSource0, "hitTestSource");
        L.p(hitTestResult0, "hitTestResult");
        Object object0 = this.T2(nodeCoordinator$HitTestSource0.a());
        if(this.L3(v)) {
            if(((DelegatableNode)object0) == null) {
                this.X2(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
                return;
            }
            if(this.a3(v)) {
                this.U2(((DelegatableNode)object0), nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
                return;
            }
            float f1 = z ? this.x2(v, this.J2()) : Infinityf;
            if(!Float.isInfinite(f1) && !Float.isNaN(f1) && hitTestResult0.m(f1, z1)) {
                this.V2(((DelegatableNode)object0), nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f1);
                return;
            }
            this.x3(((DelegatableNode)object0), nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f1);
        }
        else if(z) {
            float f = this.x2(v, this.J2());
            if(!Float.isInfinite(f) && !Float.isNaN(f) && hitTestResult0.m(f, false)) {
                this.V2(((DelegatableNode)object0), nodeCoordinator$HitTestSource0, v, hitTestResult0, true, false, f);
            }
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long X(long v) {
        if(!this.o()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates layoutCoordinates0 = LayoutCoordinatesKt.d(this);
        return this.P(layoutCoordinates0, Offset.u(LayoutNodeKt.b(this.M0()).l(v), LayoutCoordinatesKt.f(layoutCoordinates0)));
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public MeasureResult X1() {
        MeasureResult measureResult0 = this.q;
        if(measureResult0 == null) {
            throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
        }
        return measureResult0;
    }

    public void X2(@l HitTestSource nodeCoordinator$HitTestSource0, long v, @l HitTestResult hitTestResult0, boolean z, boolean z1) {
        L.p(nodeCoordinator$HitTestSource0, "hitTestSource");
        L.p(hitTestResult0, "hitTestResult");
        NodeCoordinator nodeCoordinator0 = this.i;
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.W2(nodeCoordinator$HitTestSource0, nodeCoordinator0.C2(v), hitTestResult0, z, z1);
        }
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable Y1() {
        return this.j;
    }

    public void Y2() {
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator0 = this.j;
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.Y2();
        }
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public long Z1() {
        return this.t;
    }

    public void Z2(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(this.M0().u()) {
            OwnerSnapshotObserver ownerSnapshotObserver0 = this.L2();
            androidx.compose.ui.node.NodeCoordinator.invoke.1 nodeCoordinator$invoke$10 = new a(canvas0) {
                final NodeCoordinator e;
                final Canvas f;

                {
                    this.e = nodeCoordinator0;
                    this.f = canvas0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.A2(this.f);
                }
            };
            ownerSnapshotObserver0.i(this, NodeCoordinator.E, nodeCoordinator$invoke$10);
            this.y = false;
            return;
        }
        this.y = true;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long a() {
        return this.L1();
    }

    protected final boolean a3(long v) {
        float f = Offset.p(v);
        float f1 = Offset.r(v);
        return f >= 0.0f && f1 >= 0.0f && f < ((float)this.getMeasuredWidth()) && f1 < ((float)this.getMeasuredHeight());
    }

    public final boolean b3() {
        if(this.z != null && this.p <= 0.0f) {
            return true;
        }
        return this.j == null ? false : this.j.b3();
    }

    @Override  // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.IntrinsicMeasurable
    @m
    public Object c() {
        h l0$h0 = new h();
        Node modifier$Node0 = this.M2();
        if(this.M0().x0().t(0x40)) {
            Density density0 = this.M0().getDensity();
            for(Node modifier$Node1 = this.M0().x0().r(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.O()) {
                if(modifier$Node1 != modifier$Node0 && (0x40 & modifier$Node1.J()) != 0 && modifier$Node1 instanceof ParentDataModifierNode) {
                    l0$h0.a = ((ParentDataModifierNode)modifier$Node1).E(density0, l0$h0.a);
                }
            }
        }
        return l0$h0.a;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public void c0(@l LayoutCoordinates layoutCoordinates0, @l float[] arr_f) {
        L.p(layoutCoordinates0, "sourceCoordinates");
        L.p(arr_f, "matrix");
        NodeCoordinator nodeCoordinator0 = this.y3(layoutCoordinates0);
        NodeCoordinator nodeCoordinator1 = this.B2(nodeCoordinator0);
        Matrix.m(arr_f);
        nodeCoordinator0.C3(nodeCoordinator1, arr_f);
        this.B3(nodeCoordinator1, arr_f);
    }

    private final long c3(long v) {
        float f = Offset.p(v);
        float f1 = Math.max(0.0f, (f < 0.0f ? -f : f - ((float)this.getMeasuredWidth())));
        float f2 = Offset.r(v);
        return f2 < 0.0f ? OffsetKt.a(f1, Math.max(0.0f, -f2)) : OffsetKt.a(f1, Math.max(0.0f, f2 - ((float)this.getMeasuredHeight())));
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void d2() {
        this.O1(this.Z1(), this.u, this.m);
    }

    private final void d3(Function1 function10, boolean z) {
        boolean z1 = this.m != function10 || !L.g(this.n, this.M0().getDensity()) || this.o != this.M0().getLayoutDirection() || z;
        this.m = function10;
        this.n = this.M0().getDensity();
        this.o = this.M0().getLayoutDirection();
        if(!this.o() || function10 == null) {
            OwnedLayer ownedLayer1 = this.z;
            if(ownedLayer1 != null) {
                ownedLayer1.destroy();
                this.M0().I1(true);
                this.x.invoke();
                if(this.o()) {
                    Owner owner0 = this.M0().B0();
                    if(owner0 != null) {
                        owner0.s(this.M0());
                    }
                }
            }
            this.z = null;
            this.y = false;
        }
        else {
            if(this.z == null) {
                OwnedLayer ownedLayer0 = LayoutNodeKt.b(this.M0()).i(this, this.x);
                ownedLayer0.g(this.L1());
                ownedLayer0.j(this.Z1());
                this.z = ownedLayer0;
                this.F3();
                this.M0().I1(true);
                this.x.invoke();
                return;
            }
            if(z1) {
                this.F3();
            }
        }
    }

    static void e3(NodeCoordinator nodeCoordinator0, Function1 function10, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLayerBlockUpdated");
        }
        if((v & 2) != 0) {
            z = false;
        }
        nodeCoordinator0.d3(function10, z);
    }

    public void f3() {
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
        }
    }

    public final void g3() {
        NodeCoordinator.e3(this, this.m, false, 2, null);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.M0().getDensity().getDensity();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.M0().getLayoutDirection();
    }

    protected void h3(int v, int v1) {
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 == null) {
            NodeCoordinator nodeCoordinator0 = this.j;
            if(nodeCoordinator0 != null) {
                nodeCoordinator0.Y2();
            }
        }
        else {
            ownedLayer0.g(IntSizeKt.a(v, v1));
        }
        Owner owner0 = this.M0().B0();
        if(owner0 != null) {
            owner0.s(this.M0());
        }
        this.Q1(IntSizeKt.a(v, v1));
        NodeCoordinator.F.g(IntSizeKt.f(this.L1()));
        Node modifier$Node0 = this.M2().O();
        if(modifier$Node0 != null) {
            for(Node modifier$Node1 = this.S2(false); modifier$Node1 != null && (modifier$Node1.D() & 4) != 0; modifier$Node1 = modifier$Node1.F()) {
                if((modifier$Node1.J() & 4) != 0 && modifier$Node1 instanceof DrawModifierNode) {
                    ((DrawModifierNode)modifier$Node1).p();
                }
                if(modifier$Node1 == modifier$Node0) {
                    break;
                }
            }
        }
    }

    public final void i3() {
        if(this.Q2(0x80)) {
            Snapshot snapshot0 = Snapshot.e.a();
            try {
                Snapshot snapshot1 = snapshot0.p();
                try {
                    Node modifier$Node0 = this.M2();
                    for(Node modifier$Node1 = this.S2(true); modifier$Node1 != null && (modifier$Node1.D() & 0x80) != 0; modifier$Node1 = modifier$Node1.F()) {
                        if((modifier$Node1.J() & 0x80) != 0 && modifier$Node1 instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode)modifier$Node1).L(this.L1());
                        }
                        if(modifier$Node1 == modifier$Node0) {
                            break;
                        }
                    }
                }
                finally {
                    snapshot0.w(snapshot1);
                }
            }
            finally {
                snapshot0.d();
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.Z2(((Canvas)object0));
        return S0.a;
    }

    public final void j3() {
        LookaheadDelegate lookaheadDelegate0 = this.r;
        if(lookaheadDelegate0 != null) {
            Node modifier$Node0 = this.M2();
            for(Node modifier$Node1 = this.S2(true); modifier$Node1 != null && (modifier$Node1.D() & 0x80) != 0; modifier$Node1 = modifier$Node1.F()) {
                if((modifier$Node1.J() & 0x80) != 0 && modifier$Node1 instanceof LayoutAwareModifierNode) {
                    ((LayoutAwareModifierNode)modifier$Node1).s(lookaheadDelegate0.l2());
                }
                if(modifier$Node1 == modifier$Node0) {
                    break;
                }
            }
        }
        Node modifier$Node2 = this.M2();
        for(Node modifier$Node3 = this.S2(true); modifier$Node3 != null && (modifier$Node3.D() & 0x80) != 0; modifier$Node3 = modifier$Node3.F()) {
            if((modifier$Node3.J() & 0x80) != 0 && modifier$Node3 instanceof LayoutAwareModifierNode) {
                ((LayoutAwareModifierNode)modifier$Node3).o(this);
            }
            if(modifier$Node3 == modifier$Node2) {
                break;
            }
        }
    }

    public final void k3() {
        this.k = true;
        if(this.z != null) {
            NodeCoordinator.e3(this, null, false, 2, null);
        }
    }

    public void l3(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        NodeCoordinator nodeCoordinator0 = this.i;
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.y2(canvas0);
        }
    }

    @l
    protected final Placeable m3(long v, @l a a0) {
        L.p(a0, "block");
        this.R1(v);
        Placeable placeable0 = (Placeable)a0.invoke();
        OwnedLayer ownedLayer0 = this.G2();
        if(ownedLayer0 != null) {
            ownedLayer0.g(this.L1());
        }
        return placeable0;
    }

    @m
    public Object n3(@l Rect rect0, @l d d0) {
        return NodeCoordinator.o3(this, rect0, d0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public boolean o() {
        return !this.k && this.M0().o();
    }

    static Object o3(NodeCoordinator nodeCoordinator0, Rect rect0, d d0) {
        NodeCoordinator nodeCoordinator1 = nodeCoordinator0.j;
        if(nodeCoordinator1 == null) {
            return S0.a;
        }
        Object object0 = nodeCoordinator1.n3(rect0.S(nodeCoordinator1.E(nodeCoordinator0, false).E()), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public final void p3(@l MutableRect mutableRect0, boolean z, boolean z1) {
        L.p(mutableRect0, "bounds");
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 != null) {
            if(this.l) {
                if(z1) {
                    long v = this.J2();
                    float f = Size.t(v);
                    float f1 = Size.m(v);
                    mutableRect0.i(-(f / 2.0f), -(f1 / 2.0f), ((float)IntSize.m(this.a())) + f / 2.0f, ((float)IntSize.j(this.a())) + f1 / 2.0f);
                }
                else if(z) {
                    mutableRect0.i(0.0f, 0.0f, ((float)IntSize.m(this.a())), ((float)IntSize.j(this.a())));
                }
                if(mutableRect0.j()) {
                    return;
                }
            }
            ownedLayer0.a(mutableRect0, false);
        }
        float f2 = (float)(((int)(this.Z1() >> 0x20)));
        mutableRect0.m(mutableRect0.d() + f2);
        mutableRect0.n(mutableRect0.e() + f2);
        float f3 = (float)(((int)(this.Z1() & 0xFFFFFFFFL)));
        mutableRect0.o(mutableRect0.g() + f3);
        mutableRect0.l(mutableRect0.b() + f3);
    }

    public static void q3(NodeCoordinator nodeCoordinator0, MutableRect mutableRect0, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        nodeCoordinator0.p3(mutableRect0, z, z1);
    }

    public void r3(@l MeasureResult measureResult0) {
        L.p(measureResult0, "value");
        MeasureResult measureResult1 = this.q;
        if(measureResult0 != measureResult1) {
            this.q = measureResult0;
            if(measureResult1 == null || measureResult0.getWidth() != measureResult1.getWidth() || measureResult0.getHeight() != measureResult1.getHeight()) {
                this.h3(measureResult0.getWidth(), measureResult0.getHeight());
            }
            if((this.s != null && !this.s.isEmpty() || !measureResult0.k().isEmpty()) && !L.g(measureResult0.k(), this.s)) {
                this.T1().k().q();
                Map map0 = this.s;
                if(map0 == null) {
                    map0 = new LinkedHashMap();
                    this.s = map0;
                }
                map0.clear();
                map0.putAll(measureResult0.k());
            }
        }
    }

    protected void s3(long v) {
        this.t = v;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Set t1() {
        Set set0 = null;
        while(this != null) {
            Map map0 = this.q == null ? null : this.q.k();
            if(map0 != null && !map0.isEmpty() == 1) {
                if(set0 == null) {
                    set0 = new LinkedHashSet();
                }
                set0.addAll(map0.keySet());
            }
            this = this.i;
        }
        return set0 == null ? k0.k() : set0;
    }

    private final void t2(NodeCoordinator nodeCoordinator0, MutableRect mutableRect0, boolean z) {
        if(nodeCoordinator0 == this) {
            return;
        }
        NodeCoordinator nodeCoordinator1 = this.j;
        if(nodeCoordinator1 != null) {
            nodeCoordinator1.t2(nodeCoordinator0, mutableRect0, z);
        }
        this.D2(mutableRect0, z);
    }

    public final void t3(@m NodeCoordinator nodeCoordinator0) {
        this.i = nodeCoordinator0;
    }

    private final long u2(NodeCoordinator nodeCoordinator0, long v) {
        if(nodeCoordinator0 == this) {
            return v;
        }
        NodeCoordinator nodeCoordinator1 = this.j;
        return nodeCoordinator1 == null || L.g(nodeCoordinator0, nodeCoordinator1) ? this.C2(v) : this.C2(nodeCoordinator1.u2(nodeCoordinator0, v));
    }

    public final void u3(@m NodeCoordinator nodeCoordinator0) {
        this.j = nodeCoordinator0;
    }

    protected final long v2(long v) {
        return SizeKt.a(Math.max(0.0f, (Size.t(v) - ((float)this.getMeasuredWidth())) / 2.0f), Math.max(0.0f, (Size.m(v) - ((float)this.getMeasuredHeight())) / 2.0f));
    }

    protected final void v3(float f) {
        this.u = f;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.M0().getDensity().w1();
    }

    @l
    public abstract LookaheadDelegate w2(@l LookaheadScope arg1);

    public final boolean w3() {
        Node modifier$Node0 = this.S2(false);
        if(modifier$Node0 == null) {
            return false;
        }
        if(!modifier$Node0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node1 = modifier$Node0.getNode();
        if((modifier$Node1.D() & 16) != 0) {
            for(Node modifier$Node2 = modifier$Node1.F(); modifier$Node2 != null; modifier$Node2 = modifier$Node2.F()) {
                if((modifier$Node2.J() & 16) != 0 && modifier$Node2 instanceof PointerInputModifierNode && ((PointerInputModifierNode)modifier$Node2).z()) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final float x2(long v, long v1) {
        if(((float)this.getMeasuredWidth()) >= Size.t(v1) && ((float)this.getMeasuredHeight()) >= Size.m(v1)) {
            return Infinityf;
        }
        long v2 = this.v2(v1);
        float f = Size.t(v2);
        float f1 = Size.m(v2);
        long v3 = this.c3(v);
        return f <= 0.0f && f1 <= 0.0f || Offset.p(v3) > f || Offset.r(v3) > f1 ? Infinityf : Offset.n(v3);
    }

    private final void x3(DelegatableNode delegatableNode0, HitTestSource nodeCoordinator$HitTestSource0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, float f) {
        if(delegatableNode0 == null) {
            this.X2(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
            return;
        }
        if(nodeCoordinator$HitTestSource0.c(delegatableNode0)) {
            hitTestResult0.q(delegatableNode0, f, z1, new a(delegatableNode0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f) {
                final NodeCoordinator e;
                final DelegatableNode f;
                final HitTestSource g;
                final long h;
                final HitTestResult i;
                final boolean j;
                final boolean k;
                final float l;

                {
                    this.e = nodeCoordinator0;
                    this.f = delegatableNode0;
                    this.g = nodeCoordinator$HitTestSource0;
                    this.h = v;
                    this.i = hitTestResult0;
                    this.j = z;
                    this.k = z1;
                    this.l = f;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    int v = this.g.a();
                    DelegatableNode delegatableNode0 = (DelegatableNode)NodeCoordinatorKt.b(this.f, v, 2);
                    this.e.x3(delegatableNode0, this.g, this.h, this.i, this.j, this.k, this.l);
                }
            });
            return;
        }
        this.x3(((DelegatableNode)NodeCoordinatorKt.b(delegatableNode0, nodeCoordinator$HitTestSource0.a(), 2)), nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f);
    }

    public final void y2(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 != null) {
            ownedLayer0.b(canvas0);
            return;
        }
        float f = (float)(((int)(this.Z1() >> 0x20)));
        float f1 = (float)(((int)(this.Z1() & 0xFFFFFFFFL)));
        canvas0.c(f, f1);
        this.A2(canvas0);
        canvas0.c(-f, -f1);
    }

    private final NodeCoordinator y3(LayoutCoordinates layoutCoordinates0) {
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl0 = layoutCoordinates0 instanceof LookaheadLayoutCoordinatesImpl ? ((LookaheadLayoutCoordinatesImpl)layoutCoordinates0) : null;
        if(lookaheadLayoutCoordinatesImpl0 != null) {
            NodeCoordinator nodeCoordinator0 = lookaheadLayoutCoordinatesImpl0.b();
            if(nodeCoordinator0 != null) {
                return nodeCoordinator0;
            }
        }
        L.n(layoutCoordinates0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator)layoutCoordinates0;
    }

    protected final void z2(@l Canvas canvas0, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
        canvas0.q(new Rect(0.5f, 0.5f, ((float)(((int)(this.L1() >> 0x20)))) - 0.5f, ((float)(((int)(this.L1() & 0xFFFFFFFFL)))) - 0.5f), paint0);
    }

    public long z3(long v) {
        OwnedLayer ownedLayer0 = this.z;
        if(ownedLayer0 != null) {
            v = ownedLayer0.f(v, false);
        }
        return IntOffsetKt.e(v, this.Z1());
    }
}

