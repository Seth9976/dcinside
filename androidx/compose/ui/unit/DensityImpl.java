package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import y4.l;
import y4.m;

final class DensityImpl implements Density {
    private final float a;
    private final float b;

    public DensityImpl(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float C(int v) {
        return a.e(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float D(float f) {
        return a.d(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int E1(long v) {
        return a.a(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect H0(DpRect dpRect0) {
        return a.i(this, dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long J(long v) {
        return a.j(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long M(float f) {
        return a.k(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int b1(float f) {
        return a.b(this, f);
    }

    public final float c() {
        return this.getDensity();
    }

    public final float e() {
        return this.w1();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DensityImpl)) {
            return false;
        }
        return Float.compare(this.getDensity(), ((DensityImpl)object0).getDensity()) == 0 ? Float.compare(this.w1(), ((DensityImpl)object0).w1()) == 0 : false;
    }

    @l
    public final DensityImpl f(float f, float f1) {
        return new DensityImpl(f, f1);
    }

    public static DensityImpl g(DensityImpl densityImpl0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = densityImpl0.getDensity();
        }
        if((v & 2) != 0) {
            f1 = densityImpl0.w1();
        }
        return densityImpl0.f(f, f1);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float g1(long v) {
        return a.g(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.getDensity()) * 0x1F + Float.floatToIntBits(this.w1());
    }

    @Override  // androidx.compose.ui.unit.Density
    public long m(long v) {
        return a.f(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float p(long v) {
        return a.c(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long r(int v) {
        return a.m(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long s(float f) {
        return a.l(this, f);
    }

    @Override
    @l
    public String toString() {
        return "DensityImpl(density=" + this.getDensity() + ", fontScale=" + this.w1() + ')';
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.b;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float y1(float f) {
        return a.h(this, f);
    }
}

