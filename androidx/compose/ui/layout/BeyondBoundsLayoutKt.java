package androidx.compose.ui.layout;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import y4.l;

public final class BeyondBoundsLayoutKt {
    @l
    private static final ProvidableModifierLocal a;

    static {
        BeyondBoundsLayoutKt.a = ModifierLocalKt.a(BeyondBoundsLayoutKt.ModifierLocalBeyondBoundsLayout.1.e);
    }

    @l
    public static final ProvidableModifierLocal a() {
        return BeyondBoundsLayoutKt.a;
    }
}

