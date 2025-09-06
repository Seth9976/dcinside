package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;

public final class LayoutNodeAlignmentLines extends AlignmentLines {
    public LayoutNodeAlignmentLines(@l AlignmentLinesOwner alignmentLinesOwner0) {
        L.p(alignmentLinesOwner0, "alignmentLinesOwner");
        super(alignmentLinesOwner0, null);
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    protected long d(@l NodeCoordinator nodeCoordinator0, long v) {
        L.p(nodeCoordinator0, "$this$calculatePositionInParent");
        return nodeCoordinator0.z3(v);
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    @l
    protected Map e(@l NodeCoordinator nodeCoordinator0) {
        L.p(nodeCoordinator0, "<this>");
        return nodeCoordinator0.X1().k();
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    protected int i(@l NodeCoordinator nodeCoordinator0, @l AlignmentLine alignmentLine0) {
        L.p(nodeCoordinator0, "<this>");
        L.p(alignmentLine0, "alignmentLine");
        return nodeCoordinator0.v(alignmentLine0);
    }
}

