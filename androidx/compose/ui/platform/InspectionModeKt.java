package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import y4.l;

public final class InspectionModeKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        InspectionModeKt.a = CompositionLocalKt.e(InspectionModeKt.LocalInspectionMode.1.e);
    }

    @l
    public static final ProvidableCompositionLocal a() {
        return InspectionModeKt.a;
    }
}

