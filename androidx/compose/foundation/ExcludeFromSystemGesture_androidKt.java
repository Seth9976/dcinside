package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class ExcludeFromSystemGesture_androidKt {
    @k(message = "Use systemGestureExclusion", replaceWith = @c0(expression = "systemGestureExclusion", imports = {}))
    @l
    public static final Modifier a(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return SystemGestureExclusionKt.b(modifier0);
    }

    @k(message = "Use systemGestureExclusion", replaceWith = @c0(expression = "systemGestureExclusion", imports = {}))
    @l
    public static final Modifier b(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "exclusion");
        return SystemGestureExclusionKt.c(modifier0, function10);
    }
}

