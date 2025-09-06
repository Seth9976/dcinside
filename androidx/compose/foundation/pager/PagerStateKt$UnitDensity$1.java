package androidx.compose.foundation.pager;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;

public final class PagerStateKt.UnitDensity.1 implements Density {
    private final float a;
    private final float b;

    PagerStateKt.UnitDensity.1() {
        this.a = 1.0f;
        this.b = 1.0f;
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

    @Override  // androidx.compose.ui.unit.Density
    public float g1(long v) {
        return a.g(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a;
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

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.b;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float y1(float f) {
        return a.h(this, f);
    }
}

