package androidx.compose.foundation.relocation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import y4.l;

public final class BringIntoViewKt {
    @l
    private static final ProvidableModifierLocal a;

    static {
        BringIntoViewKt.a = ModifierLocalKt.a(BringIntoViewKt.ModifierLocalBringIntoViewParent.1.e);
    }

    @l
    public static final ProvidableModifierLocal a() {
        return BringIntoViewKt.a;
    }

    public static void b() {
    }
}

