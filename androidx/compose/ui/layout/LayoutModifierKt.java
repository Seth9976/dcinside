package androidx.compose.ui.layout;

import A3.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import y4.l;

public final class LayoutModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l p p0) {
        L.p(modifier0, "<this>");
        L.p(p0, "measure");
        return modifier0.r0(new LayoutModifierElement(p0));
    }
}

