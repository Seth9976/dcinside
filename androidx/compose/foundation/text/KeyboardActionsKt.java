package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class KeyboardActionsKt {
    @l
    public static final KeyboardActions a(@l Function1 function10) {
        L.p(function10, "onAny");
        return new KeyboardActions(function10, function10, function10, function10, function10, function10);
    }
}

