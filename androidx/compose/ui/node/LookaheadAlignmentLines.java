package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,246:1\n157#2:247\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n245#1:247\n*E\n"})
public final class LookaheadAlignmentLines extends AlignmentLines {
    public LookaheadAlignmentLines(@l AlignmentLinesOwner alignmentLinesOwner0) {
        L.p(alignmentLinesOwner0, "alignmentLinesOwner");
        super(alignmentLinesOwner0, null);
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    protected long d(@l NodeCoordinator nodeCoordinator0, long v) {
        L.p(nodeCoordinator0, "$this$calculatePositionInParent");
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
        L.m(lookaheadDelegate0);
        long v1 = lookaheadDelegate0.Z1();
        return Offset.v(OffsetKt.a(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL))), v);
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    @l
    protected Map e(@l NodeCoordinator nodeCoordinator0) {
        L.p(nodeCoordinator0, "<this>");
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
        L.m(lookaheadDelegate0);
        return lookaheadDelegate0.X1().k();
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    protected int i(@l NodeCoordinator nodeCoordinator0, @l AlignmentLine alignmentLine0) {
        L.p(nodeCoordinator0, "<this>");
        L.p(alignmentLine0, "alignmentLine");
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
        L.m(lookaheadDelegate0);
        return lookaheadDelegate0.v(alignmentLine0);
    }
}

