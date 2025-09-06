package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import y4.l;

public final class OverscrollKt {
    @ExperimentalFoundationApi
    @l
    public static final Modifier a(@l Modifier modifier0, @l OverscrollEffect overscrollEffect0) {
        L.p(modifier0, "<this>");
        L.p(overscrollEffect0, "overscrollEffect");
        return modifier0.r0(overscrollEffect0.b());
    }
}

