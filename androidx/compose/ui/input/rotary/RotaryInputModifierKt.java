package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class RotaryInputModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onPreRotaryScrollEvent");
        return modifier0.r0(new OnPreRotaryScrollEventElement(function10));
    }

    @l
    public static final Modifier b(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onRotaryScrollEvent");
        return modifier0.r0(new OnRotaryScrollEventElement(function10));
    }
}

