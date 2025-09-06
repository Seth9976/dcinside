package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class KeyInputModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onKeyEvent");
        return modifier0.r0(new OnKeyEventElement(function10));
    }

    @l
    public static final Modifier b(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onPreviewKeyEvent");
        return modifier0.r0(new OnPreviewKeyEvent(function10));
    }
}

