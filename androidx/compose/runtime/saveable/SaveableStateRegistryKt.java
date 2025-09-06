package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SaveableStateRegistryKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        SaveableStateRegistryKt.a = CompositionLocalKt.e(SaveableStateRegistryKt.LocalSaveableStateRegistry.1.e);
    }

    @l
    public static final SaveableStateRegistry a(@m Map map0, @l Function1 function10) {
        L.p(function10, "canBeSaved");
        return new SaveableStateRegistryImpl(map0, function10);
    }

    @l
    public static final ProvidableCompositionLocal b() {
        return SaveableStateRegistryKt.a;
    }
}

