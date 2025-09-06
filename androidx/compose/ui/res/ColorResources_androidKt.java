package androidx.compose.ui.res;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nColorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,54:1\n76#2:55\n*S KotlinDebug\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n*L\n38#1:55\n*E\n"})
public final class ColorResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final long a(@ColorRes int v, @m Composer composer0, int v1) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x960B4AB7, v1, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        Context context0 = (Context)composer0.L(AndroidCompositionLocals_androidKt.g());
        long v2 = Build.VERSION.SDK_INT < 23 ? ColorKt.b(context0.getResources().getColor(v)) : ColorResourceHelper.a.a(context0, v);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return v2;
    }
}

