package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import y4.l;

public final class OverscrollConfigurationKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        OverscrollConfigurationKt.a = CompositionLocalKt.d(null, OverscrollConfigurationKt.LocalOverscrollConfiguration.1.e, 1, null);
    }

    @ExperimentalFoundationApi
    @l
    public static final ProvidableCompositionLocal a() {
        return OverscrollConfigurationKt.a;
    }

    @ExperimentalFoundationApi
    public static void b() {
    }
}

