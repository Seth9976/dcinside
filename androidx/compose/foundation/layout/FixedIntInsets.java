package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Immutable
final class FixedIntInsets implements WindowInsets {
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public FixedIntInsets(int v, int v1, int v2, int v3) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return this.c;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.d;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return this.e;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FixedIntInsets ? this.b == ((FixedIntInsets)object0).b && this.c == ((FixedIntInsets)object0).c && this.d == ((FixedIntInsets)object0).d && this.e == ((FixedIntInsets)object0).e : false;
    }

    @Override
    public int hashCode() {
        return ((this.b * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e;
    }

    @Override
    @l
    public String toString() {
        return "Insets(left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + ')';
    }
}

