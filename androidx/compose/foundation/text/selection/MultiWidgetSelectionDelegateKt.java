package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class MultiWidgetSelectionDelegateKt {
    private static final Selection b(long v, boolean z, long v1, TextLayoutResult textLayoutResult0) {
        return new Selection(new AnchorInfo(textLayoutResult0.c(((int)(v >> 0x20))), ((int)(v >> 0x20)), v1), new AnchorInfo(textLayoutResult0.c(Math.max(((int)(v & 0xFFFFFFFFL)) - 1, 0)), ((int)(v & 0xFFFFFFFFL)), v1), z);
    }

    public static final int c(@l TextLayoutResult textLayoutResult0, @l Rect rect0, long v) {
        L.p(textLayoutResult0, "textLayoutResult");
        L.p(rect0, "bounds");
        int v1 = textLayoutResult0.l().n().length();
        if(rect0.f(v)) {
            return s.I(textLayoutResult0.x(v), 0, v1);
        }
        return SelectionMode.a.b(v, rect0) >= 0 ? v1 : 0;
    }

    @l
    public static final V d(@l TextLayoutResult textLayoutResult0, long v, long v1, @m Offset offset0, long v2, @l SelectionAdjustment selectionAdjustment0, @m Selection selection0, boolean z) {
        L.p(textLayoutResult0, "textLayoutResult");
        L.p(selectionAdjustment0, "adjustment");
        Rect rect0 = new Rect(0.0f, 0.0f, ((float)IntSize.m(textLayoutResult0.B())), ((float)IntSize.j(textLayoutResult0.B())));
        if(!SelectionMode.a.c(rect0, v, v1)) {
            return new V(null, Boolean.FALSE);
        }
        int v3 = MultiWidgetSelectionDelegateKt.c(textLayoutResult0, rect0, v);
        int v4 = MultiWidgetSelectionDelegateKt.c(textLayoutResult0, rect0, v1);
        int v5 = offset0 == null ? -1 : MultiWidgetSelectionDelegateKt.c(textLayoutResult0, rect0, offset0.A());
        long v6 = selectionAdjustment0.a(textLayoutResult0, TextRangeKt.b(v3, v4), v5, z, (selection0 == null ? null : TextRange.b(selection0.j())));
        Selection selection1 = MultiWidgetSelectionDelegateKt.b(v6, TextRange.m(v6), v2, textLayoutResult0);
        boolean z1 = L.g(selection1, selection0);
        if(z) {
            if(v3 == v5) {
                return z1 ? new V(selection1, Boolean.FALSE) : new V(selection1, Boolean.TRUE);
            }
            return new V(selection1, Boolean.TRUE);
        }
        if(v4 == v5) {
            return z1 ? new V(selection1, Boolean.FALSE) : new V(selection1, Boolean.TRUE);
        }
        return new V(selection1, Boolean.TRUE);
    }

    public static V e(TextLayoutResult textLayoutResult0, long v, long v1, Offset offset0, long v2, SelectionAdjustment selectionAdjustment0, Selection selection0, boolean z, int v3, Object object0) {
        Selection selection1 = (v3 & 0x40) == 0 ? selection0 : null;
        return (v3 & 0x80) == 0 ? MultiWidgetSelectionDelegateKt.d(textLayoutResult0, v, v1, offset0, v2, selectionAdjustment0, selection1, z) : MultiWidgetSelectionDelegateKt.d(textLayoutResult0, v, v1, offset0, v2, selectionAdjustment0, selection1, true);
    }
}

