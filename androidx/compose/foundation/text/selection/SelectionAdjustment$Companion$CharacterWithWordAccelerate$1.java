package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class SelectionAdjustment.Companion.CharacterWithWordAccelerate.1 implements SelectionAdjustment {
    @Override  // androidx.compose.foundation.text.selection.SelectionAdjustment
    public long a(@l TextLayoutResult textLayoutResult0, long v, int v1, boolean z, @m TextRange textRange0) {
        L.p(textLayoutResult0, "textLayoutResult");
        if(textRange0 == null) {
            return Companion.a.g().a(textLayoutResult0, v, v1, z, null);
        }
        if(TextRange.h(v)) {
            return SelectionAdjustmentKt.a(textLayoutResult0.l().n().j(), ((int)(v >> 0x20)), v.j3(textLayoutResult0.l().n()), z, TextRange.m(textRange0.r()));
        }
        return z ? TextRangeKt.b(this.e(textLayoutResult0, ((int)(v >> 0x20)), v1, TextRange.n(textRange0.r()), ((int)(v & 0xFFFFFFFFL)), true, TextRange.m(v)), ((int)(v & 0xFFFFFFFFL))) : TextRangeKt.b(((int)(v >> 0x20)), this.e(textLayoutResult0, ((int)(v & 0xFFFFFFFFL)), v1, TextRange.i(textRange0.r()), ((int)(v >> 0x20)), false, TextRange.m(v)));
    }

    private final boolean b(TextLayoutResult textLayoutResult0, int v) {
        long v1 = textLayoutResult0.C(v);
        return v == ((int)(v1 >> 0x20)) || v == ((int)(v1 & 0xFFFFFFFFL));
    }

    private final boolean c(int v, int v1, boolean z, boolean z1) {
        if(v1 == -1) {
            return true;
        }
        if(v == v1) {
            return false;
        }
        return (z ^ z1) == 0 ? v > v1 : v < v1;
    }

    private final int d(TextLayoutResult textLayoutResult0, int v, int v1, int v2, boolean z, boolean z1) {
        long v3 = textLayoutResult0.C(v);
        int v4 = textLayoutResult0.q(((int)(v3 >> 0x20))) == v1 ? ((int)(v3 >> 0x20)) : textLayoutResult0.u(v1);
        int v5 = textLayoutResult0.q(((int)(v3 & 0xFFFFFFFFL))) == v1 ? ((int)(v3 & 0xFFFFFFFFL)) : TextLayoutResult.p(textLayoutResult0, v1, false, 2, null);
        if(v4 == v2) {
            return v5;
        }
        if(v5 == v2) {
            return v4;
        }
        int v6 = (v4 + v5) / 2;
        if((z ^ z1) != 0) {
            return v > v6 ? v5 : v4;
        }
        return v < v6 ? v4 : v5;
    }

    private final int e(TextLayoutResult textLayoutResult0, int v, int v1, int v2, int v3, boolean z, boolean z1) {
        if(v == v1) {
            return v2;
        }
        int v4 = textLayoutResult0.q(v);
        if(v4 != textLayoutResult0.q(v2)) {
            return this.d(textLayoutResult0, v, v4, v3, z, z1);
        }
        if(!this.c(v, v1, z, z1)) {
            return v;
        }
        return this.b(textLayoutResult0, v2) ? this.d(textLayoutResult0, v, v4, v3, z, z1) : v;
    }
}

