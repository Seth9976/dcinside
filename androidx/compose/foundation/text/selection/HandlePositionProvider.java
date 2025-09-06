package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class HandlePositionProvider implements PopupPositionProvider {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[HandleReferencePoint.values().length];
            try {
                arr_v[HandleReferencePoint.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[HandleReferencePoint.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[HandleReferencePoint.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final HandleReferencePoint a;
    private final long b;

    private HandlePositionProvider(HandleReferencePoint handleReferencePoint0, long v) {
        this.a = handleReferencePoint0;
        this.b = v;
    }

    public HandlePositionProvider(HandleReferencePoint handleReferencePoint0, long v, w w0) {
        this(handleReferencePoint0, v);
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long a(@l IntRect intRect0, long v, @l LayoutDirection layoutDirection0, long v1) {
        L.p(intRect0, "anchorBounds");
        L.p(layoutDirection0, "layoutDirection");
        switch(this.a) {
            case 1: {
                return IntOffsetKt.a(intRect0.t() + ((int)(this.b >> 0x20)), intRect0.B() + ((int)(this.b & 0xFFFFFFFFL)));
            }
            case 2: {
                return IntOffsetKt.a(intRect0.t() + ((int)(this.b >> 0x20)) - ((int)(v1 >> 0x20)), intRect0.B() + ((int)(this.b & 0xFFFFFFFFL)));
            }
            case 3: {
                return IntOffsetKt.a(intRect0.t() + ((int)(this.b >> 0x20)) - ((int)(v1 >> 0x20)) / 2, intRect0.B() + ((int)(this.b & 0xFFFFFFFFL)));
            }
            default: {
                throw new J();
            }
        }
    }
}

