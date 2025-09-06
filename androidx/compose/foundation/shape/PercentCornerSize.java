package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.v;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.sequences.m;
import y4.l;

final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float a;

    public PercentCornerSize(float f) {
        this.a = f;
        if(f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override  // androidx.compose.foundation.shape.CornerSize
    public float a(long v, @l Density density0) {
        L.p(density0, "density");
        return Size.q(v) * (this.a / 100.0f);
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public Object b() {
        return this.g();
    }

    private final float c() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public m d() {
        return v.a(this);
    }

    @l
    public final PercentCornerSize e(float f) {
        return new PercentCornerSize(f);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PercentCornerSize ? Float.compare(this.a, ((PercentCornerSize)object0).a) == 0 : false;
    }

    public static PercentCornerSize f(PercentCornerSize percentCornerSize0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = percentCornerSize0.a;
        }
        return percentCornerSize0.e(f);
    }

    @l
    public String g() {
        return this.a + '%';
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public String i() {
        return null;
    }

    @Override
    @l
    public String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}

