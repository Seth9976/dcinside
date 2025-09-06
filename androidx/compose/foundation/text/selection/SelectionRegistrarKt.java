package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Map;
import y4.l;
import y4.m;

public final class SelectionRegistrarKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        SelectionRegistrarKt.a = CompositionLocalKt.d(null, SelectionRegistrarKt.LocalSelectionRegistrar.1.e, 1, null);
    }

    @l
    public static final ProvidableCompositionLocal a() {
        return SelectionRegistrarKt.a;
    }

    public static final boolean b(@m SelectionRegistrar selectionRegistrar0, long v) {
        if(selectionRegistrar0 != null) {
            Map map0 = selectionRegistrar0.f();
            return map0 == null ? false : map0.containsKey(v);
        }
        return false;
    }
}

