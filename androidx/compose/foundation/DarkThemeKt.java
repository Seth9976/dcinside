package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import y4.m;

public final class DarkThemeKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean a(@m Composer composer0, int v) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1100791446, v, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:40)");
        }
        boolean z = DarkTheme_androidKt.a(composer0, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return z;
    }
}

