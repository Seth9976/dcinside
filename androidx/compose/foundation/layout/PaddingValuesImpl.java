package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n305#1:437\n307#1:438\n309#1:439\n311#1:440\n*E\n"})
public final class PaddingValuesImpl implements PaddingValues {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    private PaddingValuesImpl(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public PaddingValuesImpl(float f, float f1, float f2, float f3, int v, w w0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        this(f, f1, f2, f3, null);
    }

    public PaddingValuesImpl(float f, float f1, float f2, float f3, w w0) {
        this(f, f1, f2, f3);
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float a() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float b(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        return layoutDirection0 == LayoutDirection.a ? this.a : this.c;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float c(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        return layoutDirection0 == LayoutDirection.a ? this.c : this.a;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float d() {
        return this.b;
    }

    public final float e() {
        return this.d;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof PaddingValuesImpl ? Dp.l(this.a, ((PaddingValuesImpl)object0).a) && Dp.l(this.b, ((PaddingValuesImpl)object0).b) && Dp.l(this.c, ((PaddingValuesImpl)object0).c) && Dp.l(this.d, ((PaddingValuesImpl)object0).d) : false;
    }

    @Stable
    public static void f() {
    }

    public final float g() {
        return this.c;
    }

    @Stable
    public static void h() {
    }

    @Override
    public int hashCode() {
        return ((Dp.n(this.a) * 0x1F + Dp.n(this.b)) * 0x1F + Dp.n(this.c)) * 0x1F + Dp.n(this.d);
    }

    public final float i() {
        return this.a;
    }

    @Stable
    public static void j() {
    }

    public final float k() {
        return this.b;
    }

    @Stable
    public static void l() {
    }

    @Override
    @l
    public String toString() {
        return "PaddingValues(start=" + Dp.u(this.a) + ", top=" + Dp.u(this.b) + ", end=" + Dp.u(this.c) + ", bottom=" + Dp.u(this.d) + ')';
    }
}

