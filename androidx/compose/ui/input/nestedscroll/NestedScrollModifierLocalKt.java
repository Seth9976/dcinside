package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import y4.l;

public final class NestedScrollModifierLocalKt {
    @l
    private static final ProvidableModifierLocal a;

    static {
        NestedScrollModifierLocalKt.a = ModifierLocalKt.a(NestedScrollModifierLocalKt.ModifierLocalNestedScroll.1.e);
    }

    @l
    public static final ProvidableModifierLocal a() {
        return NestedScrollModifierLocalKt.a;
    }
}

