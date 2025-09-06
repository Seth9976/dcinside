package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,674:1\n76#2:675\n155#3:676\n155#3:677\n155#3:678\n155#3:679\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n243#1:675\n276#1:676\n277#1:677\n278#1:678\n279#1:679\n*E\n"})
public final class WindowInsetsKt {
    @l
    public static final WindowInsets a(int v, int v1, int v2, int v3) {
        return new FixedIntInsets(v, v1, v2, v3);
    }

    public static WindowInsets b(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 0;
        }
        if((v4 & 2) != 0) {
            v1 = 0;
        }
        if((v4 & 4) != 0) {
            v2 = 0;
        }
        if((v4 & 8) != 0) {
            v3 = 0;
        }
        return WindowInsetsKt.a(v, v1, v2, v3);
    }

    @l
    public static final WindowInsets c(float f, float f1, float f2, float f3) {
        return new FixedDpInsets(f, f1, f2, f3, null);
    }

    public static WindowInsets d(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return WindowInsetsKt.c(f, f1, f2, f3);
    }

    @l
    public static final WindowInsets e(@l WindowInsets windowInsets0, @l WindowInsets windowInsets1) {
        L.p(windowInsets0, "<this>");
        L.p(windowInsets1, "insets");
        return new AddedInsets(windowInsets0, windowInsets1);
    }

    @l
    public static final WindowInsets f(@l PaddingValues paddingValues0) {
        L.p(paddingValues0, "<this>");
        return new PaddingValuesInsets(paddingValues0);
    }

    @Composable
    @ReadOnlyComposable
    @l
    public static final PaddingValues g(@l WindowInsets windowInsets0, @m Composer composer0, int v) {
        L.p(windowInsets0, "<this>");
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1485016250, v, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:242)");
        }
        PaddingValues paddingValues0 = new InsetsPaddingValues(windowInsets0, ((Density)composer0.L(CompositionLocalsKt.i())));
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return paddingValues0;
    }

    @l
    public static final PaddingValues h(@l WindowInsets windowInsets0, @l Density density0) {
        L.p(windowInsets0, "<this>");
        L.p(density0, "density");
        return new InsetsPaddingValues(windowInsets0, density0);
    }

    @l
    public static final WindowInsets i(@l WindowInsets windowInsets0, @l WindowInsets windowInsets1) {
        L.p(windowInsets0, "<this>");
        L.p(windowInsets1, "insets");
        return new ExcludeInsets(windowInsets0, windowInsets1);
    }

    @l
    public static final WindowInsets j(@l WindowInsets windowInsets0, int v) {
        L.p(windowInsets0, "$this$only");
        return new LimitInsets(windowInsets0, v, null);
    }

    @l
    public static final WindowInsets k(@l WindowInsets windowInsets0, @l WindowInsets windowInsets1) {
        L.p(windowInsets0, "<this>");
        L.p(windowInsets1, "insets");
        return new UnionInsets(windowInsets0, windowInsets1);
    }
}

