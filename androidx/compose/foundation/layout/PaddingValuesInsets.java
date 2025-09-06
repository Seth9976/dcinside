package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class PaddingValuesInsets implements WindowInsets {
    @l
    private final PaddingValues b;

    public PaddingValuesInsets(@l PaddingValues paddingValues0) {
        L.p(paddingValues0, "paddingValues");
        super();
        this.b = paddingValues0;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return density0.b1(this.b.d());
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return density0.b1(this.b.c(layoutDirection0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return density0.b1(this.b.a());
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return density0.b1(this.b.b(layoutDirection0));
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PaddingValuesInsets ? L.g(((PaddingValuesInsets)object0).b, this.b) : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        float f = this.b.b(LayoutDirection.a);
        float f1 = this.b.d();
        float f2 = this.b.c(LayoutDirection.a);
        float f3 = this.b.a();
        return "PaddingValues(" + Dp.u(f) + ", " + Dp.u(f1) + ", " + Dp.u(f2) + ", " + Dp.u(f3) + ')';
    }
}

