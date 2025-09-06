package androidx.compose.ui.node;

import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.internal.L;
import y4.l;

public final class BackwardsCompatNodeKt.DetachedModifierLocalReadScope.1 implements ModifierLocalReadScope {
    @Override  // androidx.compose.ui.modifier.ModifierLocalReadScope
    public Object a(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "<this>");
        return modifierLocal0.a().invoke();
    }
}

