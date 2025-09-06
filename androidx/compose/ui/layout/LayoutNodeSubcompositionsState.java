package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode.LayoutState;
import androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy;
import androidx.compose.ui.node.LayoutNode.UsageByParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,774:1\n707#1:796\n707#1:810\n707#1:826\n707#1:831\n361#2,7:775\n361#2,7:782\n361#2,7:817\n480#3,4:789\n485#3:802\n480#3,4:803\n485#3:816\n122#4,3:793\n126#4:801\n122#4,3:807\n126#4:815\n1113#5,4:797\n1113#5,4:811\n1113#5,4:827\n1113#5,4:832\n1113#5,4:836\n1113#5,2:840\n1115#5,2:844\n215#6,2:824\n1855#7,2:842\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n437#1:796\n502#1:810\n695#1:826\n701#1:831\n398#1:775,7\n424#1:782,7\n630#1:817,7\n436#1:789,4\n436#1:802\n489#1:803,4\n489#1:816\n436#1:793,3\n436#1:801\n489#1:807,3\n489#1:815\n437#1:797,4\n502#1:811,4\n695#1:827,4\n701#1:832,4\n707#1:836,4\n710#1:840,2\n710#1:844,2\n686#1:824,2\n711#1:842,2\n*E\n"})
public final class LayoutNodeSubcompositionsState {
    @s0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,774:1\n76#2:775\n102#2,2:776\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n*L\n730#1:775\n730#1:776,2\n*E\n"})
    static final class NodeState {
        @m
        private Object a;
        @l
        private o b;
        @m
        private Composition c;
        private boolean d;
        @l
        private final MutableState e;

        public NodeState(@m Object object0, @l o o0, @m Composition composition0) {
            L.p(o0, "content");
            super();
            this.a = object0;
            this.b = o0;
            this.c = composition0;
            this.e = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
        }

        public NodeState(Object object0, o o0, Composition composition0, int v, w w0) {
            if((v & 4) != 0) {
                composition0 = null;
            }
            this(object0, o0, composition0);
        }

        public final boolean a() {
            return ((Boolean)this.e.getValue()).booleanValue();
        }

        @m
        public final Composition b() {
            return this.c;
        }

        @l
        public final o c() {
            return this.b;
        }

        public final boolean d() {
            return this.d;
        }

        @m
        public final Object e() {
            return this.a;
        }

        public final void f(boolean z) {
            this.e.setValue(Boolean.valueOf(z));
        }

        public final void g(@m Composition composition0) {
            this.c = composition0;
        }

        public final void h(@l o o0) {
            L.p(o0, "<set-?>");
            this.b = o0;
        }

        public final void i(boolean z) {
            this.d = z;
        }

        public final void j(@m Object object0) {
            this.a = object0;
        }
    }

    final class Scope implements SubcomposeMeasureScope {
        @l
        private LayoutDirection a;
        private float b;
        private float c;
        final LayoutNodeSubcompositionsState d;

        public Scope() {
            this.a = LayoutDirection.b;
        }

        @Override  // androidx.compose.ui.unit.Density
        public float C(int v) {
            return a.e(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float D(float f) {
            return a.d(this, f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public int E1(long v) {
            return a.a(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public Rect H0(DpRect dpRect0) {
            return a.i(this, dpRect0);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long J(long v) {
            return a.j(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long M(float f) {
            return a.k(this, f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public int b1(float f) {
            return a.b(this, f);
        }

        public void c(float f) {
            this.b = f;
        }

        @Override  // androidx.compose.ui.layout.SubcomposeMeasureScope
        @l
        public List d0(@m Object object0, @l o o0) {
            L.p(o0, "content");
            return LayoutNodeSubcompositionsState.this.z(object0, o0);
        }

        public void e(float f) {
            this.c = f;
        }

        public void f(@l LayoutDirection layoutDirection0) {
            L.p(layoutDirection0, "<set-?>");
            this.a = layoutDirection0;
        }

        @Override  // androidx.compose.ui.unit.Density
        public float g1(long v) {
            return a.g(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.b;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
        @l
        public LayoutDirection getLayoutDirection() {
            return this.a;
        }

        @Override  // androidx.compose.ui.unit.Density
        public long m(long v) {
            return a.f(this, v);
        }

        @Override  // androidx.compose.ui.layout.MeasureScope
        public MeasureResult o1(int v, int v1, Map map0, Function1 function10) {
            return MeasureScope.-CC.a(this, v, v1, map0, function10);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float p(long v) {
            return a.c(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long r(int v) {
            return a.m(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long s(float f) {
            return a.l(this, f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float w1() {
            return this.c;
        }

        @Override  // androidx.compose.ui.unit.Density
        public float y1(float f) {
            return a.h(this, f);
        }
    }

    @l
    private final LayoutNode a;
    @m
    private CompositionContext b;
    @l
    private SubcomposeSlotReusePolicy c;
    private int d;
    @l
    private final Map e;
    @l
    private final Map f;
    @l
    private final Scope g;
    @l
    private final Map h;
    @l
    private final SlotIdsSet i;
    private int j;
    private int k;
    @l
    private final String l;

    public LayoutNodeSubcompositionsState(@l LayoutNode layoutNode0, @l SubcomposeSlotReusePolicy subcomposeSlotReusePolicy0) {
        L.p(layoutNode0, "root");
        L.p(subcomposeSlotReusePolicy0, "slotReusePolicy");
        super();
        this.a = layoutNode0;
        this.c = subcomposeSlotReusePolicy0;
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Scope(this);
        this.h = new LinkedHashMap();
        this.i = new SlotIdsSet(null, 1, null);
        this.l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final void A(LayoutNode layoutNode0, NodeState layoutNodeSubcompositionsState$NodeState0) {
        Snapshot snapshot0 = Snapshot.e.a();
        try {
            Snapshot snapshot1 = snapshot0.p();
            try {
                LayoutNode layoutNode1 = this.a;
                layoutNode1.k = true;
                o o0 = layoutNodeSubcompositionsState$NodeState0.c();
                Composition composition0 = layoutNodeSubcompositionsState$NodeState0.b();
                CompositionContext compositionContext0 = this.b;
                if(compositionContext0 == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                layoutNodeSubcompositionsState$NodeState0.g(this.C(composition0, layoutNode0, compositionContext0, ComposableLambdaKt.c(-34810602, true, new o(o0) {
                    final NodeState e;
                    final o f;

                    {
                        this.e = layoutNodeSubcompositionsState$NodeState0;
                        this.f = o0;
                        super(2);
                    }

                    @Composable
                    public final void a(@m Composer composer0, int v) {
                        if((v & 11) == 2 && composer0.c()) {
                            composer0.m();
                            return;
                        }
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(-34810602, v, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:445)");
                        }
                        boolean z = this.e.a();
                        o o0 = this.f;
                        composer0.i(0xCF, Boolean.valueOf(z));
                        boolean z1 = composer0.v(z);
                        if(z) {
                            o0.invoke(composer0, 0);
                        }
                        else {
                            composer0.b(z1);
                        }
                        composer0.U();
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        this.a(((Composer)object0), ((Number)object1).intValue());
                        return S0.a;
                    }
                })));
                layoutNode1.k = false;
            }
            catch(Throwable throwable0) {
                snapshot0.w(snapshot1);
                throw throwable0;
            }
            snapshot0.w(snapshot1);
        }
        finally {
            snapshot0.d();
        }
    }

    private final void B(LayoutNode layoutNode0, Object object0, o o0) {
        Map map0 = this.e;
        NodeState layoutNodeSubcompositionsState$NodeState0 = map0.get(layoutNode0);
        if(layoutNodeSubcompositionsState$NodeState0 == null) {
            layoutNodeSubcompositionsState$NodeState0 = new NodeState(object0, ComposableSingletons.SubcomposeLayoutKt.a.a(), null, 4, null);
            map0.put(layoutNode0, layoutNodeSubcompositionsState$NodeState0);
        }
        Composition composition0 = layoutNodeSubcompositionsState$NodeState0.b();
        if(layoutNodeSubcompositionsState$NodeState0.c() != o0 || (composition0 == null ? true : composition0.c()) || layoutNodeSubcompositionsState$NodeState0.d()) {
            layoutNodeSubcompositionsState$NodeState0.h(o0);
            this.A(layoutNode0, layoutNodeSubcompositionsState$NodeState0);
            layoutNodeSubcompositionsState$NodeState0.i(false);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final Composition C(Composition composition0, LayoutNode layoutNode0, CompositionContext compositionContext0, o o0) {
        if(composition0 == null || composition0.a()) {
            composition0 = Wrapper_androidKt.a(layoutNode0, compositionContext0);
        }
        composition0.b(o0);
        return composition0;
    }

    private final LayoutNode D(Object object0) {
        int v4;
        LayoutNode layoutNode0 = null;
        if(this.j == 0) {
            return null;
        }
        int v = this.a.c0().size() - this.k;
        int v1 = v - this.j;
        int v2 = v - 1;
        int v3;
        for(v3 = v2; true; --v3) {
            v4 = -1;
            if(v3 < v1) {
                break;
            }
            if(L.g(this.q(v3), object0)) {
                v4 = v3;
                break;
            }
        }
        if(v4 == -1) {
            while(true) {
                if(v2 < v1) {
                    v3 = v2;
                    break;
                }
                LayoutNode layoutNode1 = (LayoutNode)this.a.c0().get(v2);
                Object object1 = this.e.get(layoutNode1);
                L.m(object1);
                NodeState layoutNodeSubcompositionsState$NodeState0 = (NodeState)object1;
                if(this.c.b(object0, layoutNodeSubcompositionsState$NodeState0.e())) {
                    layoutNodeSubcompositionsState$NodeState0.j(object0);
                    v3 = v2;
                    v4 = v3;
                    break;
                }
                --v2;
            }
        }
        if(v4 != -1) {
            if(v3 != v1) {
                this.u(v3, v1, 1);
            }
            --this.j;
            layoutNode0 = (LayoutNode)this.a.c0().get(v1);
            Object object2 = this.e.get(layoutNode0);
            L.m(object2);
            ((NodeState)object2).f(true);
            ((NodeState)object2).i(true);
            Snapshot.e.l();
        }
        return layoutNode0;
    }

    @l
    public final MeasurePolicy k(@l o o0) {
        L.p(o0, "block");
        return new NoIntrinsicsMeasurePolicy(/*ERROR_MISSING_ARG_2/*) {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$measure");
                L.p(list0, "measurables");
                o0.g.f(measureScope0.getLayoutDirection());
                o0.g.c(measureScope0.getDensity());
                o0.g.e(measureScope0.w1());
                o0.d = 0;
                Constraints constraints0 = Constraints.b(v);
                return new MeasureResult() {
                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return this.b.getHeight();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return this.b.getWidth();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    @l
                    public Map k() {
                        return this.b.k();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public void l() {
                        this.b.d.d = this.c;
                        this.b.l();
                        this.b.d.n(this.b.d.d);
                    }
                };
            }
        };
    }

    private final LayoutNode l(int v) {
        LayoutNode layoutNode0 = new LayoutNode(true, 0, 2, null);
        this.a.k = true;
        this.a.O0(v, layoutNode0);
        this.a.k = false;
        return layoutNode0;
    }

    public final void m() {
        LayoutNode layoutNode0 = this.a;
        layoutNode0.k = true;
        for(Object object0: this.e.values()) {
            Composition composition0 = ((NodeState)object0).b();
            if(composition0 != null) {
                composition0.dispose();
            }
        }
        this.a.s1();
        layoutNode0.k = false;
        this.e.clear();
        this.f.clear();
        this.k = 0;
        this.j = 0;
        this.h.clear();
        this.t();
    }

    public final void n(int v) {
        int v5;
        int v1 = 0;
        this.j = 0;
        int v2 = this.a.c0().size() - this.k - 1;
        if(v <= v2) {
            this.i.clear();
            if(v <= v2) {
                for(int v3 = v; true; ++v3) {
                    Object object0 = this.q(v3);
                    this.i.a(object0);
                    if(v3 == v2) {
                        break;
                    }
                }
            }
            this.c.a(this.i);
            Snapshot snapshot0 = Snapshot.e.a();
            try {
                Snapshot snapshot1 = snapshot0.p();
                v5 = 0;
                try {
                    while(v2 >= v) {
                        LayoutNode layoutNode0 = (LayoutNode)this.a.c0().get(v2);
                        Object object1 = this.e.get(layoutNode0);
                        L.m(object1);
                        NodeState layoutNodeSubcompositionsState$NodeState0 = (NodeState)object1;
                        Object object2 = layoutNodeSubcompositionsState$NodeState0.e();
                        if(this.i.contains(object2)) {
                            layoutNode0.N1(UsageByParent.c);
                            ++this.j;
                            if(layoutNodeSubcompositionsState$NodeState0.a()) {
                                layoutNodeSubcompositionsState$NodeState0.f(false);
                                v5 = 1;
                            }
                        }
                        else {
                            LayoutNode layoutNode1 = this.a;
                            layoutNode1.k = true;
                            this.e.remove(layoutNode0);
                            Composition composition0 = layoutNodeSubcompositionsState$NodeState0.b();
                            if(composition0 != null) {
                                composition0.dispose();
                            }
                            this.a.t1(v2, 1);
                            layoutNode1.k = false;
                        }
                        this.f.remove(object2);
                        --v2;
                    }
                }
                finally {
                    snapshot0.w(snapshot1);
                }
            }
            finally {
                snapshot0.d();
            }
            v1 = v5;
        }
        if(v1 != 0) {
            Snapshot.e.l();
        }
        this.t();
    }

    public final void o() {
        for(Object object0: this.e.entrySet()) {
            ((NodeState)((Map.Entry)object0).getValue()).i(true);
        }
        if(!this.a.t0()) {
            LayoutNode.C1(this.a, false, 1, null);
        }
    }

    @m
    public final CompositionContext p() {
        return this.b;
    }

    private final Object q(int v) {
        LayoutNode layoutNode0 = (LayoutNode)this.a.c0().get(v);
        Object object0 = this.e.get(layoutNode0);
        L.m(object0);
        return ((NodeState)object0).e();
    }

    @l
    public final SubcomposeSlotReusePolicy r() {
        return this.c;
    }

    private final void s(A3.a a0) {
        this.a.k = true;
        a0.invoke();
        this.a.k = false;
    }

    public final void t() {
        int v = this.a.c0().size();
        if(this.e.size() != v) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.e.size() + ") and the children count on the SubcomposeLayout (" + this.a.c0().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if(this.a.c0().size() - this.j - this.k < 0) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.a.c0().size() + ". Reusable children " + this.j + ". Precomposed children " + this.k).toString());
        }
        if(this.h.size() != this.k) {
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.k + ". Map size " + this.h.size()).toString());
        }
    }

    private final void u(int v, int v1, int v2) {
        this.a.k = true;
        this.a.j1(v, v1, v2);
        this.a.k = false;
    }

    static void v(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v2 = 1;
        }
        layoutNodeSubcompositionsState0.u(v, v1, v2);
    }

    @l
    public final PrecomposedSlotHandle w(@m Object object0, @l o o0) {
        L.p(o0, "content");
        this.t();
        if(!this.f.containsKey(object0)) {
            Map map0 = this.h;
            LayoutNode layoutNode0 = map0.get(object0);
            if(layoutNode0 == null) {
                layoutNode0 = this.D(object0);
                if(layoutNode0 == null) {
                    layoutNode0 = this.l(this.a.c0().size());
                }
                else {
                    this.u(this.a.c0().indexOf(layoutNode0), this.a.c0().size(), 1);
                }
                ++this.k;
                map0.put(object0, layoutNode0);
            }
            this.B(layoutNode0, object0, o0);
        }
        return new PrecomposedSlotHandle() {
            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public int a() {
                LayoutNode layoutNode0 = (LayoutNode)object0.h.get(this.b);
                if(layoutNode0 != null) {
                    List list0 = layoutNode0.a0();
                    return list0 == null ? 0 : list0.size();
                }
                return 0;
            }

            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public void b(int v, long v1) {
                LayoutNode layoutNode0 = (LayoutNode)object0.h.get(this.b);
                if(layoutNode0 != null && layoutNode0.o()) {
                    int v2 = layoutNode0.a0().size();
                    if(v < 0 || v >= v2) {
                        throw new IndexOutOfBoundsException("Index (" + v + ") is out of bound of [0, " + v2 + ')');
                    }
                    if(layoutNode0.u()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    LayoutNode layoutNode1 = object0.a;
                    layoutNode1.k = true;
                    LayoutNodeKt.b(layoutNode0).j(((LayoutNode)layoutNode0.a0().get(v)), v1);
                    layoutNode1.k = false;
                }
            }

            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public void dispose() {
                object0.t();
                LayoutNode layoutNode0 = (LayoutNode)object0.h.remove(this.b);
                if(layoutNode0 != null) {
                    if(object0.k <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    int v = object0.a.c0().indexOf(layoutNode0);
                    if(v < object0.a.c0().size() - object0.k) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ++object0.j;
                    --object0.k;
                    int v1 = object0.a.c0().size() - object0.k - object0.j;
                    object0.u(v, v1, 1);
                    object0.n(v1);
                }
            }
        };
    }

    public final void x(@m CompositionContext compositionContext0) {
        this.b = compositionContext0;
    }

    public final void y(@l SubcomposeSlotReusePolicy subcomposeSlotReusePolicy0) {
        L.p(subcomposeSlotReusePolicy0, "value");
        if(this.c != subcomposeSlotReusePolicy0) {
            this.c = subcomposeSlotReusePolicy0;
            this.n(0);
        }
    }

    @l
    public final List z(@m Object object0, @l o o0) {
        L.p(o0, "content");
        this.t();
        LayoutState layoutNode$LayoutState0 = this.a.m0();
        if(layoutNode$LayoutState0 != LayoutState.a && layoutNode$LayoutState0 != LayoutState.c) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        Map map0 = this.f;
        LayoutNode layoutNode0 = map0.get(object0);
        if(layoutNode0 == null) {
            layoutNode0 = (LayoutNode)this.h.remove(object0);
            if(layoutNode0 == null) {
                layoutNode0 = this.D(object0);
                if(layoutNode0 == null) {
                    layoutNode0 = this.l(this.d);
                }
            }
            else {
                int v = this.k;
                if(v <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.k = v - 1;
            }
            map0.put(object0, layoutNode0);
        }
        int v1 = this.a.c0().indexOf(layoutNode0);
        int v2 = this.d;
        if(v1 < v2) {
            throw new IllegalArgumentException(("Key \"" + object0 + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
        }
        if(v2 != v1) {
            LayoutNodeSubcompositionsState.v(this, v1, v2, 0, 4, null);
        }
        ++this.d;
        this.B(layoutNode0, object0, o0);
        return layoutNode0.Z();
    }
}

