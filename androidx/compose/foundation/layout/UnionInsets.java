package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class UnionInsets implements WindowInsets {
    @l
    private final WindowInsets b;
    @l
    private final WindowInsets c;

    public UnionInsets(@l WindowInsets windowInsets0, @l WindowInsets windowInsets1) {
        L.p(windowInsets0, "first");
        L.p(windowInsets1, "second");
        super();
        this.b = windowInsets0;
        this.c = windowInsets1;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return Math.max(this.b.a(density0), this.c.a(density0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return Math.max(this.b.b(density0, layoutDirection0), this.c.b(density0, layoutDirection0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return Math.max(this.b.c(density0), this.c.c(density0));
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return Math.max(this.b.d(density0, layoutDirection0), this.c.d(density0, layoutDirection0));
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof UnionInsets ? L.g(((UnionInsets)object0).b, this.b) && L.g(((UnionInsets)object0).c, this.c) : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.c.hashCode() * 0x1F;
    }

    @Override
    @l
    public String toString() {
        return '(' + this.b + " ∪ " + this.c + ')';
    }
}

