package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import y4.l;

public final class InspectionTablesKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        InspectionTablesKt.a = CompositionLocalKt.e(InspectionTablesKt.LocalInspectionTables.1.e);
    }

    @l
    public static final ProvidableCompositionLocal a() {
        return InspectionTablesKt.a;
    }
}

