package androidx.compose.foundation;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,589:1\n76#2:590\n76#2:591\n50#3:592\n49#3:593\n1114#4,6:594\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n*L\n64#1:590\n65#1:591\n67#1:592\n67#1:593\n67#1:594,6\n*E\n"})
public final class AndroidOverscrollKt {
    @l
    private static final Modifier a;

    static {
        Modifier modifier0 = Build.VERSION.SDK_INT >= 0x1F ? LayoutModifierKt.a(LayoutModifierKt.a(Modifier.m0, AndroidOverscrollKt.StretchOverscrollNonClippingLayer.1.e), AndroidOverscrollKt.StretchOverscrollNonClippingLayer.2.e) : Modifier.m0;
        AndroidOverscrollKt.a = modifier0;
    }

    @Composable
    @l
    public static final OverscrollEffect b(@m Composer composer0, int v) {
        OverscrollEffect overscrollEffect0;
        composer0.V(0xFB29ED8D);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xFB29ED8D, v, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context0 = (Context)composer0.L(AndroidCompositionLocals_androidKt.g());
        OverscrollConfiguration overscrollConfiguration0 = (OverscrollConfiguration)composer0.L(OverscrollConfigurationKt.a());
        if(overscrollConfiguration0 == null) {
            overscrollEffect0 = NoOpOverscrollEffect.a;
        }
        else {
            composer0.V(0x1E7B2B64);
            boolean z = composer0.t(context0);
            boolean z1 = composer0.t(overscrollConfiguration0);
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0 = composer0.W();
            if(z || z1 || androidEdgeEffectOverscrollEffect0 == Composer.a.a()) {
                androidEdgeEffectOverscrollEffect0 = new AndroidEdgeEffectOverscrollEffect(context0, overscrollConfiguration0);
                composer0.O(androidEdgeEffectOverscrollEffect0);
            }
            composer0.g0();
            overscrollEffect0 = androidEdgeEffectOverscrollEffect0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return overscrollEffect0;
    }
}

