package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import y4.l;

public final class FocusRequesterModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l FocusRequester focusRequester0) {
        L.p(modifier0, "<this>");
        L.p(focusRequester0, "focusRequester");
        return modifier0.r0(new FocusRequesterElement(focusRequester0));
    }
}

