package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,674:1\n1#2:675\n*E\n"})
final class FixedDpInsets implements WindowInsets {
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    private FixedDpInsets(float f, float f1, float f2, float f3) {
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
    }

    public FixedDpInsets(float f, float f1, float f2, float f3, w w0) {
        this(f, f1, f2, f3);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return density0.b1(this.c);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return density0.b1(this.d);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return density0.b1(this.e);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return density0.b1(this.b);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FixedDpInsets ? Dp.l(this.b, ((FixedDpInsets)object0).b) && Dp.l(this.c, ((FixedDpInsets)object0).c) && Dp.l(this.d, ((FixedDpInsets)object0).d) && Dp.l(this.e, ((FixedDpInsets)object0).e) : false;
    }

    @Override
    public int hashCode() {
        return ((Dp.n(this.b) * 0x1F + Dp.n(this.c)) * 0x1F + Dp.n(this.d)) * 0x1F + Dp.n(this.e);
    }

    @Override
    @l
    public String toString() {
        return "Insets(left=" + Dp.u(this.b) + ", top=" + Dp.u(this.c) + ", right=" + Dp.u(this.d) + ", bottom=" + Dp.u(this.e) + ')';
    }
}

