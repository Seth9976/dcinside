package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.R.id;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.Insets;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

public final class WindowInsets_androidKt {
    @ExperimentalLayoutApi
    public static void A(Companion windowInsets$Companion0) {
    }

    @Composable
    @l
    @i(name = "getSystemBars")
    public static final WindowInsets B(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0xEF22BA4C);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xEF22BA4C, v, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:183)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).s();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @l
    @i(name = "getSystemBarsIgnoringVisibility")
    public static final WindowInsets C(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x5D41650E);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x5D41650E, v, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:288)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).t();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void D(Companion windowInsets$Companion0) {
    }

    @Composable
    @l
    @i(name = "getSystemGestures")
    public static final WindowInsets E(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x3AF63DE0);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x3AF63DE0, v, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:191)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).u();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @Composable
    @l
    @i(name = "getTappableElement")
    public static final WindowInsets F(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(-1994205284);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1994205284, v, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:199)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).v();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @l
    @i(name = "getTappableElementIgnoringVisibility")
    public static final WindowInsets G(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0xA742E4BC);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xA742E4BC, v, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:301)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).w();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void H(Companion windowInsets$Companion0) {
    }

    @Composable
    @l
    @i(name = "getWaterfall")
    public static final WindowInsets I(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(1943241020);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1943241020, v, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:207)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).x();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @i(name = "isCaptionBarVisible")
    public static final boolean J(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(-501076620);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-501076620, v, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:313)");
        }
        boolean z = WindowInsetsHolder.x.c(composer0, 8).d().g();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return z;
    }

    @ExperimentalLayoutApi
    public static void K(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @i(name = "isImeVisible")
    public static final boolean L(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x905391A0);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x905391A0, v, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:325)");
        }
        boolean z = WindowInsetsHolder.x.c(composer0, 8).h().g();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return z;
    }

    @ExperimentalLayoutApi
    public static void M(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @i(name = "isTappableElementVisible")
    public static final boolean N(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(-1737201120);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1737201120, v, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:372)");
        }
        boolean z = WindowInsetsHolder.x.c(composer0, 8).v().g();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return z;
    }

    @ExperimentalLayoutApi
    public static void O(Companion windowInsets$Companion0) {
    }

    public static final void P(@l ComposeView composeView0, boolean z) {
        L.p(composeView0, "<this>");
        composeView0.setTag(id.consume_window_insets_tag, Boolean.valueOf(z));
    }

    @l
    public static final InsetsValues Q(@l Insets insets0) {
        L.p(insets0, "<this>");
        return new InsetsValues(insets0.a, insets0.b, insets0.c, insets0.d);
    }

    @l
    public static final ValueInsets a(@l Insets insets0, @l String s) {
        L.p(insets0, "insets");
        L.p(s, "name");
        return new ValueInsets(WindowInsets_androidKt.Q(insets0), s);
    }

    @ExperimentalLayoutApi
    @Composable
    @i(name = "getAreNavigationBarsVisible")
    public static final boolean b(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(710310464);
        if(ComposerKt.g0()) {
            ComposerKt.w0(710310464, v, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:349)");
        }
        boolean z = WindowInsetsHolder.x.c(composer0, 8).l().g();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return z;
    }

    @ExperimentalLayoutApi
    public static void c(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @i(name = "getAreStatusBarsVisible")
    public static final boolean d(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x6028C080);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x6028C080, v, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:337)");
        }
        boolean z = WindowInsetsHolder.x.c(composer0, 8).q().g();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return z;
    }

    @ExperimentalLayoutApi
    public static void e(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @i(name = "getAreSystemBarsVisible")
    public static final boolean f(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x76582F20);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x76582F20, v, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:361)");
        }
        boolean z = WindowInsetsHolder.x.c(composer0, 8).s().g();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return z;
    }

    @ExperimentalLayoutApi
    public static void g(Companion windowInsets$Companion0) {
    }

    @Composable
    @l
    @i(name = "getCaptionBar")
    public static final WindowInsets h(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(-1832025528);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1832025528, v, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:125)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).d();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @l
    @i(name = "getCaptionBarIgnoringVisibility")
    public static final WindowInsets i(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x98CF328A);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x98CF328A, v, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:249)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).e();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void j(Companion windowInsets$Companion0) {
    }

    public static final boolean k(@l ComposeView composeView0) {
        L.p(composeView0, "<this>");
        Object object0 = composeView0.getTag(id.consume_window_insets_tag);
        Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
        return boolean0 == null ? true : boolean0.booleanValue();
    }

    @Composable
    @l
    @i(name = "getDisplayCutout")
    public static final WindowInsets l(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x4EF71D3C);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x4EF71D3C, v, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:134)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).g();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @Composable
    @l
    @i(name = "getIme")
    public static final WindowInsets m(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0xA8909C1C);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xA8909C1C, v, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:148)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).h();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @l
    @i(name = "getImeAnimationSource")
    public static final WindowInsets n(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(-1126064918);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1126064918, v, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:387)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).i();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void o(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @l
    @i(name = "getImeAnimationTarget")
    public static final WindowInsets p(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0xE4348656);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE4348656, v, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:402)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).j();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void q(Companion windowInsets$Companion0) {
    }

    @Composable
    @l
    @i(name = "getMandatorySystemGestures")
    public static final WindowInsets r(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x51A0CDFC);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x51A0CDFC, v, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:157)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).k();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @Composable
    @l
    @i(name = "getNavigationBars")
    public static final WindowInsets s(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x5F23B556);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x5F23B556, v, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:167)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).l();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @l
    @i(name = "getNavigationBarsIgnoringVisibility")
    public static final WindowInsets t(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(-1990981160);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1990981160, v, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:263)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).m();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void u(Companion windowInsets$Companion0) {
    }

    @Composable
    @l
    @i(name = "getSafeContent")
    public static final WindowInsets v(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0x8733903C);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x8733903C, v, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:237)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).n();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @Composable
    @l
    @i(name = "getSafeDrawing")
    public static final WindowInsets w(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0xFD0D961C);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xFD0D961C, v, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:217)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).o();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @Composable
    @l
    @i(name = "getSafeGestures")
    public static final WindowInsets x(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(0xA0F9B59C);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xA0F9B59C, v, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:228)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).p();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @Composable
    @l
    @i(name = "getStatusBars")
    public static final WindowInsets y(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(-675090670);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-675090670, v, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).q();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @l
    @i(name = "getStatusBarsIgnoringVisibility")
    public static final WindowInsets z(@l Companion windowInsets$Companion0, @m Composer composer0, int v) {
        L.p(windowInsets$Companion0, "<this>");
        composer0.V(594020756);
        if(ComposerKt.g0()) {
            ComposerKt.w0(594020756, v, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:275)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.x.c(composer0, 8).r();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return windowInsets0;
    }
}

