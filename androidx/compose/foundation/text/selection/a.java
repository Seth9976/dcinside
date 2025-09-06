package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.V;

public final class a {
    public static V a(Selectable selectable0, long v, long v1, Offset offset0, boolean z, LayoutCoordinates layoutCoordinates0, SelectionAdjustment selectionAdjustment0, Selection selection0, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
        }
        boolean z1 = (v2 & 8) == 0 ? z : true;
        return (v2 & 0x40) == 0 ? selectable0.e(v, v1, offset0, z1, layoutCoordinates0, selectionAdjustment0, selection0) : selectable0.e(v, v1, offset0, z1, layoutCoordinates0, selectionAdjustment0, null);
    }
}

