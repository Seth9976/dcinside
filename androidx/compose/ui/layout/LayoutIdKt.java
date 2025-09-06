package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LayoutIdKt {
    @m
    public static final Object a(@l Measurable measurable0) {
        L.p(measurable0, "<this>");
        Object object0 = measurable0.c();
        LayoutIdParentData layoutIdParentData0 = object0 instanceof LayoutIdParentData ? ((LayoutIdParentData)object0) : null;
        return layoutIdParentData0 == null ? null : layoutIdParentData0.u();
    }

    @Stable
    @l
    public static final Modifier b(@l Modifier modifier0, @l Object object0) {
        L.p(modifier0, "<this>");
        L.p(object0, "layoutId");
        return modifier0.r0(new LayoutIdModifierElement(object0));
    }
}

