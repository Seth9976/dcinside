package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import y4.l;

public final class PinnableContainerKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        PinnableContainerKt.a = CompositionLocalKt.d(null, PinnableContainerKt.LocalPinnableContainer.1.e, 1, null);
    }

    @l
    public static final ProvidableCompositionLocal a() {
        return PinnableContainerKt.a;
    }
}

