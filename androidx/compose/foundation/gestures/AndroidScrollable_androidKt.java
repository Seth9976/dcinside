package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import y4.l;
import y4.m;

public final class AndroidScrollable_androidKt {
    @Composable
    @l
    public static final ScrollConfig a(@m Composer composer0, int v) {
        composer0.V(0xA77888F6);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xA77888F6, v, -1, "androidx.compose.foundation.gestures.platformScrollConfig (AndroidScrollable.android.kt:27)");
        }
        ScrollConfig scrollConfig0 = AndroidConfig.a;
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return scrollConfig0;
    }
}

