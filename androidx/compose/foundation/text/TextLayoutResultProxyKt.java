package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;

public final class TextLayoutResultProxyKt {
    private static final long b(long v, Rect rect0) {
        float f;
        if(Offset.p(v) < rect0.t()) {
            f = rect0.t();
        }
        else {
            f = Offset.p(v) > rect0.x() ? rect0.x() : Offset.p(v);
        }
        if(Offset.r(v) < rect0.B()) {
            return OffsetKt.a(f, rect0.B());
        }
        return Offset.r(v) > rect0.j() ? OffsetKt.a(f, rect0.j()) : OffsetKt.a(f, Offset.r(v));
    }
}

