package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBringIntoViewResponder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,48:1\n76#2:49\n36#3:50\n1114#4,6:51\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n*L\n30#1:49\n31#1:50\n31#1:51,6\n*E\n"})
public final class BringIntoViewResponder_androidKt {
    @Composable
    @l
    public static final BringIntoViewParent b(@m Composer composer0, int v) {
        composer0.V(-1031410916);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1031410916, v, -1, "androidx.compose.foundation.relocation.rememberDefaultBringIntoViewParent (BringIntoViewResponder.android.kt:28)");
        }
        View view0 = (View)composer0.L(AndroidCompositionLocals_androidKt.k());
        composer0.V(0x44FAF204);
        boolean z = composer0.t(view0);
        AndroidBringIntoViewParent androidBringIntoViewParent0 = composer0.W();
        if(z || androidBringIntoViewParent0 == Composer.a.a()) {
            androidBringIntoViewParent0 = new AndroidBringIntoViewParent(view0);
            composer0.O(androidBringIntoViewParent0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return androidBringIntoViewParent0;
    }

    private static final Rect c(androidx.compose.ui.geometry.Rect rect0) {
        return new Rect(((int)rect0.t()), ((int)rect0.B()), ((int)rect0.x()), ((int)rect0.j()));
    }
}

