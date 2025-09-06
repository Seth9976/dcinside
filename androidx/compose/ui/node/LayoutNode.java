package androidx.compose.ui.node;

import A3.a;
import A3.o;
import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Comparator;
import java.util.List;
import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 12 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1504:1\n1288#1,7:1586\n163#1:1606\n1288#1,7:1618\n1288#1,7:1625\n1276#1,7:1647\n163#1:1654\n163#1:1666\n1288#1,7:1678\n163#1:1685\n163#1:1697\n1276#1,7:1767\n163#1:1847\n163#1:1859\n163#1:1871\n1288#1,7:1883\n1182#2:1505\n1161#2,2:1506\n1182#2:1508\n1161#2,2:1509\n1182#2:1511\n1161#2,2:1512\n48#3:1514\n48#3:1550\n48#3:1562\n48#3:1574\n48#3:1593\n460#4,7:1515\n146#4:1522\n467#4,4:1523\n460#4,11:1527\n476#4,11:1538\n460#4,11:1551\n460#4,11:1563\n460#4,11:1575\n460#4,11:1594\n146#4:1605\n460#4,11:1607\n460#4,11:1655\n460#4,11:1667\n460#4,11:1686\n460#4,11:1698\n460#4,11:1806\n460#4,11:1848\n460#4,11:1860\n460#4,11:1872\n1#5:1549\n360#6,15:1632\n87#7,3:1709\n91#7:1713\n87#7:1718\n89#7,3:1720\n87#7:1726\n87#7:1730\n83#7:1735\n83#7:1750\n69#7:1774\n69#7:1789\n81#7:1817\n71#7:1834\n69#7:1835\n69#7:1839\n69#7:1841\n71#7:1842\n47#8:1712\n51#9:1714\n635#10,3:1715\n638#10,3:1723\n666#10,3:1727\n669#10,3:1732\n612#10,8:1736\n635#10,3:1744\n620#10,2:1747\n613#10:1749\n614#10,11:1751\n638#10,3:1762\n625#10:1765\n615#10:1766\n612#10,8:1775\n635#10,3:1783\n620#10,2:1786\n613#10:1788\n614#10,11:1790\n638#10,3:1801\n625#10:1804\n615#10:1805\n635#10,3:1836\n638#10,3:1844\n196#11:1719\n196#11:1731\n196#11:1840\n196#11:1843\n111#12:1818\n100#12,15:1819\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n422#1:1586,7\n518#1:1606\n588#1:1618,7\n777#1:1625,7\n922#1:1647,7\n961#1:1654\n974#1:1666\n1000#1:1678,7\n1005#1:1685\n1040#1:1697\n1157#1:1767,7\n1325#1:1847\n1347#1:1859\n1359#1:1871\n1390#1:1883,7\n95#1:1505\n95#1:1506,2\n464#1:1508\n464#1:1509,2\n107#1:1511\n107#1:1512,2\n111#1:1514\n279#1:1550\n344#1:1562\n415#1:1574\n456#1:1593\n111#1:1515,7\n113#1:1522\n111#1:1523,4\n163#1:1527,11\n165#1:1538,11\n279#1:1551,11\n344#1:1563,11\n415#1:1575,11\n456#1:1594,11\n480#1:1605\n518#1:1607,11\n961#1:1655,11\n974#1:1667,11\n1005#1:1686,11\n1040#1:1698,11\n1246#1:1806,11\n1325#1:1848,11\n1347#1:1860,11\n1359#1:1872,11\n822#1:1632,15\n1087#1:1709,3\n1087#1:1713\n1089#1:1718\n1089#1:1720,3\n1098#1:1726\n1101#1:1730\n1141#1:1735\n1142#1:1750\n1242#1:1774\n1243#1:1789\n1267#1:1817\n1298#1:1834\n1298#1:1835\n1300#1:1839\n1301#1:1841\n1305#1:1842\n1087#1:1712\n1087#1:1714\n1088#1:1715,3\n1088#1:1723,3\n1099#1:1727,3\n1099#1:1732,3\n1141#1:1736,8\n1141#1:1744,3\n1141#1:1747,2\n1141#1:1749\n1141#1:1751,11\n1141#1:1762,3\n1141#1:1765\n1141#1:1766\n1242#1:1775,8\n1242#1:1783,3\n1242#1:1786,2\n1242#1:1788\n1242#1:1790,11\n1242#1:1801,3\n1242#1:1804\n1242#1:1805\n1299#1:1836,3\n1299#1:1844,3\n1089#1:1719\n1101#1:1731\n1300#1:1840\n1305#1:1843\n1267#1:1818\n1267#1:1819,15\n*E\n"})
public final class LayoutNode implements ComposeNodeLifecycleCallback, LayoutInfo, Remeasurement, ComposeUiNode, InteroperableComposeUiNode, OnLayoutCompletedListener, OwnerScope {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final a a() {
            return LayoutNode.Y;
        }

        @l
        public final ViewConfiguration b() {
            return LayoutNode.Z;
        }

        @l
        public final Comparator c() {
            return LayoutNode.M8;
        }
    }

    public static enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;

        private static final LayoutState[] a() [...] // Inlined contents
    }

    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        @l
        private final String a;

        public NoIntrinsicsMeasurePolicy(@l String s) {
            L.p(s, "error");
            super();
            this.a = s;
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.h(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int c(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.i(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int d(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.f(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int e(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.g(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @l
        public Void f(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "<this>");
            L.p(list0, "measurables");
            throw new IllegalStateException(this.a.toString());
        }

        @l
        public Void g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "<this>");
            L.p(list0, "measurables");
            throw new IllegalStateException(this.a.toString());
        }

        @l
        public Void h(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "<this>");
            L.p(list0, "measurables");
            throw new IllegalStateException(this.a.toString());
        }

        @l
        public Void i(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "<this>");
            L.p(list0, "measurables");
            throw new IllegalStateException(this.a.toString());
        }
    }

    public static enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;

        private static final UsageByParent[] a() [...] // Inlined contents
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            try {
                arr_v[LayoutState.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private UsageByParent A;
    private boolean B;
    private boolean C;
    @l
    private final NodeChain D;
    @l
    private final LayoutNodeLayoutDelegate E;
    private float F;
    @m
    private LayoutNodeSubcompositionsState G;
    @m
    private NodeCoordinator H;
    private boolean I;
    @l
    private Modifier J;
    @m
    private Function1 K;
    @m
    private Function1 L;
    private boolean M;
    @l
    private static final Comparator M8 = null;
    private boolean N;
    private boolean O;
    @l
    public static final Companion P = null;
    @l
    private static final NoIntrinsicsMeasurePolicy Q = null;
    public static final int X = 0x7FFFFFFF;
    @l
    private static final a Y;
    @l
    private static final ViewConfiguration Z;
    private final boolean a;
    private final int b;
    private int c;
    @l
    private final MutableVectorWithMutationTracking d;
    @m
    private MutableVector e;
    private boolean f;
    @m
    private LayoutNode g;
    @m
    private Owner h;
    @m
    private AndroidViewHolder i;
    private int j;
    private boolean k;
    @l
    private final MutableVector l;
    private boolean m;
    @l
    private MeasurePolicy n;
    @l
    private final IntrinsicsPolicy o;
    @l
    private Density p;
    @m
    private LookaheadScope q;
    @l
    private LayoutDirection r;
    @l
    private ViewConfiguration s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    @l
    private UsageByParent x;
    @l
    private UsageByParent y;
    @l
    private UsageByParent z;

    static {
        LayoutNode.P = new Companion(null);
        LayoutNode.Q = new LayoutNode.Companion.ErrorMeasurePolicy.1();
        LayoutNode.Y = LayoutNode.Companion.Constructor.1.e;
        LayoutNode.Z = new LayoutNode.Companion.DummyViewConfiguration.1();
        LayoutNode.M8 = (LayoutNode layoutNode0, LayoutNode layoutNode1) -> (layoutNode0.F == layoutNode1.F ? L.t(layoutNode0.u, layoutNode1.u) : Float.compare(layoutNode0.F, layoutNode1.F));
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    public LayoutNode(boolean z, int v) {
        this.a = z;
        this.b = v;
        this.d = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16], 0), new a() {
            final LayoutNode e;

            {
                this.e = layoutNode0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.k0().D();
            }
        });
        this.l = new MutableVector(new LayoutNode[16], 0);
        this.m = true;
        this.n = LayoutNode.Q;
        this.o = new IntrinsicsPolicy(this);
        this.p = DensityKt.b(1.0f, 0.0f, 2, null);
        this.r = LayoutDirection.a;
        this.s = LayoutNode.Z;
        this.u = 0x7FFFFFFF;
        this.v = 0x7FFFFFFF;
        this.x = UsageByParent.c;
        this.y = UsageByParent.c;
        this.z = UsageByParent.c;
        this.A = UsageByParent.c;
        this.D = new NodeChain(this);
        this.E = new LayoutNodeLayoutDelegate(this);
        this.I = true;
        this.J = Modifier.m0;
    }

    public LayoutNode(boolean z, int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            z = false;
        }
        if((v1 & 2) != 0) {
            v = SemanticsModifierCore.e.a();
        }
        this(z, v);
    }

    // 检测为 Lambda 实现
    private static final int A(LayoutNode layoutNode0, LayoutNode layoutNode1) [...]

    @l
    public final NodeCoordinator A0() {
        return this.D.q();
    }

    public static void A1(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        layoutNode0.z1(z);
    }

    @m
    public final Owner B0() {
        return this.h;
    }

    public final void B1(boolean z) {
        if(!this.k && !this.a) {
            Owner owner0 = this.h;
            if(owner0 == null) {
                return;
            }
            e.f(owner0, this, false, z, 2, null);
            this.s0().W1(z);
        }
    }

    @m
    public final LayoutNode C0() {
        LayoutNode layoutNode0 = this.g;
        if(layoutNode0 != null && layoutNode0.a) {
            return layoutNode0 == null ? null : layoutNode0.C0();
        }
        return layoutNode0;
    }

    public static void C1(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        layoutNode0.B1(z);
    }

    public final int D0() {
        return this.u;
    }

    public final void D1(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "it");
        if(WhenMappings.a[layoutNode0.m0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode0.m0());
        }
        if(layoutNode0.t0()) {
            layoutNode0.B1(true);
            return;
        }
        if(layoutNode0.l0()) {
            layoutNode0.z1(true);
            return;
        }
        if(layoutNode0.o0()) {
            layoutNode0.x1(true);
            return;
        }
        if(layoutNode0.n0()) {
            layoutNode0.v1(true);
        }
    }

    public final int E0() {
        return this.v;
    }

    private final void E1() {
        this.D.E();
    }

    @m
    public final LayoutNodeSubcompositionsState F0() {
        return this.G;
    }

    public final void F1() {
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                layoutNode0.z = layoutNode0.A;
                if(layoutNode0.A != UsageByParent.c) {
                    layoutNode0.F1();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void G(@l Owner owner0) {
        L.p(owner0, "owner");
        int v = 0;
        String s = null;
        if(this.h != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + LayoutNode.N(this, 0, 1, null)).toString());
        }
        if(this.g != null && !L.g(this.g.h, owner0)) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Attaching to a different owner(");
            stringBuilder0.append(owner0);
            stringBuilder0.append(") than the parent\'s owner(");
            LayoutNode layoutNode0 = this.C0();
            stringBuilder0.append((layoutNode0 == null ? null : layoutNode0.h));
            stringBuilder0.append("). This tree: ");
            stringBuilder0.append(LayoutNode.N(this, 0, 1, null));
            stringBuilder0.append(" Parent tree: ");
            LayoutNode layoutNode1 = this.g;
            if(layoutNode1 != null) {
                s = LayoutNode.N(layoutNode1, 0, 1, null);
            }
            stringBuilder0.append(s);
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
        LayoutNode layoutNode2 = this.C0();
        if(layoutNode2 == null) {
            this.t = true;
        }
        this.h = owner0;
        this.j = (layoutNode2 == null ? -1 : layoutNode2.j) + 1;
        if(SemanticsNodeKt.j(this) != null) {
            owner0.z();
        }
        owner0.v(this);
        if(layoutNode2 == null) {
        label_32:
            if(this.C) {
                s = new LookaheadScope(this);
            }
        }
        else {
            LookaheadScope lookaheadScope0 = layoutNode2.q;
            if(lookaheadScope0 != null) {
                s = lookaheadScope0;
                goto label_34;
            }
            goto label_32;
        }
    label_34:
        this.M1(((LookaheadScope)s));
        this.D.f(false);
        MutableVector mutableVector0 = this.d.h();
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            while(true) {
                ((LayoutNode)arr_object[v]).G(owner0);
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
        this.T0();
        if(layoutNode2 != null) {
            layoutNode2.T0();
        }
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0().N2();
        while(!L.g(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            nodeCoordinator0.g3();
            nodeCoordinator0 = nodeCoordinator0.N2();
        }
        Function1 function10 = this.K;
        if(function10 != null) {
            function10.invoke(owner0);
        }
        this.P0();
    }

    @l
    public final MutableVector G0() {
        if(this.m) {
            this.l.l();
            MutableVector mutableVector0 = this.I0();
            this.l.c(this.l.J(), mutableVector0);
            this.l.k0(LayoutNode.M8);
            this.m = false;
        }
        return this.l;
    }

    public final void G1(boolean z) {
        this.B = z;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean H() {
        return this.o();
    }

    @b0
    public static void H0() {
    }

    public final void H1(int v) {
        this.j = v;
    }

    public final void I() {
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.v != layoutNode0.u) {
                    this.n1();
                    this.R0();
                    if(layoutNode0.u == 0x7FFFFFFF) {
                        layoutNode0.i1();
                    }
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    @l
    public final MutableVector I0() {
        this.U1();
        if(this.c == 0) {
            return this.d.h();
        }
        MutableVector mutableVector0 = this.e;
        L.m(mutableVector0);
        return mutableVector0;
    }

    public final void I1(boolean z) {
        this.I = z;
    }

    public final void J() {
        int v = 0;
        this.w = 0;
        MutableVector mutableVector0 = this.I0();
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v];
                layoutNode0.v = layoutNode0.u;
                layoutNode0.u = 0x7FFFFFFF;
                if(layoutNode0.x == UsageByParent.b) {
                    layoutNode0.x = UsageByParent.c;
                }
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
    }

    public final void J0(long v, @l HitTestResult hitTestResult0, boolean z, boolean z1) {
        L.p(hitTestResult0, "hitTestResult");
        long v1 = this.A0().C2(v);
        this.A0().W2(NodeCoordinator.A.a(), v1, hitTestResult0, z, z1);
    }

    public final void J1(@m AndroidViewHolder androidViewHolder0) {
        this.i = androidViewHolder0;
    }

    public final void K() {
        this.A = this.z;
        this.z = UsageByParent.c;
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.z != UsageByParent.c) {
                    layoutNode0.K();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public static void K0(LayoutNode layoutNode0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, int v1, Object object0) {
        layoutNode0.J0(v, hitTestResult0, ((v1 & 4) == 0 ? z : false), ((v1 & 8) == 0 ? z1 : true));
    }

    public final void K1(@l UsageByParent layoutNode$UsageByParent0) {
        L.p(layoutNode$UsageByParent0, "<set-?>");
        this.z = layoutNode$UsageByParent0;
    }

    private final void L() {
        this.A = this.z;
        this.z = UsageByParent.c;
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.z == UsageByParent.b) {
                    layoutNode0.L();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void L0(long v, @l HitTestResult hitTestResult0, boolean z, boolean z1) {
        L.p(hitTestResult0, "hitSemanticsEntities");
        long v1 = this.A0().C2(v);
        this.A0().W2(NodeCoordinator.A.c(), v1, hitTestResult0, true, z1);
    }

    public final void L1(boolean z) {
        if(z != this.C) {
            if(z) {
                this.M1(new LookaheadScope(this));
            }
            else {
                this.M1(null);
            }
            this.C = z;
        }
    }

    private final String M(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
        stringBuilder0.append("|-");
        stringBuilder0.append(this.toString());
        stringBuilder0.append('\n');
        MutableVector mutableVector0 = this.I0();
        int v2 = mutableVector0.J();
        if(v2 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v3 = 0;
            while(true) {
                stringBuilder0.append(((LayoutNode)arr_object[v3]).M(v + 1));
                ++v3;
                if(v3 >= v2) {
                    break;
                }
            }
        }
        String s = stringBuilder0.toString();
        L.o(s, "tree.toString()");
        if(v == 0) {
            s = s.substring(0, s.length() - 1);
            L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return s;
    }

    public static void M0(LayoutNode layoutNode0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, int v1, Object object0) {
        layoutNode0.L0(v, hitTestResult0, ((v1 & 4) == 0 ? z : true), ((v1 & 8) == 0 ? z1 : true));
    }

    private final void M1(LookaheadScope lookaheadScope0) {
        if(!L.g(lookaheadScope0, this.q)) {
            this.q = lookaheadScope0;
            this.E.I(lookaheadScope0);
            NodeCoordinator nodeCoordinator0 = this.A0();
            NodeCoordinator nodeCoordinator1 = this.e0().N2();
            while(!L.g(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
                nodeCoordinator0.H3(lookaheadScope0);
                nodeCoordinator0 = nodeCoordinator0.N2();
            }
        }
    }

    static String N(LayoutNode layoutNode0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return layoutNode0.M(v);
    }

    public final void N0(@l a a0) {
        L.p(a0, "block");
        this.k = true;
        a0.invoke();
        this.k = false;
    }

    public final void N1(@l UsageByParent layoutNode$UsageByParent0) {
        L.p(layoutNode$UsageByParent0, "<set-?>");
        this.x = layoutNode$UsageByParent0;
    }

    public final void O() {
        Owner owner0 = this.h;
        String s = null;
        if(owner0 == null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNode0 = this.C0();
            if(layoutNode0 != null) {
                s = LayoutNode.N(layoutNode0, 0, 1, null);
            }
            stringBuilder0.append(s);
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
        this.Q0();
        LayoutNode layoutNode1 = this.C0();
        if(layoutNode1 != null) {
            layoutNode1.R0();
            layoutNode1.T0();
            this.x = UsageByParent.c;
        }
        this.E.L();
        Function1 function10 = this.L;
        if(function10 != null) {
            function10.invoke(owner0);
        }
        if(SemanticsNodeKt.j(this) != null) {
            owner0.z();
        }
        this.D.h();
        owner0.w(this);
        this.h = null;
        this.j = 0;
        MutableVector mutableVector0 = this.d.h();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                ((LayoutNode)arr_object[v1]).O();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.u = 0x7FFFFFFF;
        this.v = 0x7FFFFFFF;
        this.t = false;
    }

    public final void O0(int v, @l LayoutNode layoutNode0) {
        L.p(layoutNode0, "instance");
        int v1 = 0;
        String s = null;
        if(layoutNode0.g == null) {
            if(layoutNode0.h != null) {
                throw new IllegalStateException(("Cannot insert " + layoutNode0 + " because it already has an owner. This tree: " + LayoutNode.N(this, 0, 1, null) + " Other tree: " + LayoutNode.N(layoutNode0, 0, 1, null)).toString());
            }
            layoutNode0.g = this;
            this.d.a(v, layoutNode0);
            this.n1();
            if(layoutNode0.a) {
                if(this.a) {
                    throw new IllegalArgumentException("Virtual LayoutNode can\'t be added into a virtual parent");
                }
                ++this.c;
            }
            this.X0();
            NodeCoordinator nodeCoordinator0 = layoutNode0.A0();
            if(this.a) {
                LayoutNode layoutNode1 = this.g;
                if(layoutNode1 != null) {
                    s = layoutNode1.e0();
                }
            }
            else {
                s = this.e0();
            }
            nodeCoordinator0.u3(((NodeCoordinator)s));
            if(layoutNode0.a) {
                MutableVector mutableVector0 = layoutNode0.d.h();
                int v2 = mutableVector0.J();
                if(v2 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    while(true) {
                        ((LayoutNode)arr_object[v1]).A0().u3(this.e0());
                        ++v1;
                        if(v1 >= v2) {
                            break;
                        }
                    }
                }
            }
            Owner owner0 = this.h;
            if(owner0 != null) {
                layoutNode0.G(owner0);
            }
            if(layoutNode0.E.m() > 0) {
                this.E.M(this.E.m() + 1);
            }
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Cannot insert ");
        stringBuilder0.append(layoutNode0);
        stringBuilder0.append(" because it already has a parent. This tree: ");
        stringBuilder0.append(LayoutNode.N(this, 0, 1, null));
        stringBuilder0.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode0.g;
        if(layoutNode2 != null) {
            s = LayoutNode.N(layoutNode2, 0, 1, null);
        }
        stringBuilder0.append(s);
        throw new IllegalStateException(stringBuilder0.toString().toString());
    }

    public final void O1(@l UsageByParent layoutNode$UsageByParent0) {
        L.p(layoutNode$UsageByParent0, "<set-?>");
        this.y = layoutNode$UsageByParent0;
    }

    public final void P() {
        if(this.m0() != LayoutState.e || this.l0() || this.t0() || !this.u()) {
            return;
        }
        NodeChain nodeChain0 = this.D;
        if((nodeChain0.k() & 0x100) != 0) {
            for(Node modifier$Node0 = nodeChain0.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
                if((modifier$Node0.J() & 0x100) != 0 && modifier$Node0 instanceof GlobalPositionAwareModifierNode) {
                    ((GlobalPositionAwareModifierNode)modifier$Node0).X(DelegatableNodeKt.o(((GlobalPositionAwareModifierNode)modifier$Node0), 0x100));
                }
                if((modifier$Node0.D() & 0x100) == 0) {
                    break;
                }
            }
        }
    }

    private final void P0() {
        if(this.D.s(0x1C00)) {
            for(Node modifier$Node0 = this.D.m(); true; modifier$Node0 = modifier$Node0.F()) {
                int v = 0;
                if(modifier$Node0 == null) {
                    break;
                }
                int v1 = (0x400 & modifier$Node0.J()) == 0 ? 0 : 1;
                int v2 = (0x800 & modifier$Node0.J()) == 0 ? 0 : 1;
                if((0x1000 & modifier$Node0.J()) != 0) {
                    v = 1;
                }
                if((v1 | v2 | v) != 0) {
                    NodeKindKt.a(modifier$Node0);
                }
            }
        }
    }

    public final void P1(boolean z) {
        this.M = z;
    }

    public final void Q(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        this.A0().y2(canvas0);
    }

    private final void Q0() {
        if(this.D.t(0x400)) {
            for(Node modifier$Node0 = this.D.r(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.O()) {
                if((0x400 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof FocusTargetModifierNode && ((FocusTargetModifierNode)modifier$Node0).k0().a()) {
                    LayoutNodeKt.b(this).getFocusOwner().h(true, false);
                    ((FocusTargetModifierNode)modifier$Node0).n0();
                }
            }
        }
    }

    public final void Q1(@m Function1 function10) {
        this.K = function10;
    }

    public final void R(@l Function1 function10) {
        L.p(function10, "block");
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                function10.invoke(arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void R0() {
        NodeCoordinator nodeCoordinator0 = this.f0();
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.Y2();
            return;
        }
        LayoutNode layoutNode0 = this.C0();
        if(layoutNode0 != null) {
            layoutNode0.R0();
        }
    }

    public final void R1(@m Function1 function10) {
        this.L = function10;
    }

    public final void S(@l o o0) {
        L.p(o0, "block");
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                o0.invoke(v1, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void S0() {
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0();
        while(nodeCoordinator0 != nodeCoordinator1) {
            L.n(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer ownedLayer0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).G2();
            if(ownedLayer0 != null) {
                ownedLayer0.invalidate();
            }
            nodeCoordinator0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).N2();
        }
        OwnedLayer ownedLayer1 = this.e0().G2();
        if(ownedLayer1 != null) {
            ownedLayer1.invalidate();
        }
    }

    public final void S1(@m LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0) {
        this.G = layoutNodeSubcompositionsState0;
    }

    private final void T(Function1 function10) {
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0();
        while(nodeCoordinator0 != nodeCoordinator1) {
            L.n(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            function10.invoke(((LayoutModifierNodeCoordinator)nodeCoordinator0));
            nodeCoordinator0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).N2();
        }
    }

    public final void T0() {
        if(this.q != null) {
            LayoutNode.y1(this, false, 1, null);
            return;
        }
        LayoutNode.C1(this, false, 1, null);
    }

    private final boolean T1() {
        if(this.D.t(4) && !this.D.t(2)) {
            return true;
        }
        for(Node modifier$Node0 = this.D.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
            if((2 & modifier$Node0.J()) != 0 && modifier$Node0 instanceof LayoutModifierNode && DelegatableNodeKt.o(modifier$Node0, 2).G2() != null) {
                return false;
            }
            if((4 & modifier$Node0.J()) != 0) {
                return true;
            }
        }
        return true;
    }

    private final void U(Function1 function10) {
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0().N2();
        while(!L.g(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            function10.invoke(nodeCoordinator0);
            nodeCoordinator0 = nodeCoordinator0.N2();
        }
    }

    public final void U0() {
        this.E.B();
    }

    public final void U1() {
        if(this.c > 0) {
            this.p1();
        }
    }

    public final boolean V() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = this.E;
        if(!layoutNodeLayoutDelegate0.l().k().l()) {
            AlignmentLinesOwner alignmentLinesOwner0 = layoutNodeLayoutDelegate0.t();
            if(alignmentLinesOwner0 != null) {
                AlignmentLines alignmentLines0 = alignmentLinesOwner0.k();
                return alignmentLines0 != null && alignmentLines0.l();
            }
            return false;
        }
        return true;
    }

    public final void V0(boolean z) {
        if(z) {
            LayoutNode layoutNode0 = this.C0();
            if(layoutNode0 != null) {
                layoutNode0.R0();
            }
            LayoutNodeKt.b(this).z();
        }
        LayoutNode.C1(this, false, 1, null);
        NodeChain nodeChain0 = this.D;
        if((nodeChain0.k() & 2) != 0) {
            for(Node modifier$Node0 = nodeChain0.m(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.F()) {
                if((modifier$Node0.J() & 2) != 0 && modifier$Node0 instanceof LayoutModifierNode) {
                    OwnedLayer ownedLayer0 = DelegatableNodeKt.o(((LayoutModifierNode)modifier$Node0), 2).G2();
                    if(ownedLayer0 != null) {
                        ownedLayer0.invalidate();
                    }
                }
                if((modifier$Node0.D() & 2) == 0) {
                    break;
                }
            }
        }
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                ((LayoutNode)arr_object[v1]).V0(false);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final boolean W() {
        return this.B;
    }

    public static void W0(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        layoutNode0.V0(z);
    }

    @k(message = "Temporary API to support ConstraintLayout prototyping.")
    public static void X() {
    }

    private final void X0() {
        if(this.c > 0) {
            this.f = true;
        }
        if(this.a) {
            LayoutNode layoutNode0 = this.C0();
            if(layoutNode0 != null) {
                layoutNode0.f = true;
            }
        }
    }

    @l
    public final List Y() {
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.p0();
        L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
        return layoutNodeLayoutDelegate$LookaheadPassDelegate0.V1();
    }

    public final boolean Y0() {
        return this.C;
    }

    @l
    public final List Z() {
        return this.s0().S1();
    }

    @m
    public final Boolean Z0() {
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.p0();
        return layoutNodeLayoutDelegate$LookaheadPassDelegate0 == null ? null : Boolean.valueOf(layoutNodeLayoutDelegate$LookaheadPassDelegate0.u());
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void a(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "value");
        if(this.r != layoutDirection0) {
            this.r = layoutDirection0;
            this.l1();
        }
    }

    @l
    public final List a0() {
        return this.I0().k();
    }

    public final boolean a1(@m Constraints constraints0) {
        if(constraints0 != null && this.q != null) {
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.p0();
            L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
            return layoutNodeLayoutDelegate$LookaheadPassDelegate0.g2(constraints0.x());
        }
        return false;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @l
    public Modifier b() {
        return this.J;
    }

    public final int b0() {
        return this.j;
    }

    public static boolean b1(LayoutNode layoutNode0, Constraints constraints0, int v, Object object0) {
        if((v & 1) != 0) {
            constraints0 = layoutNode0.E.q();
        }
        return layoutNode0.a1(constraints0);
    }

    @l
    public final List c0() {
        return this.d.b();
    }

    public final void c1() {
        if(this.z == UsageByParent.c) {
            this.L();
        }
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.p0();
        L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
        layoutNodeLayoutDelegate$LookaheadPassDelegate0.h2();
    }

    @Override  // androidx.compose.ui.layout.Remeasurement
    public void d() {
        LayoutNode.C1(this, false, 1, null);
        Constraints constraints0 = this.E.p();
        if(constraints0 == null) {
            Owner owner1 = this.h;
            if(owner1 != null) {
                e.e(owner1, false, 1, null);
            }
        }
        else {
            Owner owner0 = this.h;
            if(owner0 != null) {
                owner0.j(this, constraints0.x());
            }
        }
    }

    public final boolean d0() {
        long v = this.e0().F2();
        return Constraints.n(v) && Constraints.l(v);
    }

    public final void d1() {
        this.E.E();
    }

    @l
    public final NodeCoordinator e0() {
        return this.D.n();
    }

    public final void e1() {
        this.E.F();
    }

    private final NodeCoordinator f0() {
        if(this.I) {
            NodeCoordinator nodeCoordinator0 = this.e0();
            NodeCoordinator nodeCoordinator1 = this.A0().O2();
            this.H = null;
            while(!L.g(nodeCoordinator0, nodeCoordinator1)) {
                if((nodeCoordinator0 == null ? null : nodeCoordinator0.G2()) != null) {
                    this.H = nodeCoordinator0;
                    break;
                }
                nodeCoordinator0 = nodeCoordinator0 == null ? null : nodeCoordinator0.O2();
            }
        }
        NodeCoordinator nodeCoordinator2 = this.H;
        if(nodeCoordinator2 != null && nodeCoordinator2.G2() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return nodeCoordinator2;
    }

    public final void f1() {
        this.E.G();
    }

    public final boolean g0() {
        return this.I;
    }

    public final void g1() {
        this.E.H();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @l
    public Density getDensity() {
        return this.p;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.E.o();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @l
    public LayoutDirection getLayoutDirection() {
        return this.r;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @l
    public ViewConfiguration getViewConfiguration() {
        return this.s;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.E.A();
    }

    @m
    public final AndroidViewHolder h0() {
        return this.i;
    }

    private final void h1() {
        this.t = true;
        if(!this.u()) {
            if(this.t0()) {
                this.B1(true);
            }
            else if(this.o0()) {
                this.x1(true);
            }
        }
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0().N2();
        while(!L.g(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            if(nodeCoordinator0.E2()) {
                nodeCoordinator0.Y2();
            }
            nodeCoordinator0 = nodeCoordinator0.N2();
        }
        MutableVector mutableVector0 = this.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.u != 0x7FFFFFFF) {
                    layoutNode0.h1();
                    this.D1(layoutNode0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void i() {
        AndroidViewHolder androidViewHolder0 = this.i;
        if(androidViewHolder0 != null) {
            androidViewHolder0.i();
        }
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0().N2();
        while(!L.g(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            nodeCoordinator0.k3();
            nodeCoordinator0 = nodeCoordinator0.N2();
        }
    }

    @l
    public final IntrinsicsPolicy i0() {
        return this.o;
    }

    private final void i1() {
        if(this.u()) {
            int v = 0;
            this.t = false;
            MutableVector mutableVector0 = this.I0();
            int v1 = mutableVector0.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector0.F();
                while(true) {
                    ((LayoutNode)arr_object[v]).i1();
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void j() {
        AndroidViewHolder androidViewHolder0 = this.i;
        if(androidViewHolder0 != null) {
            androidViewHolder0.j();
        }
        this.O = true;
        this.E1();
    }

    @l
    public final UsageByParent j0() {
        return this.z;
    }

    public final void j1(int v, int v1, int v2) {
        if(v == v1) {
            return;
        }
        for(int v3 = 0; v3 < v2; ++v3) {
            LayoutNode layoutNode0 = (LayoutNode)this.d.i((v <= v1 ? v : v + v3));
            this.d.a((v <= v1 ? v1 + v2 - 2 : v1 + v3), layoutNode0);
        }
        this.n1();
        this.X0();
        this.T0();
    }

    @l
    public final LayoutNodeLayoutDelegate k0() {
        return this.E;
    }

    private final void k1(LayoutNode layoutNode0) {
        if(layoutNode0.E.m() > 0) {
            this.E.M(this.E.m() - 1);
        }
        if(this.h != null) {
            layoutNode0.O();
        }
        layoutNode0.g = null;
        layoutNode0.A0().u3(null);
        if(layoutNode0.a) {
            --this.c;
            MutableVector mutableVector0 = layoutNode0.d.h();
            int v = mutableVector0.J();
            if(v > 0) {
                Object[] arr_object = mutableVector0.F();
                int v1 = 0;
                while(true) {
                    ((LayoutNode)arr_object[v1]).A0().u3(null);
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }
        this.X0();
        this.n1();
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void l(@l MeasurePolicy measurePolicy0) {
        L.p(measurePolicy0, "value");
        if(!L.g(this.n, measurePolicy0)) {
            this.n = measurePolicy0;
            this.o.m(this.t());
            this.T0();
        }
    }

    public final boolean l0() {
        return this.E.r();
    }

    private final void l1() {
        this.T0();
        LayoutNode layoutNode0 = this.C0();
        if(layoutNode0 != null) {
            layoutNode0.R0();
        }
        this.S0();
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void m(@l Modifier modifier0) {
        L.p(modifier0, "value");
        if(this.a && this.b() != Modifier.m0) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        this.J = modifier0;
        this.D.M(modifier0);
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0().N2();
        while(!L.g(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            nodeCoordinator0.H3(this.q);
            nodeCoordinator0 = nodeCoordinator0.N2();
        }
        this.E.O();
    }

    @l
    public final LayoutState m0() {
        return this.E.s();
    }

    public final void m1() {
        LayoutNode layoutNode0 = this.C0();
        float f = this.e0().P2();
        NodeCoordinator nodeCoordinator0 = this.A0();
        NodeCoordinator nodeCoordinator1 = this.e0();
        while(nodeCoordinator0 != nodeCoordinator1) {
            L.n(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f += ((LayoutModifierNodeCoordinator)nodeCoordinator0).P2();
            nodeCoordinator0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).N2();
        }
        if(f != this.F) {
            this.F = f;
            if(layoutNode0 != null) {
                layoutNode0.n1();
            }
            if(layoutNode0 != null) {
                layoutNode0.R0();
            }
        }
        if(!this.u()) {
            if(layoutNode0 != null) {
                layoutNode0.R0();
            }
            this.h1();
        }
        if(layoutNode0 == null) {
            this.u = 0;
        }
        else if(!this.N && layoutNode0.m0() == LayoutState.c) {
            if(this.u != 0x7FFFFFFF) {
                throw new IllegalStateException("Place was called on a node which was placed already");
            }
            this.u = layoutNode0.w;
            ++layoutNode0.w;
        }
        this.E.l().r0();
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void n(@l Density density0) {
        L.p(density0, "value");
        if(!L.g(this.p, density0)) {
            this.p = density0;
            this.l1();
        }
    }

    public final boolean n0() {
        return this.E.u();
    }

    public final void n1() {
        if(this.a) {
            LayoutNode layoutNode0 = this.C0();
            if(layoutNode0 != null) {
                layoutNode0.n1();
            }
        }
        else {
            this.m = true;
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public boolean o() {
        return this.h != null;
    }

    public final boolean o0() {
        return this.E.v();
    }

    public final void o1(int v, int v1) {
        if(this.z == UsageByParent.c) {
            this.L();
        }
        MeasurePassDelegate layoutNodeLayoutDelegate$MeasurePassDelegate0 = this.s0();
        int v2 = layoutNodeLayoutDelegate$MeasurePassDelegate0.getMeasuredWidth();
        LayoutNode layoutNode0 = this.C0();
        NodeCoordinator nodeCoordinator0 = layoutNode0 == null ? null : layoutNode0.e0();
        LayoutCoordinates layoutCoordinates0 = PlacementScope.e;
        LayoutDirection layoutDirection0 = PlacementScope.a.m();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = PlacementScope.f;
        PlacementScope.d = v2;
        PlacementScope.c = this.getLayoutDirection();
        boolean z = PlacementScope.a.J(nodeCoordinator0);
        PlacementScope.v(PlacementScope.a, layoutNodeLayoutDelegate$MeasurePassDelegate0, v, v1, 0.0f, 4, null);
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.e2(z);
        }
        PlacementScope.d = 0;
        PlacementScope.c = layoutDirection0;
        PlacementScope.e = layoutCoordinates0;
        PlacementScope.f = layoutNodeLayoutDelegate0;
    }

    @Override  // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @m
    public View p() {
        return this.i == null ? null : this.i.getInteropView();
    }

    private final LookaheadPassDelegate p0() {
        return this.E.w();
    }

    private final void p1() {
        if(this.f) {
            int v = 0;
            this.f = false;
            MutableVector mutableVector0 = this.e;
            if(mutableVector0 == null) {
                mutableVector0 = new MutableVector(new LayoutNode[16], 0);
                this.e = mutableVector0;
            }
            mutableVector0.l();
            MutableVector mutableVector1 = this.d.h();
            int v1 = mutableVector1.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.F();
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v];
                    if(layoutNode0.a) {
                        mutableVector0.c(mutableVector0.J(), layoutNode0.I0());
                    }
                    else {
                        mutableVector0.b(layoutNode0);
                    }
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                }
            }
            this.E.D();
        }
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void q(@l ViewConfiguration viewConfiguration0) {
        L.p(viewConfiguration0, "<set-?>");
        this.s = viewConfiguration0;
    }

    @l
    public final LayoutNodeDrawScope q0() {
        return LayoutNodeKt.b(this).getSharedDrawScope();
    }

    public final boolean q1(@m Constraints constraints0) {
        if(constraints0 != null) {
            if(this.z == UsageByParent.c) {
                this.K();
            }
            return this.s0().c2(constraints0.x());
        }
        return false;
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void r() {
        AndroidViewHolder androidViewHolder0 = this.i;
        if(androidViewHolder0 != null) {
            androidViewHolder0.r();
        }
        if(this.O) {
            this.O = false;
            return;
        }
        this.E1();
    }

    @m
    public final LookaheadScope r0() {
        return this.q;
    }

    public static boolean r1(LayoutNode layoutNode0, Constraints constraints0, int v, Object object0) {
        if((v & 1) != 0) {
            constraints0 = layoutNode0.E.p();
        }
        return layoutNode0.q1(constraints0);
    }

    @Override  // androidx.compose.ui.node.Owner$OnLayoutCompletedListener
    public void s() {
        NodeCoordinator nodeCoordinator0 = this.e0();
        Node modifier$Node0 = nodeCoordinator0.M2();
        for(Node modifier$Node1 = nodeCoordinator0.S2(true); modifier$Node1 != null && (modifier$Node1.D() & 0x80) != 0; modifier$Node1 = modifier$Node1.F()) {
            if((modifier$Node1.J() & 0x80) != 0 && modifier$Node1 instanceof LayoutAwareModifierNode) {
                ((LayoutAwareModifierNode)modifier$Node1).o(this.e0());
            }
            if(modifier$Node1 == modifier$Node0) {
                break;
            }
        }
    }

    private final MeasurePassDelegate s0() {
        return this.E.x();
    }

    public final void s1() {
        for(int v = this.d.g() - 1; -1 < v; --v) {
            this.k1(((LayoutNode)this.d.e(v)));
        }
        this.d.c();
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @l
    public MeasurePolicy t() {
        return this.n;
    }

    public final boolean t0() {
        return this.E.y();
    }

    public final void t1(int v, int v1) {
        if(v1 < 0) {
            throw new IllegalArgumentException(("count (" + v1 + ") must be greater than 0").toString());
        }
        int v2 = v1 + v - 1;
        if(v <= v2) {
            while(true) {
                this.k1(((LayoutNode)this.d.i(v2)));
                if(v2 == v) {
                    break;
                }
                --v2;
            }
        }
    }

    @Override
    @l
    public String toString() {
        return JvmActuals_jvmKt.b(this, null) + " children: " + this.a0().size() + " measurePolicy: " + this.t();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public boolean u() {
        return this.t;
    }

    @l
    public final UsageByParent u0() {
        return this.x;
    }

    public final void u1() {
        if(this.z == UsageByParent.c) {
            this.L();
        }
        try {
            this.N = true;
            this.s0().d2();
            this.N = false;
        }
        catch(Throwable throwable0) {
            this.N = false;
            throw throwable0;
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    @l
    public LayoutCoordinates v() {
        return this.e0();
    }

    @l
    public final UsageByParent v0() {
        return this.y;
    }

    public final void v1(boolean z) {
        if(!this.a) {
            Owner owner0 = this.h;
            if(owner0 != null) {
                owner0.p(this, true, z);
            }
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int w() {
        return this.b;
    }

    public final boolean w0() {
        return this.M;
    }

    public static void w1(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        layoutNode0.v1(z);
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    @m
    public LayoutInfo x() {
        return this.C0();
    }

    @l
    public final NodeChain x0() {
        return this.D;
    }

    public final void x1(boolean z) {
        if(this.q == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout");
        }
        Owner owner0 = this.h;
        if(owner0 == null) {
            return;
        }
        if(!this.k && !this.a) {
            owner0.b(this, true, z);
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.p0();
            L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
            layoutNodeLayoutDelegate$LookaheadPassDelegate0.Z1(z);
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    @l
    public List y() {
        return this.D.p();
    }

    @m
    public final Function1 y0() {
        return this.K;
    }

    public static void y1(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        layoutNode0.x1(z);
    }

    @m
    public final Function1 z0() {
        return this.L;
    }

    public final void z1(boolean z) {
        if(!this.a) {
            Owner owner0 = this.h;
            if(owner0 != null) {
                e.g(owner0, this, false, z, 2, null);
            }
        }
    }
}

