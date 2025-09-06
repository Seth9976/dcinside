package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.v;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.sequences.m;
import y4.l;

final class PxCornerSize implements CornerSize, InspectableValue {
    private final float a;

    public PxCornerSize(float f) {
        this.a = f;
    }

    @Override  // androidx.compose.foundation.shape.CornerSize
    public float a(long v, @l Density density0) {
        L.p(density0, "density");
        return this.a;
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
    public final PxCornerSize e(float f) {
        return new PxCornerSize(f);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PxCornerSize ? Float.compare(this.a, ((PxCornerSize)object0).a) == 0 : false;
    }

    public static PxCornerSize f(PxCornerSize pxCornerSize0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = pxCornerSize0.a;
        }
        return pxCornerSize0.e(f);
    }

    @l
    public String g() {
        return this.a + "px";
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
        return "CornerSize(size = " + this.a + ".px)";
    }
}

