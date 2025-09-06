package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class FocusModifierKt {
    @k(message = "Replaced by focusTarget", replaceWith = @c0(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    @l
    public static final Modifier a(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return FocusModifierKt.b(modifier0);
    }

    @l
    public static final Modifier b(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return modifier0.r0(FocusTargetModifierElement.c);
    }
}

