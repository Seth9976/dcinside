package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.v;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.sequences.m;
import y4.l;

@s0({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float a;

    private DpCornerSize(float f) {
        this.a = f;
    }

    public DpCornerSize(float f, w w0) {
        this(f);
    }

    @Override  // androidx.compose.foundation.shape.CornerSize
    public float a(long v, @l Density density0) {
        L.p(density0, "density");
        return density0.y1(this.a);
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public Object b() {
        return Dp.d(this.g());
    }

    private final float c() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public m d() {
        return v.a(this);
    }

    @l
    public final DpCornerSize e(float f) {
        return new DpCornerSize(f, null);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DpCornerSize ? Dp.l(this.a, ((DpCornerSize)object0).a) : false;
    }

    public static DpCornerSize f(DpCornerSize dpCornerSize0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = dpCornerSize0.a;
        }
        return dpCornerSize0.e(f);
    }

    public float g() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Dp.n(this.a);
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public String i() {
        return null;
    }

    @Override
    @l
    public String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}

