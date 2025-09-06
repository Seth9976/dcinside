package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n*L\n278#1:710\n*E\n"})
public final class Arrangement.SpaceAround.1 implements HorizontalOrVertical {
    private final float a;

    Arrangement.SpaceAround.1() {
        this.a = 0.0f;
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical
    public float a() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal
    public void b(@l Density density0, int v, @l int[] arr_v, @l LayoutDirection layoutDirection0, @l int[] arr_v1) {
        L.p(density0, "<this>");
        L.p(arr_v, "sizes");
        L.p(layoutDirection0, "layoutDirection");
        L.p(arr_v1, "outPositions");
        if(layoutDirection0 == LayoutDirection.a) {
            Arrangement.a.w(v, arr_v, arr_v1, false);
            return;
        }
        Arrangement.a.w(v, arr_v, arr_v1, true);
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$Vertical
    public void c(@l Density density0, int v, @l int[] arr_v, @l int[] arr_v1) {
        L.p(density0, "<this>");
        L.p(arr_v, "sizes");
        L.p(arr_v1, "outPositions");
        Arrangement.a.w(v, arr_v, arr_v1, false);
    }

    @Override
    @l
    public String toString() {
        return "Arrangement#SpaceAround";
    }
}

