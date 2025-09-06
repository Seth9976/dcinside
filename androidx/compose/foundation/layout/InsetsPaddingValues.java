package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class InsetsPaddingValues implements PaddingValues {
    @l
    private final WindowInsets a;
    @l
    private final Density b;

    public InsetsPaddingValues(@l WindowInsets windowInsets0, @l Density density0) {
        L.p(windowInsets0, "insets");
        L.p(density0, "density");
        super();
        this.a = windowInsets0;
        this.b = density0;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float a() {
        int v = this.a.c(this.b);
        return this.b.C(v);
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float b(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        int v = this.a.d(this.b, layoutDirection0);
        return this.b.C(v);
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float c(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        int v = this.a.b(this.b, layoutDirection0);
        return this.b.C(v);
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float d() {
        int v = this.a.a(this.b);
        return this.b.C(v);
    }

    @l
    public final WindowInsets e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof InsetsPaddingValues ? L.g(this.a, ((InsetsPaddingValues)object0).a) && L.g(this.b, ((InsetsPaddingValues)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}

