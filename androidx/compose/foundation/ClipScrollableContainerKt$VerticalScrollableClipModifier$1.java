package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$VerticalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
public final class ClipScrollableContainerKt.VerticalScrollableClipModifier.1 implements Shape {
    @Override  // androidx.compose.ui.graphics.Shape
    @l
    public Outline a(long v, @l LayoutDirection layoutDirection0, @l Density density0) {
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        float f = (float)density0.b1(30.0f);
        return new Rectangle(new Rect(-f, 0.0f, Size.t(v) + f, Size.m(v)));
    }
}

