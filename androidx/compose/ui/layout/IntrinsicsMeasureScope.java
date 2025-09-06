package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class IntrinsicsMeasureScope implements MeasureScope, Density {
    @l
    private final LayoutDirection a;
    private final Density b;

    public IntrinsicsMeasureScope(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        super();
        this.a = layoutDirection0;
        this.b = density0;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float C(int v) {
        return this.b.C(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float D(float f) {
        return this.b.D(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int E1(long v) {
        return this.b.E1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect H0(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return this.b.H0(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long J(long v) {
        return this.b.J(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long M(float f) {
        return this.b.M(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int b1(float f) {
        return this.b.b1(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float g1(long v) {
        return this.b.g1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.b.getDensity();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.a;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long m(long v) {
        return this.b.m(v);
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    public MeasureResult o1(int v, int v1, Map map0, Function1 function10) {
        return MeasureScope.-CC.a(this, v, v1, map0, function10);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float p(long v) {
        return this.b.p(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long r(int v) {
        return this.b.r(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long s(float f) {
        return this.b.s(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.b.w1();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float y1(float f) {
        return this.b.y1(f);
    }
}

