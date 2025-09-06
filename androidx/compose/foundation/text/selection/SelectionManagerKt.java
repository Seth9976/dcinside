package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class SelectionManagerKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Handle.values().length];
            try {
                arr_v[Handle.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    public static final long a(@l SelectionManager selectionManager0, long v) {
        L.p(selectionManager0, "manager");
        Selection selection0 = selectionManager0.F();
        if(selection0 == null) {
            return 0x7FC000007FC00000L;
        }
        Handle handle0 = selectionManager0.x();
        switch((handle0 == null ? -1 : WhenMappings.a[handle0.ordinal()])) {
            case -1: {
                return 0x7FC000007FC00000L;
            }
            case 1: {
                return SelectionManagerKt.b(selectionManager0, v, selection0.h(), true);
            }
            case 2: {
                return SelectionManagerKt.b(selectionManager0, v, selection0.f(), false);
            }
            case 3: {
                throw new IllegalStateException("SelectionContainer does not support cursor");
            }
            default: {
                throw new J();
            }
        }
    }

    private static final long b(SelectionManager selectionManager0, long v, AnchorInfo selection$AnchorInfo0, boolean z) {
        Selectable selectable0 = selectionManager0.q(selection$AnchorInfo0);
        if(selectable0 == null) {
            return 0x7FC000007FC00000L;
        }
        LayoutCoordinates layoutCoordinates0 = selectionManager0.s();
        if(layoutCoordinates0 == null) {
            return 0x7FC000007FC00000L;
        }
        LayoutCoordinates layoutCoordinates1 = selectable0.d();
        if(layoutCoordinates1 == null) {
            return 0x7FC000007FC00000L;
        }
        int v1 = selection$AnchorInfo0.g();
        if(!z) {
            --v1;
        }
        if(v1 > selectable0.g()) {
            return 0x7FC000007FC00000L;
        }
        Offset offset0 = selectionManager0.u();
        L.m(offset0);
        float f = Offset.p(layoutCoordinates1.P(layoutCoordinates0, offset0.A()));
        long v2 = selectable0.j(v1);
        Rect rect0 = selectable0.c(TextRange.l(v2));
        Rect rect1 = selectable0.c(s.u(TextRange.k(v2) - 1, TextRange.l(v2)));
        float f1 = s.H(f, Math.min(rect0.t(), rect1.t()), Math.max(rect0.x(), rect1.x()));
        return Math.abs(f - f1) > ((float)(((int)(v >> 0x20)) / 2)) ? 0x7FC000007FC00000L : layoutCoordinates0.P(layoutCoordinates1, OffsetKt.a(f1, Offset.r(selectable0.c(v1).o())));
    }

    public static final boolean c(@l Rect rect0, long v) {
        L.p(rect0, "$this$containsInclusive");
        float f = Offset.p(v);
        if(rect0.t() <= f && f <= rect0.x()) {
            float f1 = Offset.r(v);
            return rect0.B() <= f1 && f1 <= rect0.j();
        }
        return false;
    }

    @l
    public static final AnnotatedString d(@l Selectable selectable0, @l Selection selection0) {
        L.p(selectable0, "selectable");
        L.p(selection0, "selection");
        AnnotatedString annotatedString0 = selectable0.a();
        if(selectable0.h() == selection0.h().h() || selectable0.h() == selection0.f().h()) {
            if(selectable0.h() == selection0.h().h() && selectable0.h() == selection0.f().h()) {
                return selection0.g() ? annotatedString0.o(selection0.f().g(), selection0.h().g()) : annotatedString0.o(selection0.h().g(), selection0.f().g());
            }
            if(selectable0.h() == selection0.h().h()) {
                return selection0.g() ? annotatedString0.o(0, selection0.h().g()) : annotatedString0.o(selection0.h().g(), annotatedString0.length());
            }
            return selection0.g() ? annotatedString0.o(selection0.f().g(), annotatedString0.length()) : annotatedString0.o(0, selection0.f().g());
        }
        return annotatedString0;
    }

    @m
    public static final Selection e(@m Selection selection0, @m Selection selection1) {
        if(selection0 != null) {
            Selection selection2 = selection0.i(selection1);
            return selection2 == null ? selection1 : selection2;
        }
        return selection1;
    }

    @l
    public static final Rect f(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "<this>");
        Rect rect0 = LayoutCoordinatesKt.c(layoutCoordinates0);
        return RectKt.a(layoutCoordinates0.X(rect0.E()), layoutCoordinates0.X(rect0.n()));
    }
}

