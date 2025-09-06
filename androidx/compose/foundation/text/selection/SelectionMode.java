package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public abstract enum SelectionMode {
    static final class Horizontal extends SelectionMode {
        Horizontal(String s, int v) {
            super(null);
        }

        @Override  // androidx.compose.foundation.text.selection.SelectionMode
        public int b(long v, @l Rect rect0) {
            L.p(rect0, "bounds");
            if(rect0.f(v)) {
                return 0;
            }
            if(Offset.p(v) < rect0.t()) {
                return -1;
            }
            return Offset.r(v) >= rect0.B() || Offset.p(v) >= rect0.x() ? 1 : -1;
        }
    }

    static final class Vertical extends SelectionMode {
        Vertical(String s, int v) {
            super(null);
        }

        @Override  // androidx.compose.foundation.text.selection.SelectionMode
        public int b(long v, @l Rect rect0) {
            L.p(rect0, "bounds");
            if(rect0.f(v)) {
                return 0;
            }
            if(Offset.r(v) < rect0.B()) {
                return -1;
            }
            return Offset.p(v) >= rect0.t() || Offset.r(v) >= rect0.j() ? 1 : -1;
        }
    }

    Vertical /* 警告！未生成枚举子类：androidx.compose.foundation.text.selection.SelectionMode$Vertical */,
    Horizontal /* 警告！未生成枚举子类：androidx.compose.foundation.text.selection.SelectionMode$Horizontal */;

    private SelectionMode() {
    }

    public SelectionMode(w w0) {
        this();
    }

    private static final SelectionMode[] a() [...] // Inlined contents

    public abstract int b(long arg1, @l Rect arg2);

    public final boolean c(@l Rect rect0, long v, long v1) {
        L.p(rect0, "bounds");
        int v2 = 1;
        if(!rect0.f(v) && !rect0.f(v1)) {
            int v3 = this.b(v, rect0);
            if(this.b(v1, rect0) <= 0) {
                v2 = 0;
            }
            return (v3 <= 0 ? 0 : 1) ^ v2;
        }
        return true;
    }
}

