package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import y4.l;

public final class Arrangement.Top.1 implements Vertical {
    @Override  // androidx.compose.foundation.layout.Arrangement$Vertical
    public float a() {
        return c.a(this);
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$Vertical
    public void c(@l Density density0, int v, @l int[] arr_v, @l int[] arr_v1) {
        L.p(density0, "<this>");
        L.p(arr_v, "sizes");
        L.p(arr_v1, "outPositions");
        Arrangement.a.u(arr_v, arr_v1, false);
    }

    @Override
    @l
    public String toString() {
        return "Arrangement#Top";
    }
}

