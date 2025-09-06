package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Stable
final class LimitInsets implements WindowInsets {
    @l
    private final WindowInsets b;
    private final int c;

    private LimitInsets(WindowInsets windowInsets0, int v) {
        this.b = windowInsets0;
        this.c = v;
    }

    public LimitInsets(WindowInsets windowInsets0, int v, w w0) {
        this(windowInsets0, v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return WindowInsetsSides.q(this.c, 16) ? this.b.a(density0) : 0;
    }

    // 去混淆评级： 低(23)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return WindowInsetsSides.q(this.c, (layoutDirection0 == LayoutDirection.a ? 4 : 1)) ? this.b.b(density0, layoutDirection0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return WindowInsetsSides.q(this.c, 0x20) ? this.b.c(density0) : 0;
    }

    // 去混淆评级： 低(23)
    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return WindowInsetsSides.q(this.c, (layoutDirection0 == LayoutDirection.a ? 8 : 2)) ? this.b.d(density0, layoutDirection0) : 0;
    }

    @l
    public final WindowInsets e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LimitInsets ? L.g(this.b, ((LimitInsets)object0).b) && WindowInsetsSides.p(this.c, ((LimitInsets)object0).c) : false;
    }

    public final int f() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + this.c;
    }

    @Override
    @l
    public String toString() {
        return '(' + this.b + " only " + WindowInsetsSides.t(this.c) + ')';
    }
}

