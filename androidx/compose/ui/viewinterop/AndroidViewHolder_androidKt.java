package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.math.b;

public final class AndroidViewHolder_androidKt {
    private static final int a = 0x80000000;

    public static final float b(int v) {
        return ((float)v) * -1.0f;
    }

    public static final float c(float f) {
        return f * -1.0f;
    }

    private static final void e(View view0, LayoutNode layoutNode0) {
        long v = LayoutCoordinatesKt.f(layoutNode0.v());
        int v1 = b.L0(Offset.p(v));
        int v2 = b.L0(Offset.r(v));
        view0.layout(v1, v2, view0.getMeasuredWidth() + v1, view0.getMeasuredHeight() + v2);
    }

    private static final float f(int v) [...] // Inlined contents

    private static final float g(float f) [...] // Inlined contents

    // 去混淆评级： 中等(50)
    private static final int h(int v) {
        return v == 0 ? 1 : 2;
    }
}

