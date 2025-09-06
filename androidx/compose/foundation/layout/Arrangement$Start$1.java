package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;

public final class Arrangement.Start.1 implements Horizontal {
    @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal
    public float a() {
        return a.a(this);
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal
    public void b(@l Density density0, int v, @l int[] arr_v, @l LayoutDirection layoutDirection0, @l int[] arr_v1) {
        L.p(density0, "<this>");
        L.p(arr_v, "sizes");
        L.p(layoutDirection0, "layoutDirection");
        L.p(arr_v1, "outPositions");
        if(layoutDirection0 == LayoutDirection.a) {
            Arrangement.a.u(arr_v, arr_v1, false);
            return;
        }
        Arrangement.a.v(v, arr_v, arr_v1, true);
    }

    @Override
    @l
    public String toString() {
        return "Arrangement#Start";
    }
}

