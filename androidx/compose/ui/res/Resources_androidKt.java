package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,34:1\n76#2:35\n76#2:36\n*S KotlinDebug\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n*L\n32#1:35\n33#1:36\n*E\n"})
public final class Resources_androidKt {
    @Composable
    @ReadOnlyComposable
    @l
    public static final Resources a(@m Composer composer0, int v) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x5CA0FF57, v, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        composer0.L(AndroidCompositionLocals_androidKt.f());
        Resources resources0 = ((Context)composer0.L(AndroidCompositionLocals_androidKt.g())).getResources();
        L.o(resources0, "LocalContext.current.resources");
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return resources0;
    }
}

