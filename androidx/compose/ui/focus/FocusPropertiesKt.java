package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class FocusPropertiesKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "scope");
        return modifier0.r0(new FocusPropertiesElement(function10));
    }
}

