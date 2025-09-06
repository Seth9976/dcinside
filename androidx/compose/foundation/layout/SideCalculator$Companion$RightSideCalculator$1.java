package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class SideCalculator.Companion.RightSideCalculator.1 implements SideCalculator {
    @Override  // androidx.compose.foundation.layout.SideCalculator
    public float a(float f, float f1) {
        return f.b(this, f, f1);
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public float b(float f, float f1) {
        return f.a(this, f, f1);
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public long c(long v) {
        return OffsetKt.a(Offset.p(v), 0.0f);
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public float d(float f, float f1) {
        return -f;
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    @l
    public Insets e(@l Insets insets0, int v) {
        L.p(insets0, "oldInsets");
        Insets insets1 = Insets.of(insets0.left, insets0.top, v, insets0.bottom);
        L.o(insets1, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
        return insets1;
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public int f(@l Insets insets0) {
        L.p(insets0, "insets");
        return insets0.right;
    }

    @Override  // androidx.compose.foundation.layout.SideCalculator
    public long g(long v, float f) {
        return VelocityKt.a(Velocity.l(v) + f, 0.0f);
    }
}

