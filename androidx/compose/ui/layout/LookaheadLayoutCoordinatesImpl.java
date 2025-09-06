package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,120:1\n179#2:121\n157#2:124\n179#2:126\n157#2:129\n86#3:122\n79#3:123\n86#3:125\n86#3:127\n79#3:128\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n*L\n63#1:121\n64#1:124\n69#1:126\n75#1:129\n63#1:122\n63#1:123\n68#1:125\n71#1:127\n68#1:128\n*E\n"})
public final class LookaheadLayoutCoordinatesImpl implements LookaheadLayoutCoordinates {
    @l
    private final LookaheadDelegate a;

    public LookaheadLayoutCoordinatesImpl(@l LookaheadDelegate lookaheadDelegate0) {
        L.p(lookaheadDelegate0, "lookaheadDelegate");
        super();
        this.a = lookaheadDelegate0;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long B(long v) {
        return this.b().B(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Rect E(@l LayoutCoordinates layoutCoordinates0, boolean z) {
        L.p(layoutCoordinates0, "sourceCoordinates");
        return this.b().E(layoutCoordinates0, z);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public LayoutCoordinates K() {
        return this.b().K();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long L(long v) {
        return this.b().L(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long P(@l LayoutCoordinates layoutCoordinates0, long v) {
        L.p(layoutCoordinates0, "sourceCoordinates");
        return this.b().P(layoutCoordinates0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public LayoutCoordinates U() {
        return this.b().U();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long X(long v) {
        return this.b().X(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long a() {
        return this.b().a();
    }

    @l
    public final NodeCoordinator b() {
        return this.a.k2();
    }

    @l
    public final LookaheadDelegate c() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public void c0(@l LayoutCoordinates layoutCoordinates0, @l float[] arr_f) {
        L.p(layoutCoordinates0, "sourceCoordinates");
        L.p(arr_f, "matrix");
        this.b().c0(layoutCoordinates0, arr_f);
    }

    @Override  // androidx.compose.ui.layout.LookaheadLayoutCoordinates
    public long g0(@l LookaheadLayoutCoordinates lookaheadLayoutCoordinates0, long v) {
        L.p(lookaheadLayoutCoordinates0, "sourceCoordinates");
        LookaheadDelegate lookaheadDelegate0 = ((LookaheadLayoutCoordinatesImpl)lookaheadLayoutCoordinates0).a;
        LookaheadDelegate lookaheadDelegate1 = this.b().B2(lookaheadDelegate0.k2()).I2();
        if(lookaheadDelegate1 != null) {
            long v1 = lookaheadDelegate0.p2(lookaheadDelegate1);
            long v2 = IntOffsetKt.a(b.L0(Offset.p(v)), b.L0(Offset.r(v)));
            long v3 = IntOffsetKt.a(((int)(v1 >> 0x20)) + ((int)(v2 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) + ((int)(v2 & 0xFFFFFFFFL)));
            long v4 = this.a.p2(lookaheadDelegate1);
            long v5 = IntOffsetKt.a(((int)(v3 >> 0x20)) - ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) - ((int)(v4 & 0xFFFFFFFFL)));
            return OffsetKt.a(((int)(v5 >> 0x20)), ((int)(v5 & 0xFFFFFFFFL)));
        }
        LookaheadDelegate lookaheadDelegate2 = LookaheadLayoutCoordinatesKt.b(lookaheadDelegate0);
        long v6 = lookaheadDelegate0.p2(lookaheadDelegate2);
        long v7 = lookaheadDelegate2.Z1();
        long v8 = IntOffsetKt.a(((int)(v6 >> 0x20)) + ((int)(v7 >> 0x20)), ((int)(v6 & 0xFFFFFFFFL)) + ((int)(v7 & 0xFFFFFFFFL)));
        long v9 = IntOffsetKt.a(b.L0(Offset.p(v)), b.L0(Offset.r(v)));
        long v10 = IntOffsetKt.a(((int)(v8 >> 0x20)) + ((int)(v9 >> 0x20)), ((int)(v8 & 0xFFFFFFFFL)) + ((int)(v9 & 0xFFFFFFFFL)));
        LookaheadDelegate lookaheadDelegate3 = LookaheadLayoutCoordinatesKt.b(this.a);
        long v11 = this.a.p2(lookaheadDelegate3);
        long v12 = LookaheadLayoutCoordinatesKt.b(this.a).Z1();
        long v13 = IntOffsetKt.a(((int)(v11 >> 0x20)) + ((int)(v12 >> 0x20)), ((int)(v11 & 0xFFFFFFFFL)) + ((int)(v12 & 0xFFFFFFFFL)));
        long v14 = IntOffsetKt.a(((int)(v10 >> 0x20)) - ((int)(v13 >> 0x20)), ((int)(v10 & 0xFFFFFFFFL)) - ((int)(v13 & 0xFFFFFFFFL)));
        NodeCoordinator nodeCoordinator0 = LookaheadLayoutCoordinatesKt.b(this.a).k2().O2();
        L.m(nodeCoordinator0);
        NodeCoordinator nodeCoordinator1 = lookaheadDelegate2.k2().O2();
        L.m(nodeCoordinator1);
        return nodeCoordinator0.P(nodeCoordinator1, OffsetKt.a(((int)(v14 >> 0x20)), ((int)(v14 & 0xFFFFFFFFL))));
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public boolean o() {
        return this.b().o();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Set t1() {
        return this.b().t1();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public int v(@l AlignmentLine alignmentLine0) {
        L.p(alignmentLine0, "alignmentLine");
        return this.b().v(alignmentLine0);
    }
}

