package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nDarkTheme.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n76#2:52\n*S KotlinDebug\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n*L\n48#1:52\n*E\n"})
public final class DarkTheme_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean a(@m Composer composer0, int v) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xCB645D0C, v, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z = (((Configuration)composer0.L(AndroidCompositionLocals_androidKt.f())).uiMode & 0x30) == 0x20;
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return z;
    }
}

