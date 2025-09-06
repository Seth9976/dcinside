package androidx.compose.ui.node;

import A3.a;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n1#2:208\n360#3,15:209\n86#4:224\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n160#1:209,15\n201#1:224\n*E\n"})
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    @l
    private final NodeCoordinator h;
    @l
    private final LookaheadScope i;
    private long j;
    @m
    private Map k;
    @l
    private final LookaheadLayoutCoordinatesImpl l;
    @m
    private MeasureResult m;
    @l
    private final Map n;

    public LookaheadDelegate(@l NodeCoordinator nodeCoordinator0, @l LookaheadScope lookaheadScope0) {
        L.p(nodeCoordinator0, "coordinator");
        L.p(lookaheadScope0, "lookaheadScope");
        super();
        this.h = nodeCoordinator0;
        this.i = lookaheadScope0;
        this.j = 0L;
        this.l = new LookaheadLayoutCoordinatesImpl(this);
        this.n = new LinkedHashMap();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int D0(int v) {
        NodeCoordinator nodeCoordinator0 = this.h.N2();
        L.m(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
        L.m(lookaheadDelegate0);
        return lookaheadDelegate0.D0(v);
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LayoutNode M0() {
        return this.h.M0();
    }

    @Override  // androidx.compose.ui.layout.Placeable
    protected final void O1(long v, float f, @m Function1 function10) {
        if(!IntOffset.j(this.Z1(), v)) {
            this.q2(v);
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.M0().k0().w();
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.c2();
            }
            this.a2(this.h);
        }
        if(this.c2()) {
            return;
        }
        this.o2();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int S0(int v) {
        NodeCoordinator nodeCoordinator0 = this.h.N2();
        L.m(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
        L.m(lookaheadDelegate0);
        return lookaheadDelegate0.S0(v);
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public AlignmentLinesOwner T1() {
        AlignmentLinesOwner alignmentLinesOwner0 = this.h.M0().k0().t();
        L.m(alignmentLinesOwner0);
        return alignmentLinesOwner0;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable U1() {
        NodeCoordinator nodeCoordinator0 = this.h.N2();
        return nodeCoordinator0 != null ? nodeCoordinator0.I2() : null;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LayoutCoordinates V1() {
        return this.l;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean W1() {
        return this.m != null;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public MeasureResult X1() {
        MeasureResult measureResult0 = this.m;
        if(measureResult0 == null) {
            throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
        }
        return measureResult0;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable Y1() {
        NodeCoordinator nodeCoordinator0 = this.h.O2();
        return nodeCoordinator0 != null ? nodeCoordinator0.I2() : null;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public long Z1() {
        return this.j;
    }

    @Override  // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.IntrinsicMeasurable
    @m
    public Object c() {
        return this.h.c();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void d2() {
        this.O1(this.Z1(), 0.0f, null);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int v) {
        NodeCoordinator nodeCoordinator0 = this.h.N2();
        L.m(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
        L.m(lookaheadDelegate0);
        return lookaheadDelegate0.g(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.h.getDensity();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.h.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int h1(int v) {
        NodeCoordinator nodeCoordinator0 = this.h.N2();
        L.m(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
        L.m(lookaheadDelegate0);
        return lookaheadDelegate0.h1(v);
    }

    public final int i2(@l AlignmentLine alignmentLine0) {
        L.p(alignmentLine0, "alignmentLine");
        Integer integer0 = (Integer)this.n.get(alignmentLine0);
        return integer0 == null ? 0x80000000 : ((int)integer0);
    }

    @l
    protected final Map j2() {
        return this.n;
    }

    @l
    public final NodeCoordinator k2() {
        return this.h;
    }

    @l
    public final LookaheadLayoutCoordinatesImpl l2() {
        return this.l;
    }

    @l
    public final LookaheadScope m2() {
        return this.i;
    }

    @l
    public final Placeable n2(long v, @l a a0) {
        L.p(a0, "block");
        this.R1(v);
        this.r2(((MeasureResult)a0.invoke()));
        return this;
    }

    protected void o2() {
        int v = this.X1().getWidth();
        LayoutDirection layoutDirection0 = this.h.getLayoutDirection();
        LayoutDirection layoutDirection1 = PlacementScope.a.m();
        PlacementScope.d = v;
        PlacementScope.c = layoutDirection0;
        boolean z = PlacementScope.a.J(this);
        this.X1().l();
        this.e2(z);
        PlacementScope.d = 0;
        PlacementScope.c = layoutDirection1;
        PlacementScope.e = PlacementScope.e;
        PlacementScope.f = PlacementScope.f;
    }

    public final long p2(@l LookaheadDelegate lookaheadDelegate0) {
        L.p(lookaheadDelegate0, "ancestor");
        long v = 0L;
        LookaheadDelegate lookaheadDelegate1 = this;
        while(!L.g(lookaheadDelegate1, lookaheadDelegate0)) {
            long v1 = lookaheadDelegate1.Z1();
            v = IntOffsetKt.a(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL)));
            NodeCoordinator nodeCoordinator0 = lookaheadDelegate1.h.O2();
            L.m(nodeCoordinator0);
            lookaheadDelegate1 = nodeCoordinator0.I2();
            L.m(lookaheadDelegate1);
        }
        return v;
    }

    public void q2(long v) {
        this.j = v;
    }

    private final void r2(MeasureResult measureResult0) {
        S0 s00;
        if(measureResult0 == null) {
            s00 = null;
        }
        else {
            this.Q1(IntSizeKt.a(measureResult0.getWidth(), measureResult0.getHeight()));
            s00 = S0.a;
        }
        if(s00 == null) {
            this.Q1(0L);
        }
        if(!L.g(this.m, measureResult0) && measureResult0 != null && ((this.k != null && !this.k.isEmpty() || !measureResult0.k().isEmpty()) && !L.g(measureResult0.k(), this.k))) {
            this.T1().k().q();
            Map map0 = this.k;
            if(map0 == null) {
                map0 = new LinkedHashMap();
                this.k = map0;
            }
            map0.clear();
            map0.putAll(measureResult0.k());
        }
        this.m = measureResult0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.h.w1();
    }
}

