package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp.Companion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,114:1\n175#2:115\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:115\n*E\n"})
public final class VisibilityThresholdsKt {
    private static final float a = 0.1f;
    private static final float b = 0.5f;
    @l
    private static final Rect c;
    @l
    private static final Map d;

    static {
        VisibilityThresholdsKt.c = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        VisibilityThresholdsKt.d = Y.W(new V[]{r0.a(VectorConvertersKt.j(J.a), 1.0f), r0.a(VectorConvertersKt.h(IntSize.b), 1.0f), r0.a(VectorConvertersKt.g(IntOffset.b), 1.0f), r0.a(VectorConvertersKt.i(A.a), 0.01f), r0.a(VectorConvertersKt.c(Rect.e), 0.5f), r0.a(VectorConvertersKt.d(Size.b), 0.5f), r0.a(VectorConvertersKt.b(Offset.b), 0.5f), r0.a(VectorConvertersKt.e(Dp.b), 0.1f), r0.a(VectorConvertersKt.f(DpOffset.b), 0.1f)});
    }

    public static final float a(@l Companion dp$Companion0) {
        L.p(dp$Companion0, "<this>");
        return 0.1f;
    }

    public static final int b(@l J j0) {
        L.p(j0, "<this>");
        return 1;
    }

    public static final long c(@l androidx.compose.ui.geometry.Offset.Companion offset$Companion0) {
        L.p(offset$Companion0, "<this>");
        return 0x3F0000003F000000L;
    }

    public static final long d(@l androidx.compose.ui.geometry.Size.Companion size$Companion0) {
        L.p(size$Companion0, "<this>");
        return 0x3F0000003F000000L;
    }

    public static final long e(@l androidx.compose.ui.unit.DpOffset.Companion dpOffset$Companion0) {
        L.p(dpOffset$Companion0, "<this>");
        return DpKt.a(VisibilityThresholdsKt.a(Dp.b), VisibilityThresholdsKt.a(Dp.b));
    }

    public static final long f(@l androidx.compose.ui.unit.IntOffset.Companion intOffset$Companion0) {
        L.p(intOffset$Companion0, "<this>");
        return IntOffsetKt.a(1, 1);
    }

    public static final long g(@l androidx.compose.ui.unit.IntSize.Companion intSize$Companion0) {
        L.p(intSize$Companion0, "<this>");
        return 0x100000001L;
    }

    @l
    public static final Rect h(@l androidx.compose.ui.geometry.Rect.Companion rect$Companion0) {
        L.p(rect$Companion0, "<this>");
        return VisibilityThresholdsKt.c;
    }

    @l
    public static final Map i() {
        return VisibilityThresholdsKt.d;
    }
}

