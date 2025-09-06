package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;

public final class LayoutModifierNodeCoordinatorKt {
    private static final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable0, AlignmentLine alignmentLine0) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable1 = lookaheadCapablePlaceable0.U1();
        if(lookaheadCapablePlaceable1 == null) {
            throw new IllegalStateException(("Child of " + lookaheadCapablePlaceable0 + " cannot be null when calculating alignment line").toString());
        }
        if(lookaheadCapablePlaceable0.X1().k().containsKey(alignmentLine0)) {
            Integer integer0 = (Integer)lookaheadCapablePlaceable0.X1().k().get(alignmentLine0);
            return integer0 == null ? 0x80000000 : ((int)integer0);
        }
        int v = lookaheadCapablePlaceable1.v(alignmentLine0);
        if(v == 0x80000000) {
            return 0x80000000;
        }
        lookaheadCapablePlaceable1.f2(true);
        lookaheadCapablePlaceable0.e2(true);
        lookaheadCapablePlaceable0.d2();
        lookaheadCapablePlaceable1.f2(false);
        lookaheadCapablePlaceable0.e2(false);
        return alignmentLine0 instanceof HorizontalAlignmentLine ? v + IntOffset.o(lookaheadCapablePlaceable1.Z1()) : v + IntOffset.m(lookaheadCapablePlaceable1.Z1());
    }
}

