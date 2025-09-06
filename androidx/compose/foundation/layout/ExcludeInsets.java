package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@Stable
final class ExcludeInsets implements WindowInsets {
    @l
    private final WindowInsets b;
    @l
    private final WindowInsets c;

    public ExcludeInsets(@l WindowInsets windowInsets0, @l WindowInsets windowInsets1) {
        L.p(windowInsets0, "included");
        L.p(windowInsets1, "excluded");
        super();
        this.b = windowInsets0;
        this.c = windowInsets1;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return s.u(this.b.a(density0) - this.c.a(density0), 0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return s.u(this.b.b(density0, layoutDirection0) - this.c.b(density0, layoutDirection0), 0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return s.u(this.b.c(density0) - this.c.c(density0), 0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return s.u(this.b.d(density0, layoutDirection0) - this.c.d(density0, layoutDirection0), 0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ExcludeInsets ? L.g(((ExcludeInsets)object0).b, this.b) && L.g(((ExcludeInsets)object0).c, this.c) : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + this.c.hashCode();
    }

    @Override
    @l
    public String toString() {
        return '(' + this.b + " - " + this.c + ')';
    }
}

