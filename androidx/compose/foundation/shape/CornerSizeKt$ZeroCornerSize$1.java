package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.v;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.sequences.m;
import y4.l;

public final class CornerSizeKt.ZeroCornerSize.1 implements CornerSize, InspectableValue {
    @Override  // androidx.compose.foundation.shape.CornerSize
    public float a(long v, @l Density density0) {
        L.p(density0, "density");
        return 0.0f;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public Object b() {
        return "ZeroCornerSize";
    }

    @l
    public String c() [...] // Inlined contents

    @Override  // androidx.compose.ui.platform.InspectableValue
    public m d() {
        return v.a(this);
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public String i() {
        return null;
    }

    @Override
    @l
    public String toString() {
        return "ZeroCornerSize";
    }
}

