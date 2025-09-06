package androidx.compose.ui.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n76#2:53\n76#2:54\n76#2:55\n83#3,3:56\n1114#4,6:59\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n45#1:53\n46#1:54\n47#1:55\n49#1:56,3\n49#1:59,6\n*E\n"})
public final class TextMeasurerHelperKt {
    private static final int a = 8;

    static {
    }

    @Composable
    @ExperimentalTextApi
    @l
    public static final TextMeasurer a(int v, @m Composer composer0, int v1, int v2) {
        composer0.V(0x5BAE9057);
        if((v2 & 1) != 0) {
            v = TextMeasurerHelperKt.a;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x5BAE9057, v1, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        Resolver fontFamily$Resolver0 = (Resolver)composer0.L(CompositionLocalsKt.k());
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        Object[] arr_object = {fontFamily$Resolver0, density0, layoutDirection0, v};
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v3 = 0; v3 < 4; ++v3) {
            z |= composer0.t(arr_object[v3]);
        }
        TextMeasurer textMeasurer0 = composer0.W();
        if(z || textMeasurer0 == Composer.a.a()) {
            textMeasurer0 = new TextMeasurer(fontFamily$Resolver0, density0, layoutDirection0, v);
            composer0.O(textMeasurer0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return textMeasurer0;
    }
}

