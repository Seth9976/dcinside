package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;

public final class RectangleShapeKt.RectangleShape.1 implements Shape {
    @Override  // androidx.compose.ui.graphics.Shape
    public Outline a(long v, LayoutDirection layoutDirection0, Density density0) {
        return this.b(v, layoutDirection0, density0);
    }

    @l
    public Rectangle b(long v, @l LayoutDirection layoutDirection0, @l Density density0) {
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        return new Rectangle(SizeKt.m(v));
    }

    @Override
    @l
    public String toString() {
        return "RectangleShape";
    }
}

