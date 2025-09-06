package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,102:1\n86#2:103\n86#2:104\n79#2:105\n86#2:106\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n84#1:103\n87#1:104\n90#1:105\n97#1:106\n*E\n"})
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    @l
    private final Alignment a;
    private final long b;

    private AlignmentOffsetPositionProvider(Alignment alignment0, long v) {
        this.a = alignment0;
        this.b = v;
    }

    public AlignmentOffsetPositionProvider(Alignment alignment0, long v, w w0) {
        this(alignment0, v);
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long a(@l IntRect intRect0, long v, @l LayoutDirection layoutDirection0, long v1) {
        L.p(intRect0, "anchorBounds");
        L.p(layoutDirection0, "layoutDirection");
        long v2 = IntOffsetKt.a(0, 0);
        long v3 = this.a.a(0L, IntSizeKt.a(intRect0.G(), intRect0.r()), layoutDirection0);
        long v4 = this.a.a(0L, IntSizeKt.a(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL))), layoutDirection0);
        long v5 = IntOffsetKt.a(intRect0.t(), intRect0.B());
        long v6 = IntOffsetKt.a(((int)(v2 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL)));
        long v7 = IntOffsetKt.a(((int)(v6 >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v6 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL)));
        long v8 = IntOffsetKt.a(((int)(v4 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)));
        long v9 = IntOffsetKt.a(((int)(v7 >> 0x20)) - ((int)(v8 >> 0x20)), ((int)(v7 & 0xFFFFFFFFL)) - ((int)(v8 & 0xFFFFFFFFL)));
        long v10 = IntOffsetKt.a(((int)(this.b >> 0x20)) * (layoutDirection0 == LayoutDirection.a ? 1 : -1), ((int)(this.b & 0xFFFFFFFFL)));
        return IntOffsetKt.a(((int)(v9 >> 0x20)) + ((int)(v10 >> 0x20)), ((int)(v9 & 0xFFFFFFFFL)) + ((int)(v10 & 0xFFFFFFFFL)));
    }

    @l
    public final Alignment b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }
}

